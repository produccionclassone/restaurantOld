package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dish.DishHeader;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterDish {
	
//	@Component
//	private Form tableForm;
	


	@Property
	private List<DishHeader> dishlist;

	@Property
	private Dish dish;
	@Property
	private DishHeader dishHead;
	@Property
	private String dishCode;
	
	@Property
	private String dishId;

	@Property
	private String dishDescriptionLang1;

	@Property
	private String dishDescriptionLang2;

	@Property
	private String dishDescriptionLang3;

	@Property
	private int dishPrint;

	@Property
	private int dishListPrice;

	@Property
	private double dishPVP;

	@Property
	private double dishCostPrice;

	@Property
	private String dishType;

	@Property
	private boolean dishDiscount;

	@Property
	private boolean dishPending;

	@Property
	private DishGroup dishGroup;

	@Property
	private boolean dishTractable;

	@Property
	private boolean dishOrderer;

	@Property
	private boolean dishVisible;

	@Property
	private int dishNumbers;

	@Property
	private String dishLongDesc;

	@Property
	private String dishShortDesc;

	@Inject
	private MasterFilesService masterFilesService;

	@Property
	private ArrayList<Integer> links;
	@Property
	private int link;
	
//	@InjectComponent
//	private Zone zone;

	@InjectComponent
	private Zone tableZone;

	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;

	@Inject
	private JavaScriptSupport javaScriptSupport;


	void setupRender() {
		dishlist = masterFilesService.findAllDish();
		int size = dishlist.size();
		
		if (size == 0) {
			try {
				 masterFilesService.importDishFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91PLA.TXT");
//				masterFilesService.importDishFile("C:/Users/VaninaBusto/Documents/RES91PLA.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			int lastId = dishlist.get(size - 1).getDishId();
			System.out.println(lastId);
			links = new ArrayList<>();
			for (int i = 1; i < 2000; i++) {
				links.add(lastId + i);
			}
		}

	}



	void afterRender() {
	}

}
