package es.classone.restaurant.model.configurationservice;

import java.util.HashMap;





import java.util.List;

import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationService {

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException;

	List<ConfigurationGeneric> getParametersGeneric() throws InstanceNotFoundException;
	public void setParametersGeneric(List<String> newParameters) throws InstanceNotFoundException;

	HashMap<String,Boolean> getParametersBool() throws InstanceNotFoundException;
	public void setParametersBool(HashMap <String,Boolean> newParameters) throws InstanceNotFoundException;
	
	public HashMap<String,String> getParametersRoom() throws InstanceNotFoundException;
}
