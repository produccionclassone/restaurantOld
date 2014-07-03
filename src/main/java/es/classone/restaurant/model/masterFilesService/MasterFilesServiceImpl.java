package es.classone.restaurant.model.masterFilesService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.channelSegment.ChannelSegmentDao;
import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.client.ClientDao;
import es.classone.restaurant.model.client.ClientHeader;
import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dish.DishDao;
import es.classone.restaurant.model.dish.DishHeader;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.dishGroup.DishGroupDao;
import es.classone.restaurant.model.waiter.Waiter;
import es.classone.restaurant.model.waiter.WaiterDao;
import es.classone.restaurant.model.waiter.WaiterHeader;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("masterFilesService")
@Transactional
public class MasterFilesServiceImpl implements MasterFilesService {

	@Autowired
	private DishGroupDao dishGroupDao;

	@Autowired
	private DishDao dishDao;

	@Autowired
	private ClientDao clientDao;

	@Autowired
	private WaiterDao waiterDao;

	@Autowired
	private ChannelSegmentDao channelSegmentDao;

	// DISHGROUP
	public List<DishGroup> findAll() {
		return dishGroupDao.findAll();
	}

	public DishGroup createDishGroup(DishGroup dishGroup)
			throws DuplicateInstanceException {
		if (dishGroupDao.existDishGroupCode(dishGroup.getDishGroupCode()) == true) {

			throw new DuplicateInstanceException(dishGroup,
					DishGroup.class.getName());

		}
		dishGroupDao.save(dishGroup);
		return dishGroup;
	}

	public void deleteDishGroup(int dishGroupId)

	throws InstanceNotFoundException {

		DishGroup dishGroup = dishGroupDao.find(dishGroupId);

		dishGroup.setDeleted(true);

	}

	public DishGroup getDishGroupByDishGroupId(int dishgroupId)
			throws InstanceNotFoundException {
		return dishGroupDao.find(dishgroupId);
	}

	public DishGroup editDishGroup(int dishGroupId, String dishGroupCode,
			String dishGroupDescription, int ivaType, int macroGroup,
			String salesLedgerAccount, String typeIncome)
			throws InstanceNotFoundException {
		DishGroup dishGroup = dishGroupDao.find(dishGroupId);
		dishGroup.setDishGroupCode(dishGroupCode);
		dishGroup.setDishGroupDescription(dishGroupDescription);
		dishGroup.setivaType(ivaType);
		dishGroup.setmacroGroup(macroGroup);
		dishGroup.setsalesLedgerAccount(salesLedgerAccount);
		dishGroup.settypeIncome(typeIncome);
		return dishGroup;
	}

