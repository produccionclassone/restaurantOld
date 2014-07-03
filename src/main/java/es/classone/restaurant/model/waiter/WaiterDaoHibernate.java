package es.classone.restaurant.model.waiter;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("waiterDao")
public class WaiterDaoHibernate extends GenericDaoHibernate<Waiter, Integer>
		implements WaiterDao {
	
	public List<WaiterHeader> findAll() {
		ArrayList<WaiterHeader> waiters=new ArrayList<WaiterHeader>();
		Query result=(getSession()
				.createQuery(
						"SELECT w.waiterId, w.waiterName, w.waiterZip, w.waiterDNI, w.waiterPhone  FROM Waiter w")
				);
		@SuppressWarnings("rawtypes")
		List l=result.list();
		for(int i=0;i<l.size();i++)  {
			 Object o[] = (Object []) l.get(i);
		   WaiterHeader wh = new WaiterHeader((Integer)o[0], (String)o[1], (String)o[2],(String)o[3],(String)o[4]);
		   waiters.add(wh);
		}
		return waiters;
	}

}
