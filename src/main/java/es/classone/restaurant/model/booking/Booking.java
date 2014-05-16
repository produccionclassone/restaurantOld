package es.classone.restaurant.model.booking;

import java.util.Calendar;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.classone.restaurant.model.client.Client;

@Entity
@Table(name="Res14res")
public class Booking {
	private Long bookingId;// R1RES000
	private int bookingType;// R1RES001
	private Calendar bookingDate;// R1RES002
	private int tableNumber;// R1RES004
	private char sessionType;// R1RES005
	private int commensalNumber;// R1RES007
	private String bookingNotes1;// R1RES010_01
	private String bookingNotes2;// R1RES010_02
	private String bookingNotes3;// R1RES010_03
	private String bookingObservations1;// R1RES011_01
	private String bookingObservations2;// R1RES011_02
	private String bookingObservations3;// R1RES011_03
	private Client client;// Res14cli_R1CLI001

	public Booking(int bookingType, Calendar bookingDate, int tableNumber,
			char sessionType, int commensalNumber, String bookingNotes1,
			String bookingNotes2, String bookingNotes3,
			String bookingObservations1, String bookingObservations2,
			String bookingObservations3) {
		this.bookingType = bookingType;
		this.bookingDate = bookingDate;
		this.tableNumber = tableNumber;
		this.sessionType = sessionType;
		this.commensalNumber = commensalNumber;
		this.bookingNotes1 = bookingNotes1;
		this.bookingNotes2 = bookingNotes2;
		this.bookingNotes3 = bookingNotes3;
		this.bookingObservations1 = bookingObservations1;
		this.bookingObservations2 = bookingObservations2;
		this.bookingObservations3 = bookingObservations3;
	}

	@Column(name = "R1RES000")
	@SequenceGenerator( // It only takes effect for
	name = "BookingIdGenerator", // databases providing identifier
	sequenceName = "BookingSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "BookingGenerator")
	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	@Column(name = "R1RES001")
	public int getBookingType() {
		return bookingType;
	}

	public void setBookingType(int bookingType) {
		this.bookingType = bookingType;
	}

	@Column(name = "R1RES002")
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Calendar bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Column(name = "R1RES004")
	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Column(name = "R1RES005")
	public char getSessionType() {
		return sessionType;
	}

	public void setSessionType(char sessionType) {
		this.sessionType = sessionType;
	}

	@Column(name = "R1RES007")
	public int getCommensalNumber() {
		return commensalNumber;
	}

	public void setCommensalNumber(int commensalNumber) {
		this.commensalNumber = commensalNumber;
	}

	@Column(name = "R1RES010_01")
	public String getBookingNotes1() {
		return bookingNotes1;
	}

	public void setBookingNotes1(String bookingNotes1) {
		this.bookingNotes1 = bookingNotes1;
	}

	@Column(name = "R1RES010_02")
	public String getBookingNotes2() {
		return bookingNotes2;
	}

	public void setBookingNotes2(String bookingNotes2) {
		this.bookingNotes2 = bookingNotes2;
	}

	@Column(name = "R1RES010_03")
	public String getBookingNotes3() {
		return bookingNotes3;
	}

	public void setBookingNotes3(String bookingNotes3) {
		this.bookingNotes3 = bookingNotes3;
	}

	@Column(name = "R1RES011_01")
	public String getBookingObservations1() {
		return bookingObservations1;
	}

	public void setBookingObservations1(String bookingObservations1) {
		this.bookingObservations1 = bookingObservations1;
	}

	@Column(name = "R1RES011_02")
	public String getBookingObservations2() {
		return bookingObservations2;
	}

	public void setBookingObservations2(String bookingObservations2) {
		this.bookingObservations2 = bookingObservations2;
	}

	@Column(name = "R1RES011_03")
	public String getBookingObservations3() {
		return bookingObservations3;
	}

	public void setBookingObservations3(String bookingObservations3) {
		this.bookingObservations3 = bookingObservations3;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "R1CLI001")
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
// CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14res` (
// `R1RES000` BIGINT NOT NULL AUTO_INCREMENT,
// `R1RES001` CHAR NOT NULL,
// `R1RES002` DATETIME NULL,
// `R1RES004` INT NOT NULL,
// `R1RES005` CHAR NULL,
// `R1RES007` INT NOT NULL,
// `R1RES010_01` VARCHAR(45) NULL,
// `R1RES010_02` VARCHAR(45) NULL,
// `R1RES010_03` VARCHAR(45) NULL,
// `R1RES011_01` VARCHAR(45) NULL,
// `R1RES011_02` VARCHAR(45) NULL,
// `R1RES011_03` VARCHAR(45) NULL,
// `Res14cli_R1CLI001` BIGINT NOT NULL,
// PRIMARY KEY (`R1RES000`),
// CONSTRAINT `fk_Res14res_Res14cli1`
// FOREIGN KEY (`Res14cli_R1CLI001`)
// REFERENCES `ayx14res`.`Res14cli` (`R1CLI001`)
// ON DELETE NO ACTION
// ON UPDATE NO ACTION)
// ENGINE = InnoDB;