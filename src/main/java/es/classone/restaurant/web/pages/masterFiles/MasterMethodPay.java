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
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.model.methodOfPayment.MethodOfPayment;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addMethodPay.js")
public class MasterMethodPay {

		@Component
		private Form tableForm;
		@Property
		private int methodPayId=-1;
		@Property
		private String methodPayName; 
		@Property
		private String ledgerAccount; 
		@Property
		private int chargeType;
		@Property
		private float percentage; 
		@Property
		private String ledgerAccountTC;
		@Property
		private String ledgerAccountDtoTC;
		@Property
		private String virtualTpv;

		@Property
		private List<MethodOfPayment> methodPays;

		@Property
		private MethodOfPayment methodPay;

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
			methodPays = masterFilesService.findAllMethodOfPayment();
			int size = methodPays.size();
			if (size == 0) {
				
			} else {
				 lastId= methodPays.get(size - 1).getMethodPayId();
				
			}
			links = new ArrayList<>();
			for (int i = 1; i < 2000; i++) {
				links.add(lastId + i);
			}

		}

	

		void onValidateFromTableForm() throws InstanceNotFoundException,
				NumberFormatException, DuplicateInstanceException {

			if (methodPayId == -1) {
				MethodOfPayment mp = new MethodOfPayment(methodPayName,ledgerAccount,chargeType,percentage,ledgerAccountTC,ledgerAccountDtoTC,virtualTpv);
				methodPayId = masterFilesService.createMethodOfPayment(mp).getMethodPayId();
				ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
					public void run(JavaScriptSupport javascriptSupport) {
						JSONObject newRow = new JSONObject();
						newRow.put("methodPayId", methodPayId);
						newRow.put("methodPayName", methodPayName);
						newRow.put("ledgerAccount", ledgerAccount);
						newRow.put("chargeType", chargeType);
						newRow.put("percentage", percentage);
						newRow.put("ledgerAccountTC", ledgerAccountTC);
						newRow.put("ledgerAccountDtoTC", ledgerAccountDtoTC);
						newRow.put("virtualTpv", virtualTpv);
						javascriptSupport
								.addInitializerCall("addMethodPay", newRow);
					}
				});
			} else {
				masterFilesService.editMethodOfPayment(methodPayId, methodPayName, ledgerAccount, chargeType, percentage, ledgerAccountTC, ledgerAccountDtoTC, virtualTpv);
			}
		}

		void onEdit(int id) throws InstanceNotFoundException {
			methodPay = masterFilesService.getMethodPaymentByMethodPaymentId(id);
			methodPayId = methodPay.getMethodPayId();
			methodPayName = methodPay.getMethodPayName();
			ledgerAccount = methodPay.getLedgerAccount();
			chargeType = methodPay.getChargeType();
			percentage = methodPay.getPercentage();
			ledgerAccountTC = methodPay.getLedgerAccountTC();
			ledgerAccountDtoTC = methodPay.getLedgerAccountDtoTC();
			virtualTpv = methodPay.getVirtualTpv();
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
				masterFilesService.deleteMethodPayment(row);
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
