package es.classone.restaurant.web.components;

import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Cookies;


public class LayoutLogin {

	
    @Property
    @Parameter(required = true, defaultPrefix = "message")
    private String pageTitle;

    @Inject
    private Cookies cookies;
    
    
}