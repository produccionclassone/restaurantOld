package es.classone.restaurant.model.client;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("clientDao")
public class ClientDaoHibernate extends GenericDaoHibernate<Client, Long>
		implements ClientDao {
	
	@SuppressWarnings("unchecked")
	public List<Client> findAll() {
		return (getSession()
				.createQuery(
						"SELECT c FROM Client c")
				.list());
	}
	
	public Client findByCode(String clientCode) {
		return (Client) (getSession()
				.createQuery(
						"SELECT c FROM Client c WHERE c.clientCode = : clientCode")
				.setParameter("clientCode", clientCode)
				.uniqueResult());
	}

}
