package es.classone.restaurant.model.dishGroup;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface DishGroupDao extends GenericDao<DishGroup, Integer> {
	public List<DishGroup> findAll();
}
