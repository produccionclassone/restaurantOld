package es.classone.restaurant.model.sessionHistory;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("sessionHistoryDao")
public class SessionHistoryDaoHibernate extends GenericDaoHibernate<SessionHistory, Long> implements SessionHistoryDao{

	public SessionHistory getSessionHistoryBySessionNumber(
			int sessionNumber) {
			
			return (SessionHistory) (getSession()
					.createQuery(
							"SELECT sh FROM SessionHistory sh WHERE "
									+ "sh.sessionNumber = :sessionNumber")
					.setParameter("sessionNumber", sessionNumber)
					.uniqueResult());
		}

}
