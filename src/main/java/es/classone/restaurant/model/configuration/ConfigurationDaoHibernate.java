package es.classone.restaurant.model.configuration;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationDao")
public class ConfigurationDaoHibernate extends
		GenericDaoHibernate<Configuration, Long> implements ConfigurationDao {

}