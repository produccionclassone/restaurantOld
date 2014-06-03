package es.classone.restaurant.model.configurationservice;

import java.util.HashMap;



import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationService {

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException;

	HashMap<String,String> getParameters() throws InstanceNotFoundException;
	public void setParameters(HashMap <String,String> newParameters) throws InstanceNotFoundException;

	HashMap<String,Boolean> getParametersBool() throws InstanceNotFoundException;
	public void setParametersBool(HashMap <String,Boolean> newParameters) throws InstanceNotFoundException;
}
