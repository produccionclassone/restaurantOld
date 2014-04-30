package es.classone.restaurant.model.client;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cli")
public class Client {

	private Long clientId; //R1CLI001
	private String clientName; //R1CLI002
	private String clientAddress; //R1CLI003
	private String clientZipCode; //R1CLI004
	private String clientDown; //R1CLI005;
	private String clientProvince; //R1CLI006
	private String clientDNI; //R1CLI007
	private String clientPhoneContact; //R1CLI008
	private String clientPersonContact; //R1CLI009
	private String clientAditionalInformation01; //R1CLI010_01
	private String clientAditionalInformation02; //R1CLI010_02
	private String clientAditionalInformation03; //R1CLI010_03
	private int clientLimitCredit; //R1CLI011
	private float clientDebtLastUpgrade; //R1CLI012
	private Calendar clientLastDateFood; //R1CLI013
	private float clientAmountSpent; //R1CLI014
	private int clientDiners; //R1CLI015;
	private int clientTimesToEat; //R1CLI016
	private String clientObservation01; //R1CLI017_01
	private String clientObservation02; //R1CLI017_02
	private String clientObservation03; //R1CLI017_03
	private String clientObservation04; //R1CLI017_04
	private String clientLedgerAccount; //R1CLI20
	private char R1CLI202;// 7* "C" / "A" / "E"
	private String R1CLI203;// Codigo de "E" o "A"

	public Client() {

	}
	
	public Client (Long id, String name, String address, String zipCode, String down, String province, String  dni, 
			String  phoneContact, String personContact, String aditionalInformation01, String  aditionalInformation02, String aditionalInformation03,
			int limitCredit, float debtLastUpgrade, Calendar lastDateFood, float amountSpent, int diners, int timesToEat, String observation01,
			String observation02, String observation03, String observation04, String ledgerAccount, char R1CLI202, String R1CLI203)
	{
		clientId = id;
		clientName = name;
		clientAddress = address;
		clientZipCode = zipCode;
		clientDown = down;
		clientProvince = province;
		clientDNI = dni;
		clientPhoneContact = phoneContact;
		clientPersonContact = personContact;
		clientAditionalInformation01 = aditionalInformation01;
		clientAditionalInformation02 = aditionalInformation02;
		clientAditionalInformation03 = aditionalInformation03;
		clientLimitCredit = limitCredit;
		clientDebtLastUpgrade = debtLastUpgrade;
		clientLastDateFood = lastDateFood;
		clientAmountSpent = amountSpent;
		clientDiners = diners;
		clientTimesToEat = timesToEat;
		clientObservation01 = observation01;
		clientObservation02 = observation02;
		clientObservation03 = observation03;
		clientObservation04 = observation04;		
		clientLedgerAccount = ledgerAccount;
		this.R1CLI202 = R1CLI202;
		this.R1CLI203 = R1CLI203;		
	}

	@SequenceGenerator( // It only takes effect for
	name = "ClientIdGenerator", // databases providing identifier
	sequenceName = "ClientSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ClientIdGenerator")
	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientZipCode() {
		return clientZipCode;
	}

	public void setClientZipCode(String clientZipCode) {
		this.clientZipCode = clientZipCode;
	}

	public String getClientDown() {
		return clientDown;
	}

	public void setClientDown(String clientDown) {
		this.clientDown = clientDown;
	}

	public String getClientProvince() {
		return clientProvince;
	}

	public void setClientProvince(String clientProvince) {
		this.clientProvince = clientProvince;
	}

	public String getClientDNI() {
		return clientDNI;
	}

	public void setClientDNI(String clientDNI) {
		this.clientDNI = clientDNI;
	}

	public String getClientPhoneContact() {
		return clientPhoneContact;
	}

	public void setClientPhoneContact(String clientPhoneContact) {
		this.clientPhoneContact = clientPhoneContact;
	}

	public String getClientPersonContact() {
		return clientPersonContact;
	}

	public void setClientPersonContact(String clientPersonContact) {
		this.clientPersonContact = clientPersonContact;
	}

	public String getClientAditionalInformation01() {
		return clientAditionalInformation01;
	}

	public void setClientAditionalInformation01(String clientAditionalInformation01) {
		this.clientAditionalInformation01 = clientAditionalInformation01;
	}

	public String getClientAditionalInformation02() {
		return clientAditionalInformation02;
	}

	public void setClientAditionalInformation02(String clientAditionalInformation02) {
		this.clientAditionalInformation02 = clientAditionalInformation02;
	}

	public String getClientAditionalInformation03() {
		return clientAditionalInformation03;
	}

	public void setClientAditionalInformation03(String clientAditionalInformation03) {
		this.clientAditionalInformation03 = clientAditionalInformation03;
	}

	public int getClientLimitCredit() {
		return clientLimitCredit;
	}

	public void setClientLimitCredit(int clientLimitCredit) {
		this.clientLimitCredit = clientLimitCredit;
	}

	public float getClientDebtLastUpgrade() {
		return clientDebtLastUpgrade;
	}

	public void setClientDebtLastUpgrade(float clientDebtLastUpgrade) {
		this.clientDebtLastUpgrade = clientDebtLastUpgrade;
	}

	public Calendar getClientLastDateFood() {
		return clientLastDateFood;
	}

	public void setClientLastDateFood(Calendar clientLastDateFood) {
		this.clientLastDateFood = clientLastDateFood;
	}

	public float getClientAmountSpent() {
		return clientAmountSpent;
	}

	public void setClientAmountSpent(float clientAmountSpent) {
		this.clientAmountSpent = clientAmountSpent;
	}

	public int getClientDiners() {
		return clientDiners;
	}

	public void setClientDiners(int clientDiners) {
		this.clientDiners = clientDiners;
	}

	public int getClientTimesToEat() {
		return clientTimesToEat;
	}

	public void setClientTimesToEat(int clientTimesToEat) {
		this.clientTimesToEat = clientTimesToEat;
	}

	public String getClientObservation01() {
		return clientObservation01;
	}

	public void setClientObservation01(String clientObservation01) {
		this.clientObservation01 = clientObservation01;
	}

	public String getClientObservation02() {
		return clientObservation02;
	}

	public void setClientObservation02(String clientObservation02) {
		this.clientObservation02 = clientObservation02;
	}

	public String getClientObservation03() {
		return clientObservation03;
	}

	public void setClientObservation03(String clientObservation03) {
		this.clientObservation03 = clientObservation03;
	}

	public String getClientObservation04() {
		return clientObservation04;
	}

	public void setClientObservation04(String clientObservation04) {
		this.clientObservation04 = clientObservation04;
	}

	public String getClientLedgerAccount() {
		return clientLedgerAccount;
	}

	public void setClientLedgerAccount(String clientLedgerAccount) {
		this.clientLedgerAccount = clientLedgerAccount;
	}

	public char getR1CLI202() {
		return R1CLI202;
	}

	public void setR1CLI202(char r1cli202) {
		R1CLI202 = r1cli202;
	}

	public String getR1CLI203() {
		return R1CLI203;
	}

	public void setR1CLI203(String r1cli203) {
		R1CLI203 = r1cli203;
	}


}
