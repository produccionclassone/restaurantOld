package es.classone.restaurant.model.masterFilesService;

import java.io.IOException;
import java.util.List;

import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface MasterFilesService {
	public List<DishGroup> findAll();

	public DishGroup createDishGroup(DishGroup dishGroup);

	public DishGroup getDishGroupByDishGroupId(int dishgroupId)
			throws InstanceNotFoundException;

	public void deleteDishGroup(int dishGroupId)
			throws InstanceNotFoundException;

	public DishGroup editDishGroup(int dishGroupId, String dishGroupCode,
			String dishGroupDescription, int ivaType, int macroGroup,
			String salesLedgerAccount, String typeIncome)
			throws InstanceNotFoundException;

	public void importDishGroupFile(String path) throws IOException;

	public List<Dish> findAllDish();

	public Dish createDish(Dish dish);

	public Dish getDishByDishId(int dishId)
			throws InstanceNotFoundException;

	public void deleteDish(int dishId)
			throws InstanceNotFoundException;

	public Dish editDish(int dishId, String dishDescriptionLang1,String dishDescriptionLang2, String dishDescriptionLang3,
 						 int dishPrint, int dishListPrice, double dishPVP, double dishCostPrice, String dishType, boolean dishDiscount,
						 boolean dishDeleted,boolean dishPending,DishGroup dishGroup, boolean dishTractable,boolean dishOrderer,
						 boolean dishVisible, int dishNumbers, String dishLongDesc, String dishShortDesc) throws InstanceNotFoundException;

	public void importDishFile(String path) throws IOException;

}
