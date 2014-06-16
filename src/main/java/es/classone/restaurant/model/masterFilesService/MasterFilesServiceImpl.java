package es.classone.restaurant.model.masterFilesService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.dishGroup.DishGroupDao;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

@Service("masterFilesService")
@Transactional
public class MasterFilesServiceImpl implements MasterFilesService {

	@Autowired
	private DishGroupDao dishGroupDao;

	public List<DishGroup> findAll() {
		return dishGroupDao.findAll();
	}

	public DishGroup createDishGroup(DishGroup dishGroup) {
		dishGroupDao.save(dishGroup);
		return dishGroup;
	}

	public void deleteDishGroup(int dishGroupId)
			throws InstanceNotFoundException {
		dishGroupDao.find(dishGroupId);
		dishGroupDao.remove(dishGroupId);
	}

	public DishGroup getDishGroupByDishGroupId(int dishgroupId)
			throws InstanceNotFoundException {
		return dishGroupDao.find(dishgroupId);
	}

	public DishGroup editDishGroup(int dishGroupId, String dishGroupCode,
			String dishGroupDescription, int ivaType, int macroGroup,
			String salesLedgerAccount, String typeIncome)
			throws InstanceNotFoundException {
		DishGroup dishGroup = dishGroupDao.find(dishGroupId);
		dishGroup.setDishGroupCode(dishGroupCode);
		dishGroup.setDishGroupDescription(dishGroupDescription);
		dishGroup.setivaType(ivaType);
		dishGroup.setmacroGroup(macroGroup);
		dishGroup.setsalesLedgerAccount(salesLedgerAccount);
		dishGroup.settypeIncome(typeIncome);
		return dishGroup;

	}

	public void importDishGroupFile(String path) throws IOException {

		FileReader input = new FileReader(path);
		@SuppressWarnings("resource")
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		int j = 1;
		while ((myLine = bufRead.readLine()) != null) {
			System.out.println("LINEA" + j);
			String[] row = myLine.split(";");
			DishGroup dishGroup = new DishGroup(
					row[0].replace('"', ' ').trim(), row[1].replace('"', ' ')
							.trim(), Integer.parseInt(row[4].replace('"', ' ')
							.trim()), row[5].replace('"', ' ').trim(), row[7]
							.replace('"', ' ').trim(), Integer.parseInt(row[6]
							.replace('"', ' ').trim()));
			createDishGroup(dishGroup);
			for (int i = 0; i < row.length; i++) {
				System.out.print("string " + i + ": "
						+ row[i].replace('"', ' '));
			}
			j++;
		}
	}
}
