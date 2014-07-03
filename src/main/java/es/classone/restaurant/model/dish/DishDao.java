package es.classone.restaurant.model.dish;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;


public interface DishDao extends GenericDao<Dish, Integer>{

	public List<DishHeader> findAll();
	public Dish findByCode(String dishCode);	
}
