package es.classone.restaurant.model.session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14mes")
public class Session {

	private int sessionId; // R1MES000
	private int sessionNumber; // R1MES001
	private char sessionType; // R1MES002

	public Session(int sessionNumber, char sessionType) {
		this.sessionNumber = sessionNumber;
		this.sessionType = sessionType;
	}

	@Column(name = "R1MES000")
	@SequenceGenerator( // It only takes effect for
	name = "SessionIdGenerator", // databases providing identifier
	sequenceName = "SessionSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SessionIdGenerator")
	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "R1MES001")
	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	@Column(name = "R1MES002")
	public char getSessionType() {
		return sessionType;
	}

	public void setSessionType(char sessionType) {
		this.sessionType = sessionType;
	}

}