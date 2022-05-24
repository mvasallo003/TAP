-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Piezas
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Piezas` ;

-- -----------------------------------------------------
-- Schema Piezas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Piezas` ;
USE `Piezas` ;

-- -----------------------------------------------------
-- Table `Piezas`.`General`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`General` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`General` (
  `idGeneral` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idGeneral`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Piezas`.`Correa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`Correa` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`Correa` (
  `idCorrea` INT NOT NULL AUTO_INCREMENT,
  `Tipo` VARCHAR(45) NOT NULL,
  `Color` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `General_idGeneral` INT NOT NULL,
  PRIMARY KEY (`idCorrea`),
  INDEX `fk_Correa_General1_idx` (`General_idGeneral` ASC) VISIBLE,
  CONSTRAINT `fk_Correa_General1`
    FOREIGN KEY (`General_idGeneral`)
    REFERENCES `Piezas`.`General` (`idGeneral`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Piezas`.`Numeros`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`Numeros` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`Numeros` (
  `idNumeros` INT NOT NULL AUTO_INCREMENT,
  `Formato` VARCHAR(45) NOT NULL,
  `Colores` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `General_idGeneral` INT NOT NULL,
  PRIMARY KEY (`idNumeros`),
  INDEX `fk_Numeros_General1_idx` (`General_idGeneral` ASC) VISIBLE,
  CONSTRAINT `fk_Numeros_General1`
    FOREIGN KEY (`General_idGeneral`)
    REFERENCES `Piezas`.`General` (`idGeneral`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Piezas`.`Caja`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`Caja` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`Caja` (
  `idCaja` INT NOT NULL AUTO_INCREMENT,
  `Tipo` VARCHAR(45) NOT NULL,
  `Color` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `General_idGeneral` INT NOT NULL,
  PRIMARY KEY (`idCaja`),
  INDEX `fk_Caja_General1_idx` (`General_idGeneral` ASC) VISIBLE,
  CONSTRAINT `fk_Caja_General1`
    FOREIGN KEY (`General_idGeneral`)
    REFERENCES `Piezas`.`General` (`idGeneral`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Piezas`.`Esfera`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`Esfera` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`Esfera` (
  `idEsfera` INT NOT NULL AUTO_INCREMENT,
  `Forma` VARCHAR(45) NOT NULL,
  `Tamano` VARCHAR(45) NOT NULL,
  `Color` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `General_idGeneral` INT NOT NULL,
  PRIMARY KEY (`idEsfera`),
  INDEX `fk_Esfera_General_idx` (`General_idGeneral` ASC) VISIBLE,
  CONSTRAINT `fk_Esfera_General`
    FOREIGN KEY (`General_idGeneral`)
    REFERENCES `Piezas`.`General` (`idGeneral`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Piezas`.`Segundero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Piezas`.`Segundero` ;

CREATE TABLE IF NOT EXISTS `Piezas`.`Segundero` (
  `idSegundero` INT NOT NULL AUTO_INCREMENT,
  `Color` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `General_idGeneral` INT NOT NULL,
  PRIMARY KEY (`idSegundero`),
  INDEX `fk_Segundero_General1_idx` (`General_idGeneral` ASC) VISIBLE,
  CONSTRAINT `fk_Segundero_General1`
    FOREIGN KEY (`General_idGeneral`)
    REFERENCES `Piezas`.`General` (`idGeneral`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
