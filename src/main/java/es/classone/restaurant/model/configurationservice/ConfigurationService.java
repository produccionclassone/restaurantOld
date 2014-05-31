package es.classone.restaurant.model.configurationservice;

import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationService {

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException;

	public String getParameter(String code) throws InstanceNotFoundException;

	public void setParameter(String code, String newValue)
			throws InstanceNotFoundException;
}
