package es.classone.restaurant.model.command;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("commandDao")
public class CommandDaoHibernate extends GenericDaoHibernate<Command, Integer>
		implements CommandDao {

}
