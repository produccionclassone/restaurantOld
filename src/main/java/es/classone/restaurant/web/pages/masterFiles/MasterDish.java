package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dish.DishHeader;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterDish {

	// @Component
	// private Form tableForm;

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
		int lastId=0;
		if (size == 0) {
			try {
				masterFilesService
						.importDishFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91PLA.TXT");
				// masterFilesService.importDishFile("C:/Users/VaninaBusto/Documents/RES91PLA.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			lastId = dishlist.get(size - 1).getDishId();
			
		}
		links = new ArrayList<>();
		for (int i = 1; i < 2000; i++) {
			links.add(lastId + i);
		}

	}

//	void onValidateFromTableForm() throws InstanceNotFoundException,
//			NumberFormatException, DuplicateInstanceException {
//
//		if (dishGroupId == -1) {
//			DishGroup dishgroup = new DishGroup(dishGroupCode, dishGroupDesc,
//					ivaType, salesLedgerAccount, typeIncome, macroGroup);
//			dishGroupId = masterFilesService.createDishGroup(dishgroup)
//					.getDishGroupId();
//			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
//				public void run(JavaScriptSupport javascriptSupport) {
//					JSONObject newRow = new JSONObject();
//					newRow.put("dishGroupId", dishGroupId);
//					newRow.put("dishGroupCode", dishGroupCode);
//					newRow.put("dishGroupDescription", dishGroupDesc);
//					newRow.put("ivaType", ivaType);
//					newRow.put("salesLedgerAccount", salesLedgerAccount);
//					newRow.put("typeIncome", typeIncome);
//					newRow.put("macroGroup", macroGroup);
//					javascriptSupport
//							.addInitializerCall("addDishGroup", newRow);
//				}
//			});
//		} else {
//			masterFilesService.editDishGroup(dishGroupId, dishGroupCode,
//					dishGroupDesc, ivaType, macroGroup, salesLedgerAccount,
//					typeIncome);
//
//		}
//	}
//
//	void onEdit(int id) throws InstanceNotFoundException {
//		dishGroup = masterFilesService.getDishGroupByDishGroupId(id);
//		dishGroupId = dishGroup.getDishGroupId();
//		dishGroupCode = dishGroup.getDishGroupCode();
//		System.out.println(dishGroupCode);
//		dishGroupDesc = dishGroup.getDishGroupDescription();
//		ivaType = dishGroup.getivaType();
//		salesLedgerAccount = dishGroup.getsalesLedgerAccount();
//		macroGroup = dishGroup.getmacroGroup();
//		typeIncome = dishGroup.gettypeIncome();
//		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
//			public void run(JavaScriptSupport javascriptSupport) {
//				javascriptSupport.addScript(String
//						.format(" $('#modal').modal('show'); "
//								+ "$('#modal').on('shown.bs.modal', function() {"
//								+ "			$('.focus').focus();});"));
//			}
//		});
//		ajaxResponseRenderer.addRender(zone);
//	}
//
//	void onDelete(Long row) {
//		try {
//			masterFilesService.deleteClient(row);
//		} catch (InstanceNotFoundException e) {
//			System.out.println("error al eliminar");
//		}
//	}
//
//	// Valores por defecto en el formulario de inserción
//	void onInsert() {
//
//		dishGroupId = -1;
//		dishGroupDesc = "";
//		ivaType = 1;
//		salesLedgerAccount = "70000000";
//		macroGroup = 1;
//		typeIncome = "";
//		ajaxResponseRenderer.addRender(zone);
//		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
//			public void run(JavaScriptSupport javascriptSupport) {
//				javascriptSupport.addScript(String
//						.format(" $('#modal').modal('show'); "
//								+ "$('#modal').on('shown.bs.modal', function() {"
//								+ "			$('.focus').focus();});"));
//			}
//		});
//	}
//
//	void onSuccess() {
//		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
//			public void run(JavaScriptSupport javascriptSupport) {
//				javascriptSupport.addScript(String
//						.format(" $('#modal').modal('hide');"));
//			}
//		});
//
//	}
//
//	void afterRender() {
//		ajaxResponseRenderer.addRender(tableZone);
//		javaScriptSupport.addScript(String.format("$('#table').show();"));
//	}

}
