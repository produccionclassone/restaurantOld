package es.classone.restaurant.web.pages.configuration;

import java.util.HashMap;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;

import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
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

	/* Diversos contadores */

	private HashMap<String, String> cgHashMap;

	private List<ConfigurationGeneric> cgList;
	
	@Inject
	private ConfigurationService configurationService;
	
	@Component
	private Form diversosContadoresForm;

	@InjectComponent
	private Zone diversosContadoresFormZone;

	@Property
	private String actualSession;
	
	
	@Property
	private String lastBill;

	@Property
	private String lastCommand;

	@Property
	private String lastClient;

	@Property
	private String notaFiscal;

	@Property
	private String restaurantCategory;

	@Property
	private String CADExplotacion;

	@Property
	private String tableNumber;

	@Property
	private String coveredServiceCharge;

	@Inject
	private Request request;

	void onPrepareForRender() throws InstanceNotFoundException {
		cgList = configurationService.getParameters();
	}

	Object onSuccessFromDiversosContadoresForm()
			throws InstanceNotFoundException {
		cgHashMap.put("actualSession", actualSession);
		configurationService.setParameters(cgList);
		return request.isXHR() ? diversosContadoresFormZone.getBody() : null;
	}
}
