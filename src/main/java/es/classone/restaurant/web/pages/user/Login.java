package es.classone.restaurant.web.pages.user;

import java.io.IOException;
import java.text.ParseException;

import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.ActivationRequestParameter;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Cookies;
import org.apache.tapestry5.services.PageRenderLinkSource;

import es.classone.restaurant.model.reportservice.ReportService;
import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.IncorrectPasswordException;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.pages.Index;
import es.classone.restaurant.web.util.CookiesManager;
import es.classone.restaurant.web.util.UserSession;

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
	private PageRenderLinkSource linkSource;
	
	@Inject
	private UserService userService;
	
	@Inject
	private ReportService reportService;

	@ActivationRequestParameter
	private String path;

	private UserProfile userProfile = null;

	
	public void setPath(String path) {
		this.path = path;
	}

	void onValidateFromLoginForm() throws NumberFormatException, IOException, ParseException {
		reportService.importSessionHistory("/home/alexpenedo/Documentos/ClassOne/exports/TOTALSES.TXT");
		if (!loginForm.isValid()) {
			return;
		}
		if ((path == null) && (userSession != null))
			path = userSession.getPersPath();
		try {
			userProfile = userService.login(loginName, password, false);
		} catch (InstanceNotFoundException e) {
			loginForm.recordError(messages.get("error-authenticationFailed1"));
		} catch (IncorrectPasswordException e) {
			loginForm.recordError(messages.get("error-authenticationFailed2"));

		}
/*		try {
			if (!userService.checkPersonification(path))
				loginForm.recordError(messages
						.get("error-notCorrectPersonification"));
		} catch (NoSuchAlgorithmException e) {
			loginForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (ParserConfigurationException e) {
			loginForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (SAXException e) {
			loginForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (IOException e) {
			loginForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (TransformerException e) {
			loginForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (XPathExpressionException e) {
			loginForm.recordError(messages
					.get("error-path"));
		}
*/
	}

	Object onSuccess() {
		userSession = new UserSession();
		userSession.setUserProfileId(userProfile.getUserProfileId());
		userSession.setUserPrivilege(userProfile.getUserPrivilege());
		userSession.setIpIn(userProfile.getIpAddressIn());
		userSession.setPersPath(path);
		userSession.setLoginName(userProfile.getLoginName());
		if (!userProfile.getIpAddressExt().equals(""))
			userSession.setIpExt(userProfile.getIpAddressExt());
		userSession.setMacAddress(userProfile.getMacAddress());

		if (rememberMyPassword) {
			CookiesManager.leaveCookies(cookies, loginName,
					userProfile.getEncryptedPassword());
		}
		Link link = linkSource.createPageRenderLink(Index.class);
		link.addParameterValue("showFavorites", false);
		link.addParameterValue("showHistory", false);
		return link;

	}

}
