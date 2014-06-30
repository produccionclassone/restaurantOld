package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JSONCallback;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.client.ClientHeader;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addRow.js")
public class MasterClient {
	@Component
	private Form editRowForm;
	@Property
	private List<ClientHeader> clients;
	@Property
	private ClientHeader client;

	@Property
	private Client clientDetails;

	@Property
	private Long clientId;
	@Property
	private String clientName;
	@Property
	private String clientAddress;
	@Property
	private String clientZipCode;
	@Property
	private String clientTown;
	@Property
	private String clientProvince;
	@Property
	private String clientDNI;
	@Property
	private String clientPhoneContact;
	@Property
	private String clientPersonContact;
	@Property
	private String clientNotes1;
	@Property
	private String clientNotes2;
	@Property
	private String clientNotes3;
	@Property
	private double clientLimitCredit;
	@Property
	private double outstandingAmount;

	private Calendar clientLastDateFood;
	@Property
	private String clientLastDateFoodString;
	@Property
	private double clientAmountSpent;
	@Property
	private int clientDiners;
	@Property
	private int clientTimesToEat;
	@Property
	private String clientObservation1;
	@Property
	private String clientObservation2;
	@Property
	private String clientObservation3;
	@Property
	private String clientObservation4;
	@Property
	private String ledgerAccount;
	@Property
	private String ledgerAccountType;
	@Property
	private String typeCode;
	@Property
	private ChannelSegment channelSegment;
	@Property
	private String channelValue;
	@Property
	private boolean sendEmail;
	@Property
	private String clientEmail;
	@Property
	private boolean sendSMS;
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

	@Inject
	private Request request;

