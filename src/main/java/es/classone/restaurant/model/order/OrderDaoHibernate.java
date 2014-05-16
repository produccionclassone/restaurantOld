package es.classone.restaurant.model.order;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;
@Repository("orderDao")
public class OrderDaoHibernate extends GenericDaoHibernate<Order, Long> implements OrderDao {

}
