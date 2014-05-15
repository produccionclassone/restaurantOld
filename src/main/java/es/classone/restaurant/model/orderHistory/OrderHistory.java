package es.classone.restaurant.model.orderHistory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.dish.Dish;

@Entity
@Table(name="Res14ses_2")
public class OrderHistory {
	private Long orderHistoryId; //R2SES000
	private int orderHistoryIVAType; //R2SES009
	private boolean orderHistoryCharged; //R3SES010
	//private String orderHistoryName; // R3SES011
	private float orderHistoryUnit; //R2SES012
	private float orderHistoryNetImport; //R3SES013
	private float orderHistoryIVAImport; //R3SES014
	private float orderHistoryCost; //R3SES016
	private boolean orderHistoryIngredientEnable; //R3SES017
	private String orderHistorySaleDept; //R3SES018
	//private ordenHistory CommandHistory; //Res14ses_1_R2SES000_1
	private Dish orderHistoryDish; //Res14pla_R1PLA001
	
	public OrderHistory(){}
	
	public OrderHistory(int orderHistoryIVAType, boolean orderHistoryCharged, float orderHistoryUnit, float orderHistoryNetImport, float orderHistoryIVAImport,
			float orderHistoryCost, String orderHistorySaleDept, Dish orderHistoryDish){
		this.orderHistoryIVAType = orderHistoryIVAType;
		this.orderHistoryCharged = orderHistoryCharged;
		this.orderHistoryUnit = orderHistoryUnit;
		this.orderHistoryNetImport = orderHistoryNetImport;
		this.orderHistoryIVAImport = orderHistoryIVAImport;
		this.orderHistoryCost = orderHistoryCost;
		this.orderHistorySaleDept = orderHistorySaleDept;
		this.orderHistoryDish = orderHistoryDish;
	}

    @Column(name="R2SES000")
    @SequenceGenerator(             // It only takes effect for
         name="OrderHistoryIdGenerator", // databases providing identifier
         sequenceName="OrderHistorySeq") // generators.
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,
                    generator="OrderHistoryIdGenerator")
    public Long getOrderHistoryId() {
		return orderHistoryId;
	}

	public void setOrderHistoryId(Long orderHistoryId) {
		this.orderHistoryId = orderHistoryId;
	}

	@Column(name="R2SES009")
	public int getOrderHistoryIVAType() {
		return orderHistoryIVAType;
	}

	public void setOrderHistoryIVAType(int orderHistoryIVAType) {
		this.orderHistoryIVAType = orderHistoryIVAType;
	}

	@Column(name="R3SES010")
	public boolean isOrderHistoryCharged() {
		return orderHistoryCharged;
	}

	public void setOrderHistoryCharged(boolean orderHistoryCharged) {
		this.orderHistoryCharged = orderHistoryCharged;
	}

	@Column(name="R2SES012")
	public float getOrderHistoryUnit() {
		return orderHistoryUnit;
	}

	public void setOrderHistoryUnit(float orderHistoryUnit) {
		this.orderHistoryUnit = orderHistoryUnit;
	}

	@Column(name="R2SES013")
	public float getOrderHistoryNetImport() {
		return orderHistoryNetImport;
	}

	public void setOrderHistoryNetImport(float orderHistoryNetImport) {
		this.orderHistoryNetImport = orderHistoryNetImport;
	}

	@Column(name="R2SES014")
	public float getOrderHistoryIVAImport() {
		return orderHistoryIVAImport;
	}

	public void setOrderHistoryIVAImport(float orderHistoryIVAImport) {
		this.orderHistoryIVAImport = orderHistoryIVAImport;
	}

	@Column(name="R2SES016")
	public float getOrderHistoryCost() {
		return orderHistoryCost;
	}

	public void setOrderHistoryCost(float orderHistoryCost) {
		this.orderHistoryCost = orderHistoryCost;
	}
	
	@Column(name="R2SES017")
	public boolean isOrderHistoryIngredientEnable() {
		return orderHistoryIngredientEnable;
	}

	public void setOrderHistoryIngredientEnable(boolean orderHistoryIngredientEnable) {
		this.orderHistoryIngredientEnable = orderHistoryIngredientEnable;
	}
	
	@Column(name="R2SES018")
	public String getOrderHistorySaleDept() {
		return orderHistorySaleDept;
	}

	public void setOrderHistorySaleDept(String orderHistorySaleDept) {
		this.orderHistorySaleDept = orderHistorySaleDept;
	}

	@Column(name="Res14pla_R1PLA001")
	public Dish getOrderHistoryDish() {
		return orderHistoryDish;
	}

	public void setOrderHistoryDish(Dish orderHistoryDish) {
		this.orderHistoryDish = orderHistoryDish;
	}
}

/*
-- -----------------------------------------------------
-- Table `Ayx14res`.`Res14ses_2`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Ayx14res`.`Res14ses_2` ;

CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14ses_2` (
  `R2SES000` BIGINT NOT NULL,
  `R2SES009` SMALLINT NOT NULL,
  `R3SES010` CHAR NOT NULL,
  `R2SES012` DECIMAL(9,2) NOT NULL,
  `R3SES013` DECIMAL(11,2) NOT NULL,
  `R3SES014` DECIMAL(11,2) NOT NULL,
  `R3SES016` DECIMAL(11,2) NOT NULL,
  `R3SES017` CHAR NULL,
  `R3SES018` VARCHAR(4) NULL,
  `Res14ses_1_R2SES000_1` BIGINT NOT NULL,
  `Res14pla_R1PLA001` INT NOT NULL,
  PRIMARY KEY (`R2SES000`),
  CONSTRAINT `fk_Res14ses_2_Res14ses_11`
    FOREIGN KEY (`Res14ses_1_R2SES000_1`)
    REFERENCES `Ayx14res`.`Res14ses_1` (`R2SES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_2_Res14pla1`
    FOREIGN KEY (`Res14pla_R1PLA001`)
    REFERENCES `Ayx14res`.`Res14pla` (`R1PLA001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14ses_2_Res14ses_11_idx` ON `Ayx14res`.`Res14ses_2` (`Res14ses_1_R2SES000_1` ASC);

CREATE INDEX `fk_Res14ses_2_Res14pla1_idx` ON `Ayx14res`.`Res14ses_2` (`Res14pla_R1PLA001` ASC);
*/