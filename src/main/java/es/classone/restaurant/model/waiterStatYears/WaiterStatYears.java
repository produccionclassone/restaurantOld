package es.classone.restaurant.model.waiterStatYears;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cam_E1")
public class WaiterStatYears {

	private Long R1CAM001_K1;// PK
	private int R1CAM991;// 1=Actual, 2=Anterior y 3=Ante-Anterior
	private int R1CAM992;// 12 Meses (01->12)
	private float R1CAM021;// Euros Coste x Mes
	private float R1CAM022;// Euros Venta x Mes

	public WaiterStatYears() {

	}

	public WaiterStatYears(Long r1cam001_K1, int r1cam991, int r1cam992,
			float r1cam021, float r1cam022) {
		R1CAM001_K1 = r1cam001_K1;
		R1CAM991 = r1cam991;
		R1CAM992 = r1cam992;
		R1CAM021 = r1cam021;
		R1CAM022 = r1cam022;
	}

	@SequenceGenerator( // It only takes effect for
	name = "WaiterStatYearsIdGenerator", // databases providing identifier
	sequenceName = "WaiterStatYearsSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "WaiterStatYearsIdGenerator")
	public Long getR1CAM001_K1() {
		return R1CAM001_K1;
	}

	public void setR1CAM001_K1(Long r1cam001_K1) {
		R1CAM001_K1 = r1cam001_K1;
	}

	public int getR1CAM991() {
		return R1CAM991;
	}

	public void setR1CAM991(int r1cam991) {
		R1CAM991 = r1cam991;
	}

	public int getR1CAM992() {
		return R1CAM992;
	}

	public void setR1CAM992(int r1cam992) {
		R1CAM992 = r1cam992;
	}

	public float getR1CAM021() {
		return R1CAM021;
	}

	public void setR1CAM021(float r1cam021) {
		R1CAM021 = r1cam021;
	}

	public float getR1CAM022() {
		return R1CAM022;
	}

	public void setR1CAM022(float r1cam022) {
		R1CAM022 = r1cam022;
	}

}
