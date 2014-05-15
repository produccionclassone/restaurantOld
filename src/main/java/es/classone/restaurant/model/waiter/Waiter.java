package es.classone.restaurant.model.waiter;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "Res14cam")
public class Waiter {

	private int waiterId;// R1CAM001
	private String waiterName;// R1CAM002
	private String waiterAddress;// R1CAM003
	private String waiterZip;// R1CAM004
	private String waiterTown;// R1CAM005
	private String waiterProvince;// R1CAM006
	private String waiterDNI;// R1CAM007
	private String waiterPhone;// R1CAM008
	private String waiterContact;// R1CAM009
	private String notes1;// R1CAM010_01
	private String notes2;// R1CAM010_02
	private String notes3;// R1CAM010_03
	private char chargeType;// R1CAM011
	private boolean waiterEnable;// R1CAM013
	private Calendar enableTime; // R1CAM014
	private Calendar disableeTime; // R1CAM015

	public Waiter() {

	}

	public Waiter(String waiterName, String waiterAddress, String waiterZip,
			String waiterTown, String waiterProvince, String waiterDNI,
			String waiterPhone, String waiterContact, String notes1,
			String notes2, String notes3, char chargeType,
			boolean waiterEnable, Calendar enableTime, Calendar disableeTime) {
		this.waiterName = waiterName;
		this.waiterAddress = waiterAddress;
		this.waiterZip = waiterZip;
		this.waiterTown = waiterTown;
		this.waiterProvince = waiterProvince;
		this.waiterDNI = waiterDNI;
		this.waiterPhone = waiterPhone;
		this.waiterContact = waiterContact;
		this.notes1 = notes1;
		this.notes2 = notes2;
		this.notes3 = notes3;
		this.chargeType = chargeType;
		this.waiterEnable = waiterEnable;
		this.enableTime = enableTime;
		this.disableeTime = disableeTime;
	}

	@Column(name = "R1CAM001")
	@SequenceGenerator( // It only takes effect for
	name = "WaiterIdGenerator", // databases providing identifier
	sequenceName = "WaiterSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "WaiterIdGenerator")
	public int getWaiterId() {
		return waiterId;
	}

	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
	}

	@Column(name = "R1CAM002")
	public String getWaiterName() {
		return waiterName;
	}

	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}

	@Column(name = "R1CAM003")
	public String getWaiterAddress() {
		return waiterAddress;
	}

	public void setWaiterAddress(String waiterAddress) {
		this.waiterAddress = waiterAddress;
	}

	@Column(name = "R1CAM004")
	public String getWaiterZip() {
		return waiterZip;
	}

	public void setWaiterZip(String waiterZip) {
		this.waiterZip = waiterZip;
	}

	@Column(name = "R1CAM005")
	public String getWaiterTown() {
		return waiterTown;
	}

	public void setWaiterTown(String waiterTown) {
		this.waiterTown = waiterTown;
	}

	@Column(name = "R1CAM006")
	public String getWaiterProvince() {
		return waiterProvince;
	}

	public void setWaiterProvince(String waiterProvince) {
		this.waiterProvince = waiterProvince;
	}

	@Column(name = "R1CAM007")
	public String getWaiterDNI() {
		return waiterDNI;
	}

	public void setWaiterDNI(String waiterDNI) {
		this.waiterDNI = waiterDNI;
	}

	@Column(name = "R1CAM008")
	public String getWaiterPhone() {
		return waiterPhone;
	}

	public void setWaiterPhone(String waiterPhone) {
		this.waiterPhone = waiterPhone;
	}

	@Column(name = "R1CAM009")
	public String getWaiterContact() {
		return waiterContact;
	}

	public void setWaiterContact(String waiterContact) {
		this.waiterContact = waiterContact;
	}

	@Column(name = "R1CAM010_01")
	public String getNotes1() {
		return notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	@Column(name = "R1CAM010_02")
	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	@Column(name = "R1CAM010_03")
	public String getNotes3() {
		return notes3;
	}

	public void setNotes3(String notes3) {
		this.notes3 = notes3;
	}

	@Column(name = "R1CAM011")
	public char getChargeType() {
		return chargeType;
	}

	public void setChargeType(char chargeType) {
		this.chargeType = chargeType;
	}

	@Column(name = "R1CAM013")
	public boolean isWaiterEnable() {
		return waiterEnable;
	}

	public void setWaiterEnable(boolean waiterEnable) {
		this.waiterEnable = waiterEnable;
	}

	@Column(name = "R1CAM014")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getEnableTime() {
		return enableTime;
	}

	public void setEnableTime(Calendar enableTime) {
		this.enableTime = enableTime;
	}

	@Column(name = "R1CAM015")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getDisableeTime() {
		return disableeTime;
	}

	public void setDisableeTime(Calendar disableeTime) {
		this.disableeTime = disableeTime;
	}

}
//CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cam` (
//		  `R1CAM001` INT NOT NULL AUTO_INCREMENT,
//		  `R1CAM002` VARCHAR(25) NULL,
//		  `R1CAM003` VARCHAR(30) NULL,
//		  `R1CAM004` VARCHAR(8) NULL,
//		  `R1CAM005` VARCHAR(30) NULL,
//		  `R1CAM006` VARCHAR(30) NULL,
//		  `R1CAM007` VARCHAR(20) NULL,
//		  `R1CAM008` VARCHAR(15) NULL,
//		  `R1CAM009` VARCHAR(30) NULL,
//		  `R1CAM010_01` VARCHAR(50) NULL,
//		  `R1CAM010_02` VARCHAR(50) NULL,
//		  `R1CAM010_03` VARCHAR(50) NULL,
//		  `R1CAM011` CHAR NOT NULL DEFAULT 'N',
//		  `R1CAM013` TINYINT(1) NOT NULL DEFAULT 0,
//		  `R1CAM014` DATETIME NULL,
//		  `R1CAM015` DATETIME NULL,
//		  PRIMARY KEY (`R1CAM001`))
//		ENGINE = InnoDB;