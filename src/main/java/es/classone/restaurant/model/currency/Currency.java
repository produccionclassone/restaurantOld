package es.classone.restaurant.model.currency;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14cnt_MD")
public class Currency {

	private Long RMCNTR00;// PK
	private String RMCNTR01; // Codigo Moneda
	private String RMCNT002; // Nombre Moneda
	private int RMCNT003; // Cambio x
	private float RMCNT004; // Cotizacion
	private float RMCNT005; // % de Comision
	public Currency() {
	}
	
	public Currency(Long rMCNTR00, String rMCNTR01, String rMCNT002,
			int rMCNT003, float rMCNT004, float rMCNT005) {
		RMCNTR00 = rMCNTR00;
		RMCNTR01 = rMCNTR01;
		RMCNT002 = rMCNT002;
		RMCNT003 = rMCNT003;
		RMCNT004 = rMCNT004;
		RMCNT005 = rMCNT005;
	}

	@SequenceGenerator( // It only takes effect for
	name = "CurrencyIdGenerator", // databases providing identifier
	sequenceName = "CurrencySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CurrencyIdGenerator")
	public Long getRMCNTR00() {
		return RMCNTR00;
	}

	public void setRMCNTR00(Long rMCNTR00) {
		RMCNTR00 = rMCNTR00;
	}

	public String getRMCNTR01() {
		return RMCNTR01;
	}

	public void setRMCNTR01(String rMCNTR01) {
		RMCNTR01 = rMCNTR01;
	}

	public String getRMCNT002() {
		return RMCNT002;
	}

	public void setRMCNT002(String rMCNT002) {
		RMCNT002 = rMCNT002;
	}

	public int getRMCNT003() {
		return RMCNT003;
	}

	public void setRMCNT003(int rMCNT003) {
		RMCNT003 = rMCNT003;
	}

	public float getRMCNT004() {
		return RMCNT004;
	}

	public void setRMCNT004(float rMCNT004) {
		RMCNT004 = rMCNT004;
	}

	public float getRMCNT005() {
		return RMCNT005;
	}

	public void setRMCNT005(float rMCNT005) {
		RMCNT005 = rMCNT005;
	}

}
