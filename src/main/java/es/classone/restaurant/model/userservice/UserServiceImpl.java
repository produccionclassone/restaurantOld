package es.classone.restaurant.model.userservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.model.favorite.FavoriteDao;
import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userprofile.UserProfileDao;
import es.classone.restaurant.model.userservice.util.PasswordEncrypter;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserProfileDao userProfileDao;
	
	@Autowired
	private FavoriteDao favoriteDao;

	public UserProfile registerUser(String loginName, String clearPassword,
			UserProfileDetails userProfileDetails, char privilege)
			throws DuplicateInstanceException {

		try {
			userProfileDao.findByLoginName(loginName);
			throw new DuplicateInstanceException(loginName,
					UserProfile.class.getName());
		} catch (InstanceNotFoundException e) {
			String encryptedPassword = PasswordEncrypter.crypt(clearPassword);

			UserProfile userProfile = new UserProfile(loginName,
					encryptedPassword, userProfileDetails.getEmail(),
					privilege, null, null, null);
			try {
				userProfile.setIpAddressIn(getIpIn().toString());
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
			try {
				userProfile.setIpAddressExt(getIpExt());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				userProfile.setMacAddress(getMacAddress(getIpIn()));
			} catch (UnknownHostException e1) {

				e1.printStackTrace();
			}
			userProfileDao.save(userProfile);
			return userProfile;
		}

	}

	@Transactional
	public UserProfile login(String loginName, String password,
			boolean passwordIsEncrypted) throws InstanceNotFoundException,
			IncorrectPasswordException {

		UserProfile userProfile = userProfileDao.findByLoginName(loginName);
		try {
			userProfile.setIpAddressIn(getIpIn().toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			userProfile.setIpAddressExt(getIpExt());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			userProfile.setMacAddress(getMacAddress(getIpIn()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
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
	public UserProfile findUserProfile(int userProfileId)
			throws InstanceNotFoundException {

		return userProfileDao.find(userProfileId);
	}

	public void updateUserProfileDetails(int userProfileId,
			UserProfileDetails userProfileDetails)
			throws InstanceNotFoundException {

		UserProfile userProfile = userProfileDao.find(userProfileId);
		userProfile.setEmail(userProfileDetails.getEmail());

	}

	public void changePassword(int userProfileId, String oldClearPassword,
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

	public boolean checkPersonification(String path)
			throws ParserConfigurationException, SAXException, IOException,
			NoSuchAlgorithmException, TransformerException,
			XPathExpressionException {
		String content = null;
		URL resource = getClass().getResource("/");
		String contextPath = resource.getPath();
		System.out.println(contextPath+path+"/res14prs.xml");
		File pers = new File(contextPath+path+"/res14prs.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(pers);
		String str = (xmlToString(doc));
		content = readFile(contextPath+path+"/res14prs.md5", StandardCharsets.UTF_8);
		String md5 = toMd5(str);
		System.out.println(md5+content);

		if (md5.equals(content))
			return true;
		else
			return false;
	}

	private static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
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
		BigInteger bigInt = new BigInteger(1, digest);
		String hashtext = bigInt.toString(16);
		// Now we need to zero pad it if you actually want the full 32 chars.
		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}
		return "classone" + hashtext+"\n";
	}

	private String getIpExt() throws IOException {
		URL whatismyip = new URL("http://www.trackip.net/ip");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				whatismyip.openStream()));

		String ips = in.readLine();
		return ips;
	}

	private InetAddress getIpIn() throws UnknownHostException {

		return InetAddress.getLocalHost();
	}

	private String getMacAddress(InetAddress ip) {
		try {
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			byte[] mac = network.getHardwareAddress();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i],
						(i < mac.length - 1) ? "-" : ""));
			}
			return sb.toString();

		} catch (SocketException e) {

			e.printStackTrace();

		}
		return "";
	}

	
	public List<Favorite> getFavoritesByUserId(int userId) {
		
		return favoriteDao.getFavoritesByUserId(userId);
	}


	public Favorite createFavorite(Favorite favorite, int userId) throws InstanceNotFoundException, DuplicateFavoriteException {
		UserProfile userProfile = userProfileDao.find(userId);
		List<Favorite> favorites = getFavoritesByUserId(userProfile.getUserProfileId());
		for (Favorite f: favorites){
			if (f.getUseCase()==favorite.getUseCase()) throw new DuplicateFavoriteException(f.getUseCase());
		}
		favorite.setUserProfile(userProfile);
		favoriteDao.save(favorite);
		return favorite;
	}

}
