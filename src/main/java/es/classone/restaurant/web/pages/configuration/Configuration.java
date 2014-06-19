package es.classone.restaurant.web.pages.configuration;

import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.Checkbox;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationRoom.ConfigurationRoom;
import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;
import es.classone.restaurant.web.util.UserSession;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = { "context:javaScript/configuration.js" })
public class Configuration {

	private List<ConfigurationGeneric> cgList;
	private List<ConfigurationBool> cbList;
	private List<ConfigurationRoom> crList;

	@SessionState(create = false)
	private UserSession userSession;

	@Inject
	private ConfigurationService configurationService;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Inject
	private Request request;

	@Property
	private boolean showMsg = false;

	// ----------------------------------------------Contadores--------------------------------------------------
	@Property
	private String actualSession;

	@Property
	private String lastBill;

	@Property
	private String lastCommand;

	@Property
	private String lastClient;

	@Property
	private String numNotaFis;

	@InjectComponent
	private Zone msgZone;

	Object onActualSessionChanged() throws InstanceNotFoundException {
		actualSession = request.getParameter("param");
		if (actualSession != null)
			configurationService.setParameterGeneric("actualSession", actualSession);
		return request.isXHR() ? msgZone.getBody() : null;
	}

	Object onLastBillChanged() throws InstanceNotFoundException {
		lastBill = request.getParameter("param");
		if (lastBill != null) 
			configurationService.setParameterGeneric("lastBill", lastBill);
		return request.isXHR() ? msgZone.getBody() : null;
	}

	Object onLastCommandChanged() throws InstanceNotFoundException {
		lastCommand = request.getParameter("param");
		if (lastCommand != null)
			configurationService.setParameterGeneric("lastCommand", lastCommand);
		return request.isXHR() ? msgZone.getBody() : null;
	}

	Object onLastClientChanged() throws InstanceNotFoundException {
		lastClient = request.getParameter("param");
		if (lastClient != null)
			configurationService.setParameterGeneric("lastClient", lastClient);
		return request.isXHR() ? msgZone.getBody() : null;
	}

	Object onNumNotaFisChanged() throws InstanceNotFoundException {
		numNotaFis = request.getParameter("param");
		if (numNotaFis != null)
			configurationService.setParameterGeneric("numNotaFis", numNotaFis);
		return request.isXHR() ? msgZone.getBody() : null;
	}

	// ----------------------------------------------General--------------------------------------------------

	@InjectComponent
	private Zone msgZone2;

	@Property
	private String restCateg;

