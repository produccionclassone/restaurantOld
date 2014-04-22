package es.classone.restaurant.web.services;

import org.apache.tapestry5.runtime.Component;
import org.apache.tapestry5.services.ApplicationStateManager;
import org.apache.tapestry5.services.ComponentSource;
import org.apache.tapestry5.services.MetaDataLocator;

import es.classone.restaurant.web.util.UserSession;

public class AuthenticationValidator {

	private final static String LOGIN_PAGE = "user/Login";

	private final static String INIT_PAGE = "Index";
	
	private final static String ERROR_PAGE = "Error";

	public static final String PAGE_AUTHENTICATION_TYPE = "page-authentication-type";
	public static final String EVENT_HANDLER_AUTHENTICATION_TYPE = "event-handler-authentication-type";

	public static String checkForPage(String pageName,
			ApplicationStateManager applicationStateManager,
			ComponentSource componentSource, MetaDataLocator locator) {

		String redirectPage = null;
		Component page = componentSource.getPage(pageName);
		try {
			String policyAsString = locator.findMeta(PAGE_AUTHENTICATION_TYPE,
					page.getComponentResources(), String.class);

			AuthenticationPolicyType policy = AuthenticationPolicyType
					.valueOf(policyAsString);
			redirectPage = check(policy, applicationStateManager, pageName);
		} catch (RuntimeException e) {
			System.out.println("Page: '" + pageName + "': " + e.getMessage());
		}
		return redirectPage;

	}

	public static String checkForComponentEvent(String pageName,
			String componentId, String eventId, String eventType,
			ApplicationStateManager applicationStateManager,
			ComponentSource componentSource, MetaDataLocator locator) {

		String redirectPage = null;
		String authenticationPolicyMeta = EVENT_HANDLER_AUTHENTICATION_TYPE
				+ "-" + eventId + "-" + eventType;
		authenticationPolicyMeta = authenticationPolicyMeta.toLowerCase();

		Component component = null;
		if (componentId == null) {
			component = componentSource.getPage(pageName);
		} else {
			component = componentSource.getComponent(pageName + ":"
					+ componentId);
		}
		try {
			String policyAsString = locator.findMeta(authenticationPolicyMeta,
					component.getComponentResources(), String.class);
			AuthenticationPolicyType policy = AuthenticationPolicyType
					.valueOf(policyAsString);
			redirectPage = AuthenticationValidator.check(policy,
					applicationStateManager, pageName);
		} catch (RuntimeException e) {
			System.out.println("Component: '" + pageName + ":" + componentId
					+ "': " + e.getMessage());
		}
		return redirectPage;

	}

	public static String check(AuthenticationPolicy policy,
			ApplicationStateManager applicationStateManager, String pageName) {

		if (policy != null) {
			return check(policy.value(), applicationStateManager, pageName);
		} else {
			return null;
		}

	}

	public static String check(AuthenticationPolicyType policyType,
			ApplicationStateManager applicationStateManager, String pageName) {
		String redirectPage = null;
		UserSession userSession = null;
		boolean userAuthenticated = applicationStateManager
				.exists(UserSession.class);
		if (userAuthenticated){
			userSession = applicationStateManager.get(UserSession.class);
		System.out.println("Con privilegio " + userSession.getUserPrivilege()
				+ " quiero acceder a " + pageName);
		}
		switch (policyType) {
		case AUTHENTICATED_USERS:

			if (!userAuthenticated) {
				redirectPage = LOGIN_PAGE;
			}
			break;

		case NON_AUTHENTICATED_USERS:

			if (userAuthenticated) {
				redirectPage = INIT_PAGE;
			}
			break;

		case PRIVELEGE_USERS:
			if ((userSession.getUserPrivilege() != '1')
					&& (userSession.getUserPrivilege() != '2')
					&& (userSession.getUserPrivilege() != '9'))
				redirectPage = ERROR_PAGE;
			break;

		default:
			break;

		}

		return redirectPage;
	}

}
