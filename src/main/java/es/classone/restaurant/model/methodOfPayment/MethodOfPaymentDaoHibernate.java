package es.classone.restaurant.model.methodOfPayment;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("mehtodOfPaymentDao")
public class MethodOfPaymentDaoHibernate extends
		GenericDaoHibernate<MethodOfPayment, Integer> implements
		MethodOfPaymentDao {

}
