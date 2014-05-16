package es.classone.restaurant.model.commandHistory;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.methodOfPayment.MethodOfPayment;

@Table(name="Res14ses_1")
@Entity
public class CommandHistory {

	private Long commandHistoryId; //R2SES000_1
	private float commandNumber; //R2SES020
	private boolean changeOrigBill;  //R2SES021
	private int boxNumber; //R2SES101
	private Calendar startDate; //R2SES011
	private Calendar endDate; //R2SES012
	private int tableNumber; //R2SES013
	private float totalMP1; //R2SES017_01
	private float netMP1; //R2SES018_01
	private float ivaMP1; //R2SES019_01
	private float totalMP2; //R2SES017_02
	private float netMP2; //R2SES018_02
	private float ivaMP2; //R2SES019_02
	private float totalMP3; //R2SES017_03
	private float netMP3; //R2SES018_03
	private float ivaMP3; //R2SES019_03
	private char typeChargeMP1; //R2SES022_01
	private char typeChargeMP2; //R2SES022_02
	private char typeChargeMP3; //R2SES022_03
	//private SesionHistory sesionHistory; //Res14ses_R1SES000
	private Client client; //Res14cli_R1CLI001
	private MethodOfPayment methodPayment1; //Res14cnt_FP_RFCNT300
	private MethodOfPayment methodPayment2; //Res14cnt_FP_RFCNT3001
	private MethodOfPayment methodPayment3; //Res14cnt_FP_RFCNT3002

	public CommandHistory(){}

	public CommandHistory(float commandNumber, boolean changeOrigBill,
			int boxNumber, Calendar startDate, Calendar endDate,
			int tableNumber, float totalMP1, float netMP1, float ivaMP1,
			float totalMP2, float netMP2, float ivaMP2, float totalMP3,
			float netMP3, float ivaMP3, char typeChargeMP1, char typeChargeMP2,
			char typeChargeMP3, Client client, MethodOfPayment methodPayment1,
			MethodOfPayment methodPayment2, MethodOfPayment methodPayment3) {
		this.commandNumber = commandNumber;
		this.changeOrigBill = changeOrigBill;
		this.boxNumber = boxNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tableNumber = tableNumber;
		this.totalMP1 = totalMP1;
		this.netMP1 = netMP1;
		this.ivaMP1 = ivaMP1;
		this.totalMP2 = totalMP2;
		this.netMP2 = netMP2;
		this.ivaMP2 = ivaMP2;
		this.totalMP3 = totalMP3;
		this.netMP3 = netMP3;
		this.ivaMP3 = ivaMP3;
		this.typeChargeMP1 = typeChargeMP1;
		this.typeChargeMP2 = typeChargeMP2;
		this.typeChargeMP3 = typeChargeMP3;
		this.client = client;
		this.methodPayment1 = methodPayment1;
		this.methodPayment2 = methodPayment2;
		this.methodPayment3 = methodPayment3;
	}

    @Column(name="R2SES000_1")
    @SequenceGenerator(             // It only takes effect for
         name="CommandHistoryIdGenerator", // databases providing identifier
         sequenceName="CommandHistorySeq") // generators.
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,
                    generator="CommandHistoryIdGenerator")
	public Long getCommandHistoryId() {
		return commandHistoryId;
	}

	public void setCommandHistoryId(Long commandHistoryId) {
		this.commandHistoryId = commandHistoryId;
	}

	@Column(name="R2SES020")
	public float getCommandNumber() {
		return commandNumber;
	}

	public void setCommandNumber(float commandNumber) {
		this.commandNumber = commandNumber;
	}

	public boolean isChangeOrigBill() {
		return changeOrigBill;
	}

	public void setChangeOrigBill(boolean changeOrigBill) {
		this.changeOrigBill = changeOrigBill;
	}

	public int getBoxNumber() {
		return boxNumber;
	}

	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}

	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public float getTotalMP1() {
		return totalMP1;
	}

	public void setTotalMP1(float totalMP1) {
		this.totalMP1 = totalMP1;
	}

	public float getNetMP1() {
		return netMP1;
	}

	public void setNetMP1(float netMP1) {
		this.netMP1 = netMP1;
	}

	public float getIvaMP1() {
		return ivaMP1;
	}

	public void setIvaMP1(float ivaMP1) {
		this.ivaMP1 = ivaMP1;
	}

	public float getTotalMP2() {
		return totalMP2;
	}

	public void setTotalMP2(float totalMP2) {
		this.totalMP2 = totalMP2;
	}

	public float getNetMP2() {
		return netMP2;
	}

	public void setNetMP2(float netMP2) {
		this.netMP2 = netMP2;
	}

	public float getIvaMP2() {
		return ivaMP2;
	}

	public void setIvaMP2(float ivaMP2) {
		this.ivaMP2 = ivaMP2;
	}

	public float getTotalMP3() {
		return totalMP3;
	}

	public void setTotalMP3(float totalMP3) {
		this.totalMP3 = totalMP3;
	}

	public float getNetMP3() {
		return netMP3;
	}

	public void setNetMP3(float netMP3) {
		this.netMP3 = netMP3;
	}

	public float getIvaMP3() {
		return ivaMP3;
	}

	public void setIvaMP3(float ivaMP3) {
		this.ivaMP3 = ivaMP3;
	}

	public char getTypeChargeMP1() {
		return typeChargeMP1;
	}

	public void setTypeChargeMP1(char typeChargeMP1) {
		this.typeChargeMP1 = typeChargeMP1;
	}

	public char getTypeChargeMP2() {
		return typeChargeMP2;
	}

	public void setTypeChargeMP2(char typeChargeMP2) {
		this.typeChargeMP2 = typeChargeMP2;
	}

	public char getTypeChargeMP3() {
		return typeChargeMP3;
	}

	public void setTypeChargeMP3(char typeChargeMP3) {
		this.typeChargeMP3 = typeChargeMP3;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public MethodOfPayment getMethodPayment1() {
		return methodPayment1;
	}

	public void setMethodPayment1(MethodOfPayment methodPayment1) {
		this.methodPayment1 = methodPayment1;
	}

	public MethodOfPayment getMethodPayment2() {
		return methodPayment2;
	}

	public void setMethodPayment2(MethodOfPayment methodPayment2) {
		this.methodPayment2 = methodPayment2;
	}

	public MethodOfPayment getMethodPayment3() {
		return methodPayment3;
	}

	public void setMethodPayment3(MethodOfPayment methodPayment3) {
		this.methodPayment3 = methodPayment3;
	}


	
	
}

