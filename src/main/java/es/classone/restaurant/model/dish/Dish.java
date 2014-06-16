package es.classone.restaurant.model.dish;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.dishGroup.DishGroup;

//import es.classone.restaurant.model.dishGroup.DishGroup;

@Entity
@Table(name = "Res14pla")
public class Dish {

	private int dishId; // R1PLA001
	private String dishDescriptionLang1; // R1PLA002_01
	private String dishDescriptionLang2; // R1PLA002_02;
	private String dishDescriptionLang3; // R1PLA002_03;
	private int dishPrint; // R1PLA004 Impresora (1 a 5)
	private int dishListPrice; // R1PLA005 Lista de Precios (0 a 9)
	private int dishPVP; // R1PLA006
	private int dishCostPrice; // R1PLA007
	private char dishType;// R1PLA008 P=Plato // K=Kilo
	private boolean dishDiscount; // R1PLA009;
	private boolean dishDeleted;// R1PLA021
	private boolean dishPending;// R1PLA022
	private DishGroup dishGroup; // Res14grp_R1GRP000
	private boolean dishTractable; //R1PLA023 
	private boolean dishOrderer; //R1PLA024
	private boolean dishVisible; //R1PLA025
	private int dishNumbers; //R1PLA026
	private String dishLongDesc; // R1PLA027
	private String dishShortDesc;  //R1PLA028
	
	
	public Dish() {

	}

	
	public Dish(String dishDescriptionLang1, String dishDescriptionLang2,
			String dishDescriptionLang3, int dishPrint, int dishListPrice,
			int dishPVP, int dishCostPrice, char dishType,
			boolean dishDiscount, boolean dishDeleted, boolean dishPending,
			DishGroup dishGroup) {
		this.dishDescriptionLang1 = dishDescriptionLang1;
		this.dishDescriptionLang2 = dishDescriptionLang2;
		this.dishDescriptionLang3 = dishDescriptionLang3;
		this.dishPrint = dishPrint;
		this.dishListPrice = dishListPrice;
		this.dishPVP = dishPVP;
		this.dishCostPrice = dishCostPrice;
		this.dishType = dishType;
		this.dishDiscount = dishDiscount;
		this.dishDeleted = dishDeleted;
		this.dishPending = dishPending;
		this.dishGroup = dishGroup;
	}


	@Column(name = "R1PLA001")
	@SequenceGenerator( // It only takes effect for
	name = "DishIdGenerator", // databases providing identifier
	sequenceName = "DishSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishGenerator")
	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	@Column(name = "R1PLA002_01")
	public String getDishDescriptionLang1() {
		return dishDescriptionLang1;
	}

	public void setDishDescriptionLang1(String dishDescriptionLang1) {
		this.dishDescriptionLang1 = dishDescriptionLang1;
	}

	@Column(name = "R1PLA002_02")
	public String getDishDescriptionLang2() {
		return dishDescriptionLang2;
	}

	public void setDishDescriptionLang2(String dishDescriptionLang2) {
		this.dishDescriptionLang2 = dishDescriptionLang2;
	}

	@Column(name = "R1PLA002_03")
	public String getDishDescriptionLang3() {
		return dishDescriptionLang3;
	}

	public void setDishDescriptionLang3(String dishDescriptionLang3) {
		this.dishDescriptionLang3 = dishDescriptionLang3;
	}

	@Column(name = "R1PLA004")
	public int getDishPrint() {
		return dishPrint;
	}

	public void setDishPrint(int dishPrint) {
		this.dishPrint = dishPrint;
	}

	@Column(name = "R1PLA005")
	public int getDishListPrice() {
		return dishListPrice;
	}

	public void setDishListPrice(int dishListPrice) {
		this.dishListPrice = dishListPrice;
	}

	@Column(name = "R1PLA006")
	public int getDishPVP() {
		return dishPVP;
	}

	public void setDishPVP(int dishPVP) {
		this.dishPVP = dishPVP;
	}

	@Column(name = "R1PLA007")
	public int getDishCostPrice() {
		return dishCostPrice;
	}

