package es.classone.restaurant.model.dish;

import java.util.List;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.modelutil.dao.GenericDao;





public interface DishDao extends GenericDao<Dish, Integer>{
	public List<Dish> findAll(); // Devuelve los platos que no han sido borrados (dishDeleted == false)

	public Dish findByCode(String dishCode);	
}
