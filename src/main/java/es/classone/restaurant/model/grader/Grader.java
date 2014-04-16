package es.classone.restaurant.model.grader;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cnt_CF")
public class Grader {

	private String RCCNTR00; // PK
	private String RCCNTR01; // Codigo Calificador
	private String RCCNT002_01; // Nombre Calificador Idioma 1
	private String RCCNT002_02; // Nombre Calificador Idioma 2
	private String RCCNT002_03; // Nombre Calificador Idioma 3

	public Grader() {

	}

	public Grader(String rCCNTR00, String rCCNTR01, String rCCNT002_01,
			String rCCNT002_02, String rCCNT002_03) {
		RCCNTR00 = rCCNTR00;
		RCCNTR01 = rCCNTR01;
		RCCNT002_01 = rCCNT002_01;
		RCCNT002_02 = rCCNT002_02;
		RCCNT002_03 = rCCNT002_03;
	}

	@SequenceGenerator( // It only takes effect for
	name = "GraderIdGenerator", // databases providing identifier
	sequenceName = "GraderSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "GraderIdGenerator")
	public String getRCCNTR00() {
		return RCCNTR00;
	}

	public void setRCCNTR00(String rCCNTR00) {
		RCCNTR00 = rCCNTR00;
	}

	public String getRCCNTR01() {
		return RCCNTR01;
	}

	public void setRCCNTR01(String rCCNTR01) {
		RCCNTR01 = rCCNTR01;
	}

	public String getRCCNT002_01() {
		return RCCNT002_01;
	}

	public void setRCCNT002_01(String rCCNT002_01) {
		RCCNT002_01 = rCCNT002_01;
	}

	public String getRCCNT002_02() {
		return RCCNT002_02;
	}

	public void setRCCNT002_02(String rCCNT002_02) {
		RCCNT002_02 = rCCNT002_02;
	}

	public String getRCCNT002_03() {
		return RCCNT002_03;
	}

	public void setRCCNT002_03(String rCCNT002_03) {
		RCCNT002_03 = rCCNT002_03;
	}
}
