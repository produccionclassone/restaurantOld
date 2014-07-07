package es.classone.restaurant.web.pages.configuration;

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
import org.got5.tapestry5.jquery.mixins.Button;

import es.classone.restaurant.model.configurationBool.ConfigurationBool;
import es.classone.restaurant.model.configurationGeneric.ConfigurationGeneric;
import es.classone.restaurant.model.configurationPrivilege.ConfigurationPrivilege;
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
	private List<ConfigurationPrivilege> cpList;

	@Property
	@Persist(PersistenceConstants.FLASH)
	private String radioSelectedValue;
	
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
	private Zone msgZone1;

	Object onActualSessionChanged() throws InstanceNotFoundException {
		actualSession = request.getParameter("param");
		configurationService
				.setParameterGeneric("actualSession", actualSession);
		return request.isXHR() ? msgZone1.getBody() : null;
	}

	Object onLastBillChanged() throws InstanceNotFoundException {
		lastBill = request.getParameter("param");
		configurationService.setParameterGeneric("lastBill", lastBill);
		return request.isXHR() ? msgZone1.getBody() : null;
	}

	Object onLastCommandChanged() throws InstanceNotFoundException {
		lastCommand = request.getParameter("param");
		configurationService.setParameterGeneric("lastCommand", lastCommand);
		return request.isXHR() ? msgZone1.getBody() : null;
	}

	Object onLastClientChanged() throws InstanceNotFoundException {
		lastClient = request.getParameter("param");
		configurationService.setParameterGeneric("lastClient", lastClient);
		return request.isXHR() ? msgZone1.getBody() : null;
	}

	Object onNumNotaFisChanged() throws InstanceNotFoundException {
		numNotaFis = request.getParameter("param");
		configurationService.setParameterGeneric("numNotaFis", numNotaFis);
		return request.isXHR() ? msgZone1.getBody() : null;
	}

	// ----------------------------------------------General--------------------------------------------------

	@InjectComponent
	private Zone msgZone2;

	@Property
	private String restCateg;

	Object onRestCategChanged() throws InstanceNotFoundException {
		restCateg = request.getParameter("param");
		configurationService.setParameterGeneric("restCateg", restCateg);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String tableNumber;

	Object onTableNumberChanged() throws InstanceNotFoundException {
		tableNumber = request.getParameter("param");
		configurationService.setParameterGeneric("tableNumber", tableNumber);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean covServChar;

	Object onCovServCharChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			covServChar = true;
		else
			covServChar = false;
		configurationService.setParameterBool("covServChar", covServChar);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String covServCharImp;

	Object onCovServCharImpChanged() throws InstanceNotFoundException {
		covServCharImp = request.getParameter("param");
		configurationService.setParameterGeneric("covServCharImp",
				covServCharImp);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String covServCharIVAType;

	static final private String[] ALL_IVA_TYPE_OPTION = new String[] { "1", "2", "3" };

	@Property
	private String[] ivaTypeOptions;

	Object onValueChangedFromCovServCharIVAType(String covServCharIVAType) throws InstanceNotFoundException {
		this.covServCharIVAType = covServCharIVAType;
		configurationService.setParameterGeneric("covServCharIVAType", covServCharIVAType);
		ivaTypeOptions = ALL_IVA_TYPE_OPTION;
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String literalCharCov;

	Object onLiteralCharCovChanged() throws InstanceNotFoundException {
		literalCharCov = request.getParameter("param");
		configurationService.setParameterGeneric("literalCharCov",
				literalCharCov);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean tipWaiterInvoice;

	Object onTipWaiterInvoiceChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			tipWaiterInvoice = true;
		else
			tipWaiterInvoice = false;
		configurationService.setParameterBool("tipWaiterInvoice",
				tipWaiterInvoice);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String tipWaiterInvoicePorc;

	Object onTipWaiterInvoicePorcChanged() throws InstanceNotFoundException {
		tipWaiterInvoicePorc = request.getParameter("param");
		configurationService.setParameterGeneric("tipWaiterInvoicePorc",
				tipWaiterInvoicePorc);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String tipWaiterInvoiceIVA;

	Object onValueChangedFromtipWaiterInvoiceIVA(String tipWaiterInvoiceIVA) throws InstanceNotFoundException {
		this.tipWaiterInvoiceIVA = tipWaiterInvoiceIVA;
		configurationService.setParameterGeneric("tipWaiterInvoiceIVA", tipWaiterInvoiceIVA);
		ivaTypeOptions = ALL_IVA_TYPE_OPTION;
		return request.isXHR() ? msgZone2.getBody() : null;
	}
	
	@Property
	private String literalTipsAuto;

	Object onLiteralTipsAutoChanged() throws InstanceNotFoundException {
		literalTipsAuto = request.getParameter("param");
		configurationService.setParameterGeneric("literalTipsAuto",
				literalTipsAuto);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean chargeAddonDish;

	Object onChargeAddonDishChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			chargeAddonDish = true;
		else
			chargeAddonDish = false;
		configurationService.setParameterBool("chargeAddonDish",
				chargeAddonDish);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private Boolean decimal;

	Object onDecimalChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			decimal = true;
		else
			decimal = false;
		configurationService.setParameterBool("decimal",
				decimal);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private Boolean ivaIncluded;

	Object onIvaIncludedChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			ivaIncluded = true;
		else
			ivaIncluded = false;
		configurationService.setParameterBool("ivaIncluded", ivaIncluded);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String actualSessionDate;

	Object onActualSessionDateChanged() throws InstanceNotFoundException {
		actualSessionDate = request.getParameter("param");
		configurationService.setParameterGeneric("actualSessionDate",
				actualSessionDate);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean actualSessionState;

	Object onActualSessionStateChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			actualSessionState = true;
		else
			actualSessionState = false;
		configurationService.setParameterBool("actualSessionState",
				actualSessionState);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private Boolean accountingLinkVtas;

	Object onAccountingLinkVtasChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			accountingLinkVtas = true;
		else
			accountingLinkVtas = false;
		configurationService.setParameterBool("accountingLinkVtas",
				accountingLinkVtas);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private Boolean euroLine;

	Object onEuroLineChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			euroLine = true;
		else
			euroLine = false;
		configurationService.setParameterBool("euroLine", euroLine);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String eurUSDChange;

	Object onEurUSDChangeChanged() throws InstanceNotFoundException {
		eurUSDChange = request.getParameter("param");
		configurationService.setParameterGeneric("eurUSDChange", eurUSDChange);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String breakfastServHot;

	Object onBreakfastServHotChanged() throws InstanceNotFoundException {
		breakfastServHot = request.getParameter("param");
		configurationService.setParameterGeneric("breakfastServHot",
				breakfastServHot);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String breakfastServCode;

	Object onBreakfastServCodeChanged() throws InstanceNotFoundException {
		breakfastServCode = request.getParameter("param");
		configurationService.setParameterGeneric("breakfastServCode",
				breakfastServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String lunchServHotel;

	Object onLunchServHotelChanged() throws InstanceNotFoundException {
		lunchServHotel = request.getParameter("param");
		configurationService.setParameterGeneric("lunchServHotel",
				lunchServHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String lunchServCode;

	Object onLunchServCodeChanged() throws InstanceNotFoundException {
		lunchServCode = request.getParameter("param");
		configurationService
				.setParameterGeneric("lunchServCode", lunchServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dinnerServHotel;

	Object onDinnerServHotelChanged() throws InstanceNotFoundException {
		dinnerServHotel = request.getParameter("param");
		configurationService.setParameterGeneric("dinnerServHotel",
				dinnerServHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dinnerServCode;

	Object onDinnerServCodeChanged() throws InstanceNotFoundException {
		dinnerServCode = request.getParameter("param");
		configurationService.setParameterGeneric("dinnerServCode",
				dinnerServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String otherServHotel;

	Object onOtherServHotelChanged() throws InstanceNotFoundException {
		otherServHotel = request.getParameter("param");
		configurationService.setParameterGeneric("otherServHotel",
				otherServHotel);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String otherServCode;

	Object onOtherServCodeChanged() throws InstanceNotFoundException {
		otherServCode = request.getParameter("param");
		configurationService
				.setParameterGeneric("otherServCode", otherServCode);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String integrationHotel;

	static final private String[] ALL_INTEGRATION_HOTEL_OPTION = new String[] { "S", "N", "R" };

	@Property
	private String[] integrationHotelOptions;

	Object onValueChangedFromIntegrationHotel(String integrationHotel) throws InstanceNotFoundException {
		this.integrationHotel = integrationHotel;
		configurationService.setParameterGeneric("integrationHotel", integrationHotel);
		integrationHotelOptions = ALL_INTEGRATION_HOTEL_OPTION;
		return request.isXHR() ? msgZone2.getBody() : null;
	}
	
	@Property
	private Boolean integrationEcon;

	Object onIntegrationEconChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			integrationEcon = true;
		else
			integrationEcon = false;
		configurationService.setParameterBool("integrationEcon",
				integrationEcon);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private Boolean splitCommand;

	Object onSplitCommandChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			splitCommand = true;
		else
			splitCommand = false;
		configurationService.setParameterBool("splitCommand", splitCommand);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String cancelTableLevel;

	static final private String[] ALL_LEVEL_OPTION = new String[] { "0", "1", "2", "3" };

	@Property
	private String[] cancelTableLevelOptions;

	Object onValueChangedFromCancelTableLevel(String cancelTableLevel) throws InstanceNotFoundException {
		this.cancelTableLevel = cancelTableLevel;
		configurationService.setParameterGeneric("cancelTableLevel", cancelTableLevel);
		cancelTableLevelOptions = ALL_LEVEL_OPTION;
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String dayMenuLevel;

	@Property
	private String[] dayMenuLevelOptions;

	Object onValueChangedFromDayMenuLevel(String dayMenuLevel) throws InstanceNotFoundException {
		this.dayMenuLevel = dayMenuLevel;
		configurationService.setParameterGeneric("dayMenuLevel", dayMenuLevel);
		dayMenuLevelOptions = ALL_LEVEL_OPTION;
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String literalEspBill;

	Object onLiteralEspBillChanged() throws InstanceNotFoundException {
		literalEspBill = request.getParameter("param");
		configurationService.setParameterGeneric("literalEspBill",
				literalEspBill);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean tips;

	Object onTipsChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			tips = true;
		else
			tips = false;
		configurationService.setParameterBool("tips", tips);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String assocElemTips;

	Object onAssocElemTipsChanged() throws InstanceNotFoundException {
		assocElemTips = request.getParameter("param");
		configurationService
				.setParameterGeneric("assocElemTips", assocElemTips);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount1;

	Object onDiscount1Changed() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			discount1 = true;
		else
			discount1 = false;
		configurationService.setParameterBool("discount1", discount1);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String assocElemDto1;

	Object onAssocElemDto1Changed() throws InstanceNotFoundException {
		assocElemDto1 = request.getParameter("param");
		configurationService
				.setParameterGeneric("assocElemDto1", assocElemDto1);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto1Porcent;

	Object onAssocElemDto1PorcentChanged() throws InstanceNotFoundException {
		assocElemDto1Porcent = request.getParameter("param");
		configurationService.setParameterGeneric("assocElemDto1Porcent",
				assocElemDto1Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount2;

	Object onDiscount2Changed() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			discount2 = true;
		else
			discount2 = false;
		configurationService.setParameterBool("discount2", discount2);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String assocElemDto2;

	Object onAssocElemDto2Changed() throws InstanceNotFoundException {
		assocElemDto2 = request.getParameter("param");
		configurationService
				.setParameterGeneric("assocElemDto2", assocElemDto2);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto2Porcent;

	Object onAssocElemDto2PorcentChanged() throws InstanceNotFoundException {
		assocElemDto2Porcent = request.getParameter("param");
		configurationService.setParameterGeneric("assocElemDto2Porcent",
				assocElemDto2Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private Boolean discount3;

	Object onDiscount3Changed() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			discount3 = true;
		else
			discount3 = false;
		configurationService.setParameterBool("discount3", discount3);
		return request.isXHR() ? msgZone2.getBody() : null;

	}

	@Property
	private String assocElemDto3;

	Object onAssocElemDto3Changed() throws InstanceNotFoundException {
		assocElemDto3 = request.getParameter("param");
		configurationService
				.setParameterGeneric("assocElemDto3", assocElemDto3);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemDto3Porcent;

	Object onAssocElemDto3PorcentChanged() throws InstanceNotFoundException {
		assocElemDto3Porcent = request.getParameter("param");
		configurationService.setParameterGeneric("assocElemDto3Porcent",
				assocElemDto3Porcent);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String assocElemTPV;

	Object onAssocElemTPVChanged() throws InstanceNotFoundException {
		assocElemTPV = request.getParameter("param");
		configurationService.setParameterGeneric("assocElemTPV", assocElemTPV);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String chargeTPV;

	Object onChargeTPVChanged() throws InstanceNotFoundException {
		chargeTPV = request.getParameter("param");
		configurationService.setParameterGeneric("chargeTPV", chargeTPV);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String fieldSeparator;

	Object onFieldSeparatorChanged() throws InstanceNotFoundException {
		fieldSeparator = request.getParameter("param");
		configurationService.setParameterGeneric("fieldSeparator",
				fieldSeparator);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	@Property
	private String alphabSeparator;

	Object onAlphabSeparatorChanged() throws InstanceNotFoundException {
		alphabSeparator = request.getParameter("param");
		configurationService.setParameterGeneric("alphabSeparator",
				alphabSeparator);
		return request.isXHR() ? msgZone2.getBody() : null;
	}

	// ---------------------- Restaurante -----------------------------------

	@InjectComponent
	private Zone msgZone3;

	@Property
	private String colCommand;

	Object onColCommandChanged() throws InstanceNotFoundException {
		colCommand = request.getParameter("param");
		configurationService.setParameterGeneric("colCommand", colCommand);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colBackground;

	Object onColBackgroundChanged() throws InstanceNotFoundException {
		colBackground = request.getParameter("param");
		configurationService
				.setParameterGeneric("colBackground", colBackground);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colBill;

	Object onColBillChanged() throws InstanceNotFoundException {
		colBill = request.getParameter("param");
		configurationService.setParameterGeneric("colBill", colBill);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colBackground2;

	Object onColBackground2Changed() throws InstanceNotFoundException {
		colBackground2 = request.getParameter("param");
		configurationService.setParameterGeneric("colBackground2",
				colBackground2);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colCharge;

	Object onColChargeChanged() throws InstanceNotFoundException {
		colCharge = request.getParameter("param");
		configurationService.setParameterGeneric("colCharge", colCharge);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTrasp;

	Object onColTraspChanged() throws InstanceNotFoundException {
		colTrasp = request.getParameter("param");
		configurationService.setParameterGeneric("colTrasp", colTrasp);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTabEmpty;

	Object onColTabEmptyChanged() throws InstanceNotFoundException {
		colTabEmpty = request.getParameter("param");
		configurationService.setParameterGeneric("colTabEmpty", colTabEmpty);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTabBusy;

	Object onColTabBusyChanged() throws InstanceNotFoundException {
		colTabBusy = request.getParameter("param");
		configurationService.setParameterGeneric("colTabBusy", colTabBusy);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTabAtached;

	Object onColTabAtachedChanged() throws InstanceNotFoundException {
		colTabAtached = request.getParameter("param");
		configurationService
				.setParameterGeneric("colTabAtached", colTabAtached);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTabReserved;

	Object onColTabReservedChanged() throws InstanceNotFoundException {
		colTabReserved = request.getParameter("param");
		configurationService.setParameterGeneric("colTabReserved",
				colTabReserved);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String colTabBill;

	Object onColTabBillChanged() throws InstanceNotFoundException {
		colTabBill = request.getParameter("param");
		configurationService.setParameterGeneric("colTabBill", colTabBill);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastNumPrinted;

	Object onLastNumPrintedChanged() throws InstanceNotFoundException {
		lastNumPrinted = request.getParameter("param");
		configurationService.setParameterGeneric("lastNumPrinted", lastNumPrinted);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String closureLastMonth;

	Object onClosureLastMonthChanged() throws InstanceNotFoundException {
		closureLastMonth = request.getParameter("param");
		configurationService.setParameterGeneric("closureLastMonth",
				closureLastMonth);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private Boolean sumDrinks;

	Object onSumDrinksChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			sumDrinks = true;
		else
			sumDrinks = false;
		configurationService.setParameterBool("sumDrinks", sumDrinks);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc1;

	Object onDesc1Changed() throws InstanceNotFoundException {
		desc1 = request.getParameter("param");
		configurationService.setRoomDesc(1, desc1);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab1;

	Object onFirstTab1Changed() throws InstanceNotFoundException {
		firstTab1 = request.getParameter("param");
		configurationService.setRoomFirstTab(1,Integer.valueOf(firstTab1));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab1;

	Object onLastTab1Changed() throws InstanceNotFoundException {
		lastTab1 = request.getParameter("param");
		configurationService.setRoomLastTab(1,Integer.valueOf(lastTab1));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc2;

	Object onDesc2Changed() throws InstanceNotFoundException {
		desc2 = request.getParameter("param");
		configurationService.setRoomDesc(2, desc2);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab2;

	Object onFirstTab2Changed() throws InstanceNotFoundException {
		firstTab2 = request.getParameter("param");
		configurationService.setRoomFirstTab(2,Integer.valueOf(firstTab2));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab2;

	Object onLastTab2Changed() throws InstanceNotFoundException {
		lastTab2 = request.getParameter("param");
		configurationService.setRoomLastTab(2,Integer.valueOf(lastTab2));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc3;

	Object onDesc3Changed() throws InstanceNotFoundException {
		desc3 = request.getParameter("param");
		configurationService.setRoomDesc(3, desc3);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab3;

	Object onFirstTab3Changed() throws InstanceNotFoundException {
		firstTab3 = request.getParameter("param");
		configurationService.setRoomFirstTab(3,Integer.valueOf(firstTab3));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab3;

	Object onLastTab3Changed() throws InstanceNotFoundException {
		lastTab3 = request.getParameter("param");
		configurationService.setRoomLastTab(3,Integer.valueOf(lastTab3));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc4;

	Object onDesc4Changed() throws InstanceNotFoundException {
		desc4 = request.getParameter("param");
		configurationService.setRoomDesc(4, desc4);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab4;

	Object onFirstTab4Changed() throws InstanceNotFoundException {
		firstTab4 = request.getParameter("param");
		configurationService.setRoomFirstTab(4,Integer.valueOf(firstTab4));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab4;

	Object onLastTab4Changed() throws InstanceNotFoundException {
		lastTab4 = request.getParameter("param");
		configurationService.setRoomLastTab(4,Integer.valueOf(lastTab4));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc5;

	Object onDesc5Changed() throws InstanceNotFoundException {
		desc5 = request.getParameter("param");
		configurationService.setRoomDesc(5, desc5);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab5;

	Object onFirstTab5Changed() throws InstanceNotFoundException {
		firstTab5 = request.getParameter("param");
		configurationService.setRoomFirstTab(5,Integer.valueOf(firstTab5));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab5;

	Object onLastTab5Changed() throws InstanceNotFoundException {
		lastTab5 = request.getParameter("param");
		configurationService.setRoomLastTab(5,Integer.valueOf(lastTab5));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc6;

	Object onDesc6Changed() throws InstanceNotFoundException {
		desc6 = request.getParameter("param");
		configurationService.setRoomDesc(6, desc6);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab6;

	Object onFirstTab6Changed() throws InstanceNotFoundException {
		firstTab6 = request.getParameter("param");
		configurationService.setRoomFirstTab(6,Integer.valueOf(firstTab6));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab6;

	Object onLastTab6Changed() throws InstanceNotFoundException {
		lastTab6 = request.getParameter("param");
		configurationService.setRoomLastTab(6,Integer.valueOf(lastTab6));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desc7;

	Object onDesc7Changed() throws InstanceNotFoundException {
		desc7 = request.getParameter("param");
		configurationService.setRoomDesc(7, desc7);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String firstTab7;

	Object onFirstTab7Changed() throws InstanceNotFoundException {
		firstTab7 = request.getParameter("param");
		configurationService.setRoomFirstTab(7,Integer.valueOf(firstTab7));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String lastTab7;

	Object onLastTab7Changed() throws InstanceNotFoundException {
		lastTab7 = request.getParameter("param");
		configurationService.setRoomLastTab(7,Integer.valueOf(lastTab7));
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desCalif1;

	Object onDesCalif1Changed() throws InstanceNotFoundException {
		desCalif1 = request.getParameter("param");
		configurationService.setParameterGeneric("desCalif1", desCalif1);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desCalif2;

	Object onDesCalif2Changed() throws InstanceNotFoundException {
		desCalif2 = request.getParameter("param");
		configurationService.setParameterGeneric("desCalif2", desCalif2);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desCalif3;

	Object onDesCalif3Changed() throws InstanceNotFoundException {
		desCalif3 = request.getParameter("param");
		configurationService.setParameterGeneric("desCalif3", desCalif3);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private String desCalif4;

	Object onDesCalif4Changed() throws InstanceNotFoundException {
		desCalif4 = request.getParameter("param");
		configurationService.setParameterGeneric("desCalif4", desCalif4);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	@Property
	private Boolean enableTPVVirtual;

	Object onEnableTPVVirtualChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			enableTPVVirtual = true;
		else
			enableTPVVirtual = false;
		configurationService.setParameterBool("enableTPVVirtual",
				enableTPVVirtual);
		return request.isXHR() ? msgZone3.getBody() : null;

	}

	@Property
	private Boolean enableStarCard;

	Object onEnableStarCardChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			enableStarCard = true;
		else
			enableStarCard = false;
		configurationService.setParameterBool("enableStarCard", enableStarCard);
		return request.isXHR() ? msgZone3.getBody() : null;

	}

	@Property
	private Boolean enableImpFiscal;

	Object onEnableImpFiscalChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			enableImpFiscal = true;
		else
			enableImpFiscal = false;
		configurationService.setParameterBool("enableImpFiscal",
				enableImpFiscal);
		return request.isXHR() ? msgZone3.getBody() : null;

	}

	@Property
	private Boolean enableMeteorology;

	Object onEnableMeteorologyChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			enableMeteorology = true;
		else
			enableMeteorology = false;
		configurationService.setParameterBool("enableMeteorology",
				enableMeteorology);
		return request.isXHR() ? msgZone3.getBody() : null;

	}

	@Property
	private Boolean enableSegmentCh;

	Object onEnableSegmentChCharChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			enableSegmentCh = true;
		else
			enableSegmentCh = false;
		configurationService.setParameterBool("enableSegmentCh",
				enableSegmentCh);
		return request.isXHR() ? msgZone3.getBody() : null;

	}

	@Property
	private String channelSegment;

	Object onChannelSegmentChanged() throws InstanceNotFoundException {
		channelSegment = request.getParameter("param");
		configurationService.setParameterGeneric("channelSegment",
				channelSegment);
		return request.isXHR() ? msgZone3.getBody() : null;
	}

	// ---------------------------------------------------------Conectividad-------------------------------------------------------------

	@InjectComponent
	private Zone msgZone4;

	@Property
	private String ipLVDE;

	Object onIpLVDEChanged() throws InstanceNotFoundException {
		ipLVDE = request.getParameter("param");
		configurationService.setParameterGeneric("ipLVDE", ipLVDE);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String ipHelp;

	Object onIpHelpChanged() throws InstanceNotFoundException {
		ipHelp = request.getParameter("param");
		configurationService.setParameterGeneric("ipHelp", ipHelp);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String ipCCC;

	Object onIpCCCChanged() throws InstanceNotFoundException {
		ipCCC = request.getParameter("param");
		configurationService.setParameterGeneric("ipCCC", ipCCC);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String ipAlternative;

	Object onIpAlternativeChanged() throws InstanceNotFoundException {
		ipAlternative = request.getParameter("param");
		configurationService
				.setParameterGeneric("ipAlternative", ipAlternative);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String sendEmail;

	Object onSendEmailChanged() throws InstanceNotFoundException {
		sendEmail = request.getParameter("param");
		configurationService.setParameterGeneric("sendEmail", sendEmail);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String sendService;

	Object onSendServiceChanged() throws InstanceNotFoundException {
		sendService = request.getParameter("param");
		configurationService.setParameterGeneric("sendService", sendService);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String sendLogin;

	Object onSendLoginChanged() throws InstanceNotFoundException {
		sendLogin = request.getParameter("param");
		configurationService.setParameterGeneric("sendLogin", sendLogin);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	@Property
	private String sendPsw;

	Object onSendPswChanged() throws InstanceNotFoundException {
		sendPsw = request.getParameter("param");
		configurationService.setParameterGeneric("sendPsw", sendPsw);
		return request.isXHR() ? msgZone4.getBody() : null;
	}

	// -------------------------- Contabilidad------------------------------

	@InjectComponent
	private Zone msgZone5;

	@Property
	private String contCode;

	Object onContCodeChanged() throws InstanceNotFoundException {
		contCode = request.getParameter("param");
		configurationService.setParameterGeneric("contCode", contCode);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String contSerie;

	Object onContSerieChanged() throws InstanceNotFoundException {
		contSerie = request.getParameter("param");
		configurationService.setParameterGeneric("contSerie", contSerie);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccCaja;

	Object onLedgerAccCajaChanged() throws InstanceNotFoundException {
		ledgerAccCaja = request.getParameter("param");
		configurationService
				.setParameterGeneric("ledgerAccCaja", ledgerAccCaja);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccInvi;

	Object onLedgerAccInviChanged() throws InstanceNotFoundException {
		ledgerAccInvi = request.getParameter("param");
		configurationService
				.setParameterGeneric("ledgerAccInvi", ledgerAccInvi);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccGerVtas;

	Object onLedgerAccGerVtasChanged() throws InstanceNotFoundException {
		ledgerAccGerVtas = request.getParameter("param");
		configurationService.setParameterGeneric("ledgerAccGerVtas",
				ledgerAccGerVtas);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccServCbtos;

	Object onLedgerAccServCbtosChanged() throws InstanceNotFoundException {
		ledgerAccServCbtos = request.getParameter("param");
		configurationService.setParameterGeneric("ledgerAccServCbtos",
				ledgerAccServCbtos);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccPropCam;

	Object onLedgerAccPropCamChanged() throws InstanceNotFoundException {
		ledgerAccPropCam = request.getParameter("param");
		configurationService.setParameterGeneric("ledgerAccPropCam",
				ledgerAccPropCam);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccDescVtas;

	Object onLedgerAccDescVtas() throws InstanceNotFoundException {
		ledgerAccDescVtas = request.getParameter("param");
		configurationService.setParameterGeneric("ledgerAccDescVtas",
				ledgerAccDescVtas);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ivaType1;

	Object onIvaType1Changed() throws InstanceNotFoundException {
		ivaType1 = request.getParameter("param");
		configurationService.setParameterGeneric("ivaType1", ivaType1);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccIVA1;

	Object onledgerAccIVA1Changed() throws InstanceNotFoundException {
		ledgerAccIVA1 = request.getParameter("param");
		configurationService
				.setParameterGeneric("ledgerAccIVA1", ledgerAccIVA1);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ivaType2;

	Object onIvaType2Changed() throws InstanceNotFoundException {
		ivaType2 = request.getParameter("param");
		configurationService.setParameterGeneric("ivaType2", ivaType2);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccIVA2;

	Object onledgerAccIVA2Changed() throws InstanceNotFoundException {
		ledgerAccIVA2 = request.getParameter("param");
		configurationService
				.setParameterGeneric("ledgerAccIVA2", ledgerAccIVA2);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ivaType3;

	Object onIvaType3Changed() throws InstanceNotFoundException {
		ivaType3 = request.getParameter("param");
		configurationService.setParameterGeneric("ivaType3", ivaType3);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String ledgerAccIVA3;

	Object onledgerAccIVA3Changed() throws InstanceNotFoundException {
		ledgerAccIVA3 = request.getParameter("param");
		configurationService
				.setParameterGeneric("ledgerAccIVA3", ledgerAccIVA3);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String literalIVA;

	Object onLiteralIVAChanged() throws InstanceNotFoundException {
		literalIVA = request.getParameter("param");
		configurationService.setParameterGeneric("literalIVA", literalIVA);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String cadExplot;

	Object onCadExplotChanged() throws InstanceNotFoundException {
		cadExplot = request.getParameter("param");
		configurationService.setParameterGeneric("cadExplot", cadExplot);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String cadDept;

	Object oncadDeptChanged() throws InstanceNotFoundException {
		cadDept = request.getParameter("param");
		configurationService.setParameterGeneric("cadDept", cadDept);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String covIncomeType;

	Object onCovIncomeTypeChanged() throws InstanceNotFoundException {
		covIncomeType = request.getParameter("param");
		configurationService
				.setParameterGeneric("covIncomeType", covIncomeType);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	@Property
	private String tipsIncomeType;

	Object onTipsIncomeTypeChanged() throws InstanceNotFoundException {
		tipsIncomeType = request.getParameter("param");
		configurationService.setParameterGeneric("tipsIncomeType",
				tipsIncomeType);
		return request.isXHR() ? msgZone5.getBody() : null;
	}

	// --------------------------------Printer---------------------------

	@InjectComponent
	private Zone msgZone6;

	@Property
	private Boolean bmpToPrint;

	Object onBmpToPrintChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			bmpToPrint = true;
		else
			bmpToPrint = false;
		configurationService.setParameterBool("bmpToPrint", bmpToPrint);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private String bmpSize;

	Object onBmpSizeChanged() throws InstanceNotFoundException {
		bmpSize = request.getParameter("param");
		configurationService.setParameterGeneric("bmpSize", bmpSize);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String secuence;

	Object onSecuenceChanged() throws InstanceNotFoundException {
		secuence = request.getParameter("param");
		configurationService.setParameterGeneric("secuence", secuence);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String standardPrint;

	Object onStandardPrintChanged() throws InstanceNotFoundException {
		standardPrint = request.getParameter("param");
		configurationService
				.setParameterGeneric("standardPrint", standardPrint);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String pageLength;

	Object onPageLengthChanged() throws InstanceNotFoundException {
		pageLength = request.getParameter("param");
		configurationService.setParameterGeneric("pageLength", pageLength);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String skipHeaderLines;

	Object onSkipHeaderLinesChanged() throws InstanceNotFoundException {
		skipHeaderLines = request.getParameter("param");
		configurationService.setParameterGeneric("skipHeaderLines",
				skipHeaderLines);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String leftTab;

	Object onLeftTabChanged() throws InstanceNotFoundException {
		leftTab = request.getParameter("param");
		configurationService.setParameterGeneric("leftTab", leftTab);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private Boolean decimalArt;

	Object onDecimalArtChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			decimalArt = true;
		else
			decimalArt = false;
		configurationService.setParameterBool("decimalArt", decimalArt);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private Boolean precioxPers;

	Object onPrecioxPersChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			precioxPers = true;
		else
			precioxPers = false;
		configurationService.setParameterBool("precioxPers", precioxPers);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private Boolean printKitchenCalif;

	Object onPrintKitchenCalifChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			printKitchenCalif = true;
		else
			printKitchenCalif = false;
		configurationService.setParameterBool("printKitchenCalif",
				printKitchenCalif);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private Boolean printer1;

	Object onPrinter1Changed() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			printer1 = true;
		else
			printer1 = false;
		configurationService.setParameterBool("printer1", printer1);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private String commandPortPrt1;

	Object commandPortPrt1Changed() throws InstanceNotFoundException {
		commandPortPrt1 = request.getParameter("param");
		configurationService.setParameterGeneric("commandPortPrt1",
				commandPortPrt1);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private Boolean printer2;

	Object onPrinter2Changed() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			printer2 = true;
		else
			printer2 = false;
		configurationService.setParameterBool("printer2", printer2);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private String commandPortPrt2;

	Object commandPortPrt2Changed() throws InstanceNotFoundException {
		commandPortPrt2 = request.getParameter("param");
		configurationService.setParameterGeneric("commandPortPrt2",
				commandPortPrt2);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private Boolean printerEsp;

	Object onPrinterEspChanged() throws InstanceNotFoundException {
		String value = request.getParameter("param");
		if (value.equals("true") == true)
			printerEsp = true;
		else
			printerEsp = false;
		configurationService.setParameterBool("printerEsp", printerEsp);
		return request.isXHR() ? msgZone6.getBody() : null;

	}

	@Property
	private String autocorte;

	Object onAutocorteChanged() throws InstanceNotFoundException {
		autocorte = request.getParameter("param");
		configurationService.setParameterGeneric("autocorte", autocorte);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String drawerOpen;

	Object onDrawerOpenChanged() throws InstanceNotFoundException {
		drawerOpen = request.getParameter("param");
		configurationService.setParameterGeneric("drawerOpen", drawerOpen);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String doubleBoldOn;

	Object onDoubleBoldOnChanged() throws InstanceNotFoundException {
		doubleBoldOn = request.getParameter("param");
		configurationService.setParameterGeneric("doubleBoldOn", doubleBoldOn);
		return request.isXHR() ? msgZone6.getBody() : null;
	}

	@Property
	private String doubleBoldOff;

	Object onDoubleBoldOffChanged() throws InstanceNotFoundException {
		doubleBoldOff = request.getParameter("param");
		configurationService
				.setParameterGeneric("doubleBoldOff", doubleBoldOff);
		return request.isXHR() ? msgZone6.getBody() : null;
	}
	
	//--------------------Privileges------------------------------------------

	
	@InjectComponent
	private Zone msgZonePriv;	
	
	Object onLevelChanged() throws InstanceNotFoundException {
		String aux [] = request.getParameter("param").split(":");
		configurationService.setPrivilegeConfiguration(aux[0],aux[1]);
		return request.isXHR() ? msgZonePriv.getBody() : null;
	}

	Object onCheckChanged(String param) throws InstanceNotFoundException {
		String aux [] = param.split(":");
		System.out.println(aux[1]);
		configurationService.setPrivilegeConfiguration(aux[0],aux[1]);
		return request.isXHR() ? msgZonePriv.getBody() : null;
	}
	
	void afterRender() throws InstanceNotFoundException {
		cgList = configurationService.getParametersGeneric();
		cbList = configurationService.getParametersBool();
		crList = configurationService.getParametersRoom();
		cpList = configurationService.getPrivileges();
		
		JSONObject parameters = new JSONObject();
		JSONArray parametersGeneric = new JSONArray();
		JSONArray parametersBool = new JSONArray();
		JSONArray parametersRoom = new JSONArray();
		JSONArray parametersPrivilege = new JSONArray();
		
		for (ConfigurationGeneric cg : cgList) {
				JSONObject parameterGeneric = new JSONObject();
				parameterGeneric.put("id", cg.getConfGenericId());
				parameterGeneric.put("name", cg.getName());
				parameterGeneric.put("value", cg.getValue());
				parametersGeneric.put(parameterGeneric);
		}
		
		for (ConfigurationBool cb : cbList) {
			JSONObject parameterBool = new JSONObject();
			parameterBool.put("id", cb.getConfBoolId());
			parameterBool.put("name", cb.getName());
			parameterBool.put("value", cb.getValue());
			parametersBool.put(parameterBool);
		}

		for (ConfigurationRoom cr : crList) {
			JSONObject parameterRoom = new JSONObject();
			parameterRoom.put("id", cr.getConfigurationRoomId());
			parameterRoom.put("roomDescription", cr.getRoomDescription());
			parameterRoom.put("firstTab", cr.getFirstTab());
			parameterRoom.put("lastTab", cr.getLastTab());
			parametersRoom.put(parameterRoom);
		}
		
		for (ConfigurationPrivilege cp : cpList) {
			JSONObject parameterPrivilege = new JSONObject();
			parameterPrivilege.put("id", cp.getConfPrivilegeId());
			parameterPrivilege.put("name", cp.getName());
			parameterPrivilege.put("value", cp.getPrivilegeValue());
			parametersPrivilege.put(parameterPrivilege);
	}

		parameters.put("parametersGeneric", parametersGeneric);
		parameters.put("parametersBool", parametersBool);
		parameters.put("parametersRoom", parametersRoom);
		parameters.put("parametersPrivilege", parametersPrivilege);
		javaScriptSupport.addInitializerCall("loadParameters", parameters);
	}
	
	void setupRender() {

		if (integrationHotelOptions == null) {
			integrationHotelOptions = ALL_INTEGRATION_HOTEL_OPTION;
	    }
		
		if (ivaTypeOptions == null) {
			ivaTypeOptions = ALL_IVA_TYPE_OPTION;
	    }
		
		if (cancelTableLevelOptions == null) {
			cancelTableLevelOptions = ALL_LEVEL_OPTION;
	    }
		
		if (dayMenuLevelOptions == null) {
			dayMenuLevelOptions = ALL_LEVEL_OPTION;
	    }
	}	
}