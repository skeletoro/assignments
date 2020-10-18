DROP DATABASE IF EXISTS APPDB;
CREATE DATABASE APPDB;

USE APPDB;
  
CREATE TABLE user(
user_name VARCHAR(25) NOT NULL,
email VARCHAR(30) NOT NULL,
password VARCHAR(25) NOT NULL,
PRIMARY KEY (user_name)
);


CREATE TABLE posts (
post VARCHAR(500),
user_name VARCHAR(25) NOT NULL,
post_datetime datetime,
PRIMARY KEY (post),
FOREIGN KEY (user_name) REFERENCES user(user_name)
);


CREATE TABLE comments (
post VARCHAR(500),
user_name VARCHAR(25),
comment VARCHAR(300),
comment_datetime datetime,
PRIMARY KEY (user_name, post),
FOREIGN KEY (user_name) REFERENCES user(user_name),
FOREIGN KEY (post) REFERENCES posts(post)
);