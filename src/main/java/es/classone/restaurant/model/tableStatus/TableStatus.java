package es.classone.restaurant.model.tableStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "Res14tab")
@Entity
public class TableStatus {

	private Long tabStatusID; // R1TAB000
	private int tableNumber; // R1TAB001
	private boolean busy; // R1TAB002
	private boolean attached; // R1TAB003
	private boolean reserved; // R1TAB004
	private boolean billed; // R1TAB005

	public TableStatus() {
	}

	public TableStatus(int tableNumber, boolean busy, boolean attached,
			boolean reserved, boolean billed) {

		this.tableNumber = tableNumber;
		this.busy = busy;
		this.attached = attached;
		this.reserved = reserved;
		this.billed = billed;
	}

	@SequenceGenerator( // It only takes effect for
	name = "TableStatusIdGenerator", // databases providing identifier
	sequenceName = "TableStatusSeq")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "TableStatusIdGenerator")
	@Column(name = "R1TAB000")
	public Long getTabStatusID() {
		return tabStatusID;
	}

	public void setTabStatusID(Long tabStatusID) {
		this.tabStatusID = tabStatusID;
	}

	@Column(name = "R1TAB001")
	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Column(name = "R1TAB002")
	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	@Column(name = "R1TAB003")
	public boolean isAttached() {
		return attached;
	}

	public void setAttached(boolean attached) {
		this.attached = attached;
	}

	@Column(name = "R1TAB004")
	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	@Column(name = "R1TAB005")
	public boolean isBilled() {
		return billed;
	}

	public void setBilled(boolean billed) {
		this.billed = billed;
	}
}

/*
 * -- ----------------------------------------------------- -- Table
 * `Ayx14res`.`Res14tab` --
 * ----------------------------------------------------- DROP TABLE IF EXISTS
 * `Ayx14res`.`Res14tab` ;
 * 
 * CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14tab` ( `R1TAB000` INT NOT NULL,
 * `R1TAB001` INT NOT NULL, `R1TAB002` TINYINT(1) NOT NULL, `R1TAB003`
 * TINYINT(1) NOT NULL, `R1TAB004` TINYINT(1) NOT NULL, `R1TAB005` TINYINT(1)
 * NOT NULL, PRIMARY KEY (`R1TAB000`)) ENGINE = InnoDB;
 */