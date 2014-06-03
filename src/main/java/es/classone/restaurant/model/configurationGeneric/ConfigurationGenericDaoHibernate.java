package es.classone.restaurant.model.configurationGeneric;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Repository("configurationGenericDao")
public class ConfigurationGenericDaoHibernate extends
		GenericDaoHibernate<ConfigurationGeneric, Integer> implements
		ConfigurationGenericDao {

	public ConfigurationGeneric findByName(String name)
			throws InstanceNotFoundException {

		ConfigurationGeneric cg = (ConfigurationGeneric) getSession()
				.createQuery(
						"SELECT cg FROM ConfigurationGeneric cg WHERE "
								+ "cg.name = :name").setParameter("name", name)
				.uniqueResult();

		if (cg == null)
			throw new InstanceNotFoundException(name,
					ConfigurationGeneric.class.getName());
		else
			return cg;
	}
	
	@SuppressWarnings("unchecked")
	public List<ConfigurationGeneric> findAll() {
		return (getSession()
				.createQuery(
						"SELECT cg FROM ConfigurationGeneric cg ")
				.list());
	}
}
