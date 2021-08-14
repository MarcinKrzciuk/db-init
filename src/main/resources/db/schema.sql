CREATE TABLE Person(
  id_person BIGINT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  age INTEGER NOT NULL,
  id_address INTEGER,
  gender VARCHAR(15),
  PRIMARY KEY (id_person)
);

CREATE TABLE Address(
    id_address BIGINT NOT NULL AUTO_INCREMENT,
    street VARCHAR(255) NOT NULL,
    street_nr INTEGER NOT NULL,
    zip_code INTEGER NOT NULL,
    PRIMARY KEY (id_address)
);