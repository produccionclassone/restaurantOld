package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addDishGroup.js")
public class MasterDishGroup {

	@Component
	private Form tableForm;

	@Property
	private String dishGroupCode;

	@Property
	private String dishGroupDesc;

	@Property
	private String salesLedgerAccount;

	@Property
	private int ivaType;

	@Property
	private String typeIncome;

	@Property
	private int macroGroup;

	@Property
	private int dishGroupId = -1;

	@Property
	private List<DishGroup> dishgroups;

	@Property
	private DishGroup dishGroup;

	@Inject
	private MasterFilesService masterFilesService;
	@Inject
	private ConfigurationService configuration;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Property
	private ArrayList<Integer> links;

	@Property
	private Long link;

	@InjectComponent
	private Zone zone;

	@InjectComponent
	private Zone tableZone;

	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;

	@Inject
	private Request request;

	@Inject
	private Messages messages;

	void setupRender() throws DuplicateInstanceException {
		dishgroups = masterFilesService.findAll();
		int size = dishgroups.size();
		if (size == 0) {
			try {
				masterFilesService
						.importDishGroupFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91GRP.TXT");
				// masterFilesService.importDishGroupFile("C:/Users/VaninaBusto/Documents/RES91GRP.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			int lastId = dishgroups.get(size - 1).getDishGroupId();
			links = new ArrayList<>();
			for (int i = 1; i < 2000; i++) {
				links.add(lastId + i);
			}
		}

	}

	// private String getNewCode(String currentCode) {
	// if (isNumeric(currentCode)) {
	// if (currentCode.equals("99")) {
	// return ("A0");
	// } else
	// return (String.valueOf(Integer.parseInt(currentCode) + 1));
	// } else {
	// String lastChar = currentCode.substring(1);
	// if (isNumeric(lastChar)) {
	//
	// String firstChar = currentCode.substring(0, 1);
	// return firstChar
	// + (String.valueOf(Integer.parseInt(lastChar) + 1));
	//
	// } else
	// return ("ZZ");
	// }
	//
	// }
	//
	// private boolean isNumeric(String s) {
	// String pattern = "^[0-9]*$";
	// if (s.matches(pattern)) {
	// return true;
	// }
	// return false;
	// }

	// public String getCategories(){
	// List<Category> categories = sellService.findCategories();
	// String categoriesName = new String();
	//
	// for (Category category : categories) {
	// categoriesName =
	// categoriesName+category.getCategoryId()+"="+category.getName()+",";
	// }
	// return categoriesName;
	// }
	public String getIvaTypes() throws InstanceNotFoundException {
		String ivatypes = "1=1 - "
				+ (String.valueOf(configuration.getConfigurationGNByName(
						"ivaType1").getValue()))
				+ ",2=2 - "
				+ (String.valueOf(configuration.getConfigurationGNByName(
						"ivaType2").getValue()))
						+ ",3=3 - "+ (String.valueOf(configuration.getConfigurationGNByName(
								"ivaType3").getValue()));

		return ivatypes;
	}

	void onValidateFromTableForm() throws InstanceNotFoundException,
			NumberFormatException, DuplicateInstanceException {

		if (dishGroupId == -1) {
			DishGroup dishgroup = new DishGroup(dishGroupCode, dishGroupDesc,
					ivaType, salesLedgerAccount, typeIncome, macroGroup);
			dishGroupId = masterFilesService.createDishGroup(dishgroup)
					.getDishGroupId();
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					JSONObject newRow = new JSONObject();
					newRow.put("dishGroupId", dishGroupId);
					newRow.put("dishGroupCode", dishGroupCode);
					newRow.put("dishGroupDescription", dishGroupDesc);
					newRow.put("ivaType", ivaType);
					newRow.put("salesLedgerAccount", salesLedgerAccount);
					newRow.put("typeIncome", typeIncome);
					newRow.put("macroGroup", macroGroup);
					javascriptSupport
							.addInitializerCall("addDishGroup", newRow);
				}
			});
		} else {
			masterFilesService.editDishGroup(dishGroupId, dishGroupCode,
					dishGroupDesc, ivaType, macroGroup, salesLedgerAccount,
					typeIncome);

		}
	}

	void onEdit(int id) throws InstanceNotFoundException {
		dishGroup = masterFilesService.getDishGroupByDishGroupId(id);
		dishGroupId = dishGroup.getDishGroupId();
		dishGroupCode = dishGroup.getDishGroupCode();
		System.out.println(dishGroupCode);
		dishGroupDesc = dishGroup.getDishGroupDescription();
		ivaType = dishGroup.getivaType();
		salesLedgerAccount = dishGroup.getsalesLedgerAccount();
		macroGroup = dishGroup.getmacroGroup();
		typeIncome = dishGroup.gettypeIncome();
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('show'); "
								+ "$('#modal').on('shown.bs.modal', function() {"
								+ "			$('.focus').focus();});"));
			}
		});
		ajaxResponseRenderer.addRender(zone);
	}

	void onDelete(Long row) {
		try {
			masterFilesService.deleteClient(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	// Valores por defecto en el formulario de inserción
	void onInsert() {

		dishGroupId = -1;
		dishGroupDesc = "";
		ivaType = 1;
		salesLedgerAccount = "70000000";
		macroGroup = 1;
		typeIncome = "";
		ajaxResponseRenderer.addRender(zone);
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('show'); "
								+ "$('#modal').on('shown.bs.modal', function() {"
								+ "			$('.focus').focus();});"));
			}
		});
	}

	void onSuccess() {
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('hide');"));
			}
		});

	}

	void afterRender() {
		ajaxResponseRenderer.addRender(tableZone);
		javaScriptSupport.addScript(String.format("$('#table').show();"));
	}

}
