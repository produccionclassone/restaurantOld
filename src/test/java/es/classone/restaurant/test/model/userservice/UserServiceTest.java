package es.classone.restaurant.test.model.userservice;

import static es.classone.restaurant.model.util.GlobalNames.SPRING_CONFIG_FILE;
import static es.classone.restaurant.test.util.GlobalNames.SPRING_CONFIG_TEST_FILE;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.xml.sax.SAXException;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.IncorrectPasswordException;
import es.classone.restaurant.model.userservice.UserProfileDetails;
import es.classone.restaurant.model.userservice.UserService;
import es.udc.pojo.modelutil.exceptions.DuplicateInstanceException;
import es.udc.pojo.modelutil.exceptions.InstanceNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SPRING_CONFIG_FILE, SPRING_CONFIG_TEST_FILE })
@Transactional
public class UserServiceTest {

	private final long NON_EXISTENT_USER_PROFILE_ID = -1;

	@Autowired
	private UserService userService;

	@Test
	public void testRegisterUserAndFindUserProfile()
			throws DuplicateInstanceException, InstanceNotFoundException,
			NoSuchAlgorithmException, ParserConfigurationException,
			SAXException, IOException, TransformerException {

		
		System.out.println(userService.checkPersonification());

		UserProfile userProfile = userService.registerUser("user",
				"userPassword", new UserProfileDetails("name", "lastName",
						"user@udc.es"));

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
		UserProfileDetails userProfileDetails = new UserProfileDetails("name",
				"lastName", "user@udc.es");

		userService.registerUser(loginName, clearPassword, userProfileDetails);

		userService.registerUser(loginName, clearPassword, userProfileDetails);

	}

	@Test
	public void testLoginClearPassword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		UserProfile userProfile2 = userService.login(
				userProfile.getLoginName(), clearPassword, false,"ipI","IpE","mac");

		assertEquals(userProfile, userProfile2);

	}

	@Test
	public void testLoginEncryptedPassword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		UserProfile userProfile = registerUser("user", "clearPassword");

		UserProfile userProfile2 = userService.login(
				userProfile.getLoginName(), userProfile.getEncryptedPassword(),
				true,"ipI","IpE","mac");

		assertEquals(userProfile, userProfile2);

	}

	@Test(expected = IncorrectPasswordException.class)
	public void testLoginIncorrectPasword() throws IncorrectPasswordException,
			InstanceNotFoundException {

		String clearPassword = "userPassword";
		UserProfile userProfile = registerUser("user", clearPassword);

		userService.login(userProfile.getLoginName(), 'X' + clearPassword,
				false,"ipI","IpE","mac");

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testLoginWithNonExistentUser()
			throws IncorrectPasswordException, InstanceNotFoundException {

		userService.login("user", "userPassword", false,"ipI","IpE","mac");

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
				'X' + userProfile.getFirstName(),
				'X' + userProfile.getLastName(), 'X' + userProfile.getEmail());

		userService.updateUserProfileDetails(userProfile.getUserProfileId(),
				newUserProfileDetails);

		/* Check changes. */
		userService.login(userProfile.getLoginName(), clearPassword, false,"ipI","IpE","mac");
		UserProfile userProfile2 = userService.findUserProfile(userProfile
				.getUserProfileId());

		assertEquals(newUserProfileDetails.getFirstName(),
				userProfile2.getFirstName());
		assertEquals(newUserProfileDetails.getLastName(),
				userProfile2.getLastName());
		assertEquals(newUserProfileDetails.getEmail(), userProfile2.getEmail());

	}

	@Test(expected = InstanceNotFoundException.class)
	public void testUpdateWithNonExistentUser()
			throws InstanceNotFoundException {

		userService.updateUserProfileDetails(NON_EXISTENT_USER_PROFILE_ID,
				new UserProfileDetails("name", "lastName", "user@udc.es"));

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
		userService.login(userProfile.getLoginName(), newClearPassword, false,"ipI","IpE","mac");

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

	private UserProfile registerUser(String loginName, String clearPassword) {

		UserProfileDetails userProfileDetails = new UserProfileDetails("name",
				"lastName", "user@udc.es");

		try {

			return userService.registerUser(loginName, clearPassword,
					userProfileDetails);

		} catch (DuplicateInstanceException e) {
			throw new RuntimeException(e);
		}

	}

}
