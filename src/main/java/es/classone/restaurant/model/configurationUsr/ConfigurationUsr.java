package es.classone.restaurant.model.configurationUsr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.userprofile.UserProfile;

@Table(name = "Res14cnt_USR")
@Entity
public class ConfigurationUsr {
	private Long configurationUsrId; // idRes14cnt_USR
	private String code; // code
	private String value; // value
	private UserProfile userProfile; // Res14usr_R1USR001_K1

	public ConfigurationUsr() {
	}

	public ConfigurationUsr(String code, String value, UserProfile userProfile) {
		this.code = code;
		this.value = value;
		this.userProfile = userProfile;
	}

	@Column(name = "idRes14cnt_USR")
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationUsrIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationUsrSeq")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationUsrIdGenerator")
	public Long getConfigurationUsrId() {
		return configurationUsrId;
	}

	public void setConfigurationUsrId(Long configurationUsrId) {
		this.configurationUsrId = configurationUsrId;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "R1USR001_K1")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
}

/*-- -----------------------------------------------------
 -- Table `Ayx14res`.`Res14cnt_USR`
 -- -----------------------------------------------------
 DROP TABLE IF EXISTS `Ayx14res`.`Res14cnt_USR` ;

 CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_USR` (
 `idRes14cnt_USR` INT NOT NULL,
 `code` VARCHAR(11) NOT NULL,
 `value` VARCHAR(45) NOT NULL,
 `Res14usr_R1USR001_K1` INT NOT NULL,
 PRIMARY KEY (`idRes14cnt_USR`),
 CONSTRAINT `fk_Res14cnt_USR_Res14usr1`
 FOREIGN KEY (`Res14usr_R1USR001_K1`)
 REFERENCES `Ayx14res`.`Res14usr` (`R1USR001_K1`)
 ON DELETE NO ACTION
 ON UPDATE NO ACTION)
 ENGINE = InnoDB;

 CREATE INDEX `fk_Res14cnt_USR_Res14usr1_idx` ON `Ayx14res`.`Res14cnt_USR` (`Res14usr_R1USR001_K1` ASC);


 SET SQL_MODE=@OLD_SQL_MODE;
 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
 */
