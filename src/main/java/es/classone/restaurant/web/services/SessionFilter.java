package es.classone.restaurant.web.services;

import java.io.IOException;

import org.apache.tapestry5.services.ApplicationStateManager;
import org.apache.tapestry5.services.Cookies;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.RequestFilter;
import org.apache.tapestry5.services.RequestHandler;
import org.apache.tapestry5.services.Response;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.IncorrectPasswordException;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.util.CookiesManager;
import es.classone.restaurant.web.util.UserSession;


public class SessionFilter implements RequestFilter {

	private ApplicationStateManager applicationStateManager;
	private Cookies cookies;
	private UserService userService;

	public SessionFilter(ApplicationStateManager applicationStateManager,
			Cookies cookies, UserService userService) {

		this.applicationStateManager = applicationStateManager;
		this.cookies = cookies;
		this.userService = userService;

	}

	public boolean service(Request request, Response response,
			RequestHandler handler) throws IOException {

		if (!applicationStateManager.exists(UserSession.class)) {

			String loginName = CookiesManager.getLoginName(cookies);
			if (loginName != null) {

				String encryptedPassword = CookiesManager
						.getEncryptedPassword(cookies);
				if (encryptedPassword != null) {

					try {

						UserProfile userProfile = userService.login(loginName,
								encryptedPassword, true);
						UserSession userSession = new UserSession();
						userSession.setUserProfileId(userProfile
								.getUserProfileId());
						applicationStateManager.set(UserSession.class,
								userSession);

					} catch (InstanceNotFoundException e) {
						CookiesManager.removeCookies(cookies);
					} catch (IncorrectPasswordException e) {
						CookiesManager.removeCookies(cookies);
					}

				}

			}

		}

		handler.service(request, response);

		return true;
	}

}
