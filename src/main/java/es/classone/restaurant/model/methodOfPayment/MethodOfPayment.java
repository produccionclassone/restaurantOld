package es.classone.restaurant.model.methodOfPayment;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cnt_FP")
public class MethodOfPayment {
	private Long RFCNT300;// PK
	private String RFCNT301; // PK Codigo Forma Pago
	private String RFCNT002; // Nombre FP
	private String RFCNT003; // Cta Contable
	private int RFCNT004; // Tipo de Cobro
	/* 0=Efectivo 1=Credito 2=Invitacion 3=Anulado 4=Cobrado por Hotel */
	private float RFCNT005; // %
	private String RFCNT006; // Cta Contable TC
	private String RFCNT007; // Cta Contable Dcto.TC
	private char RFCNT008; // TPV Virtual ("*" o "+" o " ")

	public MethodOfPayment() {

	}

	public MethodOfPayment(Long rFCNT300, String rFCNT301, String rFCNT002,
			String rFCNT003, int rFCNT004, float rFCNT005, String rFCNT006,
			String rFCNT007, char rFCNT008) {
		RFCNT300 = rFCNT300;
		RFCNT301 = rFCNT301;
		RFCNT002 = rFCNT002;
		RFCNT003 = rFCNT003;
		RFCNT004 = rFCNT004;
		RFCNT005 = rFCNT005;
		RFCNT006 = rFCNT006;
		RFCNT007 = rFCNT007;
		RFCNT008 = rFCNT008;
	}

	@SequenceGenerator( // It only takes effect for
	name = "MethodOfPaymentIdGenerator", // databases providing identifier
	sequenceName = "MethodOfPaymentSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MethodOfPaymentIdGenerator")
	public Long getRFCNT300() {
		return RFCNT300;
	}

	public void setRFCNT300(Long rFCNT300) {
		RFCNT300 = rFCNT300;
	}

	public String getRFCNT301() {
		return RFCNT301;
	}

	public void setRFCNT301(String rFCNT301) {
		RFCNT301 = rFCNT301;
	}

	public String getRFCNT002() {
		return RFCNT002;
	}

	public void setRFCNT002(String rFCNT002) {
		RFCNT002 = rFCNT002;
	}

	public String getRFCNT003() {
		return RFCNT003;
	}

	public void setRFCNT003(String rFCNT003) {
		RFCNT003 = rFCNT003;
	}

	public int getRFCNT004() {
		return RFCNT004;
	}

	public void setRFCNT004(int rFCNT004) {
		RFCNT004 = rFCNT004;
	}

	public float getRFCNT005() {
		return RFCNT005;
	}

	public void setRFCNT005(float rFCNT005) {
		RFCNT005 = rFCNT005;
	}

	public String getRFCNT006() {
		return RFCNT006;
	}

	public void setRFCNT006(String rFCNT006) {
		RFCNT006 = rFCNT006;
	}

	public String getRFCNT007() {
		return RFCNT007;
	}

	public void setRFCNT007(String rFCNT007) {
		RFCNT007 = rFCNT007;
	}

	public char getRFCNT008() {
		return RFCNT008;
	}

	public void setRFCNT008(char rFCNT008) {
		RFCNT008 = rFCNT008;
	}

}
