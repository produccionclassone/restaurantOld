package es.classone.restaurant.web.pages.masterFiles;

import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterDishGroup {
	@Property
	private List<DishGroup> dishgroups;
	@Property
	private DishGroup dishGroup;
	@Inject
	private MasterFilesService masterFilesService;

	void setupRender() {
		dishgroups = masterFilesService.findAll();
	}

}
