package es.classone.restaurant.model.configurationBool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_GN")
public class ConfigurationBool {
	private int confGenericId;
	private String code;
	private boolean value;

	public ConfigurationBool() {
	}

	public ConfigurationBool(String code, boolean value) {
		this.code = code;
		this.value = value;
	}

	@Column(name = "idRes14cnt_1_1")
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationBoolIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationBoolSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationBoolIdGenerator")
	public int getConfGenericId() {
		return confGenericId;
	}

	public void setConfGenericId(int confGenericId) {
		this.confGenericId = confGenericId;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "value")
	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_GN_BOOL` (
// `idRes14cnt_1_1` INT NOT NULL,
// `code` VARCHAR(11) NOT NULL,
// `value` TINYINT(1) NOT NULL,
// `version` INT NOT NULL,
// PRIMARY KEY (`idRes14cnt_1_1`))
// ENGINE = InnoDB;