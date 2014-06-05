package es.classone.restaurant.web.pages.configuration;

import java.util.HashMap;
import java.util.List;

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

	private List<ConfigurationGeneric> cgList;
	private HashMap<String,ConfigurationGeneric> cgHashMap = new HashMap<String,ConfigurationGeneric>();
	private List<String> newParameters;
	
	private HashMap<String, Boolean> cbHashMap = new HashMap<String, Boolean>();
	private HashMap<String, String> crHashMap = new HashMap<String, String>();

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

 /* --------- Contabilidad --------*/
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
	
	//-----------Restaurant----------
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
	//falta ultimo numero impreso
	@Property
	private String cajaCobro;
	//falta suma consumiciones
	//falta control de actividad
	
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

	private void loadHashMap(){
		for (ConfigurationGeneric cg : cgList){
		 	cgHashMap.put(cg.getName(), cg);
		}
	}
	
	void onPrepareForRender() throws InstanceNotFoundException {
		cgList = configurationService.getParametersGeneric();
		loadHashMap();
		
		cbHashMap = configurationService.getParametersBool();
		crHashMap = configurationService.getParametersRoom();

		//-----Contadores------
		actualSession = cgHashMap.get("lastBill").getValue();
		lastBill = cgHashMap.get("lastBill").getValue();
		lastCommand = cgHashMap.get("lastCommand").getValue();
		lastClient = cgHashMap.get("lastClient").getValue();
		// falta nota fiscal
		//-----General---------
		restCateg = cgHashMap.get("restCateg").getValue();
		cadExplot = cgHashMap.get("cadExplot").getValue();
		tableNumber = cgHashMap.get("tableNumber").getValue();
		covServChar = cbHashMap.get("covServChar");
		covServCharImp = cgHashMap.get("covServCharImp").getValue();
		covServCharIVAType = cgHashMap.get("covServCharIVAType").getValue();
		tipWaiterInvoice = cbHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoicePorcent = cgHashMap.get("tipWaiterInvoicel%").getValue();
		tipWaiterInvoiceIVA = cgHashMap.get("tipWaiterInvoiceIVA").getValue();
		chargeAddonDish = cbHashMap.get("chargeAddonDish");
		decimal = cbHashMap.get("decimal");
		ivaIncluded = cbHashMap.get("ivaIncluded");
		actualSessionDate = cgHashMap.get("actualSessionDate").getValue();
		closureLastMonth = cgHashMap.get("closureLastMonth").getValue();
		// falta sesión actual abierta
		accountingLinkVtas = cbHashMap.get("accountingLinkVtas");
		covIncomeType = cgHashMap.get("covIncomeType").getValue();
		tipsIncomeType = cgHashMap.get("tipsIncomeType").getValue();
		cadDept = cgHashMap.get("cadDept").getValue();
		euroLine = cbHashMap.get("euroLine");
		eurUSDChange = cgHashMap.get("eurUSDChange").getValue();
		// falta serv hot/dpto
		integrationHotel = cgHashMap.get("integrationHotel").getValue();
		integrationEcon = cbHashMap.get("integrationEcon");
		qualifyKitchenDish = cbHashMap.get("qualifyKitchenDish");
		splitCommand = cbHashMap.get("splitCommand");
		tips = cbHashMap.get("tips");
		assocElemTips = cgHashMap.get("assocElemTips").getValue();
		discount1 = cbHashMap.get("discount1");
		assocElemDto1 = cgHashMap.get("assocElemDto1").getValue();
		assocElemDto1Porcent = cgHashMap.get("assocElemDto1%").getValue();
		discount2 = cbHashMap.get("discount2");
		assocElemDto2 = cgHashMap.get("assocElemDto2").getValue();
		assocElemDto2Porcent = cgHashMap.get("assocElemDto2%").getValue();
		discount3 = cbHashMap.get("discount3");
		assocElemDto3 = cgHashMap.get("assocElemDto3").getValue();
		assocElemDto3Porcent = cgHashMap.get("assocElemDto3%").getValue();
		assocElemTPV = cgHashMap.get("assocElemTPV").getValue();
		chargeTPV = cgHashMap.get("chargeTPV").getValue();
		fieldSeparator = cgHashMap.get("fieldSeparator").getValue();
		alphabSeparator = cgHashMap.get("alphabSeparator").getValue();
		dateFormat = cgHashMap.get("dateFormat").getValue();
		//------Contabilidad ------------------
		contCode = cgHashMap.get("contCode").getValue();
		ivaType1 = cgHashMap.get("ivaType1").getValue();
		ledgerAccIVA1 = cgHashMap.get("ledgerAccIVA1").getValue();
		ivaType2 = cgHashMap.get("ivaType2").getValue();
		ledgerAccIVA2 = cgHashMap.get("ledgerAccIVA2").getValue();
		ivaType3 = cgHashMap.get("ivaType3").getValue();
		ledgerAccIVA3 = cgHashMap.get("ledgerAccIVA3").getValue();
		ledgerAccCaja = cgHashMap.get("ledgerAccCaja").getValue();
		ledgerAccInvi = cgHashMap.get("ledgerAccInvi").getValue();
		ledgerAccGerVtas = cgHashMap.get("ledgerAccGerVtas").getValue();
		ledgerAccServCbtos = cgHashMap.get("ledgerAccServCbtos").getValue();
		ledgerAccPropCam = cgHashMap.get("ledgerAccPropCam").getValue();
		ledgerAccDescVtas = cgHashMap.get("ledgerAccDescVtas").getValue();
		literalIVA = cgHashMap.get("literalIVA").getValue();
		//----------Impresion--------------
		// falta impresoras de comandas
		//----------Conectividad-----------
		enableTPVVirtual = cbHashMap.get("enableTPVVirtual");
		enableStarCard = cbHashMap.get("enableStarCard");
		//falta habilitar impresora fiscal
		ipLVDE = cgHashMap.get("ipLVDE").getValue();
		ipHelp = cgHashMap.get("ipHelp").getValue();
		ipCCC = cgHashMap.get("ipCCC").getValue();
		ipAlternative = cgHashMap.get("ipAlternative").getValue();
		sendEmail = cgHashMap.get("sendEmail").getValue();
		sendService = cgHashMap.get("sendService").getValue();
		sendLogin = cgHashMap.get("sendLogin").getValue();
		sendPsw = cgHashMap.get("sendPsw").getValue();
		//------------Restaurant---------------------
		literalEspBill = cgHashMap.get("literalEspBill").getValue();
		literalCharCov  = cgHashMap.get("literalCharCov").getValue();
		literalTipsAuto = cgHashMap.get("literalTipsAuto").getValue();
		dayMenuLevel = cbHashMap.get("dayMenuLevel");
		cancelTableLevel = cbHashMap.get("cancelTableLevel");
		//newAntibloq = cgHashMap.get("newAntibloq").getValue();
		//literalPrecPers = cgHashMap.get("literalPrecPers").getValue();
		//falta ultimo numero impreso
		cajaCobro = cgHashMap.get("cajaCobro").getValue();
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

		/* entirePrintCommand printEntireCommandP2 bmpToPrint compressPrintBillStd headerBill
		 * appName release BBDDRest maxRegAud BBDDCont BBDD/Stars BBDDStarEco BBDDStarCar
		 * actualSessionState sessionType kitchenPrinter printer2 bmpSize 
		 * breakfastServHot lunchServHotel dinnerServHotel otherServHotel
		 * breakfastDept lunchDept dinnerDept otherDept
		 * emailSMS SMSApiId smsUser smsPwd beforCharacters
		 */

	}

	void addNewParameter(String name){
		int index = cgHashMap.get(name).getConfGenericId();
		System.out.println("index" + index);
		newParameters.add("prueba");
		//for (String nP: newParameters)
		//	System.out.println("index" + newParameters.indexOf(nP) + nP);
	}
	
	Object onSuccessFromDiversosContadoresForm()
			throws InstanceNotFoundException {
		
		addNewParameter("actualSession");
		//configurationService.setParametersGeneric(newParameters);
		return request.isXHR() ? diversosContadoresFormZone.getBody() : null;
	}
}
