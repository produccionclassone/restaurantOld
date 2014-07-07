package es.classone.restaurant.web.pages.masterFiles;

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
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.configurationservice.ConfigurationService;
import es.classone.restaurant.model.currency.Currency;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addCurrency.js")
public class MasterCurrency {

	@Component
	private Form tableForm;
	@Property
	private int currencyId=-1;
	@Property
	private String currencyCode; 
	@Property
	private String currencyName; 
	@Property
	private int currencyChange; 
	@Property
	private float currencyQuote; 
	@Property
	private float commisionPercent;
	
	@Property
	private List<Currency> currencys;

	@Property
	private Currency currency;

	@Inject
	private MasterFilesService masterFilesService;
	
	@Inject
	private ConfigurationService configuration;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Property
	private ArrayList<Integer> links;

	@Property
	private int link;

	@InjectComponent
	private Zone zone;

	@InjectComponent
	private Zone tableZone;

	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;

	@Inject
	private Messages messages;
	

	void setupRender() throws DuplicateInstanceException {
		int lastId=0;
		currencys = masterFilesService.findAllCurrency();
		int size = currencys.size();
		if (size == 0) {
			
		} else {
			lastId = currencys.get(size - 1).getCurrencyId();
			
		}
		links = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			links.add(lastId + i);
		}

	}



	void onValidateFromTableForm() throws InstanceNotFoundException,
			NumberFormatException, DuplicateInstanceException {

		if (currencyId == -1) {
			Currency c = new Currency(currencyCode, currencyName, currencyChange, currencyQuote, commisionPercent);
			currencyId = masterFilesService.createCurrency(c).getCurrencyId();
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					JSONObject newRow = new JSONObject();
					newRow.put("currencyCode", currencyCode);
					newRow.put("currencyName", currencyName);
					newRow.put("currencyChange", currencyChange);
					newRow.put("currencyQuote", currencyQuote);
					newRow.put("commisionPercent", commisionPercent);
					javascriptSupport
							.addInitializerCall("addCurrency", newRow);
				}
			});
		} else {
			masterFilesService.editCurrency(currencyId, currencyCode, currencyName, currencyChange, currencyQuote, commisionPercent);
		}
	}

	void onEdit(int id) throws InstanceNotFoundException {
		currency = masterFilesService.getCurrencyByCurrencyId(id);
		currencyId = currency.getCurrencyId();
		currencyName= currency.getCurrencyName();
		currencyChange=currency.getcurrencyChange();
		currencyCode=currency.getCurrencyCode();
		currencyQuote=currency.getcurrencyQuote();
		commisionPercent= currency.getCommisionPercent();
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

	void onDelete(int row) {
		try {
			masterFilesService.deleteCurrency(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	// Valores por defecto en el formulario de inserción
	void onInsert() {
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
