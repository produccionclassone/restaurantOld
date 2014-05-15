package es.classone.restaurant.model.configurationUsr;

import org.springframework.stereotype.Repository;
import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationUsrDao")
public class ConfigurationUsrDaoHibernate extends GenericDaoHibernate<ConfigurationUsr, Long> implements ConfigurationUsrDao{

}
