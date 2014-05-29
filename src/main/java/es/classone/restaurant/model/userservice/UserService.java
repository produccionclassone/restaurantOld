package es.classone.restaurant.model.userservice;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface UserService {

	public UserProfile registerUser(String loginName, String clearPassword,
			UserProfileDetails userProfileDetails, char privilege)
			throws DuplicateInstanceException;

	public UserProfile login(String loginName, String password,
			boolean passwordIsEncrypted) throws InstanceNotFoundException,
			IncorrectPasswordException;

	public UserProfile findUserProfile(int userProfileId)
			throws InstanceNotFoundException;

	public void updateUserProfileDetails(int userProfileId,
			UserProfileDetails userProfileDetails)
			throws InstanceNotFoundException;

	public List<Favorite> getFavoritesByUserId(int userId);

	public Favorite createFavorite(Favorite favorite, int userId) throws InstanceNotFoundException;

	public void changePassword(int userProfileId, String oldClearPassword,
			String newClearPassword) throws IncorrectPasswordException,
			InstanceNotFoundException;

	public boolean checkPersonification(String path)
			throws ParserConfigurationException, SAXException, IOException,
			NoSuchAlgorithmException, TransformerException,
			XPathExpressionException;

}
