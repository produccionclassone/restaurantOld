package es.classone.restaurant.web.pages.user;

import java.io.IOException;
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

	void onValidateFromLoginForm() {
		if (!loginForm.isValid()) {
			return;
		}
		try {
			userProfile = userService.login(loginName, password, false);
		} catch (InstanceNotFoundException e) {
			loginForm.recordError(messages.get("error-authenticationFailed"));
		} catch (IncorrectPasswordException e) {
			loginForm.recordError(messages.get("error-authenticationFailed"));

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
