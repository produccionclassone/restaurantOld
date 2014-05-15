package es.classone.restaurant.model.session;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("sessionDao")
public class SessionDaoHibernate extends GenericDaoHibernate<Session, Integer>
		implements SessionDao {

}
