CREATE DATABASE 'springsecurity';

CREATE TABLE 'springsecurity'.'user' (
  'id' INT NOT NULL,
  'username' VARCHAR(45) NOT NULL,
  'password' VARCHAR(45) NOT NULL,
  'active' TINYINT NOT NULL,
  'roles' VARCHAR(45) NOT NULL,
  PRIMARY KEY ('id'));
