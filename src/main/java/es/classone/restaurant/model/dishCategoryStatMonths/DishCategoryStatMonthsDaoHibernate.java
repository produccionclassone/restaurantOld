package es.classone.restaurant.model.dishCategoryStatMonths;

import org.springframework.stereotype.Repository;

import es.udc.pojo.modelutil.dao.GenericDaoHibernate;

@Repository("dishCategoryStatMonthsDao")
public class DishCategoryStatMonthsDaoHibernate extends
		GenericDaoHibernate<DishCategoryStatMonths, Long> implements
		DishCategoryStatMonthsDao {

}
