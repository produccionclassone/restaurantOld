package es.classone.restaurant.model.sessionHistory;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("sessionHistoryDao")
public class SessionHistoryDaoHibernate extends GenericDaoHibernate<SessionHistory, Long> implements SessionHistoryDao{

}
