package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.client.Client;

import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterClient {

	@Property
	private List<Client> clients;

	@Property
	private Client client;

	@Property
	private String clientId;
	
	@Property
	private String clientCode;
	@Property
	private String clientName;
	@Property
	private String clientAddress; 
	@Property
	private String clientZipCode; 
	@Property
	private String clientDown; 
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
	@Property
	private Calendar clientLastDateFood; 
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
	private boolean sendEmail; 
	@Property
	private String clientEmail; 
	@Property
	private boolean sendSMS; 

	@Inject
	private MasterFilesService masterFilesService;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Inject
	private Request request;

	void setupRender() throws NumberFormatException, ParseException {
		clients = masterFilesService.findAllClient();
		long size = clients.size();
		
		if (size == 0) {
			clientCode = "00";
			try {
				// masterFilesService.importDishFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91PLA.TXT");
				masterFilesService.importClientFile("C:/Users/VaninaBusto/Documents/CLIENTES.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				clientCode = getNewCode(masterFilesService.getClientByClientId(size).getClientCode());
			} catch (InstanceNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	private String getNewCode(String currentCode) {
		if (isNumeric(currentCode)) {
			if (currentCode.equals("99")) {
				return ("A0");
			} else
				return (String.valueOf(Integer.parseInt(currentCode) + 1));
		} else {
			String lastChar = currentCode.substring(1);
			if (isNumeric(lastChar)) {

				String firstChar = currentCode.substring(0, 1);
				return firstChar
						+ (String.valueOf(Integer.parseInt(lastChar) + 1));

			} else
				return ("ZZ");
		}

	}

	private boolean isNumeric(String s) {
		String pattern = "^[0-9]*$";
		if (s.matches(pattern)) {
			return true;
		}
		return false;
	}

	void onActivate() {
		if (request.getParameter("id") != null) {
			try {
				clientId = request.getParameter("id");
				client = masterFilesService.getClientByClientId(Long
						.parseLong(request.getParameter("id")));
				clientId = String.valueOf(client.getClientId());

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstanceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
		}
	}

/*	void onValidateFromAddRowForm() {
		masterFilesService.createDish(new Dish(dishCode, dishDescriptionLang1,
				dishDescriptionLang2, dishDescriptionLang3, dishPrint,
				dishListPrice, dishPVP, dishCostPrice, dishType, dishDiscount,
				dishPending, dishGroup, dishTractable, dishOrderer,
				dishVisible, dishNumbers, dishLongDesc, dishShortDesc));
	}
*/
	void afterRender() {
		System.out.println("after");
	}

}
