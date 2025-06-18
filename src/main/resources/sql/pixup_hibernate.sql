-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema pixup_hibernate
-- -----------------------------------------------------
SHOW WARNINGS;
USE pixup_hibernate;

-- -----------------------------------------------------
-- Table `tbl_estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_estado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_municipio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_municipio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `municipio` VARCHAR(45) NOT NULL,
  `tbl_estado_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_municipio_tbl_estado`
    FOREIGN KEY (`tbl_estado_id`)
    REFERENCES `tbl_estado` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_municipio_tbl_estado_idx` ON `tbl_municipio` (`tbl_estado_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_colonia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_colonia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `cp` CHAR(5) NULL,
  `tbl_municipio_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_colonia_tbl_municipio1`
    FOREIGN KEY (`tbl_municipio_id`)
    REFERENCES `tbl_municipio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_colonia_tbl_municipio1_idx` ON `tbl_colonia` (`tbl_municipio_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_tipo_domicilio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_tipo_domicilio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `primer_apellido` VARCHAR(45) NOT NULL,
  `segundo_apellido` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_domicilio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_domicilio` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `calle` VARCHAR(45) NOT NULL,
  `num_exterior` VARCHAR(45) NOT NULL,
  `num_interior` VARCHAR(45) NOT NULL,
  `tbl_colonia_id` INT NOT NULL,
  `tbl_tipo_domicilio_id` INT NOT NULL,
  `tbl_usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_domicilio_tbl_colonia1`
    FOREIGN KEY (`tbl_colonia_id`)
    REFERENCES `tbl_colonia` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_domicilio_tbl_tipo_domicilio1`
    FOREIGN KEY (`tbl_tipo_domicilio_id`)
    REFERENCES `tbl_tipo_domicilio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_domicilio_tbl_usuario1`
    FOREIGN KEY (`tbl_usuario_id`)
    REFERENCES `tbl_usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_domicilio_tbl_colonia1_idx` ON `tbl_domicilio` (`tbl_colonia_id` ASC) VISIBLE;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_domicilio_tbl_tipo_domicilio1_idx` ON `tbl_domicilio` (`tbl_tipo_domicilio_id` ASC) VISIBLE;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_domicilio_tbl_usuario1_idx` ON `tbl_domicilio` (`tbl_usuario_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_tipo_notificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_tipo_notificacion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(20) NOT NULL,
  `ruta_plantilla` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_notificacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_notificacion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `fecha_notificacion` VARCHAR(20) NOT NULL,
  `tbl_usuario_id` INT NOT NULL,
  `tbl_tipo_notificacion_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_notificacion_tbl_usuario1`
    FOREIGN KEY (`tbl_usuario_id`)
    REFERENCES `tbl_usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_notificacion_tbl_tipo_notificacion1`
    FOREIGN KEY (`tbl_tipo_notificacion_id`)
    REFERENCES `tbl_tipo_notificacion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_notificacion_tbl_usuario1_idx` ON `tbl_notificacion` (`tbl_usuario_id` ASC) VISIBLE;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_notificacion_tbl_tipo_notificacion1_idx` ON `tbl_notificacion` (`tbl_tipo_notificacion_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_orden` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `costo_total` FLOAT NOT NULL,
  `fecha` VARCHAR(45) NOT NULL,
  `cantidad_total` INT NOT NULL,
  `estatus_envio` VARCHAR(45) NOT NULL,
  `costo_envio` FLOAT NOT NULL,
  `tbl_usuario_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_orden_tbl_usuario1`
    FOREIGN KEY (`tbl_usuario_id`)
    REFERENCES `tbl_usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_orden_tbl_usuario1_idx` ON `tbl_orden` (`tbl_usuario_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_pago`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_pago` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `numero_tarjeta` CHAR(5) NOT NULL,
  `fecha` VARCHAR(20) NOT NULL,
  `tbl_orden_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_pago_tbl_orden1`
    FOREIGN KEY (`tbl_orden_id`)
    REFERENCES `tbl_orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_pago_tbl_orden1_idx` ON `tbl_pago` (`tbl_orden_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_genero_musical`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_genero_musical` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_disquera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_disquera` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_artista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_artista` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_disco`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_disco` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(200) NOT NULL,
  `precio` FLOAT NOT NULL,
  `existencia` INT NOT NULL,
  `descuento` FLOAT NOT NULL,
  `fecha_lanzamiento` VARCHAR(20) NOT NULL,
  `imagen` VARCHAR(120) NOT NULL,
  `tbl_genero_musical_id` INT NOT NULL,
  `tbl_disquera_id` INT NOT NULL,
  `tbl_artista_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_disco_tbl_genero_musical1`
    FOREIGN KEY (`tbl_genero_musical_id`)
    REFERENCES `tbl_genero_musical` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_disco_tbl_disquera1`
    FOREIGN KEY (`tbl_disquera_id`)
    REFERENCES `tbl_disquera` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_disco_tbl_artista1`
    FOREIGN KEY (`tbl_artista_id`)
    REFERENCES `tbl_artista` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_disco_tbl_genero_musical1_idx` ON `tbl_disco` (`tbl_genero_musical_id` ASC) VISIBLE;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_disco_tbl_disquera1_idx` ON `tbl_disco` (`tbl_disquera_id` ASC) VISIBLE;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_disco_tbl_artista1_idx` ON `tbl_disco` (`tbl_artista_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_detalle_orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_detalle_orden` (
  `id_disco` INT NULL,
  `id_orden` INT NULL,
  `cantidad` INT NOT NULL,
  `costo` FLOAT NOT NULL,
  `tbl_orden_id` INT NOT NULL,
  `tbl_disco_id` INT NOT NULL,
  PRIMARY KEY (`tbl_orden_id`, `tbl_disco_id`),
  CONSTRAINT `fk_tbl_detalle_orden_tbl_orden1`
    FOREIGN KEY (`tbl_orden_id`)
    REFERENCES `tbl_orden` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_detalle_orden_tbl_disco1`
    FOREIGN KEY (`tbl_disco_id`)
    REFERENCES `tbl_disco` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_detalle_orden_tbl_disco1_idx` ON `tbl_detalle_orden` (`tbl_disco_id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `tbl_cancion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tbl_cancion` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `duracion` VARCHAR(20) NOT NULL,
  `tbl_disco_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_tbl_cancion_tbl_disco1`
    FOREIGN KEY (`tbl_disco_id`)
    REFERENCES `tbl_disco` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `fk_tbl_cancion_tbl_disco1_idx` ON `tbl_cancion` (`tbl_disco_id` ASC) VISIBLE;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
