package es.classone.restaurant.web.pages.configuration;

import java.util.HashMap;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;

import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.util.UserSession;

public class Configuration2 {

	@Property
	private String privilege3;

	@Property
	private String privilege4;

	@Property
	private String privilege5;

	@Property
	private String privilege6;

	@Property
	private String privilege7;

	@Property
	private String privilege8;

	@Property
	private int rGroup;

	@SessionState(create = false)
	private UserSession userSession;

	/*================================================= Diversos contadores ======================================================================*/

	private HashMap<String, String> cgHashMap = new HashMap<String, String>();
	private HashMap<String, Boolean> cbHashMap = new HashMap<String, Boolean>();

	@Inject
	private ConfigurationService configurationService;

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
	private String notaFiscal; //falta

	/*----------General---------------*/
	@Property
	private String restCateg;

	@Property
	private String CADExplot;

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

 /* --------- Contabilidad */
	@Property
	private String contCode;
	
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
	
	//falta habilitar impresora fiscal
	
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
	
	@Inject
	private Request request;

	void onPrepareForRender() throws InstanceNotFoundException {
		cgHashMap = configurationService.getParameters();
		cbHashMap = configurationService.getParametersBool();

		//-----Contadores------
		actualSession = cgHashMap.get("actualSession");
		lastBill = cgHashMap.get("lastBill");
		lastCommand = cgHashMap.get("lastCommand");
		lastClient = cgHashMap.get("lastClient");
		// falta nota fiscal
		//-----General---------
		restCateg = cgHashMap.get("restCateg");
		CADExplot = cgHashMap.get("CADExplot");
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
		//------Contabilidad ------------------
		contCode = cgHashMap.get("contCode");
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
		//----------Impresion--------------
		// falta impresoras de comandas
		//----------Conectividad-----------
		enableTPVVirtual = cbHashMap.get("enableTPVVirtual");
		enableStarCard = cbHashMap.get("enableStarCard");
		//falta habilitar impresora fiscal
		ipLVDE = cgHashMap.get("ipLVDE");
		ipHelp = cgHashMap.get("ipHelp");
		ipCCC = cgHashMap.get("ipCCC");
		ipAlternative = cgHashMap.get("ipAlternative");
		sendEmail = cgHashMap.get("sendEmail");
		sendService = cgHashMap.get("sendService");
		sendLogin = cgHashMap.get("sendLogin");
		sendPsw = cgHashMap.get("sendPsw");
		
		/*
		 * colCommand = cgHashMap.get("colCommand"); colBackground =
		 * cgHashMap.get("colBackground"); colBill = cgHashMap.get("colBill");
		 * colBackground2 = cgHashMap.get("colBackground2"); colCharge =
		 * cgHashMap.get("colCharge"); colTrasp = cgHashMap.get("colTrasp");
		 * colTabEmpty = cgHashMap.get("colTabEmpty"); colTabBusy =
		 * cgHashMap.get("colTabBusy"); colTabAtached =
		 * cgHashMap.get("colTabAtached"); colTabReserved =
		 * cgHashMap.get("colTabReserved"); colTabBill =
		 * cgHashMap.get("colTabBill");
		 */

		/*
		 * entirePrintCommand printEntireCommandP2 
		 *  bmpToPrint compressPrintBillStd literalPrecPers
		 * newAntibloq headerBill
		 */

		/*
		 * appName release BBDDRest maxRegAud BBDDCont BBDD/Stars BBDDStarEco
		 * BBDDStarCar actualSessionState sessionType kitchenPrinter printer2
		 * bmpSize dayMenuLevel cancelTableLevel
		 * 
		 * 
		 * breakfastServHot lunchServHotel dinnerServHotel otherServHotel
		 * 
		 * breakfastDept lunchDept dinnerDept otherDept
		 * 
		 *   emailSMS SMSApiId
		 * smsUser smsPwd
		 * 
		 *  cajaCobro literalEspBill
		 * literalCharCov literalTipsAuto beforCharacters
		 */

	}

	Object onSuccessFromDiversosContadoresForm()
			throws InstanceNotFoundException {
		HashMap<String, String> newParameters = new HashMap<String, String>();
		newParameters.put("actualSession", actualSession);
		configurationService.setParameters(newParameters);
		return request.isXHR() ? diversosContadoresFormZone.getBody() : null;
	}
}
