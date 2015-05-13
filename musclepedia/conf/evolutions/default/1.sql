# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table benutzer (
  benutzer_id               integer,
  name                      varchar(255),
  email                     varchar(255),
  passwort                  integer)
;




# --- !Downs

PRAGMA foreign_keys = OFF;

drop table benutzer;

PRAGMA foreign_keys = ON;

