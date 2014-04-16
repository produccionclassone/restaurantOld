package es.classone.restaurant.model.dishCategory;

import org.springframework.stereotype.Repository;

import es.udc.pojo.modelutil.dao.GenericDaoHibernate;

@Repository("dishCategoryDao")
public class DishCategoryDaoHibernate extends
		GenericDaoHibernate<DishCategory, Long> implements DishCategoryDao {

}
