package es.classone.restaurant.web.pages.configuration;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;

import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
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
	
	@Inject
	private ConfigurationService configurationService;
	
	@Property
	private String actualSession;
	
	@Component
	private Form actualSessionForm;
	
	void onPrepareForRender() throws InstanceNotFoundException {
		actualSession = configurationService.getParameter("R4CNT013_01");
		System.out.println("actual session " + actualSession);
	}	

	Object onSuccess() throws InstanceNotFoundException{
		configurationService.setParameter("R4CNT013_01",actualSession);
		return this;
	}
	
	
}
