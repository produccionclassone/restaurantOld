package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterDish {
	
	@Property
	private String dishCode;

	@Property
	private List<Dish> dishs;

	@Property
	private Dish dish;

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

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Inject
	private Request request;

	void setupRender() {
		dishs = masterFilesService.findAllDish();
		int size = dishs.size();
		
		if (size == 0) {
			dishCode = "00";
			try {
				// masterFilesService.importDishFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91PLA.TXT");
				masterFilesService
						.importDishFile("C:/Users/VaninaBusto/Documents/RES91PLA.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				dishCode = getNewCode(masterFilesService.getDishByDishId(size)
						.getDishCode());
			} catch (InstanceNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	private String getNewCode(String currentCode) {
		if (isNumeric(currentCode)) {
			if (currentCode.equals("99")) {
				return ("A0");
			} else
				return (String.valueOf(Integer.parseInt(currentCode) + 1));
		} else {
			String lastChar = currentCode.substring(1);
			if (isNumeric(lastChar)) {

				String firstChar = currentCode.substring(0, 1);
				return firstChar
						+ (String.valueOf(Integer.parseInt(lastChar) + 1));

			} else
				return ("ZZ");
		}

	}

	private boolean isNumeric(String s) {
		String pattern = "^[0-9]*$";
		if (s.matches(pattern)) {
			return true;
		}
		return false;
	}

	void onActivate() {
		if (request.getParameter("id") != null) {
			try {
				dishId = request.getParameter("id");
				dish = masterFilesService.getDishByDishId(Integer
						.parseInt(request.getParameter("id")));
				dishId = String.valueOf(dish.getDishId());

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstanceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
		}
	}

/*	void onValidateFromAddRowForm() {
		masterFilesService.createDish(new Dish(dishCode, dishDescriptionLang1,
				dishDescriptionLang2, dishDescriptionLang3, dishPrint,
				dishListPrice, dishPVP, dishCostPrice, dishType, dishDiscount,
				dishPending, dishGroup, dishTractable, dishOrderer,
				dishVisible, dishNumbers, dishLongDesc, dishShortDesc));
	}
*/
	void afterRender() {
		System.out.println("after");
	}

}
