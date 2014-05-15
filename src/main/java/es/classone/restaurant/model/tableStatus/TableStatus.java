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

	private Long tabStatusID; //R1TAB000
	private int tabStatusNumberTab; // R1TAB001
	private boolean tabStatusBusy; //  R1TAB002
	private boolean tabStatusAttached; // R1TAB003
	private boolean tabStatusReserved; // R1TAB004
	private boolean tabStatusBilled; //R1TAB005

	public TableStatus() {}

	public TableStatus(int tabStatusNumberTab, boolean tabStatusBusy, boolean tabStatusAttached, boolean tabStatusReserved,
			boolean tabStatusBilled) {
		
		this.tabStatusNumberTab = tabStatusNumberTab;
		this.tabStatusBusy = tabStatusBusy;
		this.tabStatusAttached = tabStatusAttached;
		this.tabStatusReserved = tabStatusReserved;
		this.tabStatusBilled = tabStatusBilled;
	}

	@SequenceGenerator( // It only takes effect for
	name = "TableStatusIdGenerator", // databases providing identifier
	sequenceName = "TableStatusSeq")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "TableStatusIdGenerator")
	@Column(name="R1TAB000")
	public Long getTabStatusID() {
		return tabStatusID;
	}

	public void setTabStatusID(Long tabStatusID) {
		this.tabStatusID = tabStatusID;
	}

	@Column(name="R1TAB001")
	public int getTabStatusNumberTab() {
		return tabStatusNumberTab;
	}

	public void setTabStatusNumberTab(int tabStatusNumberTab) {
		this.tabStatusNumberTab = tabStatusNumberTab;
	}
	
	@Column(name="R1TAB002")
	public boolean isTabStatusBusy() {
		return tabStatusBusy;
	}

	public void setTabStatusBusy(boolean tabStatusBusy) {
		this.tabStatusBusy = tabStatusBusy;
	}

	@Column(name="R1TAB003")
	public boolean isTabStatusAttached() {
		return tabStatusAttached;
	}

	public void setTabStatusAttached(boolean tabStatusAttached) {
		this.tabStatusAttached = tabStatusAttached;
	}

	@Column(name="R1TAB004")
	public boolean isTabStatusReserved() {
		return tabStatusReserved;
	}

	public void setTabStatusReserved(boolean tabStatusReserved) {
		this.tabStatusReserved = tabStatusReserved;
	}
	
	@Column(name="R1TAB005")
	public boolean isTabStatusBilled() {
		return tabStatusBilled;
	}

	public void setTabStatusBilled(boolean tabStatusBilled) {
		this.tabStatusBilled = tabStatusBilled;
	}
}

/*
-- -----------------------------------------------------
-- Table `Ayx14res`.`Res14tab`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Ayx14res`.`Res14tab` ;

CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14tab` (
  `R1TAB000` INT NOT NULL,
  `R1TAB001` INT NOT NULL,
  `R1TAB002` TINYINT(1) NOT NULL,
  `R1TAB003` TINYINT(1) NOT NULL,
  `R1TAB004` TINYINT(1) NOT NULL,
  `R1TAB005` TINYINT(1) NOT NULL,
  PRIMARY KEY (`R1TAB000`))
ENGINE = InnoDB;
*/