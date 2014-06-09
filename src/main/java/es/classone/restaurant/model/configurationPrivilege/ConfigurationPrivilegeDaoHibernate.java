package es.classone.restaurant.model.configurationPrivilege;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationPrivilegeDao")
public class ConfigurationPrivilegeDaoHibernate extends
		GenericDaoHibernate<ConfigurationPrivilege, Integer> implements
		ConfigurationPrivilegeDao {
	
	@SuppressWarnings("unchecked")
	public List<ConfigurationPrivilege> findAll(){
		return (getSession().createQuery(
				"SELECT cp FROM ConfigurationPrivilege cp ").list());
	}

}
