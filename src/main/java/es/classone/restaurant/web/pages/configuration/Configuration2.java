package es.classone.restaurant.web.pages.configuration;

import java.util.HashMap;
import java.util.List;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoom;
import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;
import es.classone.restaurant.web.util.MapApp;
import es.classone.restaurant.web.util.Option;
import es.classone.restaurant.web.util.UserSession;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = { "context:javaScript/configuration.js" })
public class Configuration2 {

	@SessionState(create = false)
	private UserSession userSession;

	@Inject
	private ConfigurationService configurationService;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	/*
	 * ================ Diversos contadores==============
	 */
	private List<ConfigurationGeneric> cgList;
	private List<ConfigurationBool> cbList;
	private List<ConfigurationRoom> crList;

	@Inject
	private Request requestDivCont;

	@Component
	private Form diversosContadoresForm;

	@InjectComponent
	private Zone diversosContadoresFormZone;

	/*----------Contadores -------------------*/
	@Property
	private String actualSession;

	@Property
	private String lastBill;

	@Property
	private String lastCommand;

	@Property
	private String lastClient;

	@Property
	private String notaFiscal; // falta en BBDD

	/*----------General---------------*/
	@Property
	private String restCateg;

	@Property
	private String cadExplot;

	@Property
	private String tableNumber;

	@Property
	private Boolean covServChar;

	@Property
	private String covServCharImp;

	@Property
	private String covServCharIVAType;

	@Property
	private Boolean tipWaiterInvoice;

	@Property
	private String tipWaiterInvoicePorcent;

	@Property
	private String tipWaiterInvoiceIVA;

	@Property
	private Boolean chargeAddonDish;

	@Property
	private Boolean decimal;

	@Property
	private Boolean ivaIncluded;

	@Property
	private String actualSessionDate;

	@Property
	private String closureLastMonth;

	@Property
	private Boolean accountingLinkVtas;

	@Property
	private String covIncomeType;

	@Property
	private String tipsIncomeType;

	@Property
	private String cadDept;

	@Property
	private Boolean euroLine;

	@Property
	private String eurUSDChange;

	// falta serv hot/dpto

	@Property
	private String integrationHotel;

	@Property
	private Boolean integrationEcon;

	@Property
	private Boolean qualifyKitchenDish;

	// falta impresoras de comandas

	@Property
	private Boolean splitCommand;

	@Property
	private Boolean tips;

	@Property
	private String assocElemTips;

	@Property
	private Boolean discount1;

	@Property
	private String assocElemDto1;

	@Property
	private String assocElemDto1Porcent;

	@Property
	private Boolean discount2;

	@Property
	private String assocElemDto2;

	@Property
	private String assocElemDto2Porcent;

	@Property
	private Boolean discount3;

	@Property
	private String assocElemDto3;

	@Property
	private String assocElemDto3Porcent;

	@Property
	private String assocElemTPV;

	@Property
	private String chargeTPV;

	@Property
	private String fieldSeparator;

	@Property
	private String alphabSeparator;

	@Property
	private String dateFormat;

	/* --------- Contabilidad -------- */
	@Property
	private String contCode;

	@Property
	private String contSerie;

	@Property
	private String ivaType1;

	@Property
	private String ledgerAccIVA1;

	@Property
	private String ivaType2;

	@Property
	private String ledgerAccIVA2;

	@Property
	private String ivaType3;

	@Property
	private String ledgerAccIVA3;

	@Property
	private String ledgerAccCaja;

	@Property
	private String ledgerAccInvi;

	@Property
	private String ledgerAccGerVtas;

	@Property
	private String ledgerAccServCbtos;

	@Property
	private String ledgerAccPropCam;

	@Property
	private String ledgerAccDescVtas;

	@Property
	private String literalIVA;

	/*----Conectividad---------*/
	@Property
	private Boolean enableTPVVirtual;

	@Property
	private Boolean enableStarCard;

	// falta habilitar impresora fiscal

	@Property
	private String ipLVDE;

	@Property
	private String ipHelp;

	@Property
	private String ipCCC;

