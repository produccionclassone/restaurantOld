package es.classone.restaurant.model.dish;

import es.classone.restaurant.model.dishGroup.DishGroup;

public class DishHeader {

	private int dishId;
	private String dishCode; // R1PLA001
	private String dishDescriptionLang1; // R1PLA002_01
	private double dishPVP; // R1PLA006	
	private double dishCostPrice; // R1PLA007
	private DishGroup dishGroup; // Res14grp_R1GRP000
	
	
	public DishHeader(int dishId, String dishCode, String dishDescriptionLang1,
			double dishPVP, double dishCostPrice, DishGroup dishGroup) {

		this.dishId=dishId;
		this.dishCode = dishCode;
		this.dishDescriptionLang1 = dishDescriptionLang1;
		this.dishPVP = dishPVP;
		this.dishCostPrice = dishCostPrice;
		this.dishGroup = dishGroup;
	}



	public int getDishId() {
		return dishId;
	}


	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	
	
	public String getDishCode() {
		return dishCode;
	}


	public void setDishCode(String dishCode) {
		this.dishCode = dishCode;
	}


	public String getDishDescriptionLang1() {
		return dishDescriptionLang1;
	}


	public void setDishDescriptionLang1(String dishDescriptionLang1) {
		this.dishDescriptionLang1 = dishDescriptionLang1;
	}


	public double getDishPVP() {
		return dishPVP;
	}


	public void setDishPVP(double dishPVP) {
		this.dishPVP = dishPVP;
	}


	public double getDishCostPrice() {
		return dishCostPrice;
	}


	public void setDishCostPrice(double dishCostPrice) {
		this.dishCostPrice = dishCostPrice;
	}


	public DishGroup getDishGroup() {
		return dishGroup;
	}


	public void setDishGroup(DishGroup dishGroup) {
		this.dishGroup = dishGroup;
	}


	
	
}
