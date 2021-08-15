--CREATE TABLE Person(
--  id_person BIGINT NOT NULL AUTO_INCREMENT,
--  first_name VARCHAR(255) NOT NULL,
--  last_name VARCHAR(255) NOT NULL,
--  age INTEGER NOT NULL,
--  id_address INTEGER,
--  gender VARCHAR(15),
--  PRIMARY KEY (id_person)
--);
--
--CREATE TABLE Address(
--    id_address BIGINT NOT NULL AUTO_INCREMENT,
--    street VARCHAR(255) NOT NULL,
--    street_nr INTEGER NOT NULL,
--    zip_code INTEGER NOT NULL,
--    PRIMARY KEY (id_address)
--);
--
--CREATE TABLE Product(
--    id_product BIGINT NOT NULL AUTO_INCREMENT,
--    expiration_date DATE,
--    PRIMARY KEY (id_product)
--);
--
--CREATE TABLE Company(
--    id_company BIGINT NOT NULL AUTO_INCREMENT,
--    name VARCHAR(100),
--    street VARCHAR(100),
--    nr VARCHAR(100),
--    zip VARCHAR(7),
--    PRIMARY KEY (id_company)
--);
--
--CREATE TABLE Department(
--    code VARCHAR(10) NOT NULL,
--    number BIGINT NOT NULL,
--    name VARCHAR(100),
--    PRIMARY KEY (code, number)
--);
--
--CREATE TABLE Firm(
--    id_firm BIGINT NOT NULL AUTO_INCREMENT,
--    firm_name VARCHAR(100),
--    PRIMARY KEY (id_firm)
--);
--
--CREATE TABLE Faddress(
--    id_faddress BIGINT NOT NULL AUTO_INCREMENT,
--    street VARCHAR(100),
--    number VARCHAR(20),
--    id_firm BIGINT NOT NULL,
--    PRIMARY KEY (id_faddress)
--);
--
--CREATE TABLE Info(
--    id_info BIGINT NOT NULL AUTO_INCREMENT,
--    details VARCHAR(100),
--    id_firm BIGINT
--);

CREATE TABLE Product(
    id_product BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    price DOUBLE,
    PRIMARY KEY (id_product)
);

CREATE TABLE Detail(
    id_detail BIGINT NOT NULL AUTO_INCREMENT,
    kcal INTEGER,
    id_product BIGINT,
    PRIMARY KEY (id_detail)
);