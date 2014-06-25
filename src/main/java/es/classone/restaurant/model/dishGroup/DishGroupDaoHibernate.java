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
						"SELECT dg FROM DishGroup dg WHERE dg.deleted = 'false'")
				.list());
	} 
	
	public DishGroup findByCode(String dishGroupCode) {
		
		return (DishGroup) (getSession()
				.createQuery(
						"SELECT dg FROM DishGroup dg WHERE "
								+ "dg.dishGroupCode = :dishGroupCode"
								+ " and dg.deleted = 'false'")
				.setParameter("dishGroupCode", dishGroupCode)
				.uniqueResult());
	}
	
	public boolean existDishGroupCode (String dishGroupCode) {
		DishGroup dishGroup = (DishGroup) (getSession()
				.createQuery(
						"SELECT dg FROM DishGroup dg WHERE "
								+ "dg.dishGroupCode = :dishGroupCode"
								+ " and dg.deleted = 'false'")
				.setParameter("dishGroupCode", dishGroupCode)
				.uniqueResult());
		return dishGroup != null;
	}

}
