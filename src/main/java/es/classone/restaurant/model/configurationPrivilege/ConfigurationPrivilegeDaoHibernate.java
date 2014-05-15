package es.classone.restaurant.model.configurationPrivilege;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationPrivilegeDao")
public class ConfigurationPrivilegeDaoHibernate extends
		GenericDaoHibernate<ConfigurationPrivilege, Integer> implements
		ConfigurationPrivilegeDao {

}