	@Property
	private String ipAlternative;

	@Property
	private String sendEmail;

	@Property
	private String sendService;

	@Property
	private String sendLogin;

	@Property
	private String sendPsw;

	// -----------Restaurant----------
	@Property
	private String literalEspBill;

	@Property
	private String literalCharCov;

	@Property
	private String literalTipsAuto;

	@Property
	private Boolean dayMenuLevel;

	@Property
	private Boolean cancelTableLevel;

	@Property
	private String newAntibloq;

	@Property
	private String literalPrecPers;
	// falta ultimo numero impreso

	@Property
	private String cajaCobro;
	// falta suma consumiciones
	// falta control de actividad

	@Property
	private String desc1;

	@Property
	private String firstTab1;

	@Property
	private String lastTab1;

	@Property
	private String desc2;

	@Property
	private String firstTab2;

	@Property
	private String lastTab2;

	@Property
	private String desc3;

	@Property
	private String firstTab3;

	@Property
	private String lastTab3;

	@Property
	private String desc4;

	@Property
	private String firstTab4;

	@Property
	private String lastTab4;

	@Property
	private String desc5;

	@Property
	private String firstTab5;

	@Property
	private String lastTab5;

	@Property
	private String desc6;

	@Property
	private String firstTab6;

	@Property
	private String lastTab6;

	@Property
	private String desc7;

	@Property
	private String firstTab7;

	@Property
	private String lastTab7;

	// ================Privileges =========================

	private List<ConfigurationPrivilege> cpList;

	@Inject
	private Request requestPriv;

	@Component
	private Form privForm;

	@InjectComponent
	private Zone privFormZone;

	@Property
	@Persist(PersistenceConstants.FLASH)
	private String radioSelectedValue;

	void afterRender() {
		cpList = configurationService.getPrivileges();
		JSONObject privileges = new JSONObject();
		JSONArray privilegesNames = new JSONArray();
		JSONArray privilegesList = new JSONArray();

		for (ConfigurationPrivilege cp : cpList) {
			privilegesNames.put(cp.getName());
			privilegesList.put(cp.getPrivilegeValue());
		}
		privileges.put("privilegesNames", privilegesNames);
		privileges.put("privilegesList", privilegesList);
		javaScriptSupport.addInitializerCall("loadPrivileges", privileges);
	}

	void onActivate() throws InstanceNotFoundException {
		cgList = configurationService.getParametersGeneric();
		cbList = configurationService.getParametersBool();
		crList = configurationService.getParametersRoom();
		loadData();
	}

	Object onSuccessFromPrivForm() throws InstanceNotFoundException {
		return requestDivCont.isXHR() ? privFormZone.getBody() : null;
	}

	Object onSuccessFromDiversosContadoresForm()
			throws InstanceNotFoundException {
		/*
		 * System.out.println("Se ha accedido a los parámetros");
		 * System.out.println("generic: " + cgList.size() + " bool: " +
		 * cbList.size() + " Room: " + crList.size()); for (ConfigurationGeneric
		 * cg : cgList) System.out.println("id " + cg.getConfGenericId() +
		 * " name: " + cg.getName() + " value: " + cg.getValue());
		 */
		saveData();
		return requestDivCont.isXHR() ? diversosContadoresFormZone.getBody()
				: null;
	}

