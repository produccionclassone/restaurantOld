package es.classone.restaurant.model.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("clientDao")
public class ClientDaoHibernate extends GenericDaoHibernate<Client, Long>
		implements ClientDao {

	public List<ClientHeader> findAll() {
		ArrayList<ClientHeader> clients=new ArrayList<ClientHeader>();
		Query result=(getSession()
				.createQuery(
						"SELECT c.clientId, c.clientName, c.clientZipCode, c.clientDNI, c.clientPhoneContact  FROM Client c")
				);
		@SuppressWarnings("rawtypes")
		List l=result.list();
		System.out.println("SIZE_____"+ l.size());
		for(int i=0;i<l.size();i++)  {
			 Object o[] = (Object []) l.get(i);
		   ClientHeader cp = new ClientHeader((Long)o[0], (String)o[1], (String)o[2],(String)o[3],(String)o[4]);
		   clients.add(cp);
		}
		return clients;
	}
	
	public Client findByCode(String clientCode) {
		return (Client) (getSession()
				.createQuery(
						"SELECT c FROM Client c WHERE c.clientCode = : clientCode")
				.setParameter("clientCode", clientCode)
				.uniqueResult());
	}

}
