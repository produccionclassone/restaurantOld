package es.classone.restaurant.model.configurationGeneric;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
 

public interface ConfigurationGenericDao extends GenericDao<ConfigurationGeneric, Integer>{

	ConfigurationGeneric findByCode(String code) throws InstanceNotFoundException;
	List<ConfigurationGeneric> findAll();
	void updateAll(List<ConfigurationGeneric> cgList);
}
