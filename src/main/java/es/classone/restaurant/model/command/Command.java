package es.classone.restaurant.model.command;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.methodOfPayment.MethodOfPayment;
import es.classone.restaurant.model.session.Session;

@Entity
@Table(name = "Res14mes_1")
public class Command {
	private int commandId; // R1MES000_1
	private int tableNumber; // R1MES005
	private int commensalNumber; // R1MES007
	private Long billNumber; // R1MES008
	private Calendar commandDateIni; // R1MES009
	private Calendar commandDateFin; // R1MES010
	private float mp1amount;// R1MES014_01
	private float mp1amountNoIva;// R1MS019_01
	private float mp1amountIva;// R1MES020_01
	private float mp2amount;// R1MES014_02
	private float mp2amountNoIva; // R1MES019_02
	private float mp2amountIva; // R1MES020_02
	private float mp3amount; // R1MES014_03
	private float mp3amountNoIva; // R1MES019_03
	private float mp3amountIva;// MES020_03
	private float grossAmount;// R1MES015
	private float ivaAmount;// R1MES016
	private Session session; // Res14mes_R1MES000
	private Client client;// Res14cli_R1CLI001
	private MethodOfPayment methodOfPayment1;// Res14cnt_FP_RFCNT300
	private MethodOfPayment methodOfPayment2;// Res14cnt_FP_RFCNT3001
	private MethodOfPayment methodOfPayment3;// Res14cnt_FP_RFCNT3002

	public Command(int tableNumber, int commensalNumber, Long billNumber,
			Calendar commandDateIni, Calendar commandDateFin, float mp1amount,
			float mp1amountNoIva, float mp1amountIva, float mp2amount,
			float mp2amountNoIva, float mp2amountIva, float mp3amount,
			float mp3amountNoIva, float mp3amountIva, float grossAmount,
			float ivaAmount, Session session, Client client,
			MethodOfPayment methodOfPayment1, MethodOfPayment methodOfPayment2,
			MethodOfPayment methodOfPayment3) {
		this.tableNumber = tableNumber;
		this.commensalNumber = commensalNumber;
		this.billNumber = billNumber;
		this.commandDateIni = commandDateIni;
		this.commandDateFin = commandDateFin;
		this.mp1amount = mp1amount;
		this.mp1amountNoIva = mp1amountNoIva;
		this.mp1amountIva = mp1amountIva;
		this.mp2amount = mp2amount;
		this.mp2amountNoIva = mp2amountNoIva;
		this.mp2amountIva = mp2amountIva;
		this.mp3amount = mp3amount;
		this.mp3amountNoIva = mp3amountNoIva;
		this.mp3amountIva = mp3amountIva;
		this.grossAmount = grossAmount;
		this.ivaAmount = ivaAmount;
		this.session = session;
		this.client = client;
		this.methodOfPayment1 = methodOfPayment1;
		this.methodOfPayment2 = methodOfPayment2;
		this.methodOfPayment3 = methodOfPayment3;
	}

	@Column(name = "R1MES000_1")
	@SequenceGenerator( // It only takes effect for
	name = "CommandIdGenerator", // databases providing identifier
	sequenceName = "CommandSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CommandIdGenerator")
	public int getCommandId() {
		return commandId;
	}

	public void setCommandId(int commandId) {
		this.commandId = commandId;
	}

	@Column(name = "R1MES005")
	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Column(name = "R1MES007")
	public int getCommensalNumber() {
		return commensalNumber;
	}

	public void setCommensalNumber(int commensalNumber) {
		this.commensalNumber = commensalNumber;
	}

	@Column(name = "R1MES008")
	public Long getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(Long billNumber) {
		this.billNumber = billNumber;
	}

	@Column(name = "R1MES009")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getCommandDateIni() {
		return commandDateIni;
	}

	public void setCommandDateIni(Calendar commandDateIni) {
		this.commandDateIni = commandDateIni;
	}

	@Column(name = "R1MES010")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getCommandDateFin() {
		return commandDateFin;
	}

	public void setCommandDateFin(Calendar commandDateFin) {
		this.commandDateFin = commandDateFin;
	}

	@Column(name = "R1MES014_01")
	public float getMp1amount() {
		return mp1amount;
	}

	public void setMp1amount(float mp1amount) {
		this.mp1amount = mp1amount;
	}

	@Column(name = "R1MES019_01")
	public float getMp1amountNoIva() {
		return mp1amountNoIva;
	}

	public void setMp1amountNoIva(float mp1amountNoIva) {
		this.mp1amountNoIva = mp1amountNoIva;
	}

	@Column(name = "R1MES020_01")
	public float getMp1amountIva() {
		return mp1amountIva;
	}

	public void setMp1amountIva(float mp1amountIva) {
		this.mp1amountIva = mp1amountIva;
	}

