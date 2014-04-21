package es.classone.restaurant.model.dishStatYears;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14pla_E1")
public class DishStatYears {
	private Long R1PLA001_K1;// PK
	private int R1PLA991; // 1=Actual, 2=Anterior y 3=Ante-Anterior
	private int R1PLA992;// 12 Meses (01->12)
	private float R1PLA011;// Unidades Vendidas x Mes
	private float R1PLA012; // Importe Total de Ventas x Mes

	public DishStatYears() {
	}

	public DishStatYears(Long r1pla001_K1, int r1pla991, int r1pla992,
			float r1pla011, float r1pla012) {
		R1PLA001_K1 = r1pla001_K1;
		R1PLA991 = r1pla991;
		R1PLA992 = r1pla992;
		R1PLA011 = r1pla011;
		R1PLA012 = r1pla012;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishStatYearsIdGenerator", // databases providing identifier
	sequenceName = "DishStatYearsSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishStatYearsIdGenerator")
	public Long getR1PLA001_K1() {
		return R1PLA001_K1;
	}

	public void setR1PLA001_K1(Long r1pla001_K1) {
		R1PLA001_K1 = r1pla001_K1;
	}

	public int getR1PLA991() {
		return R1PLA991;
	}

	public void setR1PLA991(int r1pla991) {
		R1PLA991 = r1pla991;
	}

	public int getR1PLA992() {
		return R1PLA992;
	}

	public void setR1PLA992(int r1pla992) {
		R1PLA992 = r1pla992;
	}

	public float getR1PLA011() {
		return R1PLA011;
	}

	public void setR1PLA011(float r1pla011) {
		R1PLA011 = r1pla011;
	}

	public float getR1PLA012() {
		return R1PLA012;
	}

	public void setR1PLA012(float r1pla012) {
		R1PLA012 = r1pla012;
	}

}
