package es.classone.restaurant.model.dishCategoryStatMonths;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14grp_E2")
public class DishCategoryStatMonths {

	private Long R1GRP001_K2;// PK
	private int R1GRP993;// 1=Actual, 2=Anterior y 3=Ante-Anterior
	private int R1GRP994;// 31 Dias (01->31)
	private float R1GRP007;// Unidades Vendidas x Dia
	private float R1GRP008;// Importe Total de Ventas x Dia

	public DishCategoryStatMonths() {

	}

	public DishCategoryStatMonths(Long r1grp001_K2, int r1grp993, int r1grp994,
			float r1grp007, float r1grp008) {

		R1GRP001_K2 = r1grp001_K2;
		R1GRP993 = r1grp993;
		R1GRP994 = r1grp994;
		R1GRP007 = r1grp007;
		R1GRP008 = r1grp008;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishCategoryStatMonthsIdGenerator", // databases providing
												// identifier
	sequenceName = "DishCategoryStatMonthsSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishCategoryStatMonthsIdGenerator")
	public Long getR1GRP001_K2() {
		return R1GRP001_K2;
	}

	public void setR1GRP001_K2(Long r1grp001_K2) {
		R1GRP001_K2 = r1grp001_K2;
	}

	public int getR1GRP993() {
		return R1GRP993;
	}

	public void setR1GRP993(int r1grp993) {
		R1GRP993 = r1grp993;
	}

	public int getR1GRP994() {
		return R1GRP994;
	}

	public void setR1GRP994(int r1grp994) {
		R1GRP994 = r1grp994;
	}

	public float getR1GRP007() {
		return R1GRP007;
	}

	public void setR1GRP007(float r1grp007) {
		R1GRP007 = r1grp007;
	}

	public float getR1GRP008() {
		return R1GRP008;
	}

	public void setR1GRP008(float r1grp008) {
		R1GRP008 = r1grp008;
	}

}
