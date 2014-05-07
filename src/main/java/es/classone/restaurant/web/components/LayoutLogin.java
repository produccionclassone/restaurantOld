package es.classone.restaurant.web.components;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Cookies;

import es.classone.restaurant.web.pages.user.Login;
import es.classone.restaurant.web.pages.user.Register;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;
import es.classone.restaurant.web.util.CookiesManager;
import es.classone.restaurant.web.util.UserSession;

public class LayoutLogin {

    @Property
    @Parameter(required = true, defaultPrefix = "message")
    private String pageTitle;

    @Inject
    private Cookies cookies;
    
    
}