package es.classone.restaurant.model.configurationRoom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14cnt_RM")
public class ConfigurationRoom {
	private int configurationRoomId;
	private String roomDescription;
	private int firstTab;
	private int lastTab;
	private String paramCode;

	public ConfigurationRoom(String roomDescription, int firstTab, int lastTab,
			String paramCode) {
		this.roomDescription = roomDescription;
		this.firstTab = firstTab;
		this.lastTab = lastTab;
		this.paramCode = paramCode;
	}

	@Column(name = "idRes14cnt_RM")
	@SequenceGenerator( // It only takes effect for
	name = "ConfigurationRoomIdGenerator", // databases providing identifier
	sequenceName = "ConfigurationRoomSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ConfigurationRoomIdGenerator")
	public int getConfigurationRoomId() {
		return configurationRoomId;
	}

	public void setConfigurationRoomId(int configurationRoomId) {
		this.configurationRoomId = configurationRoomId;
	}

	@Column(name = "roomDescription")
	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	@Column(name = "firstTab")
	public int getFirstTab() {
		return firstTab;
	}

	public void setFirstTab(int firstTab) {
		this.firstTab = firstTab;
	}

	@Column(name = "lastTab")
	public int getLastTab() {
		return lastTab;
	}

	public void setLastTab(int lastTab) {
		this.lastTab = lastTab;
	}

	@Column(name = "paramCode")
	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_RM` (
// `idRes14cnt_RM` INT NOT NULL AUTO_INCREMENT,
// `roomDescription` VARCHAR(45) NOT NULL,
// `firstTab` INT NOT NULL,
// `lastTab` INT NOT NULL,
// `version` INT NOT NULL,
// `paramCode` VARCHAR(11) NOT NULL,
// PRIMARY KEY (`idRes14cnt_RM`))
// ENGINE = InnoDB;