CREATE TABLE `hh2`.`test_user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NULL,
  PRIMARY KEY (`id`));
  
create table USERS
(
  ID                INT UNSIGNED NOT NULL AUTO_INCREMENT,
  LOGINNAME         VARCHAR(128) not null,
  PASSWORD          VARCHAR(128) not null,
  ENABLED           CHAR(1) default 'Y',
  LAST_UPDATE_DATE  DATETIME,
  LAST_UPDATED_BY   VARCHAR(128),
  CREATION_DATE     DATETIME,
  CREATED_BY        VARCHAR(128),
  PRIMARY KEY (ID)
);


create table authorities (
	LOGINNAME VARCHAR(128) not null,
	authority VARCHAR(128) not null
);

