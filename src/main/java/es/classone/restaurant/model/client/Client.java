package es.classone.restaurant.model.client;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cli")
public class Client {

	private Long R1CLI001;// PK Codigo Cliente
	private String R1CLI002;// Nombre
	private String R1CLI003;// Direccion
	private String R1CLI004;// Codigo Postal
	private String R1CLI005;// Poblacion
	private String R1CLI006;// Provincia
	private String R1CLI007;// DNI - Identify
	private String R1CLI008;// Telefono contacto
	private String R1CLI009;// Persona Contacto
	private String R1CLI010_01;// Varios .1.
	private String R1CLI010_02;// Varios .2.
	private String R1CLI010_03;// Varios .3.
	private int R1CLI011;// Limite de Credito
	private float R1CLI012;// Deuda ultima Actualizacion
	private Calendar R1CLI013;// Fecha de Alta/ultima Comida
	private float R1CLI014;// Importe consumido x l
	private float R1CLI015;// COMENSALES q comieron con l
	private float R1CLI016;// Veces que vino a COMER
	private String R1CLI017_01;// Observaciones .1.
	private String R1CLI017_02;// Observaciones .2.
	private String R1CLI017_03;// Observaciones .3.
	private String R1CLI017_04;// Observaciones .4.
	private String R1CLI20;// Cuenta Contable
	private char R1CLI202;// 7* "C" / "A" / "E"
	private String R1CLI203;// Codigo de "E" o "A"

	public Client() {

	}

	public Client(Long r1cli001, String r1cli002, String r1cli003,
			String r1cli004, String r1cli005, String r1cli006, String r1cli007,
			String r1cli008, String r1cli009, String r1cli010_01,
			String r1cli010_02, String r1cli010_03, int r1cli011,
			float r1cli012, Calendar r1cli013, float r1cli014, float r1cli015,
			float r1cli016, String r1cli017_01, String r1cli017_02,
			String r1cli017_03, String r1cli017_04, String r1cli20,
			char r1cli202, String r1cli203) {
		R1CLI001 = r1cli001;
		R1CLI002 = r1cli002;
		R1CLI003 = r1cli003;
		R1CLI004 = r1cli004;
		R1CLI005 = r1cli005;
		R1CLI006 = r1cli006;
		R1CLI007 = r1cli007;
		R1CLI008 = r1cli008;
		R1CLI009 = r1cli009;
		R1CLI010_01 = r1cli010_01;
		R1CLI010_02 = r1cli010_02;
		R1CLI010_03 = r1cli010_03;
		R1CLI011 = r1cli011;
		R1CLI012 = r1cli012;
		R1CLI013 = r1cli013;
		R1CLI014 = r1cli014;
		R1CLI015 = r1cli015;
		R1CLI016 = r1cli016;
		R1CLI017_01 = r1cli017_01;
		R1CLI017_02 = r1cli017_02;
		R1CLI017_03 = r1cli017_03;
		R1CLI017_04 = r1cli017_04;
		R1CLI20 = r1cli20;
		R1CLI202 = r1cli202;
		R1CLI203 = r1cli203;
	}

	@SequenceGenerator( // It only takes effect for
	name = "ClientIdGenerator", // databases providing identifier
	sequenceName = "ClientSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ClientIdGenerator")
	public Long getR1CLI001() {
		return R1CLI001;
	}

	public void setR1CLI001(Long r1cli001) {
		R1CLI001 = r1cli001;
	}

	public String getR1CLI002() {
		return R1CLI002;
	}

	public void setR1CLI002(String r1cli002) {
		R1CLI002 = r1cli002;
	}

	public String getR1CLI003() {
		return R1CLI003;
	}

	public void setR1CLI003(String r1cli003) {
		R1CLI003 = r1cli003;
	}

	public String getR1CLI004() {
		return R1CLI004;
	}

	public void setR1CLI004(String r1cli004) {
		R1CLI004 = r1cli004;
	}

	public String getR1CLI005() {
		return R1CLI005;
	}

	public void setR1CLI005(String r1cli005) {
		R1CLI005 = r1cli005;
	}

	public String getR1CLI006() {
		return R1CLI006;
	}

	public void setR1CLI006(String r1cli006) {
		R1CLI006 = r1cli006;
	}

	public String getR1CLI007() {
		return R1CLI007;
	}

	public void setR1CLI007(String r1cli007) {
		R1CLI007 = r1cli007;
	}

	public String getR1CLI008() {
		return R1CLI008;
	}

	public void setR1CLI008(String r1cli008) {
		R1CLI008 = r1cli008;
	}

	public String getR1CLI009() {
		return R1CLI009;
	}

	public void setR1CLI009(String r1cli009) {
		R1CLI009 = r1cli009;
	}

	public String getR1CLI010_01() {
		return R1CLI010_01;
	}

	public void setR1CLI010_01(String r1cli010_01) {
		R1CLI010_01 = r1cli010_01;
	}

	public String getR1CLI010_02() {
		return R1CLI010_02;
	}

	public void setR1CLI010_02(String r1cli010_02) {
		R1CLI010_02 = r1cli010_02;
	}

	public String getR1CLI010_03() {
		return R1CLI010_03;
	}

	public void setR1CLI010_03(String r1cli010_03) {
		R1CLI010_03 = r1cli010_03;
	}

	public int getR1CLI011() {
		return R1CLI011;
	}

	public void setR1CLI011(int r1cli011) {
		R1CLI011 = r1cli011;
	}

	public float getR1CLI012() {
		return R1CLI012;
	}

	public void setR1CLI012(float r1cli012) {
		R1CLI012 = r1cli012;
	}

	public Calendar getR1CLI013() {
		return R1CLI013;
	}

	public void setR1CLI013(Calendar r1cli013) {
		R1CLI013 = r1cli013;
	}

	public float getR1CLI014() {
		return R1CLI014;
	}

	public void setR1CLI014(float r1cli014) {
		R1CLI014 = r1cli014;
	}

	public float getR1CLI015() {
		return R1CLI015;
	}

	public void setR1CLI015(float r1cli015) {
		R1CLI015 = r1cli015;
	}

	public float getR1CLI016() {
		return R1CLI016;
	}

	public void setR1CLI016(float r1cli016) {
		R1CLI016 = r1cli016;
	}

	public String getR1CLI017_01() {
		return R1CLI017_01;
	}

	public void setR1CLI017_01(String r1cli017_01) {
		R1CLI017_01 = r1cli017_01;
	}

	public String getR1CLI017_02() {
		return R1CLI017_02;
	}

	public void setR1CLI017_02(String r1cli017_02) {
		R1CLI017_02 = r1cli017_02;
	}

	public String getR1CLI017_03() {
		return R1CLI017_03;
	}

	public void setR1CLI017_03(String r1cli017_03) {
		R1CLI017_03 = r1cli017_03;
	}

	public String getR1CLI017_04() {
		return R1CLI017_04;
	}

	public void setR1CLI017_04(String r1cli017_04) {
		R1CLI017_04 = r1cli017_04;
	}

	public String getR1CLI20() {
		return R1CLI20;
	}

	public void setR1CLI20(String r1cli20) {
		R1CLI20 = r1cli20;
	}

	public char getR1CLI202() {
		return R1CLI202;
	}

	public void setR1CLI202(char r1cli202) {
		R1CLI202 = r1cli202;
	}

	public String getR1CLI203() {
		return R1CLI203;
	}

	public void setR1CLI203(String r1cli203) {
		R1CLI203 = r1cli203;
	}

}
