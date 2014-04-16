package es.classone.restaurant.model.dishCategoryStatYears;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14grp_E1 ")
public class DishCategoryStatYears {
	private Long R1GRP001_K1;// PK
	private int R1GRP991;// 1=Actual, 2=Anterior y 3=Ante-Anterior
	private int R1GRP992;// 12 Meses (01->12)
	private float R1GRP005;// Unidades Vendidas x Mes
	private float R1GRP006;// Importe Total de Ventas x Mes

	public DishCategoryStatYears() {

	}

	public DishCategoryStatYears(Long r1grp001_K1, int r1grp991, int r1grp992,
			float r1grp005, float r1grp006) {
		R1GRP001_K1 = r1grp001_K1;
		R1GRP991 = r1grp991;
		R1GRP992 = r1grp992;
		R1GRP005 = r1grp005;
		R1GRP006 = r1grp006;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishCategoryStatYearsIdGenerator", // databases providing identifier
	sequenceName = "DishCategoryStatYearsSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishCategoryStatYearsIdGenerator")
	public Long getR1GRP001_K1() {
		return R1GRP001_K1;
	}

	public void setR1GRP001_K1(Long r1grp001_K1) {
		R1GRP001_K1 = r1grp001_K1;
	}

	public int getR1GRP991() {
		return R1GRP991;
	}

	public void setR1GRP991(int r1grp991) {
		R1GRP991 = r1grp991;
	}

	public int getR1GRP992() {
		return R1GRP992;
	}

	public void setR1GRP992(int r1grp992) {
		R1GRP992 = r1grp992;
	}

	public float getR1GRP005() {
		return R1GRP005;
	}

	public void setR1GRP005(float r1grp005) {
		R1GRP005 = r1grp005;
	}

	public float getR1GRP006() {
		return R1GRP006;
	}

	public void setR1GRP006(float r1grp006) {
		R1GRP006 = r1grp006;
	}

}
