package es.classone.restaurant.model.dish;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;


@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Integer> implements DishDao{

}
