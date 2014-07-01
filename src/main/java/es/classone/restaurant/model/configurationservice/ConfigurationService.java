package es.classone.restaurant.model.configurationservice;


import java.util.List;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoom;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationService {

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException;

	List<ConfigurationGeneric> getParametersGeneric() throws InstanceNotFoundException;
	List<ConfigurationBool> getParametersBool() throws InstanceNotFoundException;
	List<ConfigurationRoom> getParametersRoom() throws InstanceNotFoundException;
	List<ConfigurationPrivilege> getPrivileges();
	void setParameterGeneric(String name, String newValue) throws InstanceNotFoundException;
	void setParameterBool(String name, Boolean newValue) throws InstanceNotFoundException;
	void setRoomDesc(int id, String roomDesc) throws InstanceNotFoundException;
	void setRoomFirstTab(int id, int firstTab) throws InstanceNotFoundException;
	void setRoomLastTab(int id, int lastTab) throws InstanceNotFoundException;

}
