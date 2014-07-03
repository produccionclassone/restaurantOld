package es.classone.restaurant.model.waiter;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface WaiterDao extends GenericDao<Waiter, Integer> {

	public List<WaiterHeader> findAll();
}
