package es.classone.restaurant.model.configurationservice;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGenericDao;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilegeDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("configurationService")
@Transactional
public class ConfigurationServiceImpl implements ConfigurationService {

	@Autowired
	private ConfigurationPrivilegeDao configurationPrivilegeDao;

	@Autowired
	private ConfigurationGenericDao configurationGenericDao;

	public void setPrvilegeConfiguration(String privileges, int privilegeId)
			throws InstanceNotFoundException {
		ConfigurationPrivilege configurationPrivilege = configurationPrivilegeDao
				.find(privilegeId);
		configurationPrivilege.setPrivilegeValue(privileges);
		configurationPrivilegeDao.save(configurationPrivilege);
	}

	public HashMap<String,String> getParameters() throws InstanceNotFoundException {
		HashMap<String,String> cgHashMap = new HashMap<String,String>();
		List<ConfigurationGeneric> cgList = configurationGenericDao.findAll();
		for (ConfigurationGeneric cg : cgList){
			cgHashMap.put(cg.getName(), cg.getValue());
		}
		return cgHashMap;
	}
	
	public void setParameters(HashMap <String,String> newParameters) throws InstanceNotFoundException{
		ConfigurationGeneric cg = configurationGenericDao.findByName("actualSession");
		cg.setValue(newParameters.get("actualSession"));
		configurationGenericDao.save(cg);
	}
}
