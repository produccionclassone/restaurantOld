package es.classone.restaurant.model.configurationRoom;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationRoomDao")
public class ConfigurationRoomDaoHibernate extends
		GenericDaoHibernate<ConfigurationRoom, Integer> implements
		ConfigurationRoomDao {

	@SuppressWarnings("unchecked")
	public List<ConfigurationRoom> findAll() {
		List<ConfigurationRoom> list;
		list = (getSession()
				.createQuery("SELECT cr FROM ConfigurationRoom cr ").list());
		return list;
	}
}
