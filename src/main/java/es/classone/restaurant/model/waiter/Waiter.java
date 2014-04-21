package es.classone.restaurant.model.waiter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cam")
public class Waiter {

	private Long R1CAM001;// PK Codigo de Camarero
	private String R1CAM002;// Nombre del Camarero
	private String R1CAM003;// DirecciÃ³n del Camarero
	private String R1CAM004;// Codigo Postal
	private String R1CAM005;// PoblaciÃ³n
	private String R1CAM006;// Provincia
	private String R1CAM007;// DNI - Identify
	private String R1CAM008;// Telefono contacto
	private String R1CAM009;// Persona Contacto
	private String R1CAM010_01;// Varios .1.
	private String R1CAM010_02;// Varios .2.
	private String R1CAM010_03;// Varios .3.
	private char R1CAM011;// Tipo de Cobro

	public Waiter() {

	}

	public Waiter(Long r1cam001, String r1cam002, String r1cam003,
			String r1cam004, String r1cam005, String r1cam006, String r1cam007,
			String r1cam008, String r1cam009, String r1cam010_01,
			String r1cam010_02, String r1cam010_03, char r1cam011) {

		R1CAM001 = r1cam001;
		R1CAM002 = r1cam002;
		R1CAM003 = r1cam003;
		R1CAM004 = r1cam004;
		R1CAM005 = r1cam005;
		R1CAM006 = r1cam006;
		R1CAM007 = r1cam007;
		R1CAM008 = r1cam008;
		R1CAM009 = r1cam009;
		R1CAM010_01 = r1cam010_01;
		R1CAM010_02 = r1cam010_02;
		R1CAM010_03 = r1cam010_03;
		R1CAM011 = r1cam011;
	}

	@SequenceGenerator( // It only takes effect for
	name = "WaiterIdGenerator", // databases providing identifier
	sequenceName = "WaiterSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "WaiterIdGenerator")
	public Long getR1CAM001() {
		return R1CAM001;
	}

	public void setR1CAM001(Long r1cam001) {
		R1CAM001 = r1cam001;
	}

	public String getR1CAM002() {
		return R1CAM002;
	}

	public void setR1CAM002(String r1cam002) {
		R1CAM002 = r1cam002;
	}

	public String getR1CAM003() {
		return R1CAM003;
	}

	public void setR1CAM003(String r1cam003) {
		R1CAM003 = r1cam003;
	}

	public String getR1CAM004() {
		return R1CAM004;
	}

	public void setR1CAM004(String r1cam004) {
		R1CAM004 = r1cam004;
	}

	public String getR1CAM005() {
		return R1CAM005;
	}

	public void setR1CAM005(String r1cam005) {
		R1CAM005 = r1cam005;
	}

	public String getR1CAM006() {
		return R1CAM006;
	}

	public void setR1CAM006(String r1cam006) {
		R1CAM006 = r1cam006;
	}

	public String getR1CAM007() {
		return R1CAM007;
	}

	public void setR1CAM007(String r1cam007) {
		R1CAM007 = r1cam007;
	}

	public String getR1CAM008() {
		return R1CAM008;
	}

	public void setR1CAM008(String r1cam008) {
		R1CAM008 = r1cam008;
	}

	public String getR1CAM009() {
		return R1CAM009;
	}

	public void setR1CAM009(String r1cam009) {
		R1CAM009 = r1cam009;
	}

	public String getR1CAM010_01() {
		return R1CAM010_01;
	}

	public void setR1CAM010_01(String r1cam010_01) {
		R1CAM010_01 = r1cam010_01;
	}

	public String getR1CAM010_02() {
		return R1CAM010_02;
	}

	public void setR1CAM010_02(String r1cam010_02) {
		R1CAM010_02 = r1cam010_02;
	}

	public String getR1CAM010_03() {
		return R1CAM010_03;
	}

	public void setR1CAM010_03(String r1cam010_03) {
		R1CAM010_03 = r1cam010_03;
	}

	public char getR1CAM011() {
		return R1CAM011;
	}

	public void setR1CAM011(char r1cam011) {
		R1CAM011 = r1cam011;
	}

}
