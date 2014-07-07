package es.classone.restaurant.model.currency;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("currencyDao")
public class CurrencyDaoHibernate extends GenericDaoHibernate<Currency, Integer>
		implements CurrencyDao {

	@SuppressWarnings("unchecked")
	public List<Currency> findAll() {
		return (getSession()
				.createQuery(
						"SELECT c FROM Currency c")
				.list());
	}

}
