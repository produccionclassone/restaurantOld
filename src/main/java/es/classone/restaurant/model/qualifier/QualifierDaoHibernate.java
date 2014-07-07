package es.classone.restaurant.model.qualifier;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("qualifierDao")
public class QualifierDaoHibernate extends
		GenericDaoHibernate<Qualifier, Integer> implements QualifierDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Qualifier> findAll() {

			return (getSession()
					.createQuery(
							"SELECT q FROM Qualifier q")
					.list());
		} 
	
}
