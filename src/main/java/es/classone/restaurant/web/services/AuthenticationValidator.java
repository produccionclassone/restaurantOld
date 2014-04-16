package es.classone.restaurant.web.services;

import org.apache.tapestry5.runtime.Component;
import org.apache.tapestry5.services.ApplicationStateManager;
import org.apache.tapestry5.services.ComponentSource;
import org.apache.tapestry5.services.MetaDataLocator;

import es.classone.restaurant.web.util.UserSession;

public class AuthenticationValidator {

	private final static String LOGIN_PAGE = "user/Login";

	private final static String INIT_PAGE = "Index";

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
			redirectPage = check(policy, applicationStateManager);
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
					applicationStateManager);
		} catch (RuntimeException e) {
			System.out.println("Component: '" + pageName + ":" + componentId
					+ "': " + e.getMessage());
		}
		return redirectPage;

	}

	public static String check(AuthenticationPolicy policy,
			ApplicationStateManager applicationStateManager) {

		if (policy != null) {
			return check(policy.value(), applicationStateManager);
		} else {
			return null;
		}

	}

	public static String check(AuthenticationPolicyType policyType,
			ApplicationStateManager applicationStateManager) {
		String redirectPage = null;
		UserSession userSession = null;
		boolean userAuthenticated = applicationStateManager
				.exists(UserSession.class);
		if (userAuthenticated)
			userSession = applicationStateManager.get(UserSession.class);
		System.out.println(userSession.getUserPrivilege());
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

		case PRIVELEGE1_USERS:
			if ((userSession.getUserPrivilege() != '1')
					&& (userSession.getUserPrivilege() != '2')
					&& (userSession.getUserPrivilege() != '9'))
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE2_USERS:
			if (userSession.getUserPrivilege() != 2)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE3_USERS:
			if (userSession.getUserPrivilege() != 3)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE4_USERS:
			if (userSession.getUserPrivilege() != 4)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE5_USERS:
			if (userSession.getUserPrivilege() != 5)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE6_USERS:
			if (userSession.getUserPrivilege() != 6)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE7_USERS:
			if (userSession.getUserPrivilege() != 7)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE8_USERS:
			if (userSession.getUserPrivilege() != 8)
				redirectPage = LOGIN_PAGE;
			break;
		case PRIVELEGE9_USERS:
			if (userSession.getUserPrivilege() != 9)
				redirectPage = LOGIN_PAGE;
			break;
		default:
			break;

		}

		return redirectPage;
	}

}