	public void importDishGroupFile(String path) throws IOException,
			DuplicateInstanceException {

		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			System.out.println("LINEA" + j);
			String[] row = myLine.split(";");
			DishGroup dishGroup = new DishGroup(
					row[0].replace('"', ' ').trim(), row[1].replace('"', ' ')
							.trim(), Integer.parseInt(row[4].replace('"', ' ')
							.trim()), row[5].replace('"', ' ').trim(), row[7]
							.replace('"', ' ').trim(), Integer.parseInt(row[6]
							.replace('"', ' ').trim()));
			createDishGroup(dishGroup);
			for (int i = 0; i < row.length; i++) {
				System.out.print("string " + i + ": "
						+ row[i].replace('"', ' '));
			}
			j++;
		}

	}

	// DISH
	@Override
	public List<DishHeader> findAllDish() {
		return dishDao.findAll();
	}

	@Override
	public Dish createDish(Dish dish) {
		dishDao.save(dish);
		return dish;
	}

	@Override
	public Dish getDishByDishId(int dishId) throws InstanceNotFoundException {
		return dishDao.find(dishId);
	}

	@Override
	public void deleteDish(int dishId) throws InstanceNotFoundException {
		dishDao.find(dishId);
		dishDao.remove(dishId);

	}

	@Override
	public Dish editDish(int dishId, String dishDescriptionLang1,
			String dishDescriptionLang2, String dishDescriptionLang3,
			int dishPrint, int dishListPrice, double dishPVP,
			double dishCostPrice, String dishType, boolean dishDiscount,
			boolean dishDeleted, boolean dishPending, DishGroup dishGroup,
			boolean dishTractable, boolean dishOrderer, boolean dishVisible,
			int dishNumbers, String dishLongDesc, String dishShortDesc)
			throws InstanceNotFoundException {

		Dish dish = dishDao.find(dishId);
		dish.setDishDescriptionLang1(dishDescriptionLang1);
		dish.setDishDescriptionLang2(dishDescriptionLang2);
		dish.setDishDescriptionLang3(dishDescriptionLang3);
		dish.setDishPrint(dishPrint);
		dish.setDishListPrice(dishNumbers);
		dish.setDishPVP(dishPVP);
		dish.setDishCostPrice(dishCostPrice);
		dish.setDishType(dishType);
		dish.setDishDiscount(dishDiscount);
		dish.setDishDeleted(dishDeleted);
		dish.setDishPending(dishPending);
		dish.setDishGroup(dishGroup);
		dish.setDishTractable(dishTractable);
		dish.setDishOrderer(dishOrderer);
		dish.setDishVisible(dishVisible);
		dish.setDishNumbers(dishNumbers);
		dish.setDishLongDesc(dishLongDesc);
		dish.setDishShortDesc(dishShortDesc);
		return null;
	}

	@Override
	public void importDishFile(String path) throws IOException {
		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;

		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");
			Dish dish = new Dish(row[0].replace('"', ' ').trim(), row[1]
					.replace('"', ' ').trim(), row[2].replace('"', ' ').trim(),
					row[3].replace('"', ' ').trim(), Integer.parseInt(row[5]
							.replace('"', ' ').trim()), Integer.parseInt(row[6]
							.replace('"', ' ').trim()),
					Double.parseDouble(row[7].replace('"', ' ')
							.replace(',', '.').trim()),
					Double.parseDouble(row[8].replace('"', ' ')
							.replace(',', '.').trim()), row[9]
							.replace('"', ' ').trim(), false, false,
					dishGroupDao.findByCode(row[4].replace('"', ' ').trim()),
					false, false, false, 0, "", "");
			createDish(dish);
		}

	}

	// CLIENT
	public List<ClientHeader> findAllClient() {
		return clientDao.findAll();
	}

	public Client createClient(Client client) {
		clientDao.save(client);
		return client;
	}

	public void deleteClient(Long clientId) throws InstanceNotFoundException {
		clientDao.find(clientId);
		clientDao.remove(clientId);
	}

	public Client getClientByClientId(Long clientId)
			throws InstanceNotFoundException {
		return clientDao.find(clientId);
	}

	public Client editClient(long clientId, String clientName,
			String clientAddress, String clientZipCode, String clientDown,
			String clientProvince, String clientDNI, String clientPhoneContact,
			String clientPersonContact, String clientNotes1,
			String clientNotes2, String clientNotes3, double clientLimitCredit,
			double outstandingAmount, Calendar clientLastDateFood,
			double clientAmountSpent, int clientDiners, int clientTimesToEat,
			String clientObservation1, String clientObservation2,
			String clientObservation3, String clientObservation4,
			String ledgerAccount, ChannelSegment channelSegment,
			boolean sendEmail, String clientEmail, boolean sendSMS)
			throws InstanceNotFoundException {

		Client client = clientDao.find(clientId);
		client.setClientName(clientName);
		client.setClientAddress(clientAddress);
		client.setClientZipCode(clientZipCode);
		client.setClientDown(clientDown);
		client.setClientProvince(clientProvince);
		client.setClientDNI(clientDNI);
		client.setClientPhoneContact(clientPhoneContact);
		client.setClientPersonContact(clientPersonContact);
		client.setClientNotes1(clientNotes1);
		client.setClientNotes2(clientNotes2);
		client.setClientNotes3(clientNotes3);
		client.setClientLimitCredit(clientLimitCredit);
		client.setOutstandingAmount(outstandingAmount);
		client.setClientLastDateFood(clientLastDateFood);
		client.setClientAmountSpent(clientAmountSpent);
		client.setClientDiners(clientDiners);
		client.setClientTimesToEat(clientTimesToEat);
		client.setClientObservation1(clientObservation1);
		client.setClientObservation2(clientObservation2);
		client.setClientObservation3(clientObservation3);
		client.setClientObservation4(clientObservation4);
		client.setLedgerAccount(ledgerAccount);
		client.setChannelSegment(channelSegment);
		client.setSendEmail(sendEmail);
		client.setClientEmail(clientEmail);
		client.setSendSMS(sendSMS);
		
		return client;
	}

	public void importClientFile(String path) throws IOException,
			NumberFormatException, ParseException {

		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		ArrayList<Long> ids =new ArrayList<Long>();
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");

			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			System.out.println();
			j++;

			Client client = new Client(row[1].replace('"', ' ').trim(), row[2]
					.replace('"', ' ').trim(), row[3].replace('"', ' ').trim(),
					row[4].replace('"', ' ').trim(), row[5].replace('"', ' ')
							.trim(), row[6].replace('"', ' ').trim(), row[7]
							.replace('"', ' ').trim(), row[8].replace('"', ' ')
							.trim(), row[9].replace('"', ' ').trim(), row[10]
							.replace('"', ' ').trim(), row[11]
							.replace('"', ' ').trim(),
					Double.parseDouble(row[12].replace('"', ' ')
							.replace(',', '.').trim()),
					Double.parseDouble(row[13].replace('"', ' ')
							.replace(',', '.').trim()),
					stringToCalendar(row[14].replace('"', ' ').trim()),
					Double.parseDouble(row[15].replace('"', ' ')
							.replace(',', '.').trim()), 0, 0, row[18].replace(
							'"', ' ').trim(), row[19].replace('"', ' ').trim(),
					row[20].replace('"', ' ').trim(), row[21].replace('"', ' ')
							.trim(), row[22].replace('"', ' ').trim(),
					channelSegmentDao.findChannelSegmentByValue("DIR"), false,
					"", false);
			createClient(client);
			ids.add(Long.parseLong(row[0].replace('"', ' ').trim()));

		}
		j=ids.size()-1;
		for (int i=1;i<ids.size();i++){
			clientDao.updateId(j, ids.get(j-1));
			j--;
		}
	}