	void loadData() {
		HashMap<String, String> cgHashMap = new HashMap<String, String>();
		HashMap<String, Boolean> cbHashMap = new HashMap<String, Boolean>();
		HashMap<String, String> crHashMap = new HashMap<String, String>();

		for (ConfigurationGeneric cg : cgList)
			cgHashMap.put(cg.getName(), cg.getValue());

		for (ConfigurationBool cb : cbList)
			cbHashMap.put(cb.getName(), cb.getValue());

		for (ConfigurationRoom cr : crList) {
			crHashMap.put(
					"desc" + Integer.toString(cr.getConfigurationRoomId()),
					cr.getRoomDescription());
			crHashMap.put("firstTab" + cr.getConfigurationRoomId(),
					Integer.toString(cr.getFirstTab()));
			crHashMap.put("lastTab" + cr.getConfigurationRoomId(),
					Integer.toString(cr.getLastTab()));
		}

		// -----Contadores------
		actualSession = cgHashMap.get("actualSession");
		lastBill = cgHashMap.get("lastBill");
		lastCommand = cgHashMap.get("lastCommand");
		lastClient = cgHashMap.get("lastClient");
		// falta nota fiscal
		// -----General---------
		restCateg = cgHashMap.get("restCateg");
		cadExplot = cgHashMap.get("cadExplot");
		tableNumber = cgHashMap.get("tableNumber");
		covServChar = cbHashMap.get("covServChar");
		covServCharImp = cgHashMap.get("covServCharImp");
		covServCharIVAType = cgHashMap.get("covServCharIVAType");
		tipWaiterInvoice = cbHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoicePorcent = cgHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoiceIVA = cgHashMap.get("tipWaiterInvoiceIVA");
		chargeAddonDish = cbHashMap.get("chargeAddonDish");
		decimal = cbHashMap.get("decimal");
		ivaIncluded = cbHashMap.get("ivaIncluded");
		actualSessionDate = cgHashMap.get("actualSessionDate");
		closureLastMonth = cgHashMap.get("closureLastMonth");
		// falta sesión actual abierta
		accountingLinkVtas = cbHashMap.get("accountingLinkVtas");
		covIncomeType = cgHashMap.get("covIncomeType");
		tipsIncomeType = cgHashMap.get("tipsIncomeType");
		cadDept = cgHashMap.get("cadDept");
		euroLine = cbHashMap.get("euroLine");
		eurUSDChange = cgHashMap.get("eurUSDChange");
		// falta serv hot/dpto
		integrationHotel = cgHashMap.get("integrationHotel");
		integrationEcon = cbHashMap.get("integrationEcon");
		qualifyKitchenDish = cbHashMap.get("qualifyKitchenDish");
		splitCommand = cbHashMap.get("splitCommand");
		tips = cbHashMap.get("tips");
		assocElemTips = cgHashMap.get("assocElemTips");
		discount1 = cbHashMap.get("discount1");
		assocElemDto1 = cgHashMap.get("assocElemDto1");
		assocElemDto1Porcent = cgHashMap.get("assocElemDto1%");
		discount2 = cbHashMap.get("discount2");
		assocElemDto2 = cgHashMap.get("assocElemDto2");
		assocElemDto2Porcent = cgHashMap.get("assocElemDto2%");
		discount3 = cbHashMap.get("discount3");
		assocElemDto3 = cgHashMap.get("assocElemDto3");
		assocElemDto3Porcent = cgHashMap.get("assocElemDto3%");
		assocElemTPV = cgHashMap.get("assocElemTPV");
		chargeTPV = cgHashMap.get("chargeTPV");
		fieldSeparator = cgHashMap.get("fieldSeparator");
		alphabSeparator = cgHashMap.get("alphabSeparator");
		dateFormat = cgHashMap.get("dateFormat");
		// ------Contabilidad------------------
		contCode = cgHashMap.get("contCode");
		contSerie = cgHashMap.get("contSerie");
		ivaType1 = cgHashMap.get("ivaType1");
		ledgerAccIVA1 = cgHashMap.get("ledgerAccIVA1");
		ivaType2 = cgHashMap.get("ivaType2");
		ledgerAccIVA2 = cgHashMap.get("ledgerAccIVA2");
		ivaType3 = cgHashMap.get("ivaType3");
		ledgerAccIVA3 = cgHashMap.get("ledgerAccIVA3");
		ledgerAccCaja = cgHashMap.get("ledgerAccCaja");
		ledgerAccInvi = cgHashMap.get("ledgerAccInvi");
		ledgerAccGerVtas = cgHashMap.get("ledgerAccGerVtas");
		ledgerAccServCbtos = cgHashMap.get("ledgerAccServCbtos");
		ledgerAccPropCam = cgHashMap.get("ledgerAccPropCam");
		ledgerAccDescVtas = cgHashMap.get("ledgerAccDescVtas");
		literalIVA = cgHashMap.get("literalIVA");
		// ----------Impresion--------------
		// falta impresoras de comandas
		// ----------Conectividad-----------
		enableTPVVirtual = cbHashMap.get("enableTPVVirtual");
		enableStarCard = cbHashMap.get("enableStarCard");
		// falta habilitar impresora fiscal
		ipLVDE = cgHashMap.get("ipLVDE");
		ipHelp = cgHashMap.get("ipHelp");
		ipCCC = cgHashMap.get("ipCCC");
		ipAlternative = cgHashMap.get("ipAlternative");
		sendEmail = cgHashMap.get("sendEmail");
		sendService = cgHashMap.get("sendService");
		sendLogin = cgHashMap.get("sendLogin");
		sendPsw = cgHashMap.get("sendPsw");
		// ------------Restaurant---------------------
		literalEspBill = cgHashMap.get("literalEspBill");
		literalCharCov = cgHashMap.get("literalCharCov");
		literalTipsAuto = cgHashMap.get("literalTipsAuto");
		dayMenuLevel = cbHashMap.get("dayMenuLevel");
		cancelTableLevel = cbHashMap.get("cancelTableLevel");
		// newAntibloq = cgHashMap.get("newAntibloq");
		// literalPrecPers = cgHashMap.get("literalPrecPers");
		// falta ultimo numero impreso
		cajaCobro = cgHashMap.get("cajaCobro");
		// falta suma consumiciones
		// falta control de actividad
		desc1 = crHashMap.get("desc1");
		firstTab1 = crHashMap.get("firstTab1");
		lastTab1 = crHashMap.get("lastTab1");
		desc2 = crHashMap.get("desc2");
		firstTab2 = crHashMap.get("firstTab2");
		lastTab2 = crHashMap.get("lastTab2");
		desc3 = crHashMap.get("desc3");
		firstTab3 = crHashMap.get("firstTab3");
		lastTab3 = crHashMap.get("lastTab3");
		desc4 = crHashMap.get("desc4");
		firstTab4 = crHashMap.get("firstTab4");
		lastTab4 = crHashMap.get("lastTab4");
		desc5 = crHashMap.get("desc5");
		firstTab5 = crHashMap.get("firstTab5");
		lastTab5 = crHashMap.get("lastTab5");
		desc6 = crHashMap.get("desc6");
		firstTab6 = crHashMap.get("firstTab6");
		lastTab6 = crHashMap.get("lastTab6");
		desc7 = crHashMap.get("desc7");
		firstTab7 = crHashMap.get("firstTab7");
		lastTab7 = crHashMap.get("lastTab7");
	}

