package es.classone.restaurant.model.dish;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Integer>
		implements DishDao {
	public List<DishHeader> findAll() {
		ArrayList<DishHeader> dishlist = new ArrayList<DishHeader>();
		Query result = (getSession()
				.createQuery("SELECT d.dishId, d.dishCode, d.dishDescriptionLang1, d.dishPVP, d.dishCostPrice, d.dishGroup  FROM Dish d"));
		@SuppressWarnings("rawtypes")
		List l = result.list();
		System.out.println("SIZE_____" + l.size());
		for (int i = 0; i < l.size(); i++) {
			Object o[] = (Object[]) l.get(i);
			DishHeader dh = new DishHeader((Integer) o[0], (String) o[1],
					(String) o[2], (Double) o[3], (Double) o[4],
					(DishGroup) o[5]);
			dishlist.add(dh);
		}
		return dishlist;
	}

	public Dish findByCode(String dishCode) {
		return (Dish) (getSession().createQuery(
				"SELECT d FROM Dish d WHERE d.dishCode = : dishCode")
				.setParameter("dishCode", dishCode).uniqueResult());
	}
}
