package es.classone.restaurant.web.pages.configuration;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

import es.classone.restaurant.web.util.UserSession;

public class Configuration2 {

	@Property
	private String privilege3;

	@Property
	private String privilege4;

	@Property
	private String privilege5;
	
	@Property
	private String privilege6;

	@Property
	private String privilege7;

	@Property
	private String privilege8;
	@Property
	private int rGroup;

	@SessionState(create = false)
	private UserSession userSession;

}
