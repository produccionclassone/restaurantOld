package es.classone.restaurant.model.dish;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14pla")
public class Dish {

	private Long R1PLA001;// PK Codigo del Plato NUMERIC
	private String R1PLA002_01;// Descripcion Idioma .1.
	private String R1PLA002_02;// Descripcion Idioma .2.
	private String R1PLA002_03;// Descripcion Idioma .3.
	/* PK Foranea = R1GRP001 */
	private String R1PLA003;// Grupo de Plato
	private int R1PLA004;// Impresora (1 a 5)
	private int R1PLA005;// Lista de Precios (0 a 9)
	private int R1PLA006;// PVP
	private int R1PLA007;// Precio Coste
	private char R1PLA008;// P=Plato // K=Kilo
	private char R1PLA009;// ' '=Con Dcto // 'N'=Sin Dcto
	private char R1PLA021;// S/N Eliminar Restaurante
	private char R1PLA022;// S/N Pendiente

	public Dish() {

	}

	public Dish(Long r1pla001, String r1pla002_01, String r1pla002_02,
			String r1pla002_03, String r1pla003, int r1pla004, int r1pla005,
			int r1pla006, int r1pla007, char r1pla008, char r1pla009,
			char r1pla021, char r1pla022) {
		R1PLA001 = r1pla001;
		R1PLA002_01 = r1pla002_01;
		R1PLA002_02 = r1pla002_02;
		R1PLA002_03 = r1pla002_03;
		R1PLA003 = r1pla003;
		R1PLA004 = r1pla004;
		R1PLA005 = r1pla005;
		R1PLA006 = r1pla006;
		R1PLA007 = r1pla007;
		R1PLA008 = r1pla008;
		R1PLA009 = r1pla009;
		R1PLA021 = r1pla021;
		R1PLA022 = r1pla022;
	}

	@SequenceGenerator( // It only takes effect for
	name = "DishIdGenerator", // databases providing identifier
	sequenceName = "DishSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "DishGenerator")
	public Long getR1PLA001() {
		return R1PLA001;
	}

	public void setR1PLA001(Long r1pla001) {
		R1PLA001 = r1pla001;
	}

	public String getR1PLA002_01() {
		return R1PLA002_01;
	}

	public void setR1PLA002_01(String r1pla002_01) {
		R1PLA002_01 = r1pla002_01;
	}

	public String getR1PLA002_02() {
		return R1PLA002_02;
	}

	public void setR1PLA002_02(String r1pla002_02) {
		R1PLA002_02 = r1pla002_02;
	}

	public String getR1PLA002_03() {
		return R1PLA002_03;
	}

	public void setR1PLA002_03(String r1pla002_03) {
		R1PLA002_03 = r1pla002_03;
	}

	public String getR1PLA003() {
		return R1PLA003;
	}

	public void setR1PLA003(String r1pla003) {
		R1PLA003 = r1pla003;
	}

	public int getR1PLA004() {
		return R1PLA004;
	}

	public void setR1PLA004(int r1pla004) {
		R1PLA004 = r1pla004;
	}

	public int getR1PLA005() {
		return R1PLA005;
	}

	public void setR1PLA005(int r1pla005) {
		R1PLA005 = r1pla005;
	}

	public int getR1PLA006() {
		return R1PLA006;
	}

	public void setR1PLA006(int r1pla006) {
		R1PLA006 = r1pla006;
	}

	public int getR1PLA007() {
		return R1PLA007;
	}

	public void setR1PLA007(int r1pla007) {
		R1PLA007 = r1pla007;
	}

	public char getR1PLA008() {
		return R1PLA008;
	}

	public void setR1PLA008(char r1pla008) {
		R1PLA008 = r1pla008;
	}

	public char getR1PLA009() {
		return R1PLA009;
	}

	public void setR1PLA009(char r1pla009) {
		R1PLA009 = r1pla009;
	}

	public char getR1PLA021() {
		return R1PLA021;
	}

	public void setR1PLA021(char r1pla021) {
		R1PLA021 = r1pla021;
	}

	public char getR1PLA022() {
		return R1PLA022;
	}

	public void setR1PLA022(char r1pla022) {
		R1PLA022 = r1pla022;
	}
}