	Object onRestCategChanged() throws InstanceNotFoundException {
		restCateg = request.getParameter("param");
		if (restCateg != null) 
		configurationService.setParameterGeneric("restCateg", restCateg);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String tableNumber;

	Object onTableNumberChanged() throws InstanceNotFoundException {
		tableNumber = request.getParameter("param");
		if (tableNumber != null)
			configurationService.setParameterGeneric("tableNumber", tableNumber);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	
	@Property
	private Boolean covServChar;

	Object onCovServCharChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		System.out.println("value " + value);
//		if (value == "true") 
//			configurationService.setParameterBool("covServChar", true);
//		else
//			configurationService.setParameterBool("covServChar", false);
		return request.isXHR() ? msgZone2.getBody() : null;

	}


	@Property
	private String covServCharImp;

	Object onCovServCharImpChanged() throws InstanceNotFoundException {
		covServCharImp = request.getParameter("param");
		if (covServCharImp != null) 
		configurationService.setParameterGeneric("covServCharImp",
				covServCharImp);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String covServCharIVAType;

	Object onCovServCharIVATypeChanged() throws InstanceNotFoundException {
		covServCharIVAType = request.getParameter("param");
		if (covServCharIVAType != null) 
		configurationService.setParameterGeneric("covServCharIVAType",
				covServCharIVAType);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String literalCharCov;

	Object onLiteralCharCovChanged() throws InstanceNotFoundException {
		literalCharCov = request.getParameter("param");
		if (literalCharCov != null) 
		configurationService.setParameterGeneric("literalCharCov",
				literalCharCov);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean tipWaiterInvoice;

	@Property
	private String tipWaiterInvoicePorcent;

	Object onTipWaiterInvoicePorcentChanged() throws InstanceNotFoundException {
		tipWaiterInvoicePorcent = request.getParameter("param");
		if (tipWaiterInvoicePorcent != null) 
		configurationService.setParameterGeneric("tipWaiterInvoicePorcent",
				tipWaiterInvoicePorcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String tipWaiterInvoiceIVA;

	Object onTipWaiterInvoiceIVAChanged() throws InstanceNotFoundException {
		tipWaiterInvoiceIVA = request.getParameter("param");
		if (tipWaiterInvoiceIVA != null) 
		configurationService.setParameterGeneric("tipWaiterInvoiceIVA",
				tipWaiterInvoiceIVA);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String literalTipsAuto;

	Object onLiteralTipsAutoChanged() throws InstanceNotFoundException {
		literalTipsAuto = request.getParameter("param");
		if (literalTipsAuto != null) 
		configurationService.setParameterGeneric("literalTipsAuto",
				literalTipsAuto);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

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

	Object onEurUSDChangeChanged() throws InstanceNotFoundException {
		eurUSDChange = request.getParameter("param");
		if (eurUSDChange != null) 
		configurationService.setParameterGeneric("eurUSDChange", eurUSDChange);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String breakfastServHot;

	Object onBreakfastServHotChanged() throws InstanceNotFoundException {
		breakfastServHot = request.getParameter("param");
		if (breakfastServHot != null) 
		configurationService.setParameterGeneric("breakfastServHot",
				breakfastServHot);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String breakfastServCode;

	Object onBreakfastServCodeChanged() throws InstanceNotFoundException {
		breakfastServCode = request.getParameter("param");
		if (breakfastServCode != null)
		configurationService.setParameterGeneric("breakfastServCode",
				breakfastServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String lunchServHotel;

	Object onLunchServHotelChanged() throws InstanceNotFoundException {
		lunchServHotel = request.getParameter("param");
		if (lunchServHotel != null)
		configurationService.setParameterGeneric("lunchServHotel",
				lunchServHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String lunchServCode;

	Object onLunchServCodeChanged() throws InstanceNotFoundException {
		lunchServCode = request.getParameter("param");
		if (lunchServCode != null)
		configurationService
				.setParameterGeneric("lunchServCode", lunchServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dinnerServHotel;

	Object onDinnerServHotelChanged() throws InstanceNotFoundException {
		dinnerServHotel = request.getParameter("param");
		if (dinnerServHotel != null)
		configurationService.setParameterGeneric("dinnerServHotel",
				dinnerServHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dinnerServCode;

	Object onDinnerServCodeChanged() throws InstanceNotFoundException {
		dinnerServCode = request.getParameter("param");
		if (dinnerServCode != null)
		configurationService.setParameterGeneric("dinnerServCode",
				dinnerServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String otherServHotel;

	Object onOtherServHotelChanged() throws InstanceNotFoundException {
		otherServHotel = request.getParameter("param");
		if (otherServHotel != null) 
		configurationService.setParameterGeneric("otherServHotel",
				otherServHotel);
		showMsg = true;
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String otherServCode;

	Object onOtherServCodeChanged() throws InstanceNotFoundException {
		otherServCode = request.getParameter("param");
		if (otherServCode != null)
		configurationService
				.setParameterGeneric("otherServCode", otherServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String integrationHotel;

	Object onIntegrationHotelChanged() throws InstanceNotFoundException {
		integrationHotel = request.getParameter("param");
		if (integrationHotel != null)
		configurationService.setParameterGeneric("integrationHotel",
				integrationHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean integrationEcon;

	@Property
	private Boolean qualifyKitchenDish;

	@Property
	private Boolean splitCommand;

	@Property
	private String cancelTableLevel;

	Object onCancelTableLevelChanged() throws InstanceNotFoundException {
		cancelTableLevel = request.getParameter("param");
		if (cancelTableLevel != null)
		configurationService.setParameterGeneric("cancelTableLevel",
				cancelTableLevel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dayMenuLevel;

	Object onDayMenuLevelChanged() throws InstanceNotFoundException {
		dayMenuLevel = request.getParameter("param");
		if (dayMenuLevel != null)
		configurationService.setParameterGeneric("dayMenuLevel", dayMenuLevel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String literalEspBill;

	Object onLiteralEspBillChanged() throws InstanceNotFoundException {
		literalEspBill = request.getParameter("param");
		if (literalEspBill != null)
		configurationService.setParameterGeneric("literalEspBill",
				literalEspBill);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean tips;

	@Property
	private String assocElemTips;

	Object onAssocElemTipsChanged() throws InstanceNotFoundException {
		assocElemTips = request.getParameter("param");
		if (assocElemTips != null)
		configurationService
				.setParameterGeneric("assocElemTips", assocElemTips);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount1;

	@Property
	private String assocElemDto1;

	Object onAssocElemDto1Changed() throws InstanceNotFoundException {
		assocElemDto1 = request.getParameter("param");
		if (assocElemDto1 != null) 
		configurationService
				.setParameterGeneric("assocElemDto1", assocElemDto1);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto1Porcent;

	Object onAssocElemDto1PorcentChanged() throws InstanceNotFoundException {
		assocElemDto1Porcent = request.getParameter("param");
		if (assocElemDto1Porcent != null)
		configurationService.setParameterGeneric("assocElemDto1Porcent",
				assocElemDto1Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount2;

	@Property
	private String assocElemDto2;

	Object onAssocElemDto2Changed() throws InstanceNotFoundException {
		assocElemDto2 = request.getParameter("param");
		if (assocElemDto2 != null)
		configurationService
				.setParameterGeneric("assocElemDto2", assocElemDto2);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto2Porcent;

	Object onAssocElemDto2PorcentChanged() throws InstanceNotFoundException {
		assocElemDto2Porcent = request.getParameter("param");
		if (assocElemDto2Porcent != null) 
		configurationService.setParameterGeneric("assocElemDto2Porcent",
				assocElemDto2Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount3;

	@Property
	private String assocElemDto3;

	Object onAssocElemDto3Changed() throws InstanceNotFoundException {
		assocElemDto3 = request.getParameter("param");
		if (assocElemDto3 != null)
		configurationService
				.setParameterGeneric("assocElemDto3", assocElemDto3);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto3Porcent;

	Object onAssocElemDto3PorcentChanged() throws InstanceNotFoundException {
		assocElemDto3Porcent = request.getParameter("param");
		if (assocElemDto3Porcent != null)
		configurationService.setParameterGeneric("assocElemDto3Porcent",
				assocElemDto3Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemTPV;

	Object onAssocElemTPVChanged() throws InstanceNotFoundException {
		assocElemTPV = request.getParameter("param");
		if (assocElemTPV != null)
		configurationService.setParameterGeneric("assocElemTPV", assocElemTPV);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String chargeTPV;

	Object onchargeTPVChanged() throws InstanceNotFoundException {
		chargeTPV = request.getParameter("param");
		if (chargeTPV != null)
		configurationService.setParameterGeneric("chargeTPV", chargeTPV);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String fieldSeparator;

	Object onFieldSeparatorChanged() throws InstanceNotFoundException {
		fieldSeparator = request.getParameter("param");
		if (fieldSeparator != null)
		configurationService.setParameterGeneric("fieldSeparator",
				fieldSeparator);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String alphabSeparator;

	Object onAlphabSeparator() throws InstanceNotFoundException {
		alphabSeparator = request.getParameter("param");
		if (alphabSeparator != null)
		configurationService.setParameterGeneric("alphabSeparator",
				alphabSeparator);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	// ---------------------------------------------- Restaurante
	// --------------------------------------------------

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
	private String lastNumPrint;

	@Property
	private String closureLastMonth;

	@Property
	private Boolean sumDrinks;

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
	private Boolean enableMeteorology;

	@Property
	private Boolean enableSegmentCh;

	@Property
	private String channelSegment;

	/*
	 * -------------------------------------------------- Contabilidad
	 * ---------------------------------------------------------------------
	 */
	@Property
	private String contCode;

	@Property
	private String contSerie; // falta en BBDD

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

	// ------Printer-----------
	@Property
	private Boolean bmpToPrint;

	@Property
	private String bmpSize;

	@Property
	private String secuence;

	@Property
	private String standardPrint;

	@Property
	private String pageLength;

	@Property
	private String skipHeaderLines;

	@Property
	private String leftTab;

	@Property
	private Boolean decimalArt;

	@Property
	private Boolean precioxPax;

	@Property
	private Boolean printKitchenCalif;

	@Property
	private Boolean printer1;

	@Property
	private String commandPortPrt1;

	@Property
	private Boolean printer2;

	@Property
	private String commandPortPrt2;

	@Property
	private Boolean printerEsp;

	@Property
	private String autocorte;

	@Property
	private String drawerOpen;

	@Property
	private String DoubleBoldOn;

	@Property
	private String DoubleBoldOff;

	// ---------------------------------------------------------Conectividad-------------------------------------------------------------

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

	void afterRender() throws InstanceNotFoundException {
		cgList = configurationService.getParametersGeneric();
		cbList = configurationService.getParametersBool();
		crList = configurationService.getParametersRoom();

		JSONObject parameters = new JSONObject();
		JSONArray parametersGeneric = new JSONArray();
		JSONArray parametersBool = new JSONArray();
		JSONArray parametersRoom = new JSONArray();

		for (ConfigurationGeneric cg : cgList)
			parametersGeneric.put(Integer.toString(cg.getConfGenericId()) + "|"
					+ cg.getName() + "|" + cg.getValue());

		for (ConfigurationBool cb : cbList)
			parametersBool.put(Integer.toString(cb.getConfBoolId()) + "|"
					+ cb.getName() + "|" + cb.getValue());

		for (ConfigurationRoom cr : crList)
			parametersRoom.put(Integer.toString(cr.getConfigurationRoomId())
					+ "|" + cr.getRoomDescription() + "|" + cr.getFirstTab()
					+ "|" + cr.getLastTab());

		parameters.put("parametersGeneric", parametersGeneric);
		parameters.put("parametersBool", parametersBool);
		parameters.put("parametersRoom", parametersRoom);
		javaScriptSupport.addInitializerCall("loadParameters", parameters);
	}
}