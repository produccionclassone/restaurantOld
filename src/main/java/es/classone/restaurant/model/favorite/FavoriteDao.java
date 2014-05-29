package es.classone.restaurant.model.favorite;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface FavoriteDao extends GenericDao<Favorite, Integer> {

	 public List<Favorite> getFavoritesByUserId(int userId);
}
