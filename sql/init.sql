CREATE SCHEMA `aqa_it_step_4AT_2022` ;

CREATE TABLE `aqa_it_step_4AT_2022`.`student` (
                                                  `id_student` INT NOT NULL AUTO_INCREMENT,
                                                  `name` VARCHAR(100) NOT NULL,
                                                  `size` VARCHAR(4) NULL,
                                                  `bd` DATETIME NULL,
                                                  PRIMARY KEY (`id_student`));

CREATE TABLE `aqa_it_step_4AT_2022`.`address` (
                                                  `id_address` INT NOT NULL AUTO_INCREMENT,
                                                  `city` VARCHAR(45) NULL,
                                                  `street` VARCHAR(45) NULL,
                                                  `building` INT NULL,
                                                  PRIMARY KEY (`id_address`));

CREATE TABLE `aqa_it_step_4AT_2022`.`relatedstudent` (
                                                  `id_student` INT NOT NULL AUTO_INCREMENT,
                                                  `name` VARCHAR(100) NOT NULL,
                                                  `size` VARCHAR(4) NULL,
                                                  `bd` DATETIME NULL,
                                                  `id_address` INT,
                                                  PRIMARY KEY (`id_student`));

CREATE TABLE `aqa_it_step_4AT_2022`.`relatedaddress` (
                                                  `id_address` INT NOT NULL AUTO_INCREMENT,
                                                  `city` VARCHAR(45) NULL,
                                                  `street` VARCHAR(45) NULL,
                                                  `building` INT NULL,
                                                  `id_student` INT,
                                                  PRIMARY KEY (`id_address`));

CREATE TABLE `aqa_it_step_4AT_2022`.`phone` (
                                                `idphone` INT NOT NULL,
                                                id_student INT,
                                                `number` VARCHAR(15) NULL,
                                                PRIMARY KEY (`idphone`));