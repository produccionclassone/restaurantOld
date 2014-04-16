package es.classone.restaurant.model.userservice;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.udc.pojo.modelutil.exceptions.DuplicateInstanceException;
import es.udc.pojo.modelutil.exceptions.InstanceNotFoundException;

public interface UserService {

	public UserProfile registerUser(String loginName, String clearPassword,
			UserProfileDetails userProfileDetails)
			throws DuplicateInstanceException;

	public UserProfile login(String loginName, String password,
			boolean passwordIsEncrypted,String ipAddressIn,String ipAddressExt,String macAddress) throws InstanceNotFoundException,
			IncorrectPasswordException;

	public UserProfile findUserProfile(Long userProfileId)
			throws InstanceNotFoundException;

	public void updateUserProfileDetails(Long userProfileId,
			UserProfileDetails userProfileDetails)
			throws InstanceNotFoundException;

	public void changePassword(Long userProfileId, String oldClearPassword,
			String newClearPassword) throws IncorrectPasswordException,
			InstanceNotFoundException;

	public boolean checkPersonification() throws ParserConfigurationException,
			SAXException, IOException, NoSuchAlgorithmException, TransformerException;

}
