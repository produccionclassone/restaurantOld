package es.classone.restaurant.model.currency;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;



public interface CurrencyDao extends GenericDao<Currency, Integer>{

	
	public List<Currency> findAll();
}