// WAITER
	public List<WaiterHeader> findAllWaiter() {
		return waiterDao.findAll();
	}

	public Waiter createWaiter(Waiter waiter) {
		waiterDao.save(waiter);
		return waiter;
	}

	public void deleteWaiter(int waiterId) throws InstanceNotFoundException {
		waiterDao.find(waiterId);
		waiterDao.remove(waiterId);
	}

	public Waiter getWaiterByWaiterId(int waiterId)
			throws InstanceNotFoundException {
		return waiterDao.find(waiterId);
	}

	public Waiter editWaiter(int waiterId, String waiterName,
			String waiterAddress, String waiterZip, String waiterTown,
			String waiterProvince, String waiterDNI, String waiterPhone,
			String waiterContact, String notes1, String notes2, String notes3,
			String chargeType, boolean waiterEnable, Calendar enableTime,
			Calendar disableTime) throws InstanceNotFoundException {

		Waiter waiter = waiterDao.find(waiterId);
		waiter.setWaiterName(waiterName);
		waiter.setWaiterAddress(waiterAddress);
		waiter.setWaiterZip(waiterZip);
		waiter.setWaiterTown(waiterTown);
		waiter.setWaiterProvince(waiterProvince);
		waiter.setWaiterDNI(waiterDNI);
		waiter.setWaiterPhone(waiterPhone);
		waiter.setNotes1(notes1);
		waiter.setNotes2(notes2);
		waiter.setNotes3(notes3);
		waiter.setChargeType(chargeType);
		waiter.setWaiterEnable(waiterEnable);
		waiter.setEnableTime(enableTime);
		waiter.setDisableTime(disableTime);

		return waiter;
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


	private DateFormat getDateFormatter() {
		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat
				.getDateInstance();
		dateFormat.applyPattern("yyyy-MM-dd");

		return dateFormat;

	}

	@Override
	public List<ChannelSegment> getChannelsSegments() {
		return channelSegmentDao.findAll();
	}

}
