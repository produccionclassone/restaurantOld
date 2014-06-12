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
	private String tableNumber;

	@Property
	private Boolean covServChar;

	@Property
	private String covServCharImp;

	@Property
	private String covServCharIVAType;

	@Property
	private String literalCharCov;

	@Property
	private Boolean tipWaiterInvoice;

	@Property
	private String tipWaiterInvoicePorcent;

	@Property
	private String tipWaiterInvoiceIVA;

	@Property
	private String literalTipsAuto;

	@Property
	private Boolean chargeAddonDish;

	@Property
	private Boolean decimal;

	@Property
	private Boolean ivaIncluded;

	@Property
	private String actualSessionDate;

	@Property
	private Boolean actualSessionState;

	@Property
	private Boolean accountingLinkVtas;

	@Property
	private Boolean euroLine;

	@Property
	private String eurUSDChange;

	@Property
	private String breakfastServHot;

	@Property
	private String lunchServHotel;

	@Property
	private String dinnerServHotel;

	@Property
	private String otherServHotel;

	@Property
	private String integrationHotel;

	@Property
	private Boolean integrationEcon;

	@Property
	private Boolean qualifyKitchenDish;

	@Property
	private Boolean splitCommand;

	@Property
	private String cancelTableLevel;

	@Property
	private String dayMenuLevel;

	@Property
	private String literalEspBill;

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

	// -----------Restaurant----------

	@Property
	private String colCommand;
	
	@Property
	private String colBackground;
	
	@Property
	private String colBill;
	
	@Property
	private String colBackground2;
	
	@Property
	private String colCharge;
	
	@Property
	private String colTrasp;
	
	@Property
	private String colTabEmpty;
	
	@Property
	private String colTabBusy;
	
	@Property
	private String colTabAtached;
	
	@Property
	private String colTabReserved;
	
	@Property
	private String colTabBill;

	@Property
	private String lastNumPrint; //falta en BBDD
	
	@Property
	private String closureLastMonth;

	@Property
	private Boolean sumConsum; // falta en BBDD
	
	@Property
	private Boolean activityControl; // falta en BBDD
	
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
	
	@Property
	private String desCalif1;
	
	@Property
	private String desCalif2;
	
	@Property
	private String desCalif3;
	
	@Property
	private String desCalif4;

	@Property
	private Boolean enableTPVVirtual;
	
	@Property
	private Boolean enableStarCard;

	@Property
	private Boolean enableImpFiscal;

	@Property 
	private Boolean bmpToPrint;
	
	@Property 
	private String bmpSize;
	
	@Property
	private String secuence; //falta en BBDD

	/* --------- Contabilidad -------- */
	@Property
	private String contCode;

	@Property
	private String contSerie;  // falta en BBDD
	
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
	private String literalIVA;
	
	@Property
	private String cadExplot;

	@Property
	private String cadDept;

	@Property
	private String covIncomeType;

	@Property
	private String tipsIncomeType;


