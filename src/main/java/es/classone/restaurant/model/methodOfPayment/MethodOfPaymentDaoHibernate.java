package es.classone.restaurant.model.methodOfPayment;

import org.springframework.stereotype.Repository;

import es.udc.pojo.modelutil.dao.GenericDaoHibernate;

@Repository("mehtodOfPaymentDao")
public class MethodOfPaymentDaoHibernate extends GenericDaoHibernate<MethodOfPayment, Long> implements MethodOfPaymentDao {

}
