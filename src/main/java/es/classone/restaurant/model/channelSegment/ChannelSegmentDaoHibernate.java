package es.classone.restaurant.model.channelSegment;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.classone.restaurant.modelutil.dao.GenericDaoHibernate;

@Repository("channelSegmentDao")
public class ChannelSegmentDaoHibernate extends GenericDaoHibernate<ChannelSegment, Integer> implements ChannelSegmentDao{

	@SuppressWarnings("unchecked")
	public List<ChannelSegment> findAll () {
		return getSession()
				.createQuery(
						"SELECT cs FROM ChannelSegment cs")
				.list();
	}
	
	public ChannelSegment findChannelSegmentByValue (String channelValue) {
		return (ChannelSegment) (getSession()
				.createQuery(
						"SELECT cs FROM ChannelSegment cs WHERE cs.channelValue = :channelValue")
				.setParameter("channelValue", channelValue)
				.uniqueResult());
		
	}
}

