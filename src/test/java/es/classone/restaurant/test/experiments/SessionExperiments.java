package es.classone.restaurant.test.experiments;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.classone.restaurant.model.userprofile.UserProfile;
import es.classone.restaurant.model.userservice.util.PasswordEncrypter;

public class SessionExperiments {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			// Register user.
			UserProfile userProfile = new UserProfile("sessionUser",
					PasswordEncrypter.crypt("userPassword"),"user@udc.es",'1',"ipI","IpE","mac");
			session.saveOrUpdate(userProfile);
			int userId = userProfile.getUserProfileId();
			System.out.println("User with userId '" + userId
					+ "' has been created");
			System.out.println(userProfile);

			// Find user.
			userProfile = (UserProfile) session.get(UserProfile.class, userId);
			if (userProfile != null) {
				System.out.println("User with userId '" + userId
						+ "' has been retrieved");
				System.out.println(userProfile);
			} else {
				System.out.println("User with userId '" + userId
						+ "' has not been found");
			}
			
			// ... proceed in the same way for other entities / methods /use cases

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}

		HibernateUtil.shutdown();

	}
}
