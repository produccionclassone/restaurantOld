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

	/* Diversos contadores */

	private HashMap <String,String> cgHashMap = new HashMap<String,String>();
		
	@Inject
	private ConfigurationService configurationService;
	
	@Component
	private Form diversosContadoresForm;

	@InjectComponent
	private Zone diversosContadoresFormZone;

	@Property
	private String actualSession;
	
	@Property
	private String lastBill;

	@Property
	private String lastCommand;

	@Property
	private String lastClient;

	@Property
	private String notaFiscal;

	@Property
	private String restCateg;

	@Property
	private String CADExplot;

	@Property
	private String tableNumber;

	@Property
	private String covServChar;

	@Property
	private String covServCharImp;
	
	@Property
	private String covSErvCharIVAType;
	
	@Property
	private String tipWaiterInvoicelPorcent;
	
	@Property
	private String tipWaiterInvoiceIVA;
	
	@Property
	private String actualSessionDate;
	
	@Property
	private String covIncomeType;
	
	@Property
	private String tipsIncomeType;
	
	@Property
	private String cadDept;
	
	@Property
	private String eurUSDChange;
	
	//falta serv hot/dpto
	
	@Property
	private String integrationHotel;
	
	//falta impresoras de comandas
	
	@Property
	private String assocElemTips;
	
	@Property
	private String assocElemDto1;
	
	@Property
	private String assocElemDto1Porcent;
	
	@Property
	private String assocElemDto2;
	
	@Property
	private String assocElemDto2Porcent;
	
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
	private String coveredServiceCharge;

	@Inject
	private Request request;

	void onPrepareForRender() throws InstanceNotFoundException {
		cgHashMap = configurationService.getParameters();
		actualSession = cgHashMap.get("actualSession");
		lastBill = cgHashMap.get("lastBill");
		lastCommand = cgHashMap.get("lastCommand");
		lastClient = cgHashMap.get("lastClient");
		restCateg = cgHashMap.get("restCateg");
		CADExplot = cgHashMap.get("CADExplot");
		tableNumber = cgHashMap.get("tableNumber");
		covServCharImp = cgHashMap.get("covServCharImp");
		covSErvCharIVAType = cgHashMap.get("covSErvCharIVAType");
		tipWaiterInvoicelPorcent = cgHashMap.get("tipWaiterInvoicel%");
		tipWaiterInvoiceIVA = cgHashMap.get("tipWaiterInvoiceIVA");
		actualSessionDate = cgHashMap.get("actualSessionDate");
		covIncomeType = cgHashMap.get("covIncomeType");
		tipsIncomeType = cgHashMap.get("tipsIncomeType");
		cadDept = cgHashMap.get("cadDept");
		eurUSDChange = cgHashMap.get("eurUSDChange");
		//falta serv hot/dpto
		integrationHotel = cgHashMap.get("integrationHotel");
		//falta impresoras de comandas
		assocElemTips = cgHashMap.get("assocElemTips");
		assocElemDto1 = cgHashMap.get("assocElemDto1");
		assocElemDto1Porcent = cgHashMap.get("assocElemDto1%");
		assocElemDto2 = cgHashMap.get("assocElemDto2");
		assocElemDto2Porcent = cgHashMap.get("assocElemDto2%");
		assocElemDto3 = cgHashMap.get("assocElemDto3");
		assocElemDto3Porcent = cgHashMap.get("assocElemDto3%");
		assocElemTPV = cgHashMap.get("assocElemTPV");
		chargeTPV = cgHashMap.get("chargeTPV");
		fieldSeparator = cgHashMap.get("fieldSeparator");
		alphabSeparator = cgHashMap.get("alphabSeparator");

		/*		
		appName
		release
		BBDDRest
		maxRegAud
		BBDDCont
		BBDD/Stars
		BBDDStarEco
		BBDDStarCar
		restCateg
		contCode
		tableNumber
		actualSession
		lastBill
		lastCommand
		lastClient
		actualSessionState
		sessionType
		cadExplot
		kitchenPrinter
		printer2
		bmpSize
		closureLastMonth
		dayMenuLevel
		cancelTableLevel
		ivaType1
		ledgerAccIVA1
		ivaType2
		ledgerAccIVA2
		ivaType3
		ledgerAccIVA3
		ledgerAccCaja
		ledgerAccInvi
		ledgerAccGerVtas
		ledgerAccServCbtos
		ledgerAccPropCam
		ledgerAccDescVtas
		literalIVA
		breakfastServHot
		lunchServHotel
		dinnerServHotel
		otherServHotel
		breakfastDept
		lunchDept
		dinnerDept
		otherDept
		dateFormat
		sendEmail
		sendService
		sendLogin
		sendPsw
		emailSMS
		SMSApiId
		smsUser
		smsPwd
		ipLVDE
		ipHelp
		ipCCC
		ipAlternative
		colCommand
		colBackground
		colBill
		colBackground2
		colCharge
		colTrasp
		colTabEmpty
		colTabBusy
		colTabAtached
		colTabReserved
		colTabBill
		cajaCobro
		literalEspBill
		literalCharCov
		literalTipsAuto
		beforCharacters
*/

	}

	Object onSuccessFromDiversosContadoresForm()
			throws InstanceNotFoundException {
		HashMap <String,String> newParameters = new HashMap<String,String>();
		newParameters.put("actualSession",actualSession);
		configurationService.setParameters(newParameters);
		return request.isXHR() ? diversosContadoresFormZone.getBody() : null;
	}
}
