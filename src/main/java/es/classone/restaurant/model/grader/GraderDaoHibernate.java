package es.classone.restaurant.model.grader;

import org.springframework.stereotype.Repository;

import es.udc.pojo.modelutil.dao.GenericDaoHibernate;

@Repository("graderDao")
public class GraderDaoHibernate extends GenericDaoHibernate<Grader, Long>
		implements GraderDao {

}
