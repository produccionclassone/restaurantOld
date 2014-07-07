package es.classone.restaurant.model.sessionHistory;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Res14ses")
public class SessionHistory {
	private Long sessionHistoryId;// R1SES000
	private Calendar sessionDate;// R1SES001
	private char sessionType;// R1SES004
	private int sessionNumber; // R1SES005
	private boolean counted;// R1SES007
	private boolean modified;// R1SES008
	private Calendar sessionOpenDate;// R1SES009
	private Calendar sessionCloseDate;// R1SES010
	private int totalTables;// R1SES011
	private int totalCutlery;// R1SES012
	private float grossAmmount2;// R1SES013
	private float grossAmount1;// R1SES014
	private float ivaAmmount;// R1SES015
	private float iniCashBalance;// R1SES016
	private float finCashBalance;// R1SES017

	public SessionHistory() {
	}

	public SessionHistory(Calendar sessionDate, char sessionType,
			int sessionNumber, boolean counted, boolean modified,
			Calendar sessionOpenDate, Calendar sessionCloseDate,
			int totalTables, int totalCutlery, float grossAmmount2,
			float grossAmount1, float ivaAmmount, float iniCashBalance,
			float finCashBalance) {
		this.sessionDate = sessionDate;
		this.sessionType = sessionType;
		this.sessionNumber = sessionNumber;
		this.counted = counted;
		this.modified = modified;
		this.sessionOpenDate = sessionOpenDate;
		this.sessionCloseDate = sessionCloseDate;
		this.totalTables = totalTables;
		this.totalCutlery = totalCutlery;
		this.grossAmmount2 = grossAmmount2;
		this.grossAmount1 = grossAmount1;
		this.ivaAmmount = ivaAmmount;
		this.iniCashBalance = iniCashBalance;
		this.finCashBalance = finCashBalance;

	}

	@Column(name = "R1SES000")
	@SequenceGenerator( // It only takes effect for
	name = "SessionHistoryIdGenerator", // databases providing identifier
	sequenceName = "SessionHistorySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SessionHistoryIdGenerator")
	public Long getSessionHistoryId() {
		return sessionHistoryId;
	}

	public void setSessionHistoryId(Long sessionHistoryId) {
		this.sessionHistoryId = sessionHistoryId;
	}

	@Column(name = "R1SES001")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(Calendar sessionDate) {
		this.sessionDate = sessionDate;
	}

	@Column(name = "R1SES004")
	public char getSessionType() {
		return sessionType;
	}

	public void setSessionType(char sessionType) {
		this.sessionType = sessionType;
	}

	@Column(name = "R1SES005")
	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	@Column(name = "R1SES007")
	public boolean isCounted() {
		return counted;
	}

	public void setCounted(boolean counted) {
		this.counted = counted;
	}

	@Column(name = "R1SES008")
	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

	@Column(name = "R1SES009")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getSessionOpenDate() {
		return sessionOpenDate;
	}

	public void setSessionOpenDate(Calendar sessionOpenDate) {
		this.sessionOpenDate = sessionOpenDate;
	}

	@Column(name = "R1SES010")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getSessionCloseDate() {
		return sessionCloseDate;
	}

	public void setSessionCloseDate(Calendar sessionCloseDate) {
		this.sessionCloseDate = sessionCloseDate;
	}

	@Column(name = "R1SES011")
	public int getTotalTables() {
		return totalTables;
	}

	public void setTotalTables(int totalTables) {
		this.totalTables = totalTables;
	}

	@Column(name = "R1SES012")
	public int getTotalCutlery() {
		return totalCutlery;
	}

	public void setTotalCutlery(int totalCutlery) {
		this.totalCutlery = totalCutlery;
	}

	@Column(name = "R1SES013")
	public float getGrossAmmount2() {
		return grossAmmount2;
	}

	public void setGrossAmmount2(float grossAmmount2) {
		this.grossAmmount2 = grossAmmount2;
	}

	@Column(name = "R1SES014")
	public float getGrossAmount1() {
		return grossAmount1;
	}

	public void setGrossAmount1(float grossAmount1) {
		this.grossAmount1 = grossAmount1;
	}

	@Column(name = "R1SES015")
	public float getIvaAmmount() {
		return ivaAmmount;
	}

	public void setIvaAmmount(float ivaAmmount) {
		this.ivaAmmount = ivaAmmount;
	}

	@Column(name = "R1SES016")
	public float getIniCashBalance() {
		return iniCashBalance;
	}

	public void setIniCashBalance(float iniCashBalance) {
		this.iniCashBalance = iniCashBalance;
	}

	@Column(name = "R1SES017")
	public float getFinCashBalance() {
		return finCashBalance;
	}

	public void setFinCashBalance(float finCashBalance) {
		this.finCashBalance = finCashBalance;
	}

}
// CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses` (
// `R1SES000` BIGINT NOT NULL AUTO_INCREMENT,
// `R1SES001` DATE NOT NULL,
// `R1SES004` CHAR NOT NULL,
// `R1SES005` INT NOT NULL,
// `R1SES007` CHAR NOT NULL,
// `R1SES008` CHAR NULL,
// `R1SES009` DATETIME NOT NULL,
// `R1SES010` DATETIME NOT NULL,
// `R1SES011` INT NOT NULL,
// `R1SES012` INT NOT NULL,
// `R1SES013` DECIMAL(11,2) NOT NULL,
// `R1SES014` DECIMAL(11,2) NOT NULL,
// `R1SES015` DECIMAL(11,2) NOT NULL,
// `R1SES016` DECIMAL(11,2) NOT NULL,
// `R1SES017` DECIMAL(11,2) NOT NULL,
// PRIMARY KEY (`R1SES000`))
// ENGINE = InnoDB;