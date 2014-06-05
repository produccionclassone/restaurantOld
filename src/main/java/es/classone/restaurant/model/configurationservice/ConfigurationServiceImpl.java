package es.classone.restaurant.model.configurationservice;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationBool.ConfigurationBoolDao;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGenericDao;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilegeDao;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoom;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoomDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("configurationService")
@Transactional
public class ConfigurationServiceImpl implements ConfigurationService {

	@Autowired
	private ConfigurationPrivilegeDao configurationPrivilegeDao;

	@Autowired
	private ConfigurationGenericDao configurationGenericDao;

	@Autowired
	private ConfigurationBoolDao configurationBoolDao;

	@Autowired
	private ConfigurationRoomDao configurationRoomDao;

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException {
		ConfigurationPrivilege configurationPrivilege = configurationPrivilegeDao
				.find(privilegeId);
		configurationPrivilege.setPrivilegeValue(privileges);
		configurationPrivilegeDao.save(configurationPrivilege);
	}

	public List<ConfigurationGeneric> getParametersGeneric() throws InstanceNotFoundException {
		return configurationGenericDao.findAll();
	}
		
	public List<ConfigurationBool> getParametersBool() throws InstanceNotFoundException {
		return configurationBoolDao.findAll();
	}
	
	public List<ConfigurationRoom> getParametersRoom() throws InstanceNotFoundException {
		return configurationRoomDao.findAll();
	}
	
	public void setParameter(String name, String newValue) throws InstanceNotFoundException{
		ConfigurationGeneric cg = configurationGenericDao.findByName(name);
		cg.setValue(newValue);
		configurationGenericDao.save(cg);
	}
		
		

}