	void saveData() throws InstanceNotFoundException {
		// -----Contadores------
		configurationService
				.setParameterGeneric("actualSession", actualSession);
		configurationService.setParameterGeneric("lastBill", lastBill);
		configurationService.setParameterGeneric("lastCommand", lastCommand);
		configurationService.setParameterGeneric("lastClient", lastClient);
		// falta nota fiscal
		// -----General---------
		configurationService.setParameterGeneric("restCateg", restCateg);
		configurationService.setParameterGeneric("cadExplot", cadExplot);
		configurationService.setParameterGeneric("tableNumber", tableNumber);
		configurationService.setParameterBool("covServChar", covServChar);
		configurationService.setParameterGeneric("covServCharImp",
				covServCharImp);
		configurationService.setParameterGeneric("covServCharIVAType",
				covServCharIVAType);
		configurationService.setParameterBool("tipWaiterInvoice",
				tipWaiterInvoice);
		configurationService.setParameterGeneric("tipWaiterInvoice%",
				tipWaiterInvoicePorcent);
		configurationService.setParameterGeneric("tipWaiterInvoiceIVA",
				tipWaiterInvoiceIVA);
		configurationService.setParameterBool("chargeAddonDish",
				chargeAddonDish);
		// configurationService.setParameterBool("decimal",decimal);
		configurationService.setParameterBool("ivaIncluded", ivaIncluded);
		configurationService.setParameterGeneric("actualSessionDate",
				actualSessionDate);
		configurationService.setParameterGeneric("closureLastMonth",
				closureLastMonth);
		// falta sesión actual abierta
		configurationService.setParameterBool("accountingLinkVtas",
				accountingLinkVtas);
		configurationService
				.setParameterGeneric("covIncomeType", covIncomeType);
		configurationService.setParameterGeneric("tipsIncomeType",
				tipsIncomeType);
		configurationService.setParameterGeneric("cadDept", cadDept);
		configurationService.setParameterBool("euroLine", euroLine);
		configurationService.setParameterGeneric("eurUSDChange", eurUSDChange);
		// falta serv hot/dpto
		configurationService.setParameterGeneric("integrationHotel",
				integrationHotel);
		configurationService.setParameterBool("integrationEcon",
				integrationEcon);
		configurationService.setParameterBool("qualifyKitchenDish",
				qualifyKitchenDish);
		configurationService.setParameterBool("splitCommand", splitCommand);
		configurationService.setParameterBool("tips", tips);
		configurationService
				.setParameterGeneric("assocElemTips", assocElemTips);
		configurationService.setParameterBool("discount1", discount1);
		configurationService
				.setParameterGeneric("assocElemDto1", assocElemDto1);
		configurationService.setParameterGeneric("assocElemDto1%",
				assocElemDto1Porcent);
		configurationService.setParameterBool("discount2", discount2);
		configurationService
				.setParameterGeneric("assocElemDto2", assocElemDto2);
		configurationService.setParameterGeneric("assocElemDto2%",
				assocElemDto2Porcent);
		configurationService.setParameterBool("discount3", discount3);
		configurationService
				.setParameterGeneric("assocElemDto3", assocElemDto3);
		configurationService.setParameterGeneric("assocElemDto3%",
				assocElemDto3Porcent);
		configurationService.setParameterGeneric("assocElemTPV", assocElemTPV);
		configurationService.setParameterGeneric("chargeTPV", chargeTPV);
		configurationService.setParameterGeneric("fieldSeparator",
				fieldSeparator);
		configurationService.setParameterGeneric("alphabSeparator",
				alphabSeparator);
		configurationService.setParameterGeneric("dateFormat", dateFormat);
		// ------Contabilidad------------------
		configurationService.setParameterGeneric("contCode", contCode);
		configurationService.setParameterGeneric("contSerie", contSerie);
		configurationService.setParameterGeneric("ivaType1", ivaType1);
		configurationService
				.setParameterGeneric("ledgerAccIVA1", ledgerAccIVA1);
		configurationService.setParameterGeneric("ivaType2", ivaType2);
		configurationService
				.setParameterGeneric("ledgerAccIVA2", ledgerAccIVA2);
		configurationService.setParameterGeneric("ivaType3", ivaType3);
		configurationService
				.setParameterGeneric("ledgerAccIVA3", ledgerAccIVA3);
		configurationService
				.setParameterGeneric("ledgerAccCaja", ledgerAccCaja);
		configurationService
				.setParameterGeneric("ledgerAccInvi", ledgerAccInvi);
		configurationService.setParameterGeneric("ledgerAccGerVtas",
				ledgerAccGerVtas);
		configurationService.setParameterGeneric("ledgerAccServCbtos",
				ledgerAccServCbtos);
		configurationService.setParameterGeneric("ledgerAccPropCam",
				ledgerAccPropCam);
		configurationService.setParameterGeneric("ledgerAccDescVtas",
				ledgerAccDescVtas);
		configurationService.setParameterGeneric("literalIVA", literalIVA);
		// ----------Impresion--------------
		// falta impresoras de comandas
		// ----------Conectividad-----------
		configurationService.setParameterBool("enableTPVVirtual",
				enableTPVVirtual);
		configurationService.setParameterBool("enableStarCard", enableStarCard);
		// falta habilitar impresora fiscal
		configurationService.setParameterGeneric("ipLVDE", ipLVDE);
		configurationService.setParameterGeneric("ipHelp", ipHelp);
		configurationService.setParameterGeneric("ipCCC", ipCCC);
		configurationService
				.setParameterGeneric("ipAlternative", ipAlternative);
		configurationService.setParameterGeneric("sendEmail", sendEmail);
		configurationService.setParameterGeneric("sendService", sendService);
		configurationService.setParameterGeneric("sendLogin", sendLogin);
		configurationService.setParameterGeneric("sendPsw", sendPsw);
		// ------------Restaurant---------------------
		configurationService.setParameterGeneric("literalEspBill",
				literalEspBill);
		configurationService.setParameterGeneric("literalCharCov",
				literalCharCov);
		configurationService.setParameterGeneric("literalTipsAuto",
				literalTipsAuto);
		// configurationService.setParameterBool("dayMenuLevel",dayMenuLevel);
		// configurationService.setParameterBool("cancelTableLevel",cancelTableLevel);
		// newAntibloq "newAntibloq");
		// literalPrecPers "literalPrecPers");
		// falta ultimo numero impreso
		configurationService.setParameterGeneric("cajaCobro", cajaCobro);
		// falta suma consumiciones
		// falta control de actividad
		/*
		 * desc1 = crHashMap.get("desc1"); firstTab1 =
		 * crHashMap.get("firstTab1"); lastTab1 = crHashMap.get("lastTab1");
		 * configurationService.setParameterRoom(); desc2 =
		 * crHashMap.get("desc2"); firstTab2 = crHashMap.get("firstTab2");
		 * lastTab2 = crHashMap.get("lastTab2"); desc3 = crHashMap.get("desc3");
		 * firstTab3 = crHashMap.get("firstTab3"); lastTab3 =
		 * crHashMap.get("lastTab3"); desc4 = crHashMap.get("desc4"); firstTab4
		 * = crHashMap.get("firstTab4"); lastTab4 = crHashMap.get("lastTab4");
		 * desc5 = crHashMap.get("desc5"); firstTab5 =
		 * crHashMap.get("firstTab5"); lastTab5 = crHashMap.get("lastTab5");
		 * desc6 = crHashMap.get("desc6"); firstTab6 =
		 * crHashMap.get("firstTab6"); lastTab6 = crHashMap.get("lastTab6");
		 * desc7 = crHashMap.get("desc7"); firstTab7 =
		 * crHashMap.get("firstTab7"); lastTab7 = crHashMap.get("lastTab7");
		 */
	}
}

