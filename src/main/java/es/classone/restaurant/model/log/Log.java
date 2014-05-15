package es.classone.restaurant.model.log;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.classone.restaurant.model.userprofile.UserProfile;

@Table(name = "Res14aud")
public class Log {

	private Long logId;// R1SCL001
	private String errorCode;// R1SCL002
	private Calendar errorDate;// R1SCL004
	private String programOption;// R1SCL006
	private int printer; // R1SCL007
	private Calendar workDate;// R1SCL008
	private String errorDetails;// R1SCL010
	private String programName; // R1SCL011
	private String errorComent; // R1SCL013
	private UserProfile userProfile; // Res14usr_R1USR001_K1

	public Log() {

	}

	public Log(String errorCode, Calendar errorDate, String programOption,
			int printer, Calendar workDate, String errorDetails,
			String programName, String errorComent) {
		this.errorCode = errorCode;
		this.errorDate = errorDate;
		this.programOption = programOption;
		this.printer = printer;
		this.workDate = workDate;
		this.errorDetails = errorDetails;
		this.programName = programName;
		this.errorComent = errorComent;
	}

	@Column(name = "R1SCL001")
	@SequenceGenerator( // It only takes effect for
	name = "LogIdGenerator", // databases providing identifier
	sequenceName = "LogSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "LogIdGenerator")
	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	@Column(name = "R1SCL002")
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Column(name = "R1SCL004")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getErrorDate() {
		return errorDate;
	}

	public void setErrorDate(Calendar errorDate) {
		this.errorDate = errorDate;
	}

	@Column(name = "R1SCL006")
	public String getProgramOption() {
		return programOption;
	}

	public void setProgramOption(String programOption) {
		this.programOption = programOption;
	}

	@Column(name = "R1SCL007")
	public int getPrinter() {
		return printer;
	}

	public void setPrinter(int printer) {
		this.printer = printer;
	}

	@Column(name = "R1SCL008")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getWorkDate() {
		return workDate;
	}

	public void setWorkDate(Calendar workDate) {
		this.workDate = workDate;
	}

	@Column(name = "R1SCL010")
	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	@Column(name = "R1SCL011")
	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	@Column(name = "R1SCL013")
	public String getErrorComent() {
		return errorComent;
	}

	public void setErrorComent(String errorComent) {
		this.errorComent = errorComent;
	}

	@Column(name = "Res14usr_R1USR001_K1")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "R1USR001_K1")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
// CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14cnt_FP` (
// `RFCNT300` INT NOT NULL AUTO_INCREMENT,
// `RFCNT002` VARCHAR(12) NOT NULL,
// `RFCNT003` VARCHAR(8) NOT NULL,
// `RFCNT004` SMALLINT NOT NULL,
// `RFCNT005` DECIMAL(5,2) NOT NULL DEFAULT 0,
// `RFCNT006` VARCHAR(8) NOT NULL,
// `RFCNT007` VARCHAR(8) NULL,
// `RFCNT008` CHAR NULL DEFAULT ' ',
// PRIMARY KEY (`RFCNT300`))
// ENGINE = InnoDB;