package es.classone.restaurant.model.log;

import org.springframework.stereotype.Repository;

import es.udc.pojo.modelutil.dao.GenericDaoHibernate;

@Repository("logDao")
public class LogDaoHibernate extends GenericDaoHibernate<Log, Long> implements
		LogDao {

}
