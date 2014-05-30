package es.classone.restaurant.model.favorite;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("favoriteDao")
public class FavoriteDaoHibernate extends
		GenericDaoHibernate<Favorite, Integer> implements FavoriteDao {

	@SuppressWarnings("unchecked")
	public List<Favorite> getFavoritesByUserId(int usrId) {
		return getSession()
				.createQuery(
						"SELECT f FROM Favorite f "
								+ "WHERE f.userProfile.userProfileId = :usrId ")
				.setParameter("usrId", usrId).list();
	}
}
