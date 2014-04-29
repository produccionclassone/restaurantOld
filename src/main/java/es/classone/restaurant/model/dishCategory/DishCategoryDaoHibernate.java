package es.classone.restaurant.model.dishCategory;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("dishCategoryDao")
public class DishCategoryDaoHibernate extends
		GenericDaoHibernate<DishCategory, Long> implements DishCategoryDao {

}