/*
 * /* colCommand = cgHashMap.get("colCommand"); colBackground =
 * cgHashMap.get("colBackground"); colBill = cgHashMap.get("colBill");
 * colBackground2 = cgHashMap.get("colBackground2"); colCharge =
 * cgHashMap.get("colCharge"); colTrasp = cgHashMap.get("colTrasp"); colTabEmpty
 * = cgHashMap.get("colTabEmpty"); colTabBusy = cgHashMap.get("colTabBusy");
 * colTabAtached = cgHashMap.get("colTabAtached"); colTabReserved =
 * cgHashMap.get("colTabReserved"); colTabBill = cgHashMap.get("colTabBill");
 */

/*
 * entirePrintCommand printEntireCommandP2 bmpToPrint compressPrintBillStd
 * headerBill appName release BBDDRest maxRegAud BBDDCont BBDD/Stars BBDDStarEco
 * BBDDStarCar actualSessionState sessionType kitchenPrinter printer2 bmpSize
 * breakfastServHot lunchServHotel dinnerServHotel otherServHotel breakfastDept
 * lunchDept dinnerDept otherDept emailSMS SMSApiId smsUser smsPwd
 * beforCharacters
 */

/*
 * @Property private String colCommand;
 * 
 * @Property private String colBackground;
 * 
 * @Property private String colBill;
 * 
 * @Property private String colBackground2;
 * 
 * @Property private String colCharge;
 * 
 * @Property
 * 
 * private String colTrasp;
 * 
 * @Property private String colTabEmpty;
 * 
 * @Property private String colTabBusy;
 * 
 * @Property private String colTabAtached;
 * 
 * @Property private String colTabReserved;
 * 
 * @Property private String colTabBill;
 */
