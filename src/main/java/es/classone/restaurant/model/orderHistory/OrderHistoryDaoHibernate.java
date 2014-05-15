package es.classone.restaurant.model.orderHistory;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("orderHistroyDao")
public class OrderHistoryDaoHibernate extends GenericDaoHibernate<OrderHistory,Long> implements OrderHistoryDao {

}
