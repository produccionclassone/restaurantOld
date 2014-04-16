package es.classone.restaurant.model.userservice;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userprofile.UserProfileDao;
import es.classone.restaurant.model.userservice.util.PasswordEncrypter;
import es.udc.pojo.modelutil.exceptions.DuplicateInstanceException;
import es.udc.pojo.modelutil.exceptions.InstanceNotFoundException;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserProfileDao userProfileDao;
	

	public UserProfile registerUser(String loginName, String clearPassword,
			UserProfileDetails userProfileDetails)
			throws DuplicateInstanceException {

		try {
			userProfileDao.findByLoginName(loginName);
			throw new DuplicateInstanceException(loginName,
					UserProfile.class.getName());
		} catch (InstanceNotFoundException e) {
			String encryptedPassword = PasswordEncrypter.crypt(clearPassword);

			UserProfile userProfile = new UserProfile(loginName,
					encryptedPassword, userProfileDetails.getFirstName(),
					userProfileDetails.getLastName(),
					userProfileDetails.getEmail(),null,null,null);

			userProfileDao.save(userProfile);
			return userProfile;
		}

	}

	@Transactional
	public UserProfile login(String loginName, String password,
			boolean passwordIsEncrypted,String ipAddressIn,String ipAddressExt, String macAddress) throws InstanceNotFoundException,
			IncorrectPasswordException {

		UserProfile userProfile = userProfileDao.findByLoginName(loginName);
		userProfile.setIpAddressIn(ipAddressIn);
		userProfile.setIpAddressExt(ipAddressExt);
		userProfile.setMacAddress(macAddress);
		String storedPassword = userProfile.getEncryptedPassword();
		if (passwordIsEncrypted) {
			if (!password.equals(storedPassword)) {
				throw new IncorrectPasswordException(loginName);
			}
		} else {
			if (!PasswordEncrypter.isClearPasswordCorrect(password,
					storedPassword)) {
				throw new IncorrectPasswordException(loginName);
			}
		}
		return userProfile;

	}

	@Transactional(readOnly = true)
	public UserProfile findUserProfile(Long userProfileId)
			throws InstanceNotFoundException {

		return userProfileDao.find(userProfileId);
	}

	public void updateUserProfileDetails(Long userProfileId,
			UserProfileDetails userProfileDetails)
			throws InstanceNotFoundException {

		UserProfile userProfile = userProfileDao.find(userProfileId);
		userProfile.setFirstName(userProfileDetails.getFirstName());
		userProfile.setLastName(userProfileDetails.getLastName());
		userProfile.setEmail(userProfileDetails.getEmail());

	}

	public void changePassword(Long userProfileId, String oldClearPassword,
			String newClearPassword) throws IncorrectPasswordException,
			InstanceNotFoundException {

		UserProfile userProfile;
		userProfile = userProfileDao.find(userProfileId);

		String storedPassword = userProfile.getEncryptedPassword();

		if (!PasswordEncrypter.isClearPasswordCorrect(oldClearPassword,
				storedPassword)) {
			throw new IncorrectPasswordException(userProfile.getLoginName());
		}

		userProfile.setEncryptedPassword(PasswordEncrypter
				.crypt(newClearPassword));

	}

	public boolean checkPersonification() throws ParserConfigurationException,
			SAXException, IOException, NoSuchAlgorithmException,
			TransformerException {
		//por que no es el mismo md5 cuando lo lanzo desde el navegador?
		File pers = new File("res14prs.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(pers);
		String str =(xmlToString(doc));
		String md5str = toMd5(str);
		pers = new File("C:/Users/Alejandro-ClassOne/res14prs.xml");
		dbFactory = DocumentBuilderFactory.newInstance();
		dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(pers);
		str =(xmlToString(doc));
		String md5local = toMd5(str);
		if (md5str.equals(md5local))
			return true;
		else
			return false;
	}

	private String xmlToString(Document doc) throws TransformerException {
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(doc), new StreamResult(writer));
		String output = writer.getBuffer().toString().replaceAll("\n|\r", "");
		return output;
	}

	private String toMd5(String plaintext) throws NoSuchAlgorithmException {
		MessageDigest m = MessageDigest.getInstance("MD5");
		m.reset();
		m.update(plaintext.getBytes());
		byte[] digest = m.digest();
		BigInteger bigInt = new BigInteger(1,digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while(hashtext.length() < 32 ){
		  hashtext = "0"+hashtext;
		}
		return "classone"+hashtext;
	}


}
