package es.classone.restaurant.modelutil.dao;

import java.io.Serializable;

import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;



public interface GenericDao <E, PK extends Serializable>{

	void save(E entity);

	E find(PK id) throws InstanceNotFoundException;

	void remove(PK id) throws InstanceNotFoundException;

}