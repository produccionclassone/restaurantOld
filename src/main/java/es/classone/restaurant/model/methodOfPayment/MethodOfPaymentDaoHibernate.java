package es.classone.restaurant.model.methodOfPayment;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("mehtodOfPaymentDao")
public class MethodOfPaymentDaoHibernate extends
		GenericDaoHibernate<MethodOfPayment, Integer> implements
		MethodOfPaymentDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<MethodOfPayment> findAll() {
		return getSession()
				.createQuery(
						"SELECT mp FROM MethodOfPayment mp")
				.list();
	}

}
