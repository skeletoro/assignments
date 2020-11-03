create database if not exists hockeyTeams;

use hockeyTeams;

drop table if exists team;

create table team (
team_id int(12) not null auto_increment, 
team_name varchar(50) not null,
state varchar(20) not null,
city varchar (30) not null, 
primary key(team_id)
);
