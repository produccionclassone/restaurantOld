package es.classone.restaurant.model.configurationPrivilege;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_PG")
public class ConfigurationPrivilege {

	private int confPrivilegeId;
	private String code;
	private String name;
	private String privilegeValue;

	public ConfigurationPrivilege() {
	}

	public ConfigurationPrivilege(String code, String privilegeValue) {
		this.code = code;
		this.privilegeValue = privilegeValue;
	}

	@Column(name = "idRes14cnt_PG")
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationPGIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationPGSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationPGIdGenerator")
	public int getConfPrivilegeId() {
		return confPrivilegeId;
	}

	public void setConfPrivilegeId(int confPrivilegeId) {
		this.confPrivilegeId = confPrivilegeId;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "privilegeValue")
	public String getPrivilegeValue() {
		return privilegeValue;
	}

	public void setPrivilegeValue(String privilegeValue) {
		this.privilegeValue = privilegeValue;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_PG` (
// `idRes14cnt_PG` INT NOT NULL AUTO_INCREMENT,
// `code` VARCHAR(11) NOT NULL,
// `name` VARCHAR(11) NOT NULL,
// `privilegeValue` VARCHAR(324) NOT NULL,
// PRIMARY KEY (`idRes14cnt_PG`))
// ENGINE = InnoDB;