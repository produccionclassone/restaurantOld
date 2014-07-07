package es.classone.restaurant.model.reportservice;

import java.io.IOException;
import java.text.ParseException;

import es.classone.restaurant.model.commandHistory.CommandHistory;
import es.classone.restaurant.model.orderHistory.OrderHistory;
import es.classone.restaurant.model.sessionHistory.SessionHistory;

public interface ReportService {
	public SessionHistory createSessionHistory(SessionHistory sh);

	public void importSessionHistory(String path) throws NumberFormatException,
			IOException, ParseException;
}
