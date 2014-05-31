package es.classone.restaurant.model.configurationservice;

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

	public String getParameter(String code) throws InstanceNotFoundException {

		return (configurationGenericDao.findByCode(code)).getValue();
	}

	public void setParameter(String code, String newValue)
			throws InstanceNotFoundException {
		ConfigurationGeneric cg = configurationGenericDao.findByCode(code);
		cg.setValue(newValue);
		configurationGenericDao.save(cg);
	}
}
