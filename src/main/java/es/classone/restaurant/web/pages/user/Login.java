package es.classone.restaurant.web.pages.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Cookies;
import org.xml.sax.SAXException;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.IncorrectPasswordException;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.web.pages.Index;
import es.classone.restaurant.web.util.CookiesManager;
import es.classone.restaurant.web.util.UserSession;
import es.udc.pojo.modelutil.exceptions.InstanceNotFoundException;

public class Login {

	@Property
	private String loginName;

	@Property
	private String password;

	@Property
	private boolean rememberMyPassword;

	@SessionState(create = false)
	private UserSession userSession;

	@Inject
	private Cookies cookies;

	@Component
	private Form loginForm;

	@Inject
	private Messages messages;

	@Inject
	private UserService userService;

	private UserProfile userProfile = null;

	private String getIpExt() throws IOException {
		URL whatismyip = new URL("http://www.trackip.net/ip");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				whatismyip.openStream()));

		String ips = in.readLine();
		return ips;
	}

	void onValidateFromLoginForm() {
		InetAddress ipIn;
		String ipExt = "";
		if (!loginForm.isValid()) {
			return;
		}
		try {
			ipIn = InetAddress.getLocalHost();
			try {
				ipExt = getIpExt();
			} catch (IOException e1) {
				userProfile = userService.login(loginName, password, false,
						ipIn.toString(), ipExt, getMacAddress(ipIn));
			}
			System.out.println(ipExt + "  " + ipIn.toString());
			userProfile = userService.login(loginName, password, false,
					ipIn.toString(), ipExt, getMacAddress(ipIn));
		} catch (InstanceNotFoundException e) {
			loginForm.recordError(messages.get("error-authenticationFailed"));
		} catch (IncorrectPasswordException e) {
			loginForm.recordError(messages.get("error-authenticationFailed"));
		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
		try {
			if (!userService.checkPersonification())
				loginForm.recordError(messages
						.get("error-notCorrectPersonification"));
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException");
		} catch (ParserConfigurationException e) {
			System.out.println("ParserConfigurationException");
		} catch (SAXException e) {
			System.out.println("SAX");
		} catch (IOException e) {
			System.out.println("IO");
		} catch (TransformerException e) {
			System.out.println("Trans");
		}

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

	Object onSuccess() {
		userSession = new UserSession();
		userSession.setUserProfileId(userProfile.getUserProfileId());
		userSession.setFirstName(userProfile.getFirstName());
		userSession.setUserPrivilege(userProfile.getUserPrivilege());
		userSession.setIpIn(userProfile.getIpAddressIn());
		if (!userProfile.getIpAddressExt().equals(""))
			userSession.setIpExt(userProfile.getIpAddressExt());
		userSession.setMacAddress(userProfile.getMacAddress());

		if (rememberMyPassword) {
			CookiesManager.leaveCookies(cookies, loginName,
					userProfile.getEncryptedPassword());
		}
		return Index.class;

	}

}
