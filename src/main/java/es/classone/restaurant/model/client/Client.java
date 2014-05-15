package es.classone.restaurant.model.client;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private String clientNotes1; //R1CLI010_01
	private String clientNotes2; //R1CLI010_02
	private String clientNotes3; //R1CLI010_03
	private int clientLimitCredit; //R1CLI011
	private float debtLastUpgrade; //R1CLI012
	private Calendar clientLastDateFood; //R1CLI013
	private float clientAmountSpent; //R1CLI014
	private int clientDiners; //R1CLI015;
	private int clientTimesToEat; //R1CLI016
	private String clientObservation1; //R1CLI017_01
	private String clientObservation2; //R1CLI017_02
	private String clientObservation3; //R1CLI017_03
	private String clientObservation4; //R1CLI017_04
	private String ledgerAccount; //R1CLI201
	private char ledgerAccountType;// R1CLI202 7* "C" / "A" / "E"
	private String typeCode;// R1CLI203 Codigo de "E" o "A"

	public Client() {

	}
	
	

	public Client(String clientName, String clientAddress,
			String clientZipCode, String clientDown, String clientProvince,
			String clientDNI, String clientPhoneContact,
			String clientPersonContact, String clientNotes1,
			String clientNotes2, String clientNotes3, int clientLimitCredit,
			float debtLastUpgrade, Calendar clientLastDateFood,
			float clientAmountSpent, int clientDiners, int clientTimesToEat,
			String clientObservation1, String clientObservation2,
			String clientObservation3, String clientObservation4,
			String ledgerAccount, char ledgerAccountType, String typeCode) {
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.clientZipCode = clientZipCode;
		this.clientDown = clientDown;
		this.clientProvince = clientProvince;
		this.clientDNI = clientDNI;
		this.clientPhoneContact = clientPhoneContact;
		this.clientPersonContact = clientPersonContact;
		this.clientNotes1 = clientNotes1;
		this.clientNotes2 = clientNotes2;
		this.clientNotes3 = clientNotes3;
		this.clientLimitCredit = clientLimitCredit;
		this.debtLastUpgrade = debtLastUpgrade;
		this.clientLastDateFood = clientLastDateFood;
		this.clientAmountSpent = clientAmountSpent;
		this.clientDiners = clientDiners;
		this.clientTimesToEat = clientTimesToEat;
		this.clientObservation1 = clientObservation1;
		this.clientObservation2 = clientObservation2;
		this.clientObservation3 = clientObservation3;
		this.clientObservation4 = clientObservation4;
		this.ledgerAccount = ledgerAccount;
		this.ledgerAccountType = ledgerAccountType;
		this.typeCode = typeCode;
	}


	@Column(name="R1CLI001")
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


	@Column(name="R1CLI002")
	public String getClientName() {
		return clientName;
	}



	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	@Column(name="R1CLI003")
	public String getClientAddress() {
		return clientAddress;
	}



	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}


	@Column(name="R1CLI004")
	public String getClientZipCode() {
		return clientZipCode;
	}



	public void setClientZipCode(String clientZipCode) {
		this.clientZipCode = clientZipCode;
	}


	@Column(name="R1CLI005")
	public String getClientDown() {
		return clientDown;
	}



	public void setClientDown(String clientDown) {
		this.clientDown = clientDown;
	}


	@Column(name="R1CLI006")
	public String getClientProvince() {
		return clientProvince;
	}



	public void setClientProvince(String clientProvince) {
		this.clientProvince = clientProvince;
	}


	@Column(name="R1CLI007")
	public String getClientDNI() {
		return clientDNI;
	}



	public void setClientDNI(String clientDNI) {
		this.clientDNI = clientDNI;
	}


	@Column(name="R1CLI008")
	public String getClientPhoneContact() {
		return clientPhoneContact;
	}



	public void setClientPhoneContact(String clientPhoneContact) {
		this.clientPhoneContact = clientPhoneContact;
	}


	@Column(name="R1CLI009")
	public String getClientPersonContact() {
		return clientPersonContact;
	}



	public void setClientPersonContact(String clientPersonContact) {
		this.clientPersonContact = clientPersonContact;
	}


	@Column(name="R1CLI010_01")
	public String getClientNotes1() {
		return clientNotes1;
	}



	public void setClientNotes1(String clientNotes1) {
		this.clientNotes1 = clientNotes1;
	}


	@Column(name="R1CLI010_02")
	public String getClientNotes2() {
		return clientNotes2;
	}



	public void setClientNotes2(String clientNotes2) {
		this.clientNotes2 = clientNotes2;
	}


	@Column(name="R1CLI010_03")
	public String getClientNotes3() {
		return clientNotes3;
	}



	public void setClientNotes3(String clientNotes3) {
		this.clientNotes3 = clientNotes3;
	}


	@Column(name="R1CLI011")
	public int getClientLimitCredit() {
		return clientLimitCredit;
	}



	public void setClientLimitCredit(int clientLimitCredit) {
		this.clientLimitCredit = clientLimitCredit;
	}


	@Column(name="R1CLI012")
	public float getDebtLastUpgrade() {
		return debtLastUpgrade;
	}



	public void setDebtLastUpgrade(float debtLastUpgrade) {
		this.debtLastUpgrade = debtLastUpgrade;
	}


	@Column(name="R1CLI013")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getClientLastDateFood() {
		return clientLastDateFood;
	}



	public void setClientLastDateFood(Calendar clientLastDateFood) {
		this.clientLastDateFood = clientLastDateFood;
	}


	@Column(name="R1CLI014")
	public float getClientAmountSpent() {
		return clientAmountSpent;
	}



	public void setClientAmountSpent(float clientAmountSpent) {
		this.clientAmountSpent = clientAmountSpent;
	}


	@Column(name="R1CLI015")
	public int getClientDiners() {
		return clientDiners;
	}



	public void setClientDiners(int clientDiners) {
		this.clientDiners = clientDiners;
	}


	@Column(name="R1CLI016")
	public int getClientTimesToEat() {
		return clientTimesToEat;
	}



	public void setClientTimesToEat(int clientTimesToEat) {
		this.clientTimesToEat = clientTimesToEat;
	}


	@Column(name="R1CLI017_01")
	public String getClientObservation1() {
		return clientObservation1;
	}



	public void setClientObservation1(String clientObservation1) {
		this.clientObservation1 = clientObservation1;
	}


	@Column(name="R1CLI017_02")
	public String getClientObservation2() {
		return clientObservation2;
	}



	public void setClientObservation2(String clientObservation2) {
		this.clientObservation2 = clientObservation2;
	}


	@Column(name="R1CLI017_03")
	public String getClientObservation3() {
		return clientObservation3;
	}



	public void setClientObservation3(String clientObservation3) {
		this.clientObservation3 = clientObservation3;
	}


	@Column(name="R1CLI017_04")
	public String getClientObservation4() {
		return clientObservation4;
	}



	public void setClientObservation4(String clientObservation4) {
		this.clientObservation4 = clientObservation4;
	}


	@Column(name="R1CLI201")
	public String getLedgerAccount() {
		return ledgerAccount;
	}



	public void setLedgerAccount(String ledgerAccount) {
		this.ledgerAccount = ledgerAccount;
	}


	@Column(name="R1CLI202")
	public char getLedgerAccountType() {
		return ledgerAccountType;
	}



	public void setLedgerAccountType(char ledgerAccountType) {
		this.ledgerAccountType = ledgerAccountType;
	}


	@Column(name="R1CLI203")
	public String getTypeCode() {
		return typeCode;
	}



	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	

}
//CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cli` (
//		  `R1CLI001` BIGINT NOT NULL AUTO_INCREMENT,
//		  `R1CLI002` VARCHAR(30) NOT NULL,
//		  `R1CLI003` VARCHAR(30) NULL,
//		  `R1CLI004` VARCHAR(8) NULL,
//		  `R1CLI005` VARCHAR(30) NULL,
//		  `R1CLI006` VARCHAR(30) NULL,
//		  `R1CLI007` VARCHAR(20) NULL,
//		  `R1CLI008` VARCHAR(15) NULL,
//		  `R1CLI009` VARCHAR(30) NULL,
//		  `R1CLI010_01` VARCHAR(45) NULL,
//		  `R1CLI010_02` VARCHAR(45) NULL,
//		  `R1CLI010_03` VARCHAR(45) NULL,
//		  `R1CLI011` DECIMAL(9,2) NOT NULL DEFAULT 0,
//		  `R1CLI012` DECIMAL(9,2) NOT NULL DEFAULT 0,
//		  `R1CLI013` DATE NOT NULL DEFAULT 20130101,
//		  `R1CLI014` DECIMAL(9,2) NOT NULL DEFAULT 0,
//		  `R1CLI015` SMALLINT NOT NULL DEFAULT 0,
//		  `R1CLI016` INT NOT NULL DEFAULT 0,
//		  `R1CLI017_01` VARCHAR(45) NULL,
//		  `R1CLI017_02` VARCHAR(45) NULL,
//		  `R1CLI017_03` VARCHAR(45) NULL,
//		  `R1CLI017_04` VARCHAR(45) NULL,
//		  `R1CLI201` VARCHAR(8) NOT NULL DEFAULT '43000000',
//		  `R1CLI202` CHAR NULL,
//		  `R1CLI203` VARCHAR(5) NULL,
//		  PRIMARY KEY (`R1CLI001`))