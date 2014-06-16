package es.classone.restaurant.model.masterFilesService;

import java.io.IOException;
import java.util.List;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface MasterFilesService {
	public List<DishGroup> findAll();
	
	public DishGroup createDishGroup(DishGroup dishGroup);
	
	public DishGroup getDishGroupByDishGroupId(int dishgroupId) throws InstanceNotFoundException;

	public void deleteDishGroup(int dishGroupId) throws InstanceNotFoundException;
	
	public DishGroup editDishGroup(int dishGroupId, String dishGroupCode,
			String dishGroupDescription, int ivaType, int macroGroup,
			String salesLedgerAccount, String typeIncome) throws InstanceNotFoundException;
	public void importDishGroupFile(String path) throws IOException;
	
}
