package es.classone.restaurant.model.dish;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import es.classone.restaurant.model.dishGroup.DishGroup;


@Table(name = "Res14pla")
public class Dish {

	private Long dishId; //R1PLA001
	private String dishDescription_ESP; //R1PLA002_01
	private String dishDescription_ENG; //R1PLA002_02;
	private String dishDescription_ITA; //R1PLA002_03;
	//private DishGroup dishGroup; //R1PLA003 Grupo de Plato /* PK Foranea = R1GRP001 */
	private int dishPrint; //R1PLA004 Impresora (1 a 5)
	private int dishListPrice; //R1PLA005 Lista de Precios (0 a 9)
	private int dishPVP; //R1PLA006
	private int dishCostPrice; //R1PLA007
	private char dishR1PLA008;// P=Plato // K=Kilo
	private boolean dishDiscount; //R1PLA009;
	private char R1PLA021;// S/N Eliminar Restaurante
	private char R1PLA022;// S/N Pendiente

	public Dish() {

	}

	public Dish(Long id, String description_ESP, String description_ENG,
			String description_ITA, /*DishGroup dishGroup,*/ int print, int listPrice,
			int pvp, int costPrice, char r1pla008, boolean discount,
			char r1pla021, char r1pla022) {
		dishId = id;
		dishDescription_ESP = description_ESP;
		dishDescription_ENG = description_ENG;
		dishDescription_ITA = description_ITA;
		//this.dishGroup = dishGroup;
		dishPrint = print;
		dishListPrice = listPrice;
		dishPVP = pvp;
		dishCostPrice = costPrice;
		dishR1PLA008 = r1pla008;
		dishDiscount = discount;
		R1PLA021 = r1pla021;
		R1PLA022 = r1pla022;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishIdGenerator", // databases providing identifier
	sequenceName = "DishSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishGenerator")
	public Long getDishId() {
		return dishId;
	}

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	public String getDishDescription_ESP() {
		return dishDescription_ESP;
	}

	public void setDishDescription_ESP(String dishDescription_ESP) {
		this.dishDescription_ESP = dishDescription_ESP;
	}

	public String getDishDescription_ENG() {
		return dishDescription_ENG;
	}

	public void setDishDescription_ENG(String dishDescription_ENG) {
		this.dishDescription_ENG = dishDescription_ENG;
	}

	public String getDishDescription_ITA() {
		return dishDescription_ITA;
	}

	public void setDishDescription_ITA(String dishDescription_ITA) {
		this.dishDescription_ITA = dishDescription_ITA;
	}
/*
	public DishGroup getDishGroup() {
		return dishGroup;
	}

	public void setDishGroup(DishGroup dishGroup) {
		this.dishGroup = dishGroup;
	}
*/
	public int getDishPrint() {
		return dishPrint;
	}

	public void setDishPrint(int dishPrint) {
		this.dishPrint = dishPrint;
	}

	public int getDishListPrice() {
		return dishListPrice;
	}

	public void setDishListPrice(int dishListPrice) {
		this.dishListPrice = dishListPrice;
	}

	public int getDishPVP() {
		return dishPVP;
	}

	public void setDishPVP(int dishPVP) {
		this.dishPVP = dishPVP;
	}

	public int getDishCostPrice() {
		return dishCostPrice;
	}

	public void setDishCostPrice(int dishCostPrice) {
		this.dishCostPrice = dishCostPrice;
	}

	public char getDishR1PLA008() {
		return dishR1PLA008;
	}

	public void setDishR1PLA008(char dishR1PLA008) {
		this.dishR1PLA008 = dishR1PLA008;
	}

	public boolean isDishDiscount() {
		return dishDiscount;
	}

	public void setDishDiscount(boolean dishDiscount) {
		this.dishDiscount = dishDiscount;
	}

	public char getR1PLA021() {
		return R1PLA021;
	}

	public void setR1PLA021(char r1pla021) {
		R1PLA021 = r1pla021;
	}

	public char getR1PLA022() {
		return R1PLA022;
	}

	public void setR1PLA022(char r1pla022) {
		R1PLA022 = r1pla022;
	}	
	
}
