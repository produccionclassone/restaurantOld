package es.classone.restaurant.model.commandHistory;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface CommandHistoryDao extends GenericDao<CommandHistory, Long>{

	public CommandHistory getCommandHistoryByCommandNumber(
			long commandNumber);
}