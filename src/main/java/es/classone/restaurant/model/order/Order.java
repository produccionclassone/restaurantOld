package es.classone.restaurant.model.order;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.command.Command;
import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.qualifier.Qualifier;

@Entity
@Table(name = "Res14mes_2")
public class Order {

	private Long orderId;// R1MES000_2
	private float numberOfUnits;// R2MES032
	private float unitPrice;// R2MES033
	private boolean charged;// R2MES034
	private int ivaType;// R2MES036
	private String salesAccount; // R2MES037
	private char valueOne;// R2MES039
	private int printer; // R2MES701
	private boolean modified; // R2MES702
	private boolean printed;// R2MES703
	private String incomeType; // R2MES704
	private float enableUnits;// R2MES732
	private Dish dish;// Res14pla_R1PLA001
	private Dish sideDish;// Res14pla_R1PLA0011
	private Command command;// Res14mes_1_R1MES000_1
	private Set<Qualifier> qualifiers = new HashSet<Qualifier>(); // Res14cnt_CF_RCCNTR00

	public Order(float numberOfUnits, float unitPrice, boolean charged,
			int ivaType, String salesAccount, char valueOne, int printer,
			boolean modified, boolean printed, String incomeType,
			float enableUnits) {
		this.numberOfUnits = numberOfUnits;
		this.unitPrice = unitPrice;
		this.charged = charged;
		this.ivaType = ivaType;
		this.salesAccount = salesAccount;
		this.valueOne = valueOne;
		this.printer = printer;
		this.modified = modified;
		this.printed = printed;
		this.incomeType = incomeType;
		this.enableUnits = enableUnits;
	}

	@Column(name = "R1MES000_2")
	@SequenceGenerator( // It only takes effect for
	name = "OrderIdGenerator", // databases providing identifier
	sequenceName = "OrderSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "OrderIdGenerator")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Column(name = "R1MES032")
	public float getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(float numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Column(name = "R1MES033")
	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Column(name = "R1MES034")
	public boolean isCharged() {
		return charged;
	}

	public void setCharged(boolean charged) {
		this.charged = charged;
	}

	@Column(name = "R1MES036")
	public int getIvaType() {
		return ivaType;
	}

	public void setIvaType(int ivaType) {
		this.ivaType = ivaType;
	}

	@Column(name = "R1MES037")
	public String getSalesAccount() {
		return salesAccount;
	}

	public void setSalesAccount(String salesAccount) {
		this.salesAccount = salesAccount;
	}

	@Column(name = "R1MES039")
	public char getValueOne() {
		return valueOne;
	}

	public void setValueOne(char valueOne) {
		this.valueOne = valueOne;
	}

	@Column(name = "R2MES701")
	public int getPrinter() {
		return printer;
	}

	public void setPrinter(int printer) {
		this.printer = printer;
	}

	@Column(name = "R2MES702")
	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

	@Column(name = "R2MES703")
	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}

	@Column(name = "R2MES704")
	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	@Column(name = "R2MES732")
	public float getEnableUnits() {
		return enableUnits;
	}

	public void setEnableUnits(float enableUnits) {
		this.enableUnits = enableUnits;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "R1PLA001")
	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "R1PLA001")
	public Dish getSideDish() {
		return sideDish;
	}

	public void setSideDish(Dish sideDish) {
		this.sideDish = sideDish;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "R1MES000_1")
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Res14mes_2CF", joinColumns = @JoinColumn(name = "R1MES000_2"), inverseJoinColumns = @JoinColumn(name = "RCCNTR00"))
	public Set<Qualifier> getQualifiers() {
		return qualifiers;
	}

	public void setQualifiers(Set<Qualifier> qualifiers) {
		this.qualifiers = qualifiers;
	}

}
// CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes_2` (
// `R1MES000_2` BIGINT NOT NULL AUTO_INCREMENT,
// `R2MES032` DECIMAL(9,2) NOT NULL,
// `R2MES033` DECIMAL(9,2) NOT NULL,
// `R2MES034` TINYINT(1) NOT NULL,
// `R2MES036` CHAR NOT NULL,
// `R2MES037` VARCHAR(8) NOT NULL,
// `R2MES039` CHAR NULL,
// `R2MES701` CHAR NULL,
// `R2MES702` CHAR NULL,
// `R2MES703` CHAR NULL,
// `R2MES704` VARCHAR(3) NULL,
// `R2MES732` DECIMAL(9,2) NULL,
// `Res14pla_R1PLA001` INT NOT NULL,
// `Res14pla_R1PLA0011` INT NULL,
// `Res14mes_1_R1MES000_1` INT NOT NULL,
// `Res14cnt_CF_RCCNTR00` INT NOT NULL,
// PRIMARY KEY (`R1MES000_2`),
// CONSTRAINT `fk_Res14mes_2_Res14pla1`
// FOREIGN KEY (`Res14pla_R1PLA001`)
// REFERENCES `ayx14res`.`Res14pla` (`R1PLA001`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_2_Res14pla2`
// FOREIGN KEY (`Res14pla_R1PLA0011`)
// REFERENCES `ayx14res`.`Res14pla` (`R1PLA001`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_2_Res14mes_11`
// FOREIGN KEY (`Res14mes_1_R1MES000_1`)
// REFERENCES `ayx14res`.`Res14mes_1` (`R1MES000_1`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION,
// CONSTRAINT `fk_Res14mes_2_Res14cnt_CF1`
// FOREIGN KEY (`Res14cnt_CF_RCCNTR00`)
// REFERENCES `ayx14res`.`Res14cnt_CF` (`RCCNTR00`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION)
// ENGINE = InnoDB;

