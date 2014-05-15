package es.classone.restaurant.model.userprofile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14usr")
public class UserProfile {

	private int userProfileId; // R1USR001_K1
	private String loginName; // R1USR002
	private String encryptedPassword; // R1USR003
	private String email; // R1USR004
	private char userPrivilege; // R1USR005
	private String ipAddressIn; // R1USR006
	private String ipAddressExt; // R1USR007
	private String macAddress; // R1USR008

	public UserProfile() {
	}

	public UserProfile(String loginName, String encryptedPassword,
			String email, char userPrivilege, String ipAddressIn,
			String ipAddressExt, String macAddress) {

		this.loginName = loginName;
		this.encryptedPassword = encryptedPassword;
		this.email = email;
		this.userPrivilege = userPrivilege;
		this.ipAddressIn = ipAddressIn;
		this.ipAddressExt = ipAddressExt;
		this.macAddress = macAddress;
	}

	@Column(name = "R1USR001_K1")
	@SequenceGenerator( // It only takes effect for
	name = "UserProfileIdGenerator", // databases providing identifier
	sequenceName = "UserProfileSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "UserProfileIdGenerator")
	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	@Column(name = "R1USR002")
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "R1USR003")
	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	@Column(name = "R1USR004")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "R1USR005")
	public char getUserPrivilege() {
		return userPrivilege;
	}

	public void setUserPrivilege(char userPrivilege) {
		this.userPrivilege = userPrivilege;
	}

	@Column(name = "R1USR006")
	public String getIpAddressIn() {
		return ipAddressIn;
	}

	public void setIpAddressIn(String ipAddressIn) {
		this.ipAddressIn = ipAddressIn;
	}

	@Column(name = "R1USR007")
	public String getIpAddressExt() {
		return ipAddressExt;
	}

	public void setIpAddressExt(String ipAddressExt) {
		this.ipAddressExt = ipAddressExt;
	}

	@Column(name = "R1USR008")
	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	@Override
	public String toString() {
		return "UserProfile [userProfileId=" + userProfileId + ", loginName="
				+ loginName + ", encryptedPassword=" + encryptedPassword
				+ ", firstName=" + ", email=" + email + "]";
	}

}

// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14aud` (
// `R1SCL001` BIGINT NOT NULL AUTO_INCREMENT,
// `R1SCL002` VARCHAR(2) NOT NULL,
// `R1SCL004` DATETIME NOT NULL,
// `R1SCL006` VARCHAR(4) NOT NULL,
// `R1SCL007` SMALLINT NOT NULL,
// `R1SCL008` DATETIME NOT NULL,
// `R1SCL010` VARCHAR(40) NOT NULL,
// `R1SCL011` VARCHAR(45) NULL,
// `R1SCL013` VARCHAR(45) NULL,
// `Res14usr_R1USR001_K1` INT NOT NULL,
// PRIMARY KEY (`R1SCL001`),
// CONSTRAINT `fk_Res14aud_Res14usr1`
// FOREIGN KEY (`Res14usr_R1USR001_K1`)
// REFERENCES `Ayx14res`.`Res14usr` (`R1USR001_K1`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION)
// ENGINE = InnoDB;
