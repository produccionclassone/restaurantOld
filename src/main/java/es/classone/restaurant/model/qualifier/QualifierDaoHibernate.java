package es.classone.restaurant.model.qualifier;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("qualifierDao")
public class QualifierDaoHibernate extends GenericDaoHibernate<Qualifier, Long>
		implements QualifierDao {

}
