package es.classone.restaurant.model.client;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;


public interface ClientDao extends GenericDao<Client, Long> {

	public List<Client> findAll();
	public Client findByCode(String clientCode);
}
