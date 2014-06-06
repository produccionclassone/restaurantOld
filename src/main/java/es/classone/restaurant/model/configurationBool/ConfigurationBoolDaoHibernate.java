package es.classone.restaurant.model.configurationBool;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Repository("configurationBoolDao")
public class ConfigurationBoolDaoHibernate extends
		GenericDaoHibernate<ConfigurationBool, Integer> implements
		ConfigurationBoolDao {

	public ConfigurationBool findByName(String name)
			throws InstanceNotFoundException {

		ConfigurationBool cb = (ConfigurationBool) getSession()
				.createQuery(
						"SELECT cb FROM ConfigurationBool cb WHERE "
								+ "cb.name = :name").setParameter("name", name)
				.uniqueResult();

		if (cb == null)
			throw new InstanceNotFoundException(name,
					ConfigurationBool.class.getName());
		else
			return cb;
	}

	@SuppressWarnings("unchecked")
	public List<ConfigurationBool> findAll() {
		return (getSession()
				.createQuery("SELECT cb FROM ConfigurationBool cb ").list());
	}

}
