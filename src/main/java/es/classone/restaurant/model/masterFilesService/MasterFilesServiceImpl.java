package es.classone.restaurant.model.masterFilesService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@SuppressWarnings("unused")
	@Override
	public void importDishFile(String path) throws IOException {
		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			System.out.println("LINEA" + j);
			String[] row = myLine.split(";");
			Dish dish = new Dish(
					row[0].replace('"', ' ').trim(),
					row[1].replace('"', ' ').trim(),
					row[2].replace('"', ' ').trim(),
					row[3].replace('"', ' ').trim(),
					Integer.parseInt(row[5].replace('"', ' ').trim()),
					Integer.parseInt(row[6].replace('"', ' ').trim()),
					Double.parseDouble(row[7].replace('"', ' ').trim()),
					Double.parseDouble(row[8].replace('"', ' ').trim()),
					row[9].replace('"', ' ').trim(),
					false,
					false,
					dishGroupDao.findByCode(row[4].trim()),
					false,
					false,
					false,
					0,
					"",
					"");
			for (int i = 0; i < row.length; i++) {
				System.out.print("string " + i + ": "
						+ row[i].replace('"', ' '));
			}
			j++;
		}
		
	}
}



/*
CODE;DESC1;DESC2;DESC3;GRUPO;PRINT;LISTAPRECIOS;PRECIOVTA;PRECIOCOSTE;TYPE;PENDING
"0001";"VARIOS";"";"";"01";1;0;0,00;0,00;"P";" "
*/
