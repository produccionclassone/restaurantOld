package es.classone.restaurant.model.commandHistory;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("commandHistoryDao")
public class CommandHistoryDaoHibernate extends
		GenericDaoHibernate<CommandHistory, Long> implements CommandHistoryDao {

}
