package es.classone.restaurant.model.configurationRoom;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface ConfigurationRoomDao extends
		GenericDao<ConfigurationRoom, Integer> {
	List<ConfigurationRoom> findAll();
}
