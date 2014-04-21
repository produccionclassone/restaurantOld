package es.classone.restaurant.model.tableStatus;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14tab")
public class TableStatus {

	private Long R1TAB001;// PK Codigo Mesa
	private char R1TAB002;// S/N Ocupada
	private char R1TAB003;// S/N Unida
	private char R1TAB004;// S/N Reservada
	private char R1TAB005;// S/N Facturada
	private float R1TAB006;// Nro de Orden

	public TableStatus() {

	}

	public TableStatus(Long r1tab001, char r1tab002, char r1tab003,
			char r1tab004, char r1tab005, float r1tab006) {
		R1TAB001 = r1tab001;
		R1TAB002 = r1tab002;
		R1TAB003 = r1tab003;
		R1TAB004 = r1tab004;
		R1TAB005 = r1tab005;
		R1TAB006 = r1tab006;
	}

	@SequenceGenerator( // It only takes effect for
	name = "TableStatusIdGenerator", // databases providing identifier
	sequenceName = "TableStatusSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "TableStatusIdGenerator")
	public Long getR1TAB001() {
		return R1TAB001;
	}

	public void setR1TAB001(Long r1tab001) {
		R1TAB001 = r1tab001;
	}

	public char getR1TAB002() {
		return R1TAB002;
	}

	public void setR1TAB002(char r1tab002) {
		R1TAB002 = r1tab002;
	}

	public char getR1TAB003() {
		return R1TAB003;
	}

	public void setR1TAB003(char r1tab003) {
		R1TAB003 = r1tab003;
	}

	public char getR1TAB004() {
		return R1TAB004;
	}

	public void setR1TAB004(char r1tab004) {
		R1TAB004 = r1tab004;
	}

	public char getR1TAB005() {
		return R1TAB005;
	}

	public void setR1TAB005(char r1tab005) {
		R1TAB005 = r1tab005;
	}

	public float getR1TAB006() {
		return R1TAB006;
	}

	public void setR1TAB006(float r1tab006) {
		R1TAB006 = r1tab006;
	}

}
