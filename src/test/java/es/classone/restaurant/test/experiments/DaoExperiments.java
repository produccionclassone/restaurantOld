package es.classone.restaurant.test.experiments;

import org.hibernate.Transaction;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userprofile.UserProfileDao;
import es.classone.restaurant.model.userprofile.UserProfileDaoHibernate;
import es.classone.restaurant.model.userservice.util.PasswordEncrypter;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;


public class DaoExperiments {

	public static void main(String[] args) {

		UserProfileDaoHibernate userProfileDaoHibernate = new UserProfileDaoHibernate();
		userProfileDaoHibernate.setSessionFactory(HibernateUtil
				.getSessionFactory());
		UserProfileDao userProfileDao = userProfileDaoHibernate;

		Transaction tx = HibernateUtil.getSessionFactory().getCurrentSession()
				.beginTransaction();
		try {

			// Register user.
			UserProfile userProfile = new UserProfile("daoUser",
					PasswordEncrypter.crypt("userPassword"), "user@udc.es",'1',"ipI","ipE","mac");
			userProfileDao.save(userProfile);
			int userId = userProfile.getUserProfileId();
			System.out.println("User with userId '" + userId
					+ "' has been created");
			System.out.println(userProfile);

			// Find user.
			userProfile = userProfileDao.find(userId);
			System.out.println("User with userId '" + userId
					+ "' has been retrieved");
			System.out.println(userProfile);
			
			// ... proceed in the same way for other entities / methods / use cases

			tx.commit();

		} catch (RuntimeException e) {
			e.printStackTrace();
			tx.rollback();
		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
			tx.commit();
		} finally {
			HibernateUtil.getSessionFactory().getCurrentSession().close();
		}

		HibernateUtil.shutdown();

	}

}
