package es.classone.restaurant.model.currency;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cnt_MD")
public class Currency {

	private Long currencyId;// RMCNTR00
	private String currencyCode; // RMCNTR01
	private String currencyName; // RMCNT002
	private int currencyChange; // RMCNT003
	private float currencyQuote; // RMCNT004
	private float commisionPercent; // RMCNT005

	public Currency() {
	}

	public Currency(String currencyCode, String currencyName,
			int currencyChange, float currencyQuote, float commisionPercent) {
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.currencyChange = currencyChange;
		this.currencyQuote = currencyQuote;
		this.commisionPercent = commisionPercent;
	}

	@Column(name = "RMCNTR00")
	@SequenceGenerator( // It only takes effect for
	name = "CurrencyIdGenerator", // databases providing identifier
	sequenceName = "CurrencySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CurrencyIdGenerator")
	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "RMCNTR01")
	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Column(name = "RMCNTR02")
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	@Column(name = "RMCNTR03")
	public int getcurrencyChange() {
		return currencyChange;
	}

	public void setcurrencyChange(int currencyChange) {
		this.currencyChange = currencyChange;
	}

	@Column(name = "RMCNTR04")
	public float getcurrencyQuote() {
		return currencyQuote;
	}

	public void setcurrencyQuote(float currencyQuote) {
		this.currencyQuote = currencyQuote;
	}

	@Column(name = "RMCNTR05")
	public float getCommisionPercent() {
		return commisionPercent;
	}

	public void setCommisionPercent(float commisionPercent) {
		this.commisionPercent = commisionPercent;
	}

}

// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_MD` (
// `RMCNTR00` INT NOT NULL AUTO_INCREMENT,
// `RMCNTR01` VARCHAR(2) NOT NULL DEFAULT 'EU',
// `RMCNT002` VARCHAR(12) NOT NULL DEFAULT 'EURO',
// `RMCNT003` SMALLINT NOT NULL DEFAULT 1,
// `RMCNT004` DECIMAL(11,4) NOT NULL DEFAULT 1,
// `RMCNT005` DECIMAL(5,2) NOT NULL DEFAULT 0,
// PRIMARY KEY (`RMCNTR00`))
// ENGINE = InnoDB;
