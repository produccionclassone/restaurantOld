package es.classone.restaurant.model.userprofile;

import es.classone.restaurant.modelutil.dao.GenericDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;




public interface UserProfileDao extends GenericDao<UserProfile, Long>{

    /**
     * Returns an UserProfile by login name (not user identifier)
     *
     * @param loginName the user identifier
     * @return the UserProfile
     */
    public UserProfile findByLoginName(String loginName) throws InstanceNotFoundException;
}
