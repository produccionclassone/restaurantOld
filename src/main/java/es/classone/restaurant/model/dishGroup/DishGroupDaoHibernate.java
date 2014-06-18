package es.classone.restaurant.model.dishGroup;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("dishGroupDao")
public class DishGroupDaoHibernate extends
		GenericDaoHibernate<DishGroup, Integer> implements DishGroupDao {

	@SuppressWarnings("unchecked")
	public List<DishGroup> findAll() {
		return (getSession()
				.createQuery(
						"SELECT dg FROM DishGroup dg")
				.list());
	} 
	
	//get by dishgroupId
	
	public DishGroup findByCode(String dishGroupCode) {
		return (DishGroup) (getSession()
				.createQuery(
						"SELECT dg FROM DishGroup dg WHERE dg:dishGroupcode = : dishGroupCode")
				.setParameter("dishGroupCode", dishGroupCode)
				.uniqueResult());
	}

}