	public void setDishCostPrice(int dishCostPrice) {
		this.dishCostPrice = dishCostPrice;
	}

	@Column(name = "R1PLA008")
	public char getDishType() {
		return dishType;
	}

	public void setDishType(char dishType) {
		this.dishType = dishType;
	}

	@Column(name = "R1PLA009")
	public boolean isDishDiscount() {
		return dishDiscount;
	}

	public void setDishDiscount(boolean dishDiscount) {
		this.dishDiscount = dishDiscount;
	}

	@Column(name = "R1PLA021")
	public boolean isDishDeleted() {
		return dishDeleted;
	}

	public void setDishDeleted(boolean dishDeleted) {
		this.dishDeleted = dishDeleted;
	}

	@Column(name = "R1PLA022")
	public boolean isDishPending() {
		return dishPending;
	}

	public void setDishPending(boolean dishPending) {
		this.dishPending = dishPending;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "R1GRP000")
	public DishGroup getDishGroup() {
		return dishGroup;
	}

	public void setDishGroup(DishGroup dishGroup) {
		this.dishGroup = dishGroup;
	}

	@Column(name="R1PLA023")
	public boolean isDishTractable() {
		return dishTractable;
	}


	public void setDishTractable(boolean dishTractable) {
		this.dishTractable = dishTractable;
	}

	@Column(name="R1PLA024")
	public boolean isDishOrderer() {
		return dishOrderer;
	}


	public void setDishOrderer(boolean dishOrderer) {
		this.dishOrderer = dishOrderer;
	}

	@Column(name="R1PLA025")
	public boolean isDishVisible() {
		return dishVisible;
	}


	public void setDishVisible(boolean dishVisible) {
		this.dishVisible = dishVisible;
	}

	@Column(name="R1PLA026")
	public int getDishNumbers() {
		return dishNumbers;
	}


	public void setDishNumbers(int dishNumbers) {
		this.dishNumbers = dishNumbers;
	}

	@Column(name="R1PLA027")
	public String getDishLongDesc() {
		return dishLongDesc;
	}


	public void setDishLongDesc(String dishLongDesc) {
		this.dishLongDesc = dishLongDesc;
	}

	@Column(name="R1PLA028")
	public String getDishShortDesc() {
		return dishShortDesc;
	}


	public void setDishShortDesc(String dishShortDesc) {
		this.dishShortDesc = dishShortDesc;
	}
	
	

}
/*
 *CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14pla` (
  `R1PLA001` INT NOT NULL AUTO_INCREMENT,
  `R1PLA002_01` VARCHAR(30) NOT NULL,
  `R1PLA002_02` VARCHAR(30) NULL,
  `R1PLA002_03` VARCHAR(30) NULL,
  `R1PLA004` INT NOT NULL DEFAULT 1,
  `R1PLA005` INT NOT NULL DEFAULT 0,
  `R1PLA006` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1PLA007` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1PLA008` CHAR NOT NULL DEFAULT 'P',
  `R1PLA009` TINYINT(1) NOT NULL DEFAULT false,
  `R1PLA021` TINYINT(1) NOT NULL DEFAULT false,
  `R1PLA022` TINYINT(1) NOT NULL DEFAULT false,
  `Res14grp_R1GRP000` INT NOT NULL,
  `R1PLA023` TINYINT(1) NULL,
  `R1PLA024` TINYINT(1) NULL,
  `R1PLA025` TINYINT(1) NULL,
  `R1PLA026` SMALLINT NULL,
  `R1PLA027` VARCHAR(64) NULL,
  `R1PLA028` VARCHAR(256) NULL,
  PRIMARY KEY (`R1PLA001`),
  INDEX `fk_Res14pla_Res14grp1_idx` (`Res14grp_R1GRP000` ASC),
  CONSTRAINT `fk_Res14pla_Res14grp1`
    FOREIGN KEY (`Res14grp_R1GRP000`)
    REFERENCES `ayx14res`.`Res14grp` (`R1GRP000`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
*/
