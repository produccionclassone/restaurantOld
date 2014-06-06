package es.classone.restaurant.model.configurationGeneric;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_GN")
public class ConfigurationGeneric {
	private int confGenericId;
	private String code;
	private String name;
	private String value;

	public ConfigurationGeneric() {
	}

	public ConfigurationGeneric(String code, String value) {
		this.code = code;
		this.value = value;
	}

	@Column(name = "idRes14cnt_GN")
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationGenericIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationGenericSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationGenericIdGenerator")
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

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_GN` (
// `idRes14cnt_GN` INT NOT NULL AUTO_INCREMENT,
// `code` VARCHAR(11) NOT NULL,
// `name` VARCHAR(20) NOT NULL,
// `value` VARCHAR(45) NULL,
// `version` INT NOT NULL,
// PRIMARY KEY (`idRes14cnt_GN`))
// ENGINE = InnoDB;