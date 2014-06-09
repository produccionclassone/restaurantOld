package es.classone.restaurant.model.masterFilesService;

import java.util.List;

import es.classone.restaurant.model.dishGroup.DishGroup;

public interface MasterFilesService {
	public List<DishGroup> findAll();
	
	public DishGroup createDishGroup(DishGroup dishGroup);
//modifyDishGroup
//deleteDishGroup
	
}
