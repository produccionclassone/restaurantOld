package es.classone.restaurant.test.model.userservice;

import static es.classone.restaurant.model.util.GlobalNames.SPRING_CONFIG_FILE;
import static es.classone.restaurant.test.util.GlobalNames.SPRING_CONFIG_TEST_FILE;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.model.favorite.FavoriteDao;
import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.IncorrectPasswordException;
import es.classone.restaurant.model.userservice.UserProfileDetails;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SPRING_CONFIG_FILE, SPRING_CONFIG_TEST_FILE })
@Transactional
public class UserServiceTest {

	private final int NON_EXISTENT_USER_PROFILE_ID = -1;

	@Autowired
	private UserService userService;
	@Autowired
	private FavoriteDao favoriteDao;

	@Test
	public void testRegisterUserAndFindUserProfile()
			throws DuplicateInstanceException, InstanceNotFoundException,
			NoSuchAlgorithmException, ParserConfigurationException,
			SAXException, IOException, TransformerException {


		UserProfile userProfile = userService.registerUser("user",
				"userPassword", new UserProfileDetails("user@udc.es"),'1');

		UserProfile userProfile2 = userService.findUserProfile(userProfile
				.getUserProfileId());
		
		/* Check data. */
		assertEquals(userProfile, userProfile2);

	}

	@Test(expected = DuplicateInstanceException.class)
	public void testRegisterDuplicatedUser() throws DuplicateInstanceException,
			InstanceNotFoundException {

		String loginName = "user";
		String clearPassword = "userPassword";
		UserProfileDetails userProfileDetails = new UserProfileDetails("user@udc.es");

		userService.registerUser(loginName, clearPassword, userProfileDetails,'1');

		userService.registerUser(loginName, clearPassword, userProfileDetails,'1');

	}

	@Test
	public void testLoginClearPassword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		UserProfile userProfile2 = userService.login(
				userProfile.getLoginName(), clearPassword, false);

		assertEquals(userProfile, userProfile2);

	}

	@Test
	public void testLoginEncryptedPassword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		UserProfile userProfile = registerUser("user", "clearPassword");

		UserProfile userProfile2 = userService.login(
				userProfile.getLoginName(), userProfile.getEncryptedPassword(),
				true);

		assertEquals(userProfile, userProfile2);

	}

	@Test(expected = IncorrectPasswordException.class)
	public void testLoginIncorrectPasword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		userService.login(userProfile.getLoginName(), 'X' + clearPassword,
				false);

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testLoginWithNonExistentUser()
			throws IncorrectPasswordException, InstanceNotFoundException {

		userService.login("user", "userPassword", false);

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testFindNonExistentUser() throws InstanceNotFoundException {

		userService.findUserProfile(NON_EXISTENT_USER_PROFILE_ID);

	}

	@Test
	public void testUpdate() throws InstanceNotFoundException,
			IncorrectPasswordException {

		/* Update profile. */
		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		UserProfileDetails newUserProfileDetails = new UserProfileDetails(
				'X' + userProfile.getEmail());

		userService.updateUserProfileDetails(userProfile.getUserProfileId(),
				newUserProfileDetails);

		/* Check changes. */
		userService.login(userProfile.getLoginName(), clearPassword, false);
		UserProfile userProfile2 = userService.findUserProfile(userProfile
				.getUserProfileId());

		assertEquals(newUserProfileDetails.getEmail(), userProfile2.getEmail());

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testUpdateWithNonExistentUser()
			throws InstanceNotFoundException {

		userService.updateUserProfileDetails(NON_EXISTENT_USER_PROFILE_ID,
				new UserProfileDetails("user@udc.es"));

	}

	@Test
	public void testChangePassword() throws InstanceNotFoundException,
			IncorrectPasswordException {

		/* Change password. */
		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);
		String newClearPassword = 'X' + clearPassword;

		userService.changePassword(userProfile.getUserProfileId(),
				clearPassword, newClearPassword);

		/* Check new password. */
		userService.login(userProfile.getLoginName(), newClearPassword, false);

	}

	@Test(expected = IncorrectPasswordException.class)
	public void testChangePasswordWithIncorrectPassword()
			throws InstanceNotFoundException, IncorrectPasswordException {

		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		userService.changePassword(userProfile.getUserProfileId(),
				'X' + clearPassword, 'Y' + clearPassword);

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testChangePasswordWithNonExistentUser()
			throws InstanceNotFoundException, IncorrectPasswordException {

		userService.changePassword(NON_EXISTENT_USER_PROFILE_ID,
				"userPassword", "XuserPassword");

	}
	@Test
	public void testGetFavorites()
			throws InstanceNotFoundException, IncorrectPasswordException, DuplicateInstanceException {
		UserProfile userProfile = userService.registerUser("user",
				"userPassword", new UserProfileDetails("user@udc.es"),'1');
		Favorite favorite = new Favorite(112);
		favorite.setUserProfile(userProfile);
		favoriteDao.save(favorite);
		Favorite favorite2 = new Favorite(111);
		favorite.setUserProfile(userProfile);
		favoriteDao.save(favorite2);
		List<Favorite> favorites = favoriteDao.getFavoritesByUserId(userProfile.getUserProfileId());
		assertEquals(favorites.size(), 2);
	}

	private UserProfile registerUser(String loginName, String clearPassword) {

		UserProfileDetails userProfileDetails = new UserProfileDetails( "user@udc.es");

		try {

			return userService.registerUser(loginName, clearPassword,
					userProfileDetails,'1');

		} catch (DuplicateInstanceException e) {
			throw new RuntimeException(e);
		}

	}

}
