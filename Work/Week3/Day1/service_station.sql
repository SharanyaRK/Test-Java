/* Creating a database */

CREATE DATABASE service_station;
USE service_station;

/* creating table station to store station details */

CREATE TABLE `station` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(100),
	`address` VARCHAR(200),
	`contact` VARCHAR(15),
	PRIMARY KEY (`id`)
);

/* creating table employee to store station details */

CREATE TABLE `employee` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(100),
	`age` INT,
	`contact` VARCHAR(15),
	PRIMARY KEY (`id`)
);

/* creating customer employee to store customer details */

CREATE TABLE `customer` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(100),
	`age` INT,
	`contact` VARCHAR(15),
	`emp_id` INT NOT NULL,
	PRIMARY KEY (`id`),
	FOREIGN KEY (`emp_id`) REFERENCES `employee`(`id`)
);

/* creating table vehicle to store vehicle details */

CREATE TABLE `vehicle` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`type` VARCHAR(5) NOT NULL CHECK (`type` = car or `type` = bike or `type` = bus),
	`brand` VARCHAR(15),
	`color` VARCHAR(15),
	`service_charge` INT NOT NULL,
	PRIMARY KEY (`id`)
);

/* creating table invoice to store invoice details */

CREATE TABLE `invoices` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`customer` INT NOT NULL,
	`vehicle` INT NOT NULL,
	`amount_total` INT NOT NULL,
	`employee_assigned` INT NOT NULL,
	PRIMARY KEY (`id`),
	FOREIGN KEY(`customer`) REFERENCES `customer`(`id`),
	FOREIGN KEY(`vehicle`) REFERENCES `vehicle`(`id`),
	FOREIGN KEY(`employee_assigned`) REFERENCES `employee`(`id`)
);

/* Dropping all the tables */

DROP TABLE `invoices`;
DROP TABLE `vehicle`;
DROP TABLE `customer`;
DROP TABLE `employee`;
DROP TABLE `station`;

/* Dropping the database */

DROP DATABASE `service_station`;
