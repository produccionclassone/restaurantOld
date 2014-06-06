package es.classone.restaurant.model.configurationBool;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface ConfigurationBoolDao extends
		GenericDao<ConfigurationBool, Integer> {

	ConfigurationBool findByName(String name) throws InstanceNotFoundException;

	List<ConfigurationBool> findAll();
}
