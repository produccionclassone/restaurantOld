package es.classone.restaurant.model.configurationGeneric;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Repository("configurationGenericDao")
public class ConfigurationGenericDaoHibernate extends
		GenericDaoHibernate<ConfigurationGeneric, Integer> implements
		ConfigurationGenericDao {

	public ConfigurationGeneric findByCode(String code)
			throws InstanceNotFoundException {

		ConfigurationGeneric cg = (ConfigurationGeneric) getSession()
				.createQuery(
						"SELECT cg FROM ConfigurationGeneric cg WHERE "
								+ "cg.code = :code").setParameter("code", code)
				.uniqueResult();

		if (cg == null)
			throw new InstanceNotFoundException(code,
					ConfigurationGeneric.class.getName());
		else
			return cg;
	}
	
	@SuppressWarnings("unchecked")
	public List<ConfigurationGeneric> findAll() {
		return (getSession()
				.createQuery(
						"SELECT * FROM ConfigurationGeneric cg ")
				.list());
	}
	
	public void updateAll(List<ConfigurationGeneric> cgList){
		String query = "";
		for (ConfigurationGeneric cg : cgList)
			query += "UPDATE ConfigurationGeneric set value = + " + cg.getValue() +  "where code = " + cg.getCode() + ";";
		getSession().createQuery(query);
	}
}