//----------------------------Parámetros que faltan------------------------------
	@Property
	private String dateFormat;

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

	@Property
	private String newAntibloq;

	@Property
	private String literalPrecPers;

	@Property
	private String cajaCobro;


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
			crHashMap.put("desc" + Integer.toString(cr.getConfigurationRoomId()),cr.getRoomDescription());
			crHashMap.put("firstTab" + Integer.toString(cr.getConfigurationRoomId()),Integer.toString(cr.getFirstTab()));
			crHashMap.put("lastTab" + Integer.toString(cr.getConfigurationRoomId()), Integer.toString(cr.getLastTab()));
		}

		// -----Contadores------
		actualSession = cgHashMap.get("actualSession");
		lastBill = cgHashMap.get("lastBill");
		lastCommand = cgHashMap.get("lastCommand");
		lastClient = cgHashMap.get("lastClient");
		//falta nro nota fiscal
		// -----General---------
		restCateg = cgHashMap.get("restCateg");
		tableNumber = cgHashMap.get("tableNumber");
		covServChar = cbHashMap.get("covServChar");
		covServCharImp = cgHashMap.get("covServCharImp");
		covServCharIVAType = cgHashMap.get("covServCharIVAType");
		literalCharCov = cgHashMap.get("literalCharCov");
		tipWaiterInvoice = cbHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoicePorcent = cgHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoiceIVA = cgHashMap.get("tipWaiterInvoiceIVA");
		literalTipsAuto = cgHashMap.get("literalTipsAuto");
		chargeAddonDish = cbHashMap.get("chargeAddonDish");
		decimal = cbHashMap.get("decimal");
		ivaIncluded = cbHashMap.get("ivaIncluded");
		actualSessionDate = cgHashMap.get("actualSessionDate");
		actualSessionState = cbHashMap.get("actualSessionState");
		accountingLinkVtas = cbHashMap.get("accountingLinkVtas");
		euroLine = cbHashMap.get("euroLine");
		eurUSDChange = cgHashMap.get("eurUSDChange");
		breakfastServHot = cgHashMap.get("breakfastServHot");
		lunchServHotel = cgHashMap.get("lunchServHotel");
		dinnerServHotel = cgHashMap.get("dinnerServHotel");
		otherServHotel = cgHashMap.get("otherServHotel");
		integrationHotel = cgHashMap.get("integrationHotel");
		integrationEcon = cbHashMap.get("integrationEcon");
		qualifyKitchenDish = cbHashMap.get("qualifyKitchenDish");
		splitCommand = cbHashMap.get("splitCommand");
		cancelTableLevel = cgHashMap.get("cancelTableLevel");
		dayMenuLevel = cgHashMap.get("dayMenuLevel");
		literalEspBill = cgHashMap.get("literalEspBill");
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
		// -----Restaurante---------
		colCommand = cgHashMap.get("colCommand");
		colBackground = cgHashMap.get("colBackground");
		colBill = cgHashMap.get("colBill");
		colBackground2 = cgHashMap.get("colBackground2");
		colCharge = cgHashMap.get("colCharge");
		colTrasp = cgHashMap.get("colTrasp");
		colTabEmpty = cgHashMap.get("colTabEmpty");
		colTabBusy = cgHashMap.get("colTabBusy");
		colTabAtached = cgHashMap.get("colTabAtached");
		colTabReserved = cgHashMap.get("colTabReserved"); 
		colTabBill = cgHashMap.get("colTabBill");
		//falta Ultimo numero impreso
		closureLastMonth = cgHashMap.get("closureLastMonth");
		//falta suma consumiciones
		//falta control de actividad
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
		desCalif1 = crHashMap.get("desCalif1");
		desCalif2 = crHashMap.get("desCalif2");
		desCalif3 = crHashMap.get("desCalif3");
		desCalif4 = crHashMap.get("desCalif4");
		enableTPVVirtual = cbHashMap.get("enableTPVVirtual");
		enableStarCard = cbHashMap.get("enableStarCard");
		enableImpFiscal = cbHashMap.get("enableImpFiscal");
		bmpToPrint = cbHashMap.get("bmpToPrint");
		bmpSize = cgHashMap.get("bmpSize");
		//falta secuencia
		// ------Contabilidad------------------
		contCode = cgHashMap.get("contCode");
		//contSerie = cgHashMap.get("contSerie");
		ledgerAccCaja = cgHashMap.get("ledgerAccCaja");
		ledgerAccInvi = cgHashMap.get("ledgerAccInvi");
		ledgerAccGerVtas = cgHashMap.get("ledgerAccGerVtas");
		ledgerAccServCbtos = cgHashMap.get("ledgerAccServCbtos");
		ledgerAccPropCam = cgHashMap.get("ledgerAccPropCam");
		ledgerAccDescVtas = cgHashMap.get("ledgerAccDescVtas");
		ivaType1 = cgHashMap.get("ivaType1");
		ledgerAccIVA1 = cgHashMap.get("ledgerAccIVA1");
		ivaType2 = cgHashMap.get("ivaType2");
		ledgerAccIVA2 = cgHashMap.get("ledgerAccIVA2");
		ivaType3 = cgHashMap.get("ivaType3");
		ledgerAccIVA3 = cgHashMap.get("ledgerAccIVA3");
		literalIVA = cgHashMap.get("literalIVA");
		cadExplot = cgHashMap.get("cadExplot");
		cadDept = cgHashMap.get("cadDept");
		covIncomeType = cgHashMap.get("covIncomeType");
		tipsIncomeType = cgHashMap.get("tipsIncomeType");
		
		
		// ----------Parámetros que faltan --------------
		//ipLVDE = cgHashMap.get("ipLVDE");
		//ipHelp = cgHashMap.get("ipHelp");
		//ipCCC = cgHashMap.get("ipCCC");
		//ipAlternative = cgHashMap.get("ipAlternative");
		//sendEmail = cgHashMap.get("sendEmail");
		//sendService = cgHashMap.get("sendService");
		//sendLogin = cgHashMap.get("sendLogin");
		//sendPsw = cgHashMap.get("sendPsw");
		// newAntibloq = cgHashMap.get("newAntibloq");
		// literalPrecPers = cgHashMap.get("literalPrecPers");
		//cajaCobro = cgHashMap.get("cajaCobro");
	}

	void saveData() throws InstanceNotFoundException {
		// -----Contadores------
		configurationService.setParameterGeneric("actualSession", actualSession);
		configurationService.setParameterGeneric("lastBill", lastBill);
		configurationService.setParameterGeneric("lastCommand", lastCommand);
		configurationService.setParameterGeneric("lastClient", lastClient);
		// falta nota fiscal
		// -----General---------
		configurationService.setParameterGeneric("restCateg", restCateg);
		configurationService.setParameterGeneric("tableNumber", tableNumber);
		configurationService.setParameterBool("covServChar", covServChar);
		configurationService.setParameterGeneric("covServCharImp",covServCharImp);
		configurationService.setParameterGeneric("covServCharIVAType",covServCharIVAType);
		configurationService.setParameterGeneric("literalCharCov",literalCharCov);
		configurationService.setParameterBool("tipWaiterInvoice",tipWaiterInvoice);
		configurationService.setParameterGeneric("tipWaiterInvoice%",tipWaiterInvoicePorcent);
		configurationService.setParameterGeneric("tipWaiterInvoiceIVA",tipWaiterInvoiceIVA);
		configurationService.setParameterGeneric("literalTipsAuto",	literalTipsAuto);
		configurationService.setParameterBool("chargeAddonDish",chargeAddonDish);
		configurationService.setParameterBool("decimal",decimal);
		configurationService.setParameterBool("ivaIncluded", ivaIncluded);
		configurationService.setParameterGeneric("actualSessionDate",actualSessionDate);
		configurationService.setParameterBool("actualSessionState",actualSessionState);
		configurationService.setParameterBool("accountingLinkVtas",accountingLinkVtas);
		configurationService.setParameterBool("euroLine", euroLine);
		configurationService.setParameterGeneric("eurUSDChange", eurUSDChange);
		configurationService.setParameterGeneric("breakfastServHot", breakfastServHot);
		configurationService.setParameterGeneric("lunchServHotel",lunchServHotel);
		configurationService.setParameterGeneric("dinnerServHotel",	dinnerServHotel);
		configurationService.setParameterGeneric("otherServHotel",otherServHotel);
		configurationService.setParameterGeneric("integrationHotel",integrationHotel);
		configurationService.setParameterBool("integrationEcon",integrationEcon);
		configurationService.setParameterBool("qualifyKitchenDish", qualifyKitchenDish);
		configurationService.setParameterBool("splitCommand", splitCommand);
		configurationService.setParameterGeneric("dayMenuLevel",dayMenuLevel);
		configurationService.setParameterGeneric("cancelTableLevel",cancelTableLevel);
		configurationService.setParameterGeneric("literalEspBill",literalEspBill);
		configurationService.setParameterBool("tips", tips);
		configurationService.setParameterGeneric("assocElemTips", assocElemTips);
		configurationService.setParameterBool("discount1", discount1);
		configurationService.setParameterGeneric("assocElemDto1", assocElemDto1);
		configurationService.setParameterGeneric("assocElemDto1%",assocElemDto1Porcent);
		configurationService.setParameterBool("discount2", discount2);
		configurationService.setParameterGeneric("assocElemDto2", assocElemDto2);
		configurationService.setParameterGeneric("assocElemDto2%",assocElemDto2Porcent);
		configurationService.setParameterBool("discount3", discount3);
		configurationService.setParameterGeneric("assocElemDto3", assocElemDto3);
		configurationService.setParameterGeneric("assocElemDto3%",assocElemDto3Porcent);
		configurationService.setParameterGeneric("assocElemTPV", assocElemTPV);
		configurationService.setParameterGeneric("chargeTPV", chargeTPV);
		configurationService.setParameterGeneric("fieldSeparator",fieldSeparator);
		configurationService.setParameterGeneric("alphabSeparator",	alphabSeparator);
		// ------------Restaurante---------------------
		configurationService.setParameterGeneric("colCommand",colCommand);
		configurationService.setParameterGeneric("colBackground",colBackground);
		configurationService.setParameterGeneric("colBill",colBill);
		configurationService.setParameterGeneric("colBackground2",colBackground2);
		configurationService.setParameterGeneric("colCharge",colCharge);
		configurationService.setParameterGeneric("colTrasp",colTrasp);
		configurationService.setParameterGeneric("colTabEmpty",colTabEmpty);
		configurationService.setParameterGeneric("colTabBusy",colTabBusy);
		configurationService.setParameterGeneric("colTabAtached",colTabAtached);
		configurationService.setParameterGeneric("colTabReserved",colTabReserved); 
		configurationService.setParameterGeneric("colTabBill",colTabBill);
		// falta ultimo numero impreso
		configurationService.setParameterGeneric("closureLastMonth",closureLastMonth);
		//falta suma consumiciones
		//falta control de actividad
		//falta salas
		configurationService.setParameterGeneric("desCalif1", desCalif1);		
		configurationService.setParameterGeneric("desCalif2", desCalif2);		
		configurationService.setParameterGeneric("desCalif3", desCalif3);		
		configurationService.setParameterGeneric("desCalif4", desCalif4);		
		configurationService.setParameterBool("enableTPVVirtual",enableTPVVirtual);
		configurationService.setParameterBool("enableStarCard", enableStarCard);
		configurationService.setParameterBool("enableImpFiscal",enableImpFiscal);
		configurationService.setParameterBool("bmpToPrint", bmpToPrint);
		configurationService.setParameterGeneric("bmpSize",bmpSize);
		//falta secuencia
		// ------Contabilidad------------------
		configurationService.setParameterGeneric("contCode", contCode);
		//configurationService.setParameterGeneric("contSerie", contSerie);
		configurationService.setParameterGeneric("covIncomeType", covIncomeType);
		configurationService.setParameterGeneric("tipsIncomeType",tipsIncomeType);
		configurationService.setParameterGeneric("cadDept", cadDept);
		configurationService.setParameterGeneric("ledgerAccCaja", ledgerAccCaja);
		configurationService.setParameterGeneric("ledgerAccInvi", ledgerAccInvi);
		configurationService.setParameterGeneric("ledgerAccGerVtas",ledgerAccGerVtas);
		configurationService.setParameterGeneric("ledgerAccServCbtos",ledgerAccServCbtos);
		configurationService.setParameterGeneric("ledgerAccPropCam",ledgerAccPropCam);
		configurationService.setParameterGeneric("ledgerAccDescVtas",ledgerAccDescVtas);
		configurationService.setParameterGeneric("ivaType1", ivaType1);
		configurationService.setParameterGeneric("ledgerAccIVA1", ledgerAccIVA1);
		configurationService.setParameterGeneric("ivaType2", ivaType2);
		configurationService.setParameterGeneric("ledgerAccIVA2", ledgerAccIVA2);
		configurationService.setParameterGeneric("ivaType3", ivaType3);
		configurationService.setParameterGeneric("ledgerAccIVA3", ledgerAccIVA3);
		configurationService.setParameterGeneric("literalIVA", literalIVA);
		configurationService.setParameterGeneric("cadExplot", cadExplot);
		configurationService.setParameterGeneric("cadDept", cadDept);
		configurationService.setParameterGeneric("covIncomeType",covIncomeType);
		configurationService.setParameterGeneric("tipsIncomeType",tipsIncomeType);

		/*		Parámetros que faltan	
		configurationService.setParameterGeneric("ipLVDE", ipLVDE);
		configurationService.setParameterGeneric("ipHelp", ipHelp);
		configurationService.setParameterGeneric("ipCCC", ipCCC);
		configurationService.setParameterGeneric("ipAlternative", ipAlternative);
		configurationService.setParameterGeneric("sendEmail", sendEmail);
		configurationService.setParameterGeneric("sendService", sendService);
		configurationService.setParameterGeneric("sendLogin", sendLogin);
		configurationService.setParameterGeneric("sendPsw", sendPsw);
*/
	}
}