package es.classone.restaurant.model.configurationservice;

import java.util.List;

import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationService {

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException;

	public List<ConfigurationGeneric> getParameters() throws InstanceNotFoundException;

	public void setParameters (List<ConfigurationGeneric> configurationGenericList);
	
}
