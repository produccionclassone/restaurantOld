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

	private int dishGroupId; // R1GRP001
	private String dishGroupDescription; // R1GRP002_01
	private int ivaType; // R1GRP003 Tipo de IVA (1,2 or 3)
	private String salesLedgerAccount; // R1GRP004
	private String typeIncome; // R1GRP112
	private int macroGroup; // R1GRP011 1= Comida 2= Bebida 3= Otros

	public DishGroup() {

	}

	public DishGroup(String description, int ivaType,
			String salesLedgerAccount, String typeIncome, int macroGroup) {
		this.dishGroupDescription = description;
		this.ivaType = ivaType;
		this.salesLedgerAccount = salesLedgerAccount;
		this.typeIncome = typeIncome;
		this.macroGroup = macroGroup;
	}

	@Column(name = "R1GRP001")
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

	public void setsalesLedgerAccount(
			String salesLedgerAccount) {
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
