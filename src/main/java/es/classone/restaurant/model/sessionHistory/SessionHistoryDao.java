package es.classone.restaurant.model.sessionHistory;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface SessionHistoryDao extends GenericDao<SessionHistory, Long> {

	public SessionHistory getSessionHistoryBySessionNumber(int sessionNumber);
}
