package es.classone.restaurant.model.dish;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.model.dishGroup.DishGroup;
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
	
	public Dish findByCode(String dishCode) {
		return (Dish) (getSession()
				.createQuery(
						"SELECT d FROM Dish d WHERE d.dishCode = : dishCode")
				.setParameter("dishCode", dishCode)
				.uniqueResult());
	}
}
