package es.classone.restaurant.model.orderHistory;

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

import es.classone.restaurant.model.commandHistory.CommandHistory;
import es.classone.restaurant.model.dish.Dish;

@Entity
@Table(name = "Res14ses_2")
public class OrderHistory {
	private Long orderHistoryId; // R2SES000
	private int ivaType; // R2SES009
	private boolean charged; // R3SES010
	private float numberOfUnits; // R2SES012
	private float netImport; // R3SES013
	private float ivaImport; // R3SES014
	private float cost; // R3SES016
	private boolean ingredientEnable; // R3SES017
	private String saleDeptTPV; // R3SES018
	private CommandHistory commandHistory; // Res14ses_1_R2SES000_1
	private Dish dish; // Res14pla_R1PLA001

	public OrderHistory() {
	}

	public OrderHistory(int ivaType, boolean charged,
			float numberOfUnits, float netImport,
			float ivaImport, float cost,
			String saleDeptTPV) {
		this.ivaType = ivaType;
		this.charged = charged;
		this.numberOfUnits = numberOfUnits;
		this.netImport = netImport;
		this.ivaImport = ivaImport;
		this.cost = cost;
		this.saleDeptTPV = saleDeptTPV;
	}

	@Column(name = "R2SES000")
	@SequenceGenerator( // It only takes effect for
	name = "OrderHistoryIdGenerator", // databases providing identifier
	sequenceName = "OrderHistorySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "OrderHistoryIdGenerator")
	public Long getOrderHistoryId() {
		return orderHistoryId;
	}

	public void setOrderHistoryId(Long orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	@Column(name = "R2SES009")
	public int getIvaType() {
		return ivaType;
	}

	public void setIvaType(int ivaType) {
		this.ivaType = ivaType;
	}

	@Column(name = "R3SES010")
	public boolean isCharged() {
		return charged;
	}

	public void setCharged(boolean charged) {
		this.charged = charged;
	}

	@Column(name = "R2SES012")
	public float getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(float numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Column(name = "R2SES013")
	public float getNetImport() {
		return netImport;
	}

	public void setNetImport(float netImport) {
		this.netImport = netImport;
	}

	@Column(name = "R2SES014")
	public float getIvaImport() {
		return ivaImport;
	}

	public void setIvaImport(float ivaImport) {
		this.ivaImport = ivaImport;
	}

	@Column(name = "R2SES016")
	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Column(name = "R2SES017")
	public boolean isIngredientEnable() {
		return ingredientEnable;
	}

	public void setIngredientEnable(
			boolean ingredientEnable) {
		this.ingredientEnable = ingredientEnable;
	}

	@Column(name = "R2SES018")
	public String getSaleDeptTPV() {
		return saleDeptTPV;
	}

	public void setSaleDeptTPV(String saleDeptTPV) {
		this.saleDeptTPV = saleDeptTPV;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "R1PLA001")
	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "R1SES000_1")
	public CommandHistory getCommandHistory() {
		return commandHistory;
	}

	public void setCommandHistory(CommandHistory commandHistory) {
		this.commandHistory = commandHistory;
	}
}

/*
 CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses_2` (
  `R2SES000` BIGINT NOT NULL AUTO_INCREMENT,
  `R2SES009` SMALLINT NOT NULL,
  `R3SES010` CHAR NOT NULL,
  `R2SES012` DECIMAL(9,2) NOT NULL,
  `R3SES013` DECIMAL(11,2) NOT NULL,
  `R3SES014` DECIMAL(11,2) NOT NULL,
  `R3SES016` DECIMAL(11,2) NOT NULL,
  `R3SES017` TINYINT(1) NOT NULL,
  `R3SES018` VARCHAR(4) NULL,
  `Res14ses_1_R2SES000_1` BIGINT NOT NULL,
  `Res14pla_R1PLA000` INT NOT NULL,
  PRIMARY KEY (`R2SES000`),
  CONSTRAINT `fk_Res14ses_2_Res14ses_11`
    FOREIGN KEY (`Res14ses_1_R2SES000_1`)
    REFERENCES `ayx14res`.`Res14ses_1` (`R2SES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_2_Res14pla1`
    FOREIGN KEY (`Res14pla_R1PLA000`)
    REFERENCES `ayx14res`.`Res14pla` (`R1PLA000`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
 */