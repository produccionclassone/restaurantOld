package es.classone.restaurant.model.configurationservice;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationBool.ConfigurationBoolDao;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGenericDao;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGenericDaoHibernate;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilegeDao;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoom;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoomDao;
import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userprofile.UserProfileDao;
import es.classone.restaurant.model.userprofile.UserProfileDaoHibernate;
import es.classone.restaurant.model.userservice.util.PasswordEncrypter;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.test.experiments.HibernateUtil;

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
	
	public void setParametersGeneric(List<String> newParameters) throws InstanceNotFoundException{
		for (String s : newParameters){
			ConfigurationGeneric cg = configurationGenericDao.find(newParameters.indexOf(s));
			cg.setValue(s);
		}
	}
	
	public ConfigurationGeneric findByName(String name) throws InstanceNotFoundException{
		return configurationGenericDao.findByName(name);
	}
	
	public HashMap<String,Boolean> getParametersBool() throws InstanceNotFoundException {
		HashMap<String,Boolean> cbHashMap = new HashMap<String,Boolean>();
		List<ConfigurationBool> cbList = configurationBoolDao.findAll();
		for (ConfigurationBool cb : cbList){
			cbHashMap.put(cb.getName(), cb.getValue());
		}
		return cbHashMap;
	}
	
	public void setParametersBool(HashMap <String,Boolean> newParameters) throws InstanceNotFoundException{
		ConfigurationBool cb = configurationBoolDao.findByName("decimal");
		cb.setValue(newParameters.get("decimal"));
		configurationBoolDao.save(cb);
	}
	
	public HashMap<String,String> getParametersRoom() throws InstanceNotFoundException {
		HashMap<String,String> crHashMap = new HashMap<String,String>();
		List<ConfigurationRoom> crList = configurationRoomDao.findAll();
		for (ConfigurationRoom cr : crList){
			crHashMap.put("desc" + Integer.toString(cr.getConfigurationRoomId()),cr.getRoomDescription());
			crHashMap.put("firstTab" + cr.getConfigurationRoomId(), Integer.toString(cr.getFirstTab()));
			crHashMap.put("lastTab" + cr.getConfigurationRoomId(), Integer.toString(cr.getLastTab()));
		}
		System.out.println("Size " + crList.size());
		return crHashMap;
	}


}
