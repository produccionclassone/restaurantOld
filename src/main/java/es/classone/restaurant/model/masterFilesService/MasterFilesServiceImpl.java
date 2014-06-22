package es.classone.restaurant.model.masterFilesService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.client.ClientDao;
import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dish.DishDao;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.dishGroup.DishGroupDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("masterFilesService")
@Transactional
public class MasterFilesServiceImpl implements MasterFilesService {

	@Autowired
	private DishGroupDao dishGroupDao;

	@Autowired DishDao dishDao;
	
	@Autowired
	private ClientDao clientDao;
	
	public List<DishGroup> findAll() {
		return dishGroupDao.findAll();
	}

	public DishGroup createDishGroup(DishGroup dishGroup) {
		dishGroupDao.save(dishGroup);
		return dishGroup;
	}

	public void deleteDishGroup(int dishGroupId)
			throws InstanceNotFoundException {
		dishGroupDao.find(dishGroupId);
		dishGroupDao.remove(dishGroupId);
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

	public void importDishGroupFile(String path) throws IOException {

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
		int j = 1;
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


	public List<Client> findAllClient() {
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

	public Client editClient()
			throws InstanceNotFoundException {
		return null;
	}

	public void importClientFile(String path) throws IOException {

		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			String[] row = myLine.split(";");

			/* PRINT Edited lines*/ 
			System.out.println ("code " + row[0].replace('"', ' ').trim());
			System.out.println (" name " + row[1].replace('"', ' ').trim());
			System.out.println ("address " + row[2].replace('"', ' ').trim());
			System.out.println ("zip code " + row[3].replace('"', ' ').trim());
			System.out.println ("down " + row[4].replace('"', ' ').trim());
			System.out.println ("province " + row[5].replace('"', ' ').trim());
			System.out.println ("cif dni " + row[6].replace('"', ' ').trim());
			System.out.println ("tc " + row[7].replace('"', ' ').trim());
			System.out.println ("pc " + row[8].replace('"', ' ').trim());
			System.out.println ("note1 " + row[9].replace('"', ' ').trim());
			System.out.println ("note2 " + row[10].replace('"', ' ').trim());
			System.out.println ("note3 " + row[11].replace('"', ' ').trim());
			System.out.println ("Limit credit " + Double.parseDouble(row[12].replace('"', ' ').trim()));
			System.out.println ("Outstanding amount " + Double.parseDouble(row[13].replace('"', ' ').trim()));
			System.out.println ("Last date food " + row[14].replace('"', ' ').trim());
			System.out.println ("Amunt spent " + Double.parseDouble(row[15].replace('"', ' ').trim()));
			System.out.println ("Dinners " + Integer.parseInt(row[16].replace('"', ' ').trim()));
			System.out.println ("Times to eat " + Integer.parseInt(row[17].replace('"', ' ').trim()));
			System.out.println ("obs1 " + row[18].replace('"', ' ').trim());
			System.out.println ("obs2 " + row[19].replace('"', ' ').trim());
			System.out.println ("obs3 " + row[20].replace('"', ' ').trim());
			System.out.println ("obs4 " + row[21].replace('"', ' ').trim());
			System.out.println ("ledger Account " + row[22].replace('"', ' ').trim());
			System.out.println ("ledger Account type" + row[23].replace('"', ' ').trim());
			System.out.println();
			/*
			String typeCode
			ChannelSegment channelSegment
			boolean sendEmail
			String clientEmail
			boolean sendSMS
			*/
	
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


}
//|0 code |1  name |2 address |3 zip code |4 down |5 province |6 cif dni |7 tc |8 pc |9 note 1 |10 note 2 |11 note 3 |12 limit credit 
//|13  outstandingAmount |14 LastDateFood |15 AmountSpent |16 clientDiners|17 clientTimesToEat |18 obs1 |19 obs2|20 obs3 
//|21 obs4 |22 ledgerAccount |23 ledgerAccountType 
//00008;IDESA PARFUM                  ;VIA AUGUSTA, 59 - 9§          ;08006;BARCELONA                ;BARCELONA      ;A08144172      ;
//619005264      ;ANGELES MENENDEZ    ;                              ;                              ;                              ;
//0,00;      9930,94;20070228;     10965,73;       123,00;        11,00;                                    ;                                    ;                                    ;                                    ;43010008;C;     
