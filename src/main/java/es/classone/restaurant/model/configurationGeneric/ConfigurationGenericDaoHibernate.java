package es.classone.restaurant.model.configurationGeneric;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationGenericDao")
public class ConfigurationGenericDaoHibernate extends
		GenericDaoHibernate<ConfigurationGeneric, Integer> implements
		ConfigurationGenericDao {

}
