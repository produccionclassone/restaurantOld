package es.classone.restaurant.model.dishGroup;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res13grp")
public class DishGroup {

	private Long dishGroupId; // R1GRP001
	private String dishGroupDescription_ESP; // R1GRP002_01
	private String dishGroupDescription_ENG; // R1GRP002_02
	private String dishGroupDescription_ITA; // R1GRP002_03
	private int	dishGroupIVAType; //R1GRP003 Tipo de IVA (1,2 or 3)
	private String dishGroupSalesLedgerAccount; //R1GRP004
	private String dishGroupTypeIncome; //R1GRP112
	private int dishGroupMacroGroup; //R1GRP011 1= Comida 2= Bebida 3= Otros
	
	public DishGroup() {

	}

	public DishGroup(Long id, String description_ESP, String description_ENG,
			String description_ITA, int ivaType, String salesLedgerAccount, String typeIncome, int macroGroup) {
		dishGroupId = id;
		dishGroupDescription_ESP = description_ESP;
		dishGroupDescription_ENG = description_ENG;
		dishGroupDescription_ITA = description_ITA;
		dishGroupIVAType = ivaType;
		dishGroupSalesLedgerAccount = salesLedgerAccount;
		dishGroupTypeIncome = typeIncome;
		dishGroupMacroGroup = macroGroup;
	}

	@SequenceGenerator( // It only takes effect for
			name = "DishCategoryIdGenerator", // databases providing identifier
			sequenceName = "DishCategorySeq")
			// generators.
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishCategoryIdGenerator")
	public Long getDishGroupId() {
		return dishGroupId;
	}

	public void setDishGroupId(Long dishGroupId) {
		this.dishGroupId = dishGroupId;
	}

	public String getDishGroupDescription_ESP() {
		return dishGroupDescription_ESP;
	}

	public void setDishGroupDescription_ESP(String dishGroupDescription_ESP) {
		this.dishGroupDescription_ESP = dishGroupDescription_ESP;
	}

	public String getDishGroupDescription_ENG() {
		return dishGroupDescription_ENG;
	}

	public void setDishGroupDescription_ENG(String dishGroupDescription_ENG) {
		this.dishGroupDescription_ENG = dishGroupDescription_ENG;
	}

	public String getDishGroupDescription_ITA() {
		return dishGroupDescription_ITA;
	}

	public void setDishGroupDescription_ITA(String dishGroupDescription_ITA) {
		this.dishGroupDescription_ITA = dishGroupDescription_ITA;
	}

	public int getDishGroupIVAType() {
		return dishGroupIVAType;
	}

	public void setDishGroupIVAType(int dishGroupIVAType) {
		this.dishGroupIVAType = dishGroupIVAType;
	}

	public String getDishGroupSalesLedgerAccount() {
		return dishGroupSalesLedgerAccount;
	}

	public void setDishGroupSalesLedgerAccount(String dishGroupSalesLedgerAccount) {
		this.dishGroupSalesLedgerAccount = dishGroupSalesLedgerAccount;
	}

	public String getDishGroupTypeIncome() {
		return dishGroupTypeIncome;
	}

	public void setDishGroupTypeIncome(String dishGroupTypeIncome) {
		this.dishGroupTypeIncome = dishGroupTypeIncome;
	}

	public int getDishGroupMacroGroup() {
		return dishGroupMacroGroup;
	}

	public void setDishGroupMacroGroup(int dishGroupMacroGroup) {
		this.dishGroupMacroGroup = dishGroupMacroGroup;
	}

	
	

	
	}