	void setupRender() throws NumberFormatException, ParseException,
			InstanceNotFoundException {

		clients = masterFilesService.findAllClient();
		long size = clients.size();
		System.out.println("SIZE IN WEB:" + size);
		if (size == 0) {
			try {
				masterFilesService
						.importClientFile("/home/alexpenedo/Documentos/ClassOne/exports/CLIENTES.TXT");
				// masterFilesService.importClientFile("C:/Users/VaninaBusto/Documents/CLIENTES.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	void onValidateFromEditRowForm() throws InstanceNotFoundException {
		// validar
		if (clientId == null) {

			clientLastDateFood = Calendar.getInstance();
			channelSegment = masterFilesService.getChannelsSegments().get(0);
			Client newClient = new Client(clientName, clientAddress,
					clientZipCode, clientTown, clientProvince, clientDNI,
					clientPhoneContact, clientPersonContact, clientNotes1,
					clientNotes2, clientNotes3, clientLimitCredit,
					outstandingAmount, clientLastDateFood, clientAmountSpent,
					clientDiners, clientTimesToEat, clientObservation1,
					clientObservation2, clientObservation3, clientObservation4,
					ledgerAccount, ledgerAccountType, typeCode, channelSegment,
					sendEmail, clientEmail, sendSMS);
			clientId = masterFilesService.createClient(newClient).getClientId();
			// Añadir con jquery una fila
			final String row = (String
					.format("<tr style='font-size:12px; text-align:left;' class='textZoom even' id='%s'>"
							+ "<td class=' '>%s</td><td class=' '>%s</td>"
							+ "<td class=' '>%s</td><td class=' '>%s</td><td class=' '>%s</td></tr>",
							clientId, clientId,clientName, clientZipCode,
							clientDNI, clientPhoneContact));
			System.out.println(row);
			final String row1="<div>hola</div>";

			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					  JSONObject newRow = new JSONObject();
					  newRow.put("clientId", clientId);
					  newRow.put("clientName", clientName);
					  newRow.put("clientZipCode", clientZipCode);
					  newRow.put("clientDNI", clientDNI);
					  newRow.put("clientPhoneContact", clientPhoneContact);
				        javascriptSupport.addInitializerCall("addRow", newRow);

				}
			});

		} else {
			clientDetails = masterFilesService.getClientByClientId(clientId);
			masterFilesService.editClient(clientId, clientName, clientAddress,
					clientZipCode, clientDetails.getClientDown(),
					clientDetails.getClientProvince(),
					clientDetails.getClientDNI(),
					clientDetails.getClientPhoneContact(),
					clientDetails.getClientPersonContact(),
					clientDetails.getClientNotes1(),
					clientDetails.getClientNotes2(),
					clientDetails.getClientNotes3(),
					clientDetails.getClientLimitCredit(),
					clientDetails.getOutstandingAmount(),
					clientDetails.getClientLastDateFood(),
					clientDetails.getClientAmountSpent(),
					clientDetails.getClientDiners(),
					clientDetails.getClientTimesToEat(),
					clientDetails.getClientObservation1(),
					clientDetails.getClientObservation2(),
					clientDetails.getClientObservation3(),
					clientDetails.getClientObservation4(),
					clientDetails.getLedgerAccount(),
					clientDetails.getLedgerAccountType(),
					clientDetails.getTypeCode(),
					clientDetails.getChannelSegment(),
					clientDetails.isSendEmail(),
					clientDetails.getClientEmail(), clientDetails.isSendSMS());
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					javascriptSupport.addScript(String
							.format("row = $('#'+%s).children(); $(row[0]).text('%s'); $(row[1]).text('%s');",
									clientId, clientId, clientName));
				}
			});
		}
	}

	void onSuccess() {
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String.format(
						" $('#modalEdit').modal('hide');", null));
			}
		});

	}

	void onEdit(Long id) throws InstanceNotFoundException {
		clientDetails = masterFilesService.getClientByClientId(id);
		clientId = clientDetails.getClientId();
		clientName = clientDetails.getClientName();
		clientAddress = clientDetails.getClientAddress();
		clientZipCode = clientDetails.getClientZipCode();
		clientTown = clientDetails.getClientDown();
		clientProvince = clientDetails.getClientProvince();
		clientDNI = clientDetails.getClientDNI();
		clientPhoneContact = clientDetails.getClientPhoneContact();
		clientPersonContact = clientDetails.getClientPersonContact();
		clientNotes1 = clientDetails.getClientNotes1();
		clientNotes2 = clientDetails.getClientNotes2();
		clientNotes3 = clientDetails.getClientNotes3();
		clientLimitCredit = clientDetails.getClientLimitCredit();
		outstandingAmount = clientDetails.getOutstandingAmount();
		clientLastDateFoodString = clientDetails.getClientLastDateFood()
				.toString();
		clientAmountSpent = clientDetails.getClientAmountSpent();
		clientDiners = clientDetails.getClientDiners();
		clientTimesToEat = clientDetails.getClientTimesToEat();
		clientObservation1 = clientDetails.getClientObservation1();
		clientObservation2 = clientDetails.getClientObservation2();
		clientObservation3 = clientDetails.getClientObservation3();
		clientObservation4 = clientDetails.getClientObservation4();
		ledgerAccount = clientDetails.getLedgerAccount();
		ledgerAccountType = clientDetails.getLedgerAccountType();
		typeCode = clientDetails.getTypeCode();
		channelValue = clientDetails.getChannelSegment().getChannelValue();
		sendEmail = clientDetails.isSendEmail();
		clientEmail = clientDetails.getClientEmail();
		sendSMS = clientDetails.isSendSMS();
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modalEdit').modal('show'); "
								+ "$('#modalEdit').on('shown.bs.modal', function() {"
								+ "			$('.focus').focus();});", null));
			}
		});
		ajaxResponseRenderer.addRender(zone);
	}

	void onDelete(Long row) {
		try {
			masterFilesService.deleteClient(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	void afterRender() {

		javaScriptSupport.addScript(String.format("$('#table').show();", null));
	}

}
