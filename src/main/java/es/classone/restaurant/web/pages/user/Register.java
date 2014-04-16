package es.classone.restaurant.web.pages.user;

import javax.xml.transform.TransformerException;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;


import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.UserProfileDetails;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.web.pages.Index;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;
import es.classone.restaurant.web.util.UserSession;
import es.udc.pojo.modelutil.exceptions.DuplicateInstanceException;

@AuthenticationPolicy(AuthenticationPolicyType.PRIVELEGE_USERS)
public class Register {

	@Property
	private String loginName;

	@Property
	private String password;

	@Property
	private String retypePassword;

	@Property
	private String firstName;

	@Property
	private String lastName;

	@Property
	private String email;
	
	@Property
	private int privilege;

	@SessionState(create = false)
	private UserSession userSession;

	@Inject
	private UserService userService;

	@Component
	private Form registrationForm;

	@Component(id = "loginName")
	private TextField loginNameField;

	@Component(id = "password")
	private PasswordField passwordField;

	@Inject
	private Messages messages;

	private Long userProfileId;

	void onValidateFromRegistrationForm() {
		try {

			if (!userService.checkPersonification())
				registrationForm.recordError(messages
						.get("error-notCorrectPersonification"));

		} catch (TransformerException e) {
			registrationForm.recordError(messages
					.get("error-notCorrectPersonification"));
		} catch (Exception e) {
			registrationForm.recordError(messages
					.get("error-notCorrectPersonification"));
		}
		if (!registrationForm.isValid()) {
			return;
		}

		if (!password.equals(retypePassword)) {
			registrationForm.recordError(passwordField,
					messages.get("error-passwordsDontMatch"));
		} else {

			try {
				UserProfile userProfile = userService.registerUser(loginName,
						password, new UserProfileDetails(firstName, lastName,
								email),(char) ('2' + privilege));
				userProfileId = userProfile.getUserProfileId();
			} catch (DuplicateInstanceException e) {
				registrationForm.recordError(loginNameField,
						messages.get("error-loginNameAlreadyExists"));
			}

		}

	}
	
	Object onSuccess() {
		userSession = new UserSession();
		userSession.setUserProfileId(userProfileId);
		userSession.setFirstName(firstName);
		userSession.setUserPrivilege((char) ('2' + privilege));
		return Index.class;

	}

}
