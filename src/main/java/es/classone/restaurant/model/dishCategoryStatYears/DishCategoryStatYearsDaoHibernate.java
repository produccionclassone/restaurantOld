package es.classone.restaurant.model.dishCategoryStatYears;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("dishCategoryStatYearsDao")
public class DishCategoryStatYearsDaoHibernate extends
		GenericDaoHibernate<DishCategoryStatYears, Long> implements
		DishCategoryStatYearsDao {


}
