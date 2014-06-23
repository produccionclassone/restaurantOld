package es.classone.restaurant.model.channelSegment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Res14CAN")
public class ChannelSegment {
	private int channelSegmentId; //R1CAN000
	private String channelValue; //R1CAN001
	private String channelDesc; // R1CAN002
	
	public ChannelSegment(){}
	
	public ChannelSegment(String channelValue, String channelDesc) {
		this.channelValue = channelValue;
		this.channelDesc = channelDesc;
	}

	@Column(name = "R1CAN000")
	@SequenceGenerator( // It only takes effect for
	name = "CHANNELSEGMENTIdGenerator", // databases providing identifier
	sequenceName = "CHANNELSEGMENTSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CHANNELSEGMENTIdGenerator")
	public int getChannelSegmentId() {
		return channelSegmentId;
	}

	public void setChannelSegmentId(int channelSegmentId) {
		this.channelSegmentId = channelSegmentId;
	}

	@Column(name = "R1CAN001")
	public String getChannelValue() {
		return channelValue;
	}

	public void setChannelValue(String channelValue) {
		this.channelValue = channelValue;
	}

	@Column(name = "R1CAN002")
	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
}

/*
CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14CAN` (
		  `R1CAN000` INT NOT NULL,
		  `R1CAN001` VARCHAR(3) NOT NULL,
		  `R1CAN002` VARCHAR(45) NULL,
		  PRIMARY KEY (`R1CAN000`),
		  UNIQUE INDEX `R1CAN001_UNIQUE` (`R1CAN001` ASC))
		ENGINE = InnoDB;
*/