/*
-- -----------------------------------------------------
-- Table `Ayx14res`.`Res14ses_1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Ayx14res`.`Res14ses_1` ;

CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14ses_1` (
`R2SES000_1` BIGINT NOT NULL AUTO_INCREMENT,
`R2SES020` DECIMAL(11,2) NOT NULL,
`R2SES021` CHAR NOT NULL,
`R2SES101` DECIMAL(6) NOT NULL,
`R2SES011` DATETIME NOT NULL,
`R2SES012` DATETIME NOT NULL,
`R2SES013` INT NOT NULL,
`R2SES017_01` DECIMAL(11,2) NOT NULL,
`R2SES018_01` DECIMAL(11,2) NULL,
`R2SES019_01` DECIMAL(11,2) NULL,
`R2SES017_02` DECIMAL(11,2) NOT NULL,
`R2SES018_02` DECIMAL(11,2) NULL,
`R2SES019_02` DECIMAL(11,2) NULL,
`R2SES017_03` DECIMAL(11,2) NOT NULL,
`R2SES018_03` DECIMAL(11,2) NULL,
`R2SES019_03` DECIMAL(11,2) NULL,
`R2SES022_01` CHAR NOT NULL,
`R2SES022_02` CHAR NULL,
`R2SES022_03` CHAR NULL,
`Res14ses_R1SES000` BIGINT NOT NULL,
`Res14cli_R1CLI001` BIGINT NOT NULL,
`Res14cnt_FP_RFCNT300` INT NOT NULL,
`Res14cnt_FP_RFCNT3001` INT NOT NULL,
`Res14cnt_FP_RFCNT3002` INT NOT NULL,
PRIMARY KEY (`R2SES000_1`),
CONSTRAINT `fk_Res14ses_1_Res14ses1`
  FOREIGN KEY (`Res14ses_R1SES000`)
  REFERENCES `Ayx14res`.`Res14ses` (`R1SES000`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
CONSTRAINT `fk_Res14ses_1_Res14cli1`
  FOREIGN KEY (`Res14cli_R1CLI001`)
  REFERENCES `Ayx14res`.`Res14cli` (`R1CLI001`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
CONSTRAINT `fk_Res14ses_1_Res14cnt_FP1`
  FOREIGN KEY (`Res14cnt_FP_RFCNT300`)
  REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
CONSTRAINT `fk_Res14ses_1_Res14cnt_FP2`
  FOREIGN KEY (`Res14cnt_FP_RFCNT3001`)
  REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
CONSTRAINT `fk_Res14ses_1_Res14cnt_FP3`
  FOREIGN KEY (`Res14cnt_FP_RFCNT3002`)
  REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14ses_1_Res14ses1_idx` ON `Ayx14res`.`Res14ses_1` (`Res14ses_R1SES000` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cli1_idx` ON `Ayx14res`.`Res14ses_1` (`Res14cli_R1CLI001` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP1_idx` ON `Ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT300` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP2_idx` ON `Ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT3001` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP3_idx` ON `Ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT3002` ASC);
*/
