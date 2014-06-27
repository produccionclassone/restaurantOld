package es.classone.restaurant.model.masterFilesService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.dishGroup.DishGroupDao;
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
	private ChannelSegmentDao channelSegmentDao;
	
	public List<DishGroup> findAll() {
		return dishGroupDao.findAll();
	}
	
	  public DishGroup createDishGroup(DishGroup dishGroup) throws DuplicateInstanceException {
          if (dishGroupDao.existDishGroupCode(dishGroup.getDishGroupCode())==true){

                throw new DuplicateInstanceException(dishGroup, DishGroup.class.getName());

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

	public void importDishGroupFile(String path) throws IOException, DuplicateInstanceException {

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

	@Override
	public List<Dish> findAllDish() {
		return dishDao.findAll();
	}

	@Override
	public Dish createDish(Dish dish) {
		dishDao.save(dish);
		return dish;
	}

	@Override
	public Dish getDishByDishId(int dishId)
			throws InstanceNotFoundException {
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
			int dishPrint, int dishListPrice, double dishPVP, double dishCostPrice,
			String dishType, boolean dishDiscount, boolean dishDeleted,
			boolean dishPending, DishGroup dishGroup, boolean dishTractable,
			boolean dishOrderer, boolean dishVisible, int dishNumbers,
			String dishLongDesc, String dishShortDesc) throws InstanceNotFoundException {


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
			/* PRINT Edited lines
			System.out.print("cod " + row[0].replace('"', ' ').trim());
			System.out.print("desc 1 " + row[1].replace('"', ' ').trim());
			System.out.print("desc 2 " + row[2].replace('"', ' ').trim());
			System.out.print("desc 3 " + row[3].replace('"', ' ').trim());
			System.out.print("Print " + Integer.parseInt(row[5].replace('"', ' ').trim()));
			System.out.print("ListPrice " +Integer.parseInt(row[6].replace('"', ' ').trim()));
			System.out.print("PVP " +Double.parseDouble(row[7].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("CostPrice " +Double.parseDouble(row[8].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("Type " + row[9].replace('"', ' ').trim());
			System.out.print("Group " + dishGroupDao.findByCode(row[4].replace('"', ' ').trim()).getDishGroupCode());
			System.out.println();
			*/
			
			Dish dish = new Dish(
					row[0].replace('"', ' ').trim(),
					row[1].replace('"', ' ').trim(),
					row[2].replace('"', ' ').trim(),
					row[3].replace('"', ' ').trim(),
					Integer.parseInt(row[5].replace('"', ' ').trim()),
					Integer.parseInt(row[6].replace('"', ' ').trim()),
					Double.parseDouble(row[7].replace('"', ' ').replace(',', '.').trim()),
					Double.parseDouble(row[8].replace('"', ' ').replace(',', '.').trim()),
					row[9].replace('"', ' ').trim(),
					false,
					false,
					dishGroupDao.findByCode(row[4].replace('"', ' ').trim()),
					false,
					false,
					false,
					0,
					"",
					"");
			createDish(dish);
			
			/* PRINT File line
			System.out.print(j + ":");
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			System.out.println();
			j++;
			*/
		}
		
	}


	public List<ClientHeader> findAllClient() {
		return clientDao.findAll();
	}

	public Client createClient(Client client) {
		clientDao.save(client);
		return client;
	}

	public void deleteClient(Long clientId)
			throws InstanceNotFoundException {
		clientDao.find(clientId);
		clientDao.remove(clientId);
	}

	public Client getClientByClientId(Long clientId)
			throws InstanceNotFoundException {
		return clientDao.find(clientId);
	}

	public Client editClient(long clientId, String clientName, String clientAddress,
			String clientZipCode, String clientDown, String clientProvince,
			String clientDNI, String clientPhoneContact,
			String clientPersonContact, String clientNotes1,
			String clientNotes2, String clientNotes3, double clientLimitCredit,
			double outstandingAmount, Calendar clientLastDateFood,
			double clientAmountSpent, int clientDiners, int clientTimesToEat,
			String clientObservation1, String clientObservation2,
			String clientObservation3, String clientObservation4,
			String ledgerAccount, String ledgerAccountType, String typeCode,
			ChannelSegment channelSegment, boolean sendEmail,
			String clientEmail, boolean sendSMS)
			throws InstanceNotFoundException {
		
		Client client = clientDao.find(clientId);
		client.setClientName (clientName);
		client.setClientAddress (clientAddress);
		client.setClientZipCode (clientZipCode);
		client.setClientDown (clientDown);
		client.setClientProvince (clientProvince);
		client.setClientDNI (clientDNI); 
		client.setClientPhoneContact (clientPhoneContact);
		client.setClientPersonContact (clientPersonContact);
		client.setClientNotes1 (clientNotes1);
		client.setClientNotes2 (clientNotes2);
		client.setClientNotes3 (clientNotes3);
		client.setClientLimitCredit (clientLimitCredit);
		client.setOutstandingAmount (outstandingAmount);
		client.setClientLastDateFood (clientLastDateFood);
		client.setClientAmountSpent (clientAmountSpent);
		client.setClientDiners (clientDiners);
		client.setClientTimesToEat (clientTimesToEat);
		client.setClientObservation1 (clientObservation1);
		client.setClientObservation2 (clientObservation2);
		client.setClientObservation3 (clientObservation3);
		client.setClientObservation4 (clientObservation4);
		client.setLedgerAccount (ledgerAccount);
		client.setLedgerAccountType (ledgerAccountType);
		client.setTypeCode (typeCode);
		client.setChannelSegment (channelSegment);
		client.setSendEmail (sendEmail);
		client.setClientEmail (clientEmail);
		client.setSendSMS (sendSMS);
		return null;
	}

	public void importClientFile(String path) throws IOException, NumberFormatException, ParseException {

		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");
			
//			/PRINT Edited lines
			System.out.print("code " + row[0].replace('"', ' ').trim());
			System.out.print(" name " + row[1].replace('"', ' ').trim());
			System.out.print("address " + row[2].replace('"', ' ').trim());
			System.out.print("zip code " + row[3].replace('"', ' ').trim());
			System.out.print("down " + row[4].replace('"', ' ').trim());
			System.out.print("province " + row[5].replace('"', ' ').trim());
			System.out.print("cif dni " + row[6].replace('"', ' ').trim());
			System.out.print("tc " + row[7].replace('"', ' ').trim());
			System.out.print("pc " + row[8].replace('"', ' ').trim());
			System.out.print("note1 " + row[9].replace('"', ' ').trim());
			System.out.print("note2 " + row[10].replace('"', ' ').trim());
			System.out.print("note3 " + row[11].replace('"', ' ').trim());
			System.out.print("Limit credit " + Double.parseDouble(row[12].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("Outstanding amount " + Double.parseDouble(row[13].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("Last date food " + stringToCalendar(row[14].replace('"', ' ').trim()));
			System.out.print("Amunt spent " + Double.parseDouble(row[15].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("Dinners " + Double.parseDouble(row[16].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("Times to eat " + Double.parseDouble(row[17].replace('"', ' ').replace(',', '.').trim()));
			System.out.print("obs1 " + row[18].replace('"', ' ').trim());
			System.out.print("obs2 " + row[19].replace('"', ' ').trim());
			System.out.print("obs3 " + row[20].replace('"', ' ').trim());
			System.out.print("obs4 " + row[21].replace('"', ' ').trim());
			System.out.print("ledger Account " + row[22].replace('"', ' ').trim());
			System.out.print("ledger Account type" + row[23].replace('"', ' ').trim());
			System.out.println();

			/*
			String typeCode
			ChannelSegment channelSegment
			boolean sendEmail
			String clientEmail
			boolean sendSMS
			/*
			 PRINT File line*/
			System.out.print(j + ":");
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i].trim() + " ");
			}
			System.out.println();
			j++;
			
			
			Client client = new Client(
					row[1].replace('"', ' ').trim(),
					row[2].replace('"', ' ').trim(),
					row[3].replace('"', ' ').trim(),
					row[4].replace('"', ' ').trim(),
					row[5].replace('"', ' ').trim(),
					row[6].replace('"', ' ').trim(),
					row[7].replace('"', ' ').trim(),
					row[8].replace('"', ' ').trim(),
					row[9].replace('"', ' ').trim(),
					row[10].replace('"', ' ').trim(),
					row[11].replace('"', ' ').trim(),
					Double.parseDouble(row[12].replace('"', ' ').replace(',', '.').trim()),
					Double.parseDouble(row[13].replace('"', ' ').replace(',', '.').trim()),
					stringToCalendar(row[14].replace('"', ' ').trim()),
					Double.parseDouble(row[15].replace('"', ' ').replace(',', '.').trim()),
					0,//Double.parseDouble(row[16].replace('"', ' ').replace(',', '.').trim()),
					0,//Double.parseDouble(row[17].replace('"', ' ').replace(',', '.').trim()),
					row[18].replace('"', ' ').trim(),
					row[19].replace('"', ' ').trim(),
					row[20].replace('"', ' ').trim(),
					row[21].replace('"', ' ').trim(),
					row[22].replace('"', ' ').trim(),
					row[23].replace('"', ' ').trim(),
					"E",
					channelSegmentDao.findChannelSegmentByValue("DIR"),
					false,
					"",
					false
					);
			createClient(client);
			
		}
	}

	private Calendar stringToCalendar(String dateAsString) throws ParseException {
		Calendar dateAsCalendar = Calendar.getInstance();
		String dateWithFormat = dateAsString.substring(0,4) + "-" + dateAsString.substring(4, 6) + "-" + dateAsString.substring(6,8);
		Date date = getDateFormatter().parse(dateWithFormat);
		dateAsCalendar.setTime(date);
		return dateAsCalendar;
	}

	/**
	 * It helps to generate pretty REST-like URLs.
	 */
	private DateFormat getDateFormatter() {
		SimpleDateFormat dateFormat =
            (SimpleDateFormat) DateFormat.getDateInstance();
        dateFormat.applyPattern("yyyy-MM-dd");

        return dateFormat;

	}

}


//|0 code |1  name |2 address |3 zip code |4 down |5 province |6 cif dni |7 tc |8 pc |9 note 1 |10 note 2 |11 note 3 |12 limit credit 
//|13  outstandingAmount |14 LastDateFood |15 AmountSpent |16 clientDiners|17 clientTimesToEat |18 obs1 |19 obs2|20 obs3 
//|21 obs4 |22 ledgerAccount |23 ledgerAccountType 
//00008;IDESA PARFUM                  ;VIA AUGUSTA, 59 - 9§          ;08006;BARCELONA                ;BARCELONA      ;A08144172      ;
//619005264      ;ANGELES MENENDEZ    ;                              ;                              ;                              ;
//0,00;      9930,94;20070228;     10965,73;       123,00;        11,00;                                    ;                                    ;                                    ;                                    ;43010008;C;     
