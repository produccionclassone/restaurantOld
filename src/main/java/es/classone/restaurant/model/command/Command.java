package es.classone.restaurant.model.command;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.methodOfPayment.MethodOfPayment;
import es.classone.restaurant.model.session.Session;


@Entity
@Table(name="Res14mes_1")
public class Command {
	private int commandId; //R1MES000_1
	private int tableNumber; //R1MES005
	private int commensalNumber; //R1MES007
	private Long billNumber; //R1MES008
	private Calendar commandDateIni; //R1MES009
	private Calendar commandDateFin; //R1MES010
	private float MP1amount;//R1MES014_01	NUMERIC	11,2					Importe Forma de Pago1
	private float MP1amountNoIva;//R1MES019_01	NUMERIC	11,2					Importe sin IVA FP1
	private float MP1amountIva;//R1MES020_01	NUMERIC	11,2					Importe del IVA FP1
	private float MP2amount;//R1MES014_02	NUMERIC	11,2					Importe Forma de Pago2
	private float MP2amountNoIva; //R1MES019_02	NUMERIC	11,2					Importe sin IVA FP2
	private float MP2amountIva; //R1MES020_02	NUMERIC	11,2					Importe del IVA FP2
	private float MP3amount; //R1MES014_03	NUMERIC	11,2					Importe Forma de Pago3
	private float MP3amountNoIva; //R1MES019_03	NUMERIC	11,2					Importe sin IVA FP3
	private float MP3amountIva;//MES020_03	NUMERIC	11,2					Importe del IVA FP3
	private float grossAmount;//	NUMERIC	11,2					Importe Bruto Factura
	private float ivaAmount;//R1MES016	NUMERIC	11,2					Importe IVA
	
	
	private Session session; //Res14mes_R1MES000
	private Client client;// Res14cli_R1CLI001
	private MethodOfPayment methodOfPayment1;// Res14cnt_FP_RFCNT300	INT						Clave foránea a Forma de pago (1)
	private MethodOfPayment methodOfPayment2;//Res14cnt_FP_RFCNT3001	INT						Clave foránea a Forma de pago (2)
	private MethodOfPayment methodOfPayment3;//Res14cnt_FP_RFCNT3002	INT						Clave foránea a Forma de pago (3)

}
//CREATE TABLE IF NOT EXISTS `Ayx14res`.`Res14mes_1` (
//		  `R1MES000_1` INT NOT NULL AUTO_INCREMENT,
//		  `R1MES005` INT NOT NULL,
//		  `R1MES007` BIGINT NULL,
//		  `R1MES008` BIGINT NULL,
//		  `R1MES009` DATETIME NOT NULL,
//		  `R1MES010` DATETIME NULL,
//		  `R1MES015` DECIMAL(11,2) NULL,
//		  `R1MES016` DECIMAL(11,2) NULL,
//		  `R1MES014_01` DECIMAL(11,2) NULL,
//		  `R1MES019_01` DECIMAL(11,2) NULL,
//		  `R1MES020_01` DECIMAL(11,2) NULL,
//		  `R1MES014_02` DECIMAL(11,2) NULL,
//		  `R1MES019_02` DECIMAL(11,2) NULL,
//		  `R1MES020_02` DECIMAL(11,2) NULL,
//		  `R1MES014_03` DECIMAL(11,2) NULL,
//		  `R1MES019_03` DECIMAL(11,2) NULL,
//		  `R1MES020_03` DECIMAL(11,2) NULL,
//		  `Res14mes_R1MES000` INT NOT NULL,
//		  `Res14cli_R1CLI001` BIGINT NOT NULL,
//		  `Res14cnt_FP_RFCNT300` INT NOT NULL,
//		  `Res14cnt_FP_RFCNT3001` INT NOT NULL,
//		  `Res14cnt_FP_RFCNT3002` INT NOT NULL,
//		  PRIMARY KEY (`R1MES000_1`),
//		  CONSTRAINT `fk_Res14mes_1_Res14mes1`
//		    FOREIGN KEY (`Res14mes_R1MES000`)
//		    REFERENCES `Ayx14res`.`Res14mes` (`R1MES000`)
//		    ON DELETE NO ACTION
//		    ON UPDATE NO ACTION,
//		  CONSTRAINT `fk_Res14mes_1_Res14cli1`
//		    FOREIGN KEY (`Res14cli_R1CLI001`)
//		    REFERENCES `Ayx14res`.`Res14cli` (`R1CLI001`)
//		    ON DELETE NO ACTION
//		    ON UPDATE NO ACTION,
//		  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP1`
//		    FOREIGN KEY (`Res14cnt_FP_RFCNT300`)
//		    REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
//		    ON DELETE NO ACTION
//		    ON UPDATE NO ACTION,
//		  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP2`
//		    FOREIGN KEY (`Res14cnt_FP_RFCNT3001`)
//		    REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
//		    ON DELETE NO ACTION
//		    ON UPDATE NO ACTION,
//		  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP3`
//		    FOREIGN KEY (`Res14cnt_FP_RFCNT3002`)
//		    REFERENCES `Ayx14res`.`Res14cnt_FP` (`RFCNT300`)
//		    ON DELETE NO ACTION
//		    ON UPDATE NO ACTION)
//		ENGINE = InnoDB;