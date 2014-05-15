package es.classone.restaurant.model.qualifier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_CF")
public class Qualifier {

	private int qualifierId; // RCCNTR00
	private String qualifierNameLang1; // RCCNT002_01
	private String qualifierNameLang2; // RCCNT002_02
	private String qualifierNameLang3; // RCCNT002_03

	public Qualifier() {

	}

	public Qualifier(String qualifierCode, String qualifierNameLang1,
			String qualifierNameLang2, String qualifierNameLang3) {
		this.qualifierNameLang1 = qualifierNameLang1;
		this.qualifierNameLang2 = qualifierNameLang2;
		this.qualifierNameLang3 = qualifierNameLang3;
	}

	@Column(name = "RCCNTR00")
	@SequenceGenerator( // It only takes effect for
	name = "QualifierIdGenerator", // databases providing identifier
	sequenceName = "QualifierSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "QualifierIdGenerator")
	public int getQualifierId() {
		return qualifierId;
	}

	public void setQualifierId(int qualifierId) {
		this.qualifierId = qualifierId;
	}

	@Column(name = "RCCNTR02_01")
	public String getQualifierNameLang1() {
		return qualifierNameLang1;
	}

	public void setQualifierNameLang1(String qualifierNameLang1) {
		this.qualifierNameLang1 = qualifierNameLang1;
	}

	@Column(name = "RCCNTR02_02")
	public String getQualifierNameLang2() {
		return qualifierNameLang2;
	}

	public void setQualifierNameLang2(String qualifierNameLang2) {
		this.qualifierNameLang2 = qualifierNameLang2;
	}

	@Column(name = "RCCNTR02_03")
	public String getQualifierNameLang3() {
		return qualifierNameLang3;
	}

	public void setQualifierNameLang3(String qualifierNameLang3) {
		this.qualifierNameLang3 = qualifierNameLang3;
	}

}

// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_CF` (
// `RCCNTR00` INT NOT NULL AUTO_INCREMENT,
// `RCCNT002_01` VARCHAR(25) NOT NULL DEFAULT 'SIN SAL',
// `RCCNT002_02` VARCHAR(25) NULL DEFAULT 'UNSALTED',
// `RCCNT002_03` VARCHAR(25) NULL DEFAULT 'NON SALE',
// PRIMARY KEY (`RCCNTR00`))
// ENGINE = InnoDB;
