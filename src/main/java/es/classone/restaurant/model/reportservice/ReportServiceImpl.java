package es.classone.restaurant.model.reportservice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.client.ClientDao;
import es.classone.restaurant.model.commandHistory.CommandHistory;
import es.classone.restaurant.model.commandHistory.CommandHistoryDao;
import es.classone.restaurant.model.dish.DishDao;
import es.classone.restaurant.model.methodOfPayment.MethodOfPaymentDao;
import es.classone.restaurant.model.orderHistory.OrderHistory;
import es.classone.restaurant.model.orderHistory.OrderHistoryDao;
import es.classone.restaurant.model.sessionHistory.SessionHistory;
import es.classone.restaurant.model.sessionHistory.SessionHistoryDao;
import es.classone.restaurant.model.waiter.Waiter;
import es.classone.restaurant.model.waiter.WaiterDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("reportService")
@Transactional
public class ReportServiceImpl implements ReportService {

	@Autowired
	SessionHistoryDao sessionHistoryDao;

	@Autowired
	CommandHistoryDao commandHistoryDao;
	
	@Autowired
	OrderHistoryDao orderHistoryDao;

	@Autowired
	MethodOfPaymentDao methodPaYDao;

	@Autowired
	WaiterDao waiterDao;
	
	@Autowired
	DishDao dishDao;

	@Autowired
	ClientDao clientDao;

	public SessionHistory createSessionHistory(SessionHistory sh) {
		sessionHistoryDao.save(sh);
		return sh;
	}

	public CommandHistory createCommandHistory(CommandHistory ch) {
		commandHistoryDao.save(ch);
		return ch;
	}
	
	public OrderHistory createOrderHistory(OrderHistory oh) {
		orderHistoryDao.save(oh);
		return oh;
	}

	public void importSessionHistory(String path) throws NumberFormatException,
			IOException, ParseException {
		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");

			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			SessionHistory sh = new SessionHistory(stringToCalendar(row[0]),
					row[3].charAt(0), Integer.parseInt(row[4]),
					stringToBoolean(row[6]), false, stringHourToCalendar(
							row[9], row[0]), stringHourToCalendar(row[10],
							row[0]), Integer.parseInt(row[11]),
					Integer.parseInt(row[12]), Float.parseFloat(row[13]
							.replace(",", ".")), Float.parseFloat(row[14]
							.replace(",", ".")), Float.parseFloat(row[15]
							.replace(",", ".")), Float.parseFloat(row[16]
							.replace(",", ".")), Float.parseFloat(row[17]
							.replace(",", ".")));
			createSessionHistory(sh);

			j++;
		}
		System.out.println("TAMAÑO FICHERO " + j);

	}

	public void importCommandHistory(String path) throws NumberFormatException,
			IOException, ParseException, InstanceNotFoundException {
		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");

			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			int sessionNumber = Integer.parseInt(row[3]);
			SessionHistory sh = sessionHistoryDao
					.getSessionHistoryBySessionNumber(sessionNumber);
			CommandHistory ch = new CommandHistory(Long.parseLong(row[5]),
					stringToBoolean(row[6]), stringHourToCalendar(row[10],
							dateAsString(sh.getSessionDate())),
					stringHourToCalendar(row[11],
							dateAsString(sh.getSessionDate())),
					Integer.parseInt(row[12]), Float.parseFloat(row[16]
							.replace(",", ".")), Float.parseFloat(row[17]
							.replace(",", ".")), Float.parseFloat(row[18]
							.replace(",", ".")), Float.parseFloat(row[20]
							.replace(",", ".")), Float.parseFloat(row[21]
							.replace(",", ".")), Float.parseFloat(row[22]
							.replace(",", ".")), Float.parseFloat(row[24]
							.replace(",", ".")), Float.parseFloat(row[25]
							.replace(",", ".")), Float.parseFloat(row[26]
							.replace(",", ".")), row[29].charAt(0),
					row[30].charAt(0), row[31].charAt(0));

			// FOREIGN KEYS
			ch.setSesionHistory(sh);
			ch.setMethodPayment1(methodPaYDao.find(1));
			ch.setMethodPayment1(methodPaYDao.find(2));
			ch.setMethodPayment1(methodPaYDao.find(3));
			ArrayList<Waiter> waiters = new ArrayList<>();
			waiters.add(waiterDao.find(1));
			waiters.add(waiterDao.find(2));
			ch.setWaiters(waiters);
			if (!row[8].equals("00000"))
				ch.setClient(clientDao.find(Long.parseLong(row[8])));
			createCommandHistory(ch);

			j++;
		}
		System.out.println("TAMAÑO FICHERO " + j);

	}

	public void importOrderHistory(String path) throws NumberFormatException,
			IOException, ParseException {
		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			CommandHistory ch = commandHistoryDao.getCommandHistoryByCommandNumber(Long.parseLong(row[5]));
			OrderHistory oh = new OrderHistory(Integer.parseInt(row[9]),stringToBoolean(row[10]),Float.parseFloat(row[12].replace(",", ".")),Float.parseFloat(row[13].replace(",", ".")),Float.parseFloat(row[14].replace(",", ".")),Float.parseFloat(row[16].replace(",", ".")),"");
					oh.setCommandHistory(ch);
					oh.setDish(dishDao.findByCode(row[2]));
					createOrderHistory(oh);			
			j++;
		}
		System.out.println("TAMAÑO FICHERO " + j);

	}

	private boolean stringToBoolean(String booleanAsString) {
		if (booleanAsString.equals("\"S\""))
			return true;
		else
			return false;
	}

	private String dateAsString(Calendar date) {
		StringBuilder sb = new StringBuilder(date.get(Calendar.YEAR));
		sb.append(date.get(Calendar.MONTH));
		sb.append(date.get(Calendar.DAY_OF_MONTH));
		return sb.toString();
	}

	private Calendar stringToCalendar(String dateAsString)
			throws ParseException {
		Calendar dateAsCalendar = Calendar.getInstance();
		String dateWithFormat = dateAsString.substring(0, 4) + "-"
				+ dateAsString.substring(4, 6) + "-"
				+ dateAsString.substring(6, 8);
		Date date = getDateFormatter().parse(dateWithFormat);
		dateAsCalendar.setTime(date);
		return dateAsCalendar;
	}

	private Calendar stringHourToCalendar(String hourAsString, String date) {
		Calendar hourAsCalendar = Calendar.getInstance();
		hourAsCalendar.set(Calendar.YEAR,
				Integer.parseInt(date.substring(0, 4)));
		hourAsCalendar.set(Calendar.MONTH,
				Integer.parseInt(date.substring(4, 6)));
		hourAsCalendar.set(Calendar.DAY_OF_MONTH,
				Integer.parseInt(date.substring(6, 8)));
		hourAsCalendar.set(Calendar.HOUR,
				Integer.parseInt(hourAsString.substring(0, 2)));
		hourAsCalendar.set(Calendar.MINUTE,
				Integer.parseInt(hourAsString.substring(2, 4)));
		return hourAsCalendar;
	}

	private DateFormat getDateFormatter() {
		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat
				.getDateInstance();
		dateFormat.applyPattern("yyyy-MM-dd");

		return dateFormat;

	}
}
