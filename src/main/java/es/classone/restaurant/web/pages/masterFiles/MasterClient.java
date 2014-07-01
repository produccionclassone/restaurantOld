package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
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

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.client.ClientHeader;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addClient.js")
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
	private ChannelSegment channelSegment;
	@Property
	private String channelValue;
	@Property
	private boolean sendEmail;
	@Property
	private String clientEmail;
	@Property
	private boolean sendSMS;
	@Property
	private ArrayList<Long> links;
	@Property
	private Long link;
	@Inject
	private MasterFilesService masterFilesService;
	@InjectComponent
	private Zone zone;
	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;
	@Inject
	private JavaScriptSupport javaScriptSupport;

	void setupRender() throws NumberFormatException, ParseException,
			InstanceNotFoundException {

		clients = masterFilesService.findAllClient();
		int size = clients.size();

		if (size == 0) {
			try {
				masterFilesService
						.importClientFile("/home/alexpenedo/Documentos/ClassOne/exports/CLIENTES.TXT");
				// masterFilesService.importClientFile("C:/Users/VaninaBusto/Documents/CLIENTES.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			long lastId = clients.get(size - 1).getClientId();
			System.out.println(lastId);
			links = new ArrayList<>();
			for (int i = 1; i < 2000; i++) {
				links.add(lastId + i);
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
					ledgerAccount, channelSegment,
					sendEmail, clientEmail, sendSMS);
			clientId = masterFilesService.createClient(newClient).getClientId();
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					JSONObject newRow = new JSONObject();
					newRow.put("clientId", clientId);
					newRow.put("clientName", clientName);
					newRow.put("clientZipCode", clientZipCode);
					newRow.put("clientDNI", clientDNI);
					newRow.put("clientPhoneContact", clientPhoneContact);
					javascriptSupport.addInitializerCall("addClient", newRow);
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
					clientDetails.getChannelSegment(),
					clientDetails.isSendEmail(),
					clientDetails.getClientEmail(), clientDetails.isSendSMS());
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) { // cambiar
																		// con
																		// la
																		// api
																		// de
																		// datatables
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
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('hide');"));
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
		channelValue = clientDetails.getChannelSegment().getChannelValue();
		sendEmail = clientDetails.isSendEmail();
		clientEmail = clientDetails.getClientEmail();
		sendSMS = clientDetails.isSendSMS();
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

	void onDelete(Long row) {
		try {
			masterFilesService.deleteClient(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	void afterRender() {

		javaScriptSupport.addScript(String.format("$('#table').show();"));
	}

}
