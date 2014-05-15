package es.classone.restaurant.model.tableStatus;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("TableStatusDao")
public class TableStatusDaoHibernate extends
		GenericDaoHibernate<TableStatus, Long> implements TableStatusDao {

}
