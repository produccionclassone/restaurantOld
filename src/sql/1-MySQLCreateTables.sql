-- MySQL Script generated by MySQL Workbench
-- jue 29 may 2014 13:00:37 CEST
-- Model: New Model    Version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema ayx14res
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ayx14res` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `ayx14res` ;

-- -----------------------------------------------------
-- Table `ayx14res`.`Res14usr`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14usr` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14usr` (
  `R1USR001_K1` INT NOT NULL AUTO_INCREMENT,
  `R1USR002` VARCHAR(30) NOT NULL,
  `R1USR003` VARCHAR(40) NOT NULL,
  `R1USR004` VARCHAR(60) NULL,
  `R1USR005` CHAR NOT NULL,
  `R1USR006` VARCHAR(30) NULL,
  `R1USR007` VARCHAR(30) NULL,
  `R1USR008` VARCHAR(20) NULL,
  PRIMARY KEY (`R1USR001_K1`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14aud`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14aud` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14aud` (
  `R1SCL001` BIGINT NOT NULL AUTO_INCREMENT,
  `R1SCL002` VARCHAR(2) NOT NULL,
  `R1SCL004` DATETIME NOT NULL,
  `R1SCL006` VARCHAR(4) NOT NULL,
  `R1SCL007` SMALLINT NOT NULL,
  `R1SCL008` DATETIME NOT NULL,
  `R1SCL010` VARCHAR(40) NOT NULL,
  `R1SCL011` VARCHAR(45) NULL,
  `R1SCL013` VARCHAR(45) NULL,
  `Res14usr_R1USR001_K1` INT NOT NULL,
  PRIMARY KEY (`R1SCL001`),
  CONSTRAINT `fk_Res14aud_Res14usr1`
    FOREIGN KEY (`Res14usr_R1USR001_K1`)
    REFERENCES `ayx14res`.`Res14usr` (`R1USR001_K1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14aud_Res14usr1_idx` ON `ayx14res`.`Res14aud` (`Res14usr_R1USR001_K1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_FP`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_FP` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_FP` (
  `RFCNT300` INT NOT NULL AUTO_INCREMENT,
  `RFCNT002` VARCHAR(12) NOT NULL,
  `RFCNT003` VARCHAR(8) NOT NULL,
  `RFCNT004` SMALLINT NOT NULL,
  `RFCNT005` DECIMAL(5,2) NOT NULL DEFAULT 0,
  `RFCNT006` VARCHAR(8) NOT NULL,
  `RFCNT007` VARCHAR(8) NULL,
  `RFCNT008` CHAR NULL DEFAULT ' ',
  PRIMARY KEY (`RFCNT300`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_MD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_MD` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_MD` (
  `RMCNTR00` INT NOT NULL AUTO_INCREMENT,
  `RMCNTR01` VARCHAR(2) NOT NULL DEFAULT 'EU',
  `RMCNT002` VARCHAR(12) NOT NULL DEFAULT 'EURO',
  `RMCNT003` SMALLINT NOT NULL DEFAULT 1,
  `RMCNT004` DECIMAL(11,4) NOT NULL DEFAULT 1,
  `RMCNT005` DECIMAL(5,2) NOT NULL DEFAULT 0,
  PRIMARY KEY (`RMCNTR00`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_CF`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_CF` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_CF` (
  `RCCNTR00` INT NOT NULL AUTO_INCREMENT,
  `RCCNT002_01` VARCHAR(25) NOT NULL DEFAULT 'SIN SAL',
  `RCCNT002_02` VARCHAR(25) NULL DEFAULT 'UNSALTED',
  `RCCNT002_03` VARCHAR(25) NULL DEFAULT 'NON SALE',
  PRIMARY KEY (`RCCNTR00`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14grp`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14grp` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14grp` (
  `R1GRP000` INT NOT NULL AUTO_INCREMENT,
  `R1GRP001` VARCHAR(4) NOT NULL,
  `R1GRP002_01` VARCHAR(30) NOT NULL,
  `R1GRP003` SMALLINT NULL DEFAULT 1,
  `R1GRP004` VARCHAR(8) NOT NULL,
  `R1GRP112` VARCHAR(3) NULL,
  `R1GRP011` SMALLINT NOT NULL DEFAULT 1,
  `Res14grpcol` VARCHAR(45) NULL,
  PRIMARY KEY (`R1GRP000`),
  UNIQUE INDEX `R1GRP001_UNIQUE` (`R1GRP001` ASC))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `ayx14res`.`Res14pla`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14pla` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14pla` (
  `R1PLA001` INT NOT NULL AUTO_INCREMENT,
  `R1PLA002_01` VARCHAR(30) NOT NULL,
  `R1PLA002_02` VARCHAR(30) NULL,
  `R1PLA002_03` VARCHAR(30) NULL,
  `R1PLA004` INT NOT NULL DEFAULT 1,
  `R1PLA005` INT NOT NULL DEFAULT 0,
  `R1PLA006` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1PLA007` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1PLA008` CHAR NOT NULL DEFAULT 'P',
  `R1PLA009` CHAR NOT NULL DEFAULT ' ',
  `R1PLA021` CHAR NOT NULL DEFAULT 'N',
  `R1PLA022` CHAR NOT NULL DEFAULT 'N',
  `Res14grp_R1GRP000` INT NOT NULL,
  PRIMARY KEY (`R1PLA001`),
  INDEX `fk_Res14pla_Res14grp1_idx` (`Res14grp_R1GRP000` ASC),
  CONSTRAINT `fk_Res14pla_Res14grp1`
    FOREIGN KEY (`Res14grp_R1GRP000`)
    REFERENCES `ayx14res`.`Res14grp` (`R1GRP000`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cam`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cam` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cam` (
  `R1CAM001` INT NOT NULL AUTO_INCREMENT,
  `R1CAM002` VARCHAR(25) NULL,
  `R1CAM003` VARCHAR(30) NULL,
  `R1CAM004` VARCHAR(8) NULL,
  `R1CAM005` VARCHAR(30) NULL,
  `R1CAM006` VARCHAR(30) NULL,
  `R1CAM007` VARCHAR(20) NULL,
  `R1CAM008` VARCHAR(15) NULL,
  `R1CAM009` VARCHAR(30) NULL,
  `R1CAM010_01` VARCHAR(50) NULL,
  `R1CAM010_02` VARCHAR(50) NULL,
  `R1CAM010_03` VARCHAR(50) NULL,
  `R1CAM011` CHAR NOT NULL DEFAULT 'N',
  `R1CAM013` TINYINT(1) NOT NULL DEFAULT 0,
  `R1CAM014` DATETIME NULL,
  `R1CAM015` DATETIME NULL,
  PRIMARY KEY (`R1CAM001`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cli`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cli` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cli` (
  `R1CLI001` BIGINT NOT NULL AUTO_INCREMENT,
  `R1CLI002` VARCHAR(30) NOT NULL,
  `R1CLI003` VARCHAR(30) NULL,
  `R1CLI004` VARCHAR(8) NULL,
  `R1CLI005` VARCHAR(30) NULL,
  `R1CLI006` VARCHAR(30) NULL,
  `R1CLI007` VARCHAR(20) NULL,
  `R1CLI008` VARCHAR(15) NULL,
  `R1CLI009` VARCHAR(30) NULL,
  `R1CLI010_01` VARCHAR(45) NULL,
  `R1CLI010_02` VARCHAR(45) NULL,
  `R1CLI010_03` VARCHAR(45) NULL,
  `R1CLI011` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1CLI012` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1CLI013` DATE NOT NULL DEFAULT 20130101,
  `R1CLI014` DECIMAL(9,2) NOT NULL DEFAULT 0,
  `R1CLI015` SMALLINT NOT NULL DEFAULT 0,
  `R1CLI016` INT NOT NULL DEFAULT 0,
  `R1CLI017_01` VARCHAR(45) NULL,
  `R1CLI017_02` VARCHAR(45) NULL,
  `R1CLI017_03` VARCHAR(45) NULL,
  `R1CLI017_04` VARCHAR(45) NULL,
  `R1CLI201` VARCHAR(8) NOT NULL DEFAULT '43000000',
  `R1CLI202` CHAR NULL,
  `R1CLI203` VARCHAR(5) NULL,
  PRIMARY KEY (`R1CLI001`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_GN`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_GN` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_GN` (
  `idRes14cnt_GN` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(11) NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `value` VARCHAR(45) NULL,
  PRIMARY KEY (`idRes14cnt_GN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_PG`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_PG` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_PG` (
  `idRes14cnt_PG` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(11) NOT NULL,
  `name` VARCHAR(11) NOT NULL,
  `privilegeValue` VARCHAR(324) NOT NULL,
  PRIMARY KEY (`idRes14cnt_PG`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_GN_BOOL`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_GN_BOOL` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_GN_BOOL` (
  `idRes14cnt_1_1` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(11) NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `value` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idRes14cnt_1_1`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_RM`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_RM` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_RM` (
  `idRes14cnt_RM` INT NOT NULL AUTO_INCREMENT,
  `roomDescription` VARCHAR(45) NOT NULL,
  `firstTab` INT NOT NULL,
  `lastTab` INT NOT NULL,
  `paramCode` VARCHAR(11) NOT NULL,
  PRIMARY KEY (`idRes14cnt_RM`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14mes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14mes` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes` (
  `R1MES000` INT NOT NULL AUTO_INCREMENT,
  `R1MES001` INT NOT NULL,
  `R1MES002` CHAR NOT NULL,
  PRIMARY KEY (`R1MES000`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14mes_1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14mes_1` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes_1` (
  `R1MES000_1` INT NOT NULL AUTO_INCREMENT,
  `R1MES005` INT NOT NULL,
  `R1MES007` BIGINT NULL,
  `R1MES008` BIGINT NULL,
  `R1MES009` DATETIME NOT NULL,
  `R1MES010` DATETIME NULL,
  `R1MES015` DECIMAL(11,2) NULL,
  `R1MES016` DECIMAL(11,2) NULL,
  `R1MES014_01` DECIMAL(11,2) NULL,
  `R1MES019_01` DECIMAL(11,2) NULL,
  `R1MES020_01` DECIMAL(11,2) NULL,
  `R1MES014_02` DECIMAL(11,2) NULL,
  `R1MES019_02` DECIMAL(11,2) NULL,
  `R1MES020_02` DECIMAL(11,2) NULL,
  `R1MES014_03` DECIMAL(11,2) NULL,
  `R1MES019_03` DECIMAL(11,2) NULL,
  `R1MES020_03` DECIMAL(11,2) NULL,
  `Res14mes_R1MES000` INT NOT NULL,
  `Res14cli_R1CLI001` BIGINT NOT NULL,
  `Res14cnt_FP_RFCNT300` INT NOT NULL,
  `Res14cnt_FP_RFCNT3001` INT NOT NULL,
  `Res14cnt_FP_RFCNT3002` INT NOT NULL,
  PRIMARY KEY (`R1MES000_1`),
  CONSTRAINT `fk_Res14mes_1_Res14mes1`
    FOREIGN KEY (`Res14mes_R1MES000`)
    REFERENCES `ayx14res`.`Res14mes` (`R1MES000`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_1_Res14cli1`
    FOREIGN KEY (`Res14cli_R1CLI001`)
    REFERENCES `ayx14res`.`Res14cli` (`R1CLI001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP1`
    FOREIGN KEY (`Res14cnt_FP_RFCNT300`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP2`
    FOREIGN KEY (`Res14cnt_FP_RFCNT3001`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_1_Res14cnt_FP3`
    FOREIGN KEY (`Res14cnt_FP_RFCNT3002`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14mes_1_Res14mes1_idx` ON `ayx14res`.`Res14mes_1` (`Res14mes_R1MES000` ASC);

CREATE INDEX `fk_Res14mes_1_Res14cli1_idx` ON `ayx14res`.`Res14mes_1` (`Res14cli_R1CLI001` ASC);

CREATE INDEX `fk_Res14mes_1_Res14cnt_FP1_idx` ON `ayx14res`.`Res14mes_1` (`Res14cnt_FP_RFCNT300` ASC);

CREATE INDEX `fk_Res14mes_1_Res14cnt_FP2_idx` ON `ayx14res`.`Res14mes_1` (`Res14cnt_FP_RFCNT3001` ASC);

CREATE INDEX `fk_Res14mes_1_Res14cnt_FP3_idx` ON `ayx14res`.`Res14mes_1` (`Res14cnt_FP_RFCNT3002` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14mes_2`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14mes_2` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes_2` (
  `R1MES000_2` BIGINT NOT NULL AUTO_INCREMENT,
  `R2MES032` DECIMAL(9,2) NOT NULL,
  `R2MES033` DECIMAL(9,2) NOT NULL,
  `R2MES034` TINYINT(1) NOT NULL,
  `R2MES036` CHAR NOT NULL,
  `R2MES037` VARCHAR(8) NOT NULL,
  `R2MES039` CHAR NULL,
  `R2MES701` CHAR NULL,
  `R2MES702` TINYINT(1) NOT NULL,
  `R2MES703` TINYINT(1) NOT NULL,
  `R2MES704` VARCHAR(3) NULL,
  `R2MES732` DECIMAL(9,2) NULL,
  `Res14pla_R1PLA001` INT NOT NULL,
  `Res14pla_R1PLA0011` INT NULL,
  `Res14mes_1_R1MES000_1` INT NOT NULL,
  PRIMARY KEY (`R1MES000_2`),
  CONSTRAINT `fk_Res14mes_2_Res14pla1`
    FOREIGN KEY (`Res14pla_R1PLA001`)
    REFERENCES `ayx14res`.`Res14pla` (`R1PLA001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_2_Res14pla2`
    FOREIGN KEY (`Res14pla_R1PLA0011`)
    REFERENCES `ayx14res`.`Res14pla` (`R1PLA001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_2_Res14mes_11`
    FOREIGN KEY (`Res14mes_1_R1MES000_1`)
    REFERENCES `ayx14res`.`Res14mes_1` (`R1MES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14mes_2_Res14pla1_idx` ON `ayx14res`.`Res14mes_2` (`Res14pla_R1PLA001` ASC);

CREATE INDEX `fk_Res14mes_2_Res14pla2_idx` ON `ayx14res`.`Res14mes_2` (`Res14pla_R1PLA0011` ASC);

CREATE INDEX `fk_Res14mes_2_Res14mes_11_idx` ON `ayx14res`.`Res14mes_2` (`Res14mes_1_R1MES000_1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14res`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14res` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14res` (
  `R1RES000` BIGINT NOT NULL AUTO_INCREMENT,
  `R1RES001` CHAR NOT NULL,
  `R1RES002` DATETIME NULL,
  `R1RES004` INT NOT NULL,
  `R1RES005` CHAR NULL,
  `R1RES007` INT NOT NULL,
  `R1RES010_01` VARCHAR(45) NULL,
  `R1RES010_02` VARCHAR(45) NULL,
  `R1RES010_03` VARCHAR(45) NULL,
  `R1RES011_01` VARCHAR(45) NULL,
  `R1RES011_02` VARCHAR(45) NULL,
  `R1RES011_03` VARCHAR(45) NULL,
  `Res14cli_R1CLI001` BIGINT NOT NULL,
  PRIMARY KEY (`R1RES000`),
  CONSTRAINT `fk_Res14res_Res14cli1`
    FOREIGN KEY (`Res14cli_R1CLI001`)
    REFERENCES `ayx14res`.`Res14cli` (`R1CLI001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14res_Res14cli1_idx` ON `ayx14res`.`Res14res` (`Res14cli_R1CLI001` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14ses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14ses` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses` (
  `R1SES000` BIGINT NOT NULL AUTO_INCREMENT,
  `R1SES001` DATE NOT NULL,
  `R1SES004` CHAR NOT NULL,
  `R1SES005` INT NOT NULL,
  `R1SES007` TINYINT(1) NOT NULL,
  `R1SES008` TINYINT(1) NOT NULL,
  `R1SES009` DATETIME NOT NULL,
  `R1SES010` DATETIME NOT NULL,
  `R1SES011` INT NOT NULL,
  `R1SES012` INT NOT NULL,
  `R1SES013` DECIMAL(11,2) NOT NULL,
  `R1SES014` DECIMAL(11,2) NOT NULL,
  `R1SES015` DECIMAL(11,2) NOT NULL,
  `R1SES016` DECIMAL(11,2) NOT NULL,
  `R1SES017` DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (`R1SES000`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14ses_1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14ses_1` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses_1` (
  `R2SES000_1` BIGINT NOT NULL AUTO_INCREMENT,
  `R2SES020` DECIMAL(11,2) NOT NULL,
  `R2SES021` CHAR NOT NULL,
  `R2SES101` INT NOT NULL,
  `R2SES011` DATETIME NOT NULL,
  `R2SES012` DATETIME NOT NULL,
  `R2SES013` INT NOT NULL,
  `R2SES017_01` DECIMAL(11,2) NOT NULL,
  `R2SES018_01` DECIMAL(11,2) NULL,
  `R2SES019_01` DECIMAL(11,2) NULL,
  `R2SES017_02` DECIMAL(11,2) NOT NULL,
  `R2SES018_02` DECIMAL(11,2) NULL,
  `R2SES019_02` DECIMAL(11,2) NULL,
  `R2SES017_03` DECIMAL(11,2) NOT NULL,
  `R2SES018_03` DECIMAL(11,2) NULL,
  `R2SES019_03` DECIMAL(11,2) NULL,
  `R2SES022_01` CHAR NOT NULL,
  `R2SES022_02` CHAR NULL,
  `R2SES022_03` CHAR NULL,
  `Res14ses_R1SES000` BIGINT NOT NULL,
  `Res14cli_R1CLI001` BIGINT NOT NULL,
  `Res14cnt_FP_RFCNT300` INT NOT NULL,
  `Res14cnt_FP_RFCNT3001` INT NOT NULL,
  `Res14cnt_FP_RFCNT3002` INT NOT NULL,
  PRIMARY KEY (`R2SES000_1`),
  CONSTRAINT `fk_Res14ses_1_Res14ses1`
    FOREIGN KEY (`Res14ses_R1SES000`)
    REFERENCES `ayx14res`.`Res14ses` (`R1SES000`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_1_Res14cli1`
    FOREIGN KEY (`Res14cli_R1CLI001`)
    REFERENCES `ayx14res`.`Res14cli` (`R1CLI001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_1_Res14cnt_FP1`
    FOREIGN KEY (`Res14cnt_FP_RFCNT300`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_1_Res14cnt_FP2`
    FOREIGN KEY (`Res14cnt_FP_RFCNT3001`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_1_Res14cnt_FP3`
    FOREIGN KEY (`Res14cnt_FP_RFCNT3002`)
    REFERENCES `ayx14res`.`Res14cnt_FP` (`RFCNT300`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14ses_1_Res14ses1_idx` ON `ayx14res`.`Res14ses_1` (`Res14ses_R1SES000` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cli1_idx` ON `ayx14res`.`Res14ses_1` (`Res14cli_R1CLI001` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP1_idx` ON `ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT300` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP2_idx` ON `ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT3001` ASC);

CREATE INDEX `fk_Res14ses_1_Res14cnt_FP3_idx` ON `ayx14res`.`Res14ses_1` (`Res14cnt_FP_RFCNT3002` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14ses_2`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14ses_2` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses_2` (
  `R2SES000` BIGINT NOT NULL AUTO_INCREMENT,
  `R2SES009` SMALLINT NOT NULL,
  `R3SES010` CHAR NOT NULL,
  `R2SES012` DECIMAL(9,2) NOT NULL,
  `R3SES013` DECIMAL(11,2) NOT NULL,
  `R3SES014` DECIMAL(11,2) NOT NULL,
  `R3SES016` DECIMAL(11,2) NOT NULL,
  `R3SES017` TINYINT(1) NOT NULL,
  `R3SES018` VARCHAR(4) NULL,
  `Res14ses_1_R2SES000_1` BIGINT NOT NULL,
  `Res14pla_R1PLA001` INT NOT NULL,
  PRIMARY KEY (`R2SES000`),
  CONSTRAINT `fk_Res14ses_2_Res14ses_11`
    FOREIGN KEY (`Res14ses_1_R2SES000_1`)
    REFERENCES `ayx14res`.`Res14ses_1` (`R2SES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_2_Res14pla1`
    FOREIGN KEY (`Res14pla_R1PLA001`)
    REFERENCES `ayx14res`.`Res14pla` (`R1PLA001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14ses_2_Res14ses_11_idx` ON `ayx14res`.`Res14ses_2` (`Res14ses_1_R2SES000_1` ASC);

CREATE INDEX `fk_Res14ses_2_Res14pla1_idx` ON `ayx14res`.`Res14ses_2` (`Res14pla_R1PLA001` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14mes_1_has_Res14cam`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14mes_1_has_Res14cam` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes_1_has_Res14cam` (
  `Res14mes_1_R1MES000_1` INT NOT NULL,
  `Res14cam_R1CAM001` INT NOT NULL,
  PRIMARY KEY (`Res14mes_1_R1MES000_1`, `Res14cam_R1CAM001`),
  CONSTRAINT `fk_Res14mes_1_has_Res14cam_Res14mes_11`
    FOREIGN KEY (`Res14mes_1_R1MES000_1`)
    REFERENCES `ayx14res`.`Res14mes_1` (`R1MES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_1_has_Res14cam_Res14cam1`
    FOREIGN KEY (`Res14cam_R1CAM001`)
    REFERENCES `ayx14res`.`Res14cam` (`R1CAM001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14mes_1_has_Res14cam_Res14cam1_idx` ON `ayx14res`.`Res14mes_1_has_Res14cam` (`Res14cam_R1CAM001` ASC);

CREATE INDEX `fk_Res14mes_1_has_Res14cam_Res14mes_11_idx` ON `ayx14res`.`Res14mes_1_has_Res14cam` (`Res14mes_1_R1MES000_1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14ses_1_has_Res14cam`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14ses_1_has_Res14cam` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14ses_1_has_Res14cam` (
  `Res14ses_1_R2SES000_1` BIGINT NOT NULL,
  `Res14cam_R1CAM001` INT NOT NULL,
  PRIMARY KEY (`Res14ses_1_R2SES000_1`, `Res14cam_R1CAM001`),
  CONSTRAINT `fk_Res14ses_1_has_Res14cam_Res14ses_11`
    FOREIGN KEY (`Res14ses_1_R2SES000_1`)
    REFERENCES `ayx14res`.`Res14ses_1` (`R2SES000_1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14ses_1_has_Res14cam_Res14cam1`
    FOREIGN KEY (`Res14cam_R1CAM001`)
    REFERENCES `ayx14res`.`Res14cam` (`R1CAM001`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14ses_1_has_Res14cam_Res14cam1_idx` ON `ayx14res`.`Res14ses_1_has_Res14cam` (`Res14cam_R1CAM001` ASC);

CREATE INDEX `fk_Res14ses_1_has_Res14cam_Res14ses_11_idx` ON `ayx14res`.`Res14ses_1_has_Res14cam` (`Res14ses_1_R2SES000_1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14tab`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14tab` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14tab` (
  `R1TAB000` INT NOT NULL AUTO_INCREMENT,
  `R1TAB001` INT NOT NULL,
  `R1TAB002` TINYINT(1) NOT NULL,
  `R1TAB003` TINYINT(1) NOT NULL,
  `R1TAB004` TINYINT(1) NOT NULL,
  `R1TAB005` TINYINT(1) NOT NULL,
  PRIMARY KEY (`R1TAB000`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14cnt_USR`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14cnt_USR` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14cnt_USR` (
  `idRes14cnt_USR` INT NOT NULL AUTO_INCREMENT,
  `code` VARCHAR(11) NOT NULL,
  `name` VARCHAR(20) NOT NULL,
  `value` VARCHAR(45) NOT NULL,
  `Res14usr_R1USR001_K1` INT NOT NULL,
  PRIMARY KEY (`idRes14cnt_USR`),
  CONSTRAINT `fk_Res14cnt_USR_Res14usr1`
    FOREIGN KEY (`Res14usr_R1USR001_K1`)
    REFERENCES `ayx14res`.`Res14usr` (`R1USR001_K1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14cnt_USR_Res14usr1_idx` ON `ayx14res`.`Res14cnt_USR` (`Res14usr_R1USR001_K1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14mes_2CF`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14mes_2CF` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14mes_2CF` (
  `Res14mes_2_R1MES000_2` BIGINT NOT NULL,
  `Res14cnt_CF_RCCNTR00` INT NOT NULL,
  PRIMARY KEY (`Res14mes_2_R1MES000_2`, `Res14cnt_CF_RCCNTR00`),
  CONSTRAINT `fk_Res14mes_2_has_Res14cnt_CF_Res14mes_21`
    FOREIGN KEY (`Res14mes_2_R1MES000_2`)
    REFERENCES `ayx14res`.`Res14mes_2` (`R1MES000_2`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Res14mes_2_has_Res14cnt_CF_Res14cnt_CF1`
    FOREIGN KEY (`Res14cnt_CF_RCCNTR00`)
    REFERENCES `ayx14res`.`Res14cnt_CF` (`RCCNTR00`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14mes_2_has_Res14cnt_CF_Res14cnt_CF1_idx` ON `ayx14res`.`Res14mes_2CF` (`Res14cnt_CF_RCCNTR00` ASC);

CREATE INDEX `fk_Res14mes_2_has_Res14cnt_CF_Res14mes_21_idx` ON `ayx14res`.`Res14mes_2CF` (`Res14mes_2_R1MES000_2` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14fav`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14fav` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14fav` (
  `R1FAV001` INT NOT NULL AUTO_INCREMENT,
  `R1FAV002` VARCHAR(7) NOT NULL,
  `R1FAV003` VARCHAR(45) NOT NULL,
  `Res14usr_R1USR001_K1` INT NOT NULL,
  PRIMARY KEY (`R1FAV001`),
  CONSTRAINT `fk_Res14fav_Res14usr1`
    FOREIGN KEY (`Res14usr_R1USR001_K1`)
    REFERENCES `ayx14res`.`Res14usr` (`R1USR001_K1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14fav_Res14usr1_idx` ON `ayx14res`.`Res14fav` (`Res14usr_R1USR001_K1` ASC);


-- -----------------------------------------------------
-- Table `ayx14res`.`Res14his`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ayx14res`.`Res14his` ;

CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14his` (
  `R1HIS001` INT NOT NULL,
  `R1HIS002` VARCHAR(7) NULL,
  `R1HIS003` VARCHAR(45) NOT NULL,
  `Res14usr_R1USR001_K1` INT NOT NULL,
  PRIMARY KEY (`R1HIS001`),
  CONSTRAINT `fk_Res14his_Res14usr1`
    FOREIGN KEY (`Res14usr_R1USR001_K1`)
    REFERENCES `ayx14res`.`Res14usr` (`R1USR001_K1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_Res14his_Res14usr1_idx` ON `ayx14res`.`Res14his` (`Res14usr_R1USR001_K1` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
