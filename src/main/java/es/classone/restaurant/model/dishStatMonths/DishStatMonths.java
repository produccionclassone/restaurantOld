package es.classone.restaurant.model.dishStatMonths;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14pla_E2")
public class DishStatMonths {

	private Long R1PLA001_K2;// PK
	private int R1PLA993;// 1=Actual, 2=Anterior y 3=Ante-Anterior
	private int R1PLA994; // 31 Dias (01->31)
	private float R1PLA013;// Unidades Vendidas x Dia
	private float R1PLA014;// Importe Total de Ventas x Dia

	public DishStatMonths() {

	}

	public DishStatMonths(Long r1pla001_K2, int r1pla993, int r1pla994,
			float r1pla013, float r1pla014) {
		R1PLA001_K2 = r1pla001_K2;
		R1PLA993 = r1pla993;
		R1PLA994 = r1pla994;
		R1PLA013 = r1pla013;
		R1PLA014 = r1pla014;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishStatMonthsIdGenerator", // databases providing identifier
	sequenceName = "DishStatMonthsSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishStatMonthsIdGenerator")
	public Long getR1PLA001_K2() {
		return R1PLA001_K2;
	}

	public void setR1PLA001_K2(Long r1pla001_K2) {
		R1PLA001_K2 = r1pla001_K2;
	}

	public int getR1PLA993() {
		return R1PLA993;
	}

	public void setR1PLA993(int r1pla993) {
		R1PLA993 = r1pla993;
	}

	public int getR1PLA994() {
		return R1PLA994;
	}

	public void setR1PLA994(int r1pla994) {
		R1PLA994 = r1pla994;
	}

	public float getR1PLA013() {
		return R1PLA013;
	}

	public void setR1PLA013(float r1pla013) {
		R1PLA013 = r1pla013;
	}

	public float getR1PLA014() {
		return R1PLA014;
	}

	public void setR1PLA014(float r1pla014) {
		R1PLA014 = r1pla014;
	}

}
