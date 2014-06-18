package es.classone.restaurant.model.dish;

import java.util.List;

import org.springframework.stereotype.Repository;
import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;


@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Integer> implements DishDao{
	
	@SuppressWarnings("unchecked")
	public List<Dish> findAll() {
		boolean dishDeleted = false;
		return (getSession()
				.createQuery("SELECT d FROM Dish d WHERE d.dishDeleted = :dishDeleted")
				.setParameter("dishDeleted", dishDeleted)
				.list());
	} 
}
