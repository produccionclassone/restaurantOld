package es.classone.restaurant.model.log;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14aud")
public class Log {

	private Long R1SCL001;// PK
	private String R1SCL002;// Codigo Incidencia o F.Status.
	private int R1SCL003;// Numero de Terminal.
	private Calendar R1SCL004;// Fecha Incidencia
	private Calendar R1SCL005;// Hora Incidencia
	private String R1SCL006;// Opcion Programa
	private int R1SCL007; // Impresora (1-5)
	private Calendar R1SCL008;// Fecha de Trabajo
	private int R1SCL009; // Clave de Acceso (Nro 1-9)
	private String R1SCL010;// Especificacion del Error
	// File Status. // Numero de Operacion. // Numero de Fichero.
	private String R1SCL011; // Nombre del Programa
	private String R1SCL012; // Nombre del Parrafo
	private String R1SCL013; // Comentario de la Incidencia
	private String R1SCL014; // IP que accede

	public Log() {

	}

	public Log(Long r1scl001, String r1scl002, int r1scl003, Calendar r1scl004,
			Calendar r1scl005, String r1scl006, int r1scl007,
			Calendar r1scl008, int r1scl009, String r1scl010, String r1scl011,
			String r1scl012, String r1scl013, String r1scl014) {
		R1SCL001 = r1scl001;
		R1SCL002 = r1scl002;
		R1SCL003 = r1scl003;
		R1SCL004 = r1scl004;
		R1SCL005 = r1scl005;
		R1SCL006 = r1scl006;
		R1SCL007 = r1scl007;
		R1SCL008 = r1scl008;
		R1SCL009 = r1scl009;
		R1SCL010 = r1scl010;
		R1SCL011 = r1scl011;
		R1SCL012 = r1scl012;
		R1SCL013 = r1scl013;
		R1SCL014 = r1scl014;
	}

	@SequenceGenerator( // It only takes effect for
	name = "LogIdGenerator", // databases providing identifier
	sequenceName = "LogSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "LogIdGenerator")
	public Long getR1SCL001() {
		return R1SCL001;
	}

	public String getR1SCL002() {
		return R1SCL002;
	}

	public int getR1SCL003() {
		return R1SCL003;
	}

	public Calendar getR1SCL004() {
		return R1SCL004;
	}

	public Calendar getR1SCL005() {
		return R1SCL005;
	}

	public String getR1SCL006() {
		return R1SCL006;
	}

	public int getR1SCL007() {
		return R1SCL007;
	}

	public Calendar getR1SCL008() {
		return R1SCL008;
	}

	public int getR1SCL009() {
		return R1SCL009;
	}

	public String getR1SCL010() {
		return R1SCL010;
	}

	public String getR1SCL011() {
		return R1SCL011;
	}

	public String getR1SCL012() {
		return R1SCL012;
	}

	public String getR1SCL013() {
		return R1SCL013;
	}

	public String getR1SCL014() {
		return R1SCL014;
	}

	public void setR1SCL001(Long r1scl001) {
		R1SCL001 = r1scl001;
	}

	public void setR1SCL002(String r1scl002) {
		R1SCL002 = r1scl002;
	}

	public void setR1SCL003(int r1scl003) {
		R1SCL003 = r1scl003;
	}

	public void setR1SCL004(Calendar r1scl004) {
		R1SCL004 = r1scl004;
	}

	public void setR1SCL005(Calendar r1scl005) {
		R1SCL005 = r1scl005;
	}

	public void setR1SCL006(String r1scl006) {
		R1SCL006 = r1scl006;
	}

	public void setR1SCL007(int r1scl007) {
		R1SCL007 = r1scl007;
	}

	public void setR1SCL008(Calendar r1scl008) {
		R1SCL008 = r1scl008;
	}

	public void setR1SCL009(int r1scl009) {
		R1SCL009 = r1scl009;
	}

	public void setR1SCL010(String r1scl010) {
		R1SCL010 = r1scl010;
	}

	public void setR1SCL011(String r1scl011) {
		R1SCL011 = r1scl011;
	}

	public void setR1SCL012(String r1scl012) {
		R1SCL012 = r1scl012;
	}

	public void setR1SCL013(String r1scl013) {
		R1SCL013 = r1scl013;
	}

	public void setR1SCL014(String r1scl014) {
		R1SCL014 = r1scl014;
	}
}
