package es.classone.restaurant.model.channelSegment;

import java.util.List;

import es.classone.restaurant.modelutil.dao.GenericDao;

public interface ChannelSegmentDao extends GenericDao<ChannelSegment,Integer> {

	public List<ChannelSegment> findAll();
	public ChannelSegment findChannelSegmentByValue (String channelValue);	
}
