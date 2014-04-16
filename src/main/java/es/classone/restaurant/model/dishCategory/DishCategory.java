package es.classone.restaurant.model.dishCategory;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res13grp")
public class DishCategory {

	private Long R1GRP001;// PK
	private String R1GRP002_01;// Descripcion Idioma .1.
	private String R1GRP002_02;// Descripcion Idioma .2.
	private String R1GRP002_03;// Descripcion Idioma .3.
	private int R1GRP003;// Tipo de IVA (1,2 Ã³ 3)
	private String R1GRP004;// Cta Contable Ventas
	private String R1GRP112;// Tipo de Ingreso CAD
	private int R1GRP011;// Macro-Grupo RestauraciÃ³n

	/* 1= Comida 2= Bebida 3= Otros */
	public DishCategory() {

	}

	public DishCategory(Long r1grp001, String r1grp002_01, String r1grp002_02,
			String r1grp002_03, int r1grp003, String r1grp004, String r1grp112,
			int r1grp011) {
		R1GRP001 = r1grp001;
		R1GRP002_01 = r1grp002_01;
		R1GRP002_02 = r1grp002_02;
		R1GRP002_03 = r1grp002_03;
		R1GRP003 = r1grp003;
		R1GRP004 = r1grp004;
		R1GRP112 = r1grp112;
		R1GRP011 = r1grp011;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishCategoryIdGenerator", // databases providing identifier
	sequenceName = "DishCategorySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishCategoryIdGenerator")
	public Long getR1GRP001() {
		return R1GRP001;
	}

	public String getR1GRP002_01() {
		return R1GRP002_01;
	}

	public String getR1GRP002_02() {
		return R1GRP002_02;
	}

	public String getR1GRP002_03() {
		return R1GRP002_03;
	}

	public int getR1GRP003() {
		return R1GRP003;
	}

	public String getR1GRP004() {
		return R1GRP004;
	}

	public String getR1GRP112() {
		return R1GRP112;
	}

	public int getR1GRP011() {
		return R1GRP011;
	}

	public void setR1GRP001(Long r1grp001) {
		R1GRP001 = r1grp001;
	}

	public void setR1GRP002_01(String r1grp002_01) {
		R1GRP002_01 = r1grp002_01;
	}

	public void setR1GRP002_02(String r1grp002_02) {
		R1GRP002_02 = r1grp002_02;
	}

	public void setR1GRP002_03(String r1grp002_03) {
		R1GRP002_03 = r1grp002_03;
	}

	public void setR1GRP003(int r1grp003) {
		R1GRP003 = r1grp003;
	}

	public void setR1GRP004(String r1grp004) {
		R1GRP004 = r1grp004;
	}

	public void setR1GRP112(String r1grp112) {
		R1GRP112 = r1grp112;
	}

	public void setR1GRP011(int r1grp011) {
		R1GRP011 = r1grp011;
	}

}