	@Column(name = "R1MES014_02")
	public float getMp2amount() {
		return mp2amount;
	}

	public void setMp2amount(float mp2amount) {
		this.mp2amount = mp2amount;
	}

	@Column(name = "R1MES019_02")
	public float getMp2amountNoIva() {
		return mp2amountNoIva;
	}

	public void setMp2amountNoIva(float mp2amountNoIva) {
		this.mp2amountNoIva = mp2amountNoIva;
	}

	@Column(name = "R1MES020_02")
	public float getMp2amountIva() {
		return mp2amountIva;
	}

	public void setMp2amountIva(float mp2amountIva) {
		this.mp2amountIva = mp2amountIva;
	}

	@Column(name = "R1MES014_03")
	public float getMp3amount() {
		return mp3amount;
	}

	public void setMp3amount(float mp3amount) {
		this.mp3amount = mp3amount;
	}

	@Column(name = "R1MES019_02")
	public float getMp3amountNoIva() {
		return mp3amountNoIva;
	}

	public void setMp3amountNoIva(float mp3amountNoIva) {
		this.mp3amountNoIva = mp3amountNoIva;
	}

	@Column(name = "R1MES020_03")
	public float getMp3amountIva() {
		return mp3amountIva;
	}

	public void setMp3amountIva(float mp3amountIva) {
		this.mp3amountIva = mp3amountIva;
	}

	@Column(name = "R1MES015")
	public float getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(float grossAmount) {
		this.grossAmount = grossAmount;
	}

	@Column(name = "R1MES016")
	public float getIvaAmount() {
		return ivaAmount;
	}

	public void setIvaAmount(float ivaAmount) {
		this.ivaAmount = ivaAmount;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "R1MES000")
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "R1CLI001")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RFCNT300")
	public MethodOfPayment getMethodOfPayment1() {
		return methodOfPayment1;
	}

	public void setMethodOfPayment1(MethodOfPayment methodOfPayment1) {
		this.methodOfPayment1 = methodOfPayment1;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RFCNT300")
	public MethodOfPayment getMethodOfPayment2() {
		return methodOfPayment2;
	}

	public void setMethodOfPayment2(MethodOfPayment methodOfPayment2) {
		this.methodOfPayment2 = methodOfPayment2;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RFCNT300")
	public MethodOfPayment getMethodOfPayment3() {
		return methodOfPayment3;
	}

	public void setMethodOfPayment3(MethodOfPayment methodOfPayment3) {
		this.methodOfPayment3 = methodOfPayment3;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14mes_1` (
// `R1MES000_1` INT NOT NULL AUTO_INCREMENT,
// `R1MES005` INT NOT NULL,
// `R1MES007` BIGINT NULL,
// `R1MES008` BIGINT NULL,
// `R1MES009` DATETIME NOT NULL,
// `R1MES010` DATETIME NULL,
// `R1MES015` DECIMAL(11,2) NULL,
// `R1MES016` DECIMAL(11,2) NULL,
// `R1MES014_01` DECIMAL(11,2) NULL,
// `R1MES019_01` DECIMAL(11,2) NULL,
// `R1MES020_01` DECIMAL(11,2) NULL,
// `R1MES014_02` DECIMAL(11,2) NULL,
// `R1MES019_02` DECIMAL(11,2) NULL,
// `R1MES020_02` DECIMAL(11,2) NULL,
// `R1MES014_03` DECIMAL(11,2) NULL,
// `R1MES019_03` DECIMAL(11,2) NULL,
// `R1MES020_03` DECIMAL(11,2) NULL,
// `Res14mes_R1MES000` INT NOT NULL,
// `Res14cli_R1CLI001` BIGINT NOT NULL,
// `Res14cnt_FP_RFCNT300` INT NOT NULL,
// `Res14cnt_FP_RFCNT3001` INT NOT NULL,
// `Res14cnt_FP_RFCNT3002` INT NOT NULL,
// PRIMARY KEY (`R1MES000_1`),
// CONSTRAINT `fk_Res14mes_1_Res14mes1`
// FOREIGN KEY (`Res14mes_R1MES000`)
// REFERENCES `Ayx14res`.`Res14mes` (`R1MES000`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_1_Res14cli1`
// FOREIGN KEY (`Res14cli_R1CLI001`)
// REFERENCES `Ayx14res`.`Res14cli` (`R1CLI001`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_1_Res14cnt_FP1`
// FOREIGN KEY (`Res14cnt_FP_RFCNT300`)
// REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_1_Res14cnt_FP2`
// FOREIGN KEY (`Res14cnt_FP_RFCNT3001`)
// REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_1_Res14cnt_FP3`
// FOREIGN KEY (`Res14cnt_FP_RFCNT3002`)
// REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION)
// ENGINE = InnoDB;