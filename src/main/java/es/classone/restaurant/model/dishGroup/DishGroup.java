package es.classone.restaurant.model.dishGroup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14grp")
public class DishGroup {

	private int dishGroupId; // R1GRP000
	private String dishGroupCode; // R1GRP001
	private String dishGroupDescription; // R1GRP002_01
	private int ivaType; // R1GRP003 Tipo de IVA (1,2 or 3)
	private String salesLedgerAccount; // R1GRP004
	private String typeIncome; // R1GRP112
	private int macroGroup; // R1GRP011 1= Comida 2= Bebida 3= Otros

	public DishGroup() {

	}

	public DishGroup(String dishGroupCode, String description, int ivaType,
			String salesLedgerAccount, String typeIncome, int macroGroup) {
		this.dishGroupCode = dishGroupCode;
		this.dishGroupDescription = description;
		this.ivaType = ivaType;
		this.salesLedgerAccount = salesLedgerAccount;
		this.typeIncome = typeIncome;
		this.macroGroup = macroGroup;
	}

	@Column(name = "R1GRP000")
	@SequenceGenerator( // It only takes effect for
	name = "DishCategoryIdGenerator", // databases providing identifier
	sequenceName = "DishCategorySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishCategoryIdGenerator")
	public int getDishGroupId() {
		return dishGroupId;
	} 
	public void setDishGroupId(int dishGroupId) {
		this.dishGroupId = dishGroupId;
	}

	@Column(name="R1GRP001")
	public String getDishGroupCode() {
		return dishGroupCode;
	}

	public void setDishGroupCode(String dishGroupCode) {
		this.dishGroupCode = dishGroupCode;
	}

	@Column(name = "R1GRP002_01")
	public String getDishGroupDescription() {
		return dishGroupDescription;
	}

	public void setDishGroupDescription(String dishGroupDescription) {
		this.dishGroupDescription = dishGroupDescription;
	}

	@Column(name = "R1GRP003")
	public int getivaType() {
		return ivaType;
	}

	public void setivaType(int ivaType) {
		this.ivaType = ivaType;
	}

	@Column(name = "R1GRP004")
	public String getsalesLedgerAccount() {
		return salesLedgerAccount;
	}

	public void setsalesLedgerAccount(String salesLedgerAccount) {
		this.salesLedgerAccount = salesLedgerAccount;
	}

	@Column(name = "R1GRP112")
	public String gettypeIncome() {
		return typeIncome;
	}

	public void settypeIncome(String typeIncome) {
		this.typeIncome = typeIncome;
	}

	@Column(name = "R1GRP011")
	public int getmacroGroup() {
		return macroGroup;
	}

	public void setmacroGroup(int macroGroup) {
		this.macroGroup = macroGroup;
	}

}

/*
-- -----------------------------------------------------
-- Table `ayx14res`.`Res14grp`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14grp` ;
CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14grp` (
  `R1GRP000` INT NOT NULL AUTO_INCREMENT,
  `R1GRP001` VARCHAR(4) NOT NULL,
  `R1GRP002_01` VARCHAR(30) NOT NULL,
  `R1GRP003` SMALLINT NULL DEFAULT 1,
  `R1GRP004` VARCHAR(8) NOT NULL,
  `R1GRP112` VARCHAR(3) NOT NULL,
  `R1GRP011` SMALLINT NOT NULL DEFAULT 1,
  `Res14grpcol` VARCHAR(45) NULL,
  PRIMARY KEY (`R1GRP000`),
  UNIQUE INDEX `R1GRP001_UNIQUE` (`R1GRP001` ASC))
ENGINE = InnoDB;
*/