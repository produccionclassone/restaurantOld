package es.classone.restaurant.model.booking;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("bookingDao")
public class BookingDaoHibernate extends GenericDaoHibernate<Booking, Long> implements BookingDao {

}
