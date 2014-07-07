package es.classone.restaurant.model.methodOfPayment;

import java.util.List;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.modelutil.dao.GenericDao;



public interface MethodOfPaymentDao extends GenericDao<MethodOfPayment, Integer> {
	public List<MethodOfPayment> findAll();
}
