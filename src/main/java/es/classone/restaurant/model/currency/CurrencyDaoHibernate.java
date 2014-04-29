package es.classone.restaurant.model.currency;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("currencyDao")
public class CurrencyDaoHibernate extends GenericDaoHibernate<Currency, Long>
		implements CurrencyDao {

}
