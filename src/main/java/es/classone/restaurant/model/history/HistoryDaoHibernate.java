package es.classone.restaurant.model.history;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("historyDao")
public class HistoryDaoHibernate extends GenericDaoHibernate<History, Integer>
		implements HistoryDao {

}
