package es.classone.restaurant.web.pages.masterFiles;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.model.waiter.Waiter;
import es.classone.restaurant.model.waiter.WaiterHeader;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;


@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addWaiter.js")
public class MasterWaiter {
	@Component
	private Form tableForm;
	@Property
	private List<WaiterHeader> waiters;
	@Property
	private WaiterHeader waiter;
	@Property
	private Waiter waiterDetails;
	@Property
	private int waiterId = -1;
	@Property
	private String waiterName;
	@Property
	private String waiterAddress;
	@Property
	private String waiterZip;
	@Property
	private String waiterTown;
	@Property
	private String waiterProvince;
	@Property
	private String waiterDNI;
	@Property
	private String waiterPhone;
	@Property
	private String waiterContact;
	@Property
	private String notes1;
	@Property
	private String notes2;
	@Property
	private String notes3;
	@Property
	private String chargeType;
	@Property
	private boolean waiterEnable;
	private Calendar enableTime;
	@Property
	private String enableTimeString;
	private Calendar disableTime;
	@Property
	private String disableTimeString;
	@Property
	private ArrayList<Integer> links;
	@Property
	private int link;
	@Inject
	private MasterFilesService masterFilesService;

	@InjectComponent
	private Zone zone;

	@InjectComponent
	private Zone tableZone;

	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	void setupRender() throws NumberFormatException, ParseException,
			InstanceNotFoundException {
		int lastId=0;
		waiters = masterFilesService.findAllWaiter();
		int size = waiters.size();

		if (size == 0) {
		} else {
			lastId = waiters.get(size - 1).getWaiterId();
			
		}
		links = new ArrayList<>();
		for (int i = 1; i < 2000; i++) {
			links.add(lastId + i);
		}

	}

	void onValidateFromTableForm() throws InstanceNotFoundException {
		// validar
		if (waiterId == -1) {
			enableTime = Calendar.getInstance();
			disableTime = Calendar.getInstance();
			Waiter newWaiter = new Waiter(waiterName, waiterAddress, waiterZip,
					waiterTown, waiterProvince, waiterDNI, waiterPhone,
					waiterContact, notes1, notes2, notes3, chargeType,
					waiterEnable, enableTime, disableTime);
			waiterId = masterFilesService.createWaiter(newWaiter).getWaiterId();
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					JSONObject newRow = new JSONObject();
					newRow.put("waiterId", waiterId);
					newRow.put("waiterName", waiterName);
					newRow.put("waiterZip", waiterZip);
					newRow.put("waiterDNI", waiterDNI);
					newRow.put("waiterPhone", waiterPhone);
					javascriptSupport.addInitializerCall("addWaiter", newRow);
				}
			});
		} else {

			masterFilesService.editWaiter(waiterId, waiterName, waiterAddress,
					waiterZip, waiterTown, waiterProvince, waiterDNI,
					waiterPhone, waiterContact, notes1, notes2, notes3,
					chargeType, waiterEnable, enableTime, disableTime);

		}
	}

	void onSuccess() {
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('hide');"));
			}
		});

	}

	void onEdit(int id) throws InstanceNotFoundException {
		waiterDetails = masterFilesService.getWaiterByWaiterId(id);
		waiterId = waiterDetails.getWaiterId();
		waiterName = waiterDetails.getWaiterName();
		waiterAddress = waiterDetails.getWaiterAddress();
		waiterZip = waiterDetails.getWaiterZip();
		waiterTown = waiterDetails.getWaiterTown();
		waiterProvince = waiterDetails.getWaiterProvince();
		waiterDNI = waiterDetails.getWaiterDNI();
		waiterPhone = waiterDetails.getWaiterPhone();
		waiterContact = waiterDetails.getWaiterContact();
		notes1 = waiterDetails.getNotes1();
		notes2 = waiterDetails.getNotes2();
		notes3 = waiterDetails.getNotes3();
		chargeType = waiterDetails.getChargeType();
		waiterEnable = waiterDetails.isWaiterEnable();
		enableTimeString = waiterDetails.getEnableTime().toString();
		disableTimeString = waiterDetails.getDisableTime().toString();
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

	void onInsert() {
		// Valores por defecto
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

	void onDelete(int row) {
		try {
			masterFilesService.deleteWaiter(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	void afterRender() {
		ajaxResponseRenderer.addRender(tableZone);
		javaScriptSupport.addScript(String.format("$('#table').show();"));
	}
}
