package es.classone.restaurant.model.qualifier;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface QualifierDao extends GenericDao<Qualifier, Integer> {
	
	public List<Qualifier> findAll();
}
