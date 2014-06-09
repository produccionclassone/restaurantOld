package es.classone.restaurant.model.configurationPrivilege;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface ConfigurationPrivilegeDao extends GenericDao<ConfigurationPrivilege, Integer>{

	public List<ConfigurationPrivilege> findAll();
} 
