package es.classone.restaurant.model.masterFilesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.dishGroup.DishGroupDao;

@Service("masterFilesService")
@Transactional
public class MasterFilesServiceImpl implements MasterFilesService {

	@Autowired
	private DishGroupDao dishGroupDao;

	public List<DishGroup> findAll() {
		return dishGroupDao.findAll();
	}

}
