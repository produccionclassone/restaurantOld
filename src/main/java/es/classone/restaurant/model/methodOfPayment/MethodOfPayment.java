package es.classone.restaurant.model.methodOfPayment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_FP")
public class MethodOfPayment {
	private int methodPayId;// RFCNT300
	private String methodPayName; // RFCNT002
	private String ledgerAccount; // RFCNT003
	private int chargeType; // RFCNT004
	/* 0=Efectivo 1=Credito 2=Invitacion 3=Anulado 4=Cobrado por Hotel */
	private float percentage; // RFCNT005
	private String ledgerAccountTC; // RFCNT006
	private String ledgerAccountDtoTC; // RFCNT007
	private char virtualTpv; // RFCNT008

	public MethodOfPayment() {

	}

	public MethodOfPayment(String methodPayName, String ledgerAccount,
			int chargeType, float percentage, String ledgerAccountTC,
			String ledgerAccountDtoTC, char virtualTpv) {
		this.methodPayName = methodPayName;
		this.ledgerAccount = ledgerAccount;
		this.chargeType = chargeType;
		this.percentage = percentage;
		this.ledgerAccountTC = ledgerAccountTC;
		this.ledgerAccountDtoTC = ledgerAccountDtoTC;
		this.virtualTpv = virtualTpv;
	}

	@Column(name = "RFCNT000")
	@SequenceGenerator( // It only takes effect for
	name = "MethodOfPaymentIdGenerator", // databases providing identifier
	sequenceName = "MethodOfPaymentSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MethodOfPaymentIdGenerator")
	public int getMethodPayId() {
		return methodPayId;
	}

	public void setMethodPayId(int methodPayId) {
		this.methodPayId = methodPayId;
	}

	@Column(name = "RFCNT002")
	public String getMethodPayName() {
		return methodPayName;
	}

	public void setMethodPayName(String methodPayName) {
		this.methodPayName = methodPayName;
	}

	@Column(name = "RFCNT003")
	public String getLedgerAccount() {
		return ledgerAccount;
	}

	public void setLedgerAccount(String ledgerAccount) {
		this.ledgerAccount = ledgerAccount;
	}

	@Column(name = "RFCNT004")
	public int getChargeType() {
		return chargeType;
	}

	public void setChargeType(int chargeType) {
		this.chargeType = chargeType;
	}

	@Column(name = "RFCNT005")
	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Column(name = "RFCNT006")
	public String getLedgerAccountTC() {
		return ledgerAccountTC;
	}

	public void setLedgerAccountTC(String ledgerAccountTC) {
		this.ledgerAccountTC = ledgerAccountTC;
	}

	@Column(name = "RFCNT007")
	public String getLedgerAccountDtoTC() {
		return ledgerAccountDtoTC;
	}

	public void setLedgerAccountDtoTC(String ledgerAccountDtoTC) {
		this.ledgerAccountDtoTC = ledgerAccountDtoTC;
	}

	@Column(name = "RFCNT008")
	public char getVirtualTpv() {
		return virtualTpv;
	}

	public void setVirtualTpv(char virtualTpv) {
		this.virtualTpv = virtualTpv;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_FP` (
// `RFCNT300` INT NOT NULL AUTO_INCREMENT,
// `RFCNT002` VARCHAR(12) NOT NULL,
// `RFCNT003` VARCHAR(8) NOT NULL,
// `RFCNT004` SMALLINT NOT NULL,
// `RFCNT005` DECIMAL(5,2) NOT NULL DEFAULT 0,
// `RFCNT006` VARCHAR(8) NOT NULL,
// `RFCNT007` VARCHAR(8) NULL,
// `RFCNT008` CHAR NULL DEFAULT ' ',
// PRIMARY KEY (`RFCNT300`))
// ENGINE = InnoDB;