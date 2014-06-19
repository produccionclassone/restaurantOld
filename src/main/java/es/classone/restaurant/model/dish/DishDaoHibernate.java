package es.classone.restaurant.model.dish;

import java.util.List;

import org.springframework.stereotype.Repository;
import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;


@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Integer> implements DishDao{
	
	@SuppressWarnings("unchecked")
	public List<Dish> findAll() {
		return (getSession()
				.createQuery(
						"SELECT d FROM Dish d")
				.list());
	} 
}
