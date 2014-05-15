package es.classone.restaurant.model.configurationRoom;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("configurationRoomDao")
public class ConfigurationRoomDaoHibernate extends
		GenericDaoHibernate<ConfigurationRoom, Integer> implements
		ConfigurationRoomDao {

}
