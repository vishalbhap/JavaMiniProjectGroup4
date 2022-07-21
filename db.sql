
DROP database foodapp;

create database foodapp;
use foodapp;


CREATE TABLE user (
  userId INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  password VARCHAR(45) NULL,
  contactNo VARCHAR(15) NULL,
  gender VARCHAR(10) NULL,
  role VARCHAR(15) NULL,
  PRIMARY KEY (userId));



CREATE TABLE food_item (
  foodId INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  category VARCHAR(45) NULL,
  price INT NULL,
  PRIMARY KEY (foodId));



CREATE TABLE cart (
    cartId int NOT NULL AUTO_INCREMENT,
    quantity int NOT NULL,
    PRIMARY KEY (cartId),
    foodId int,
    userId int,
    FOREIGN KEY (foodId) REFERENCES food_item(foodId),
    FOREIGN KEY (userId) REFERENCES user(userId)
    
);




CREATE TABLE OrderTable (
    orderID int NOT NULL AUTO_INCREMENT,
    orderStatus varchar(50),
    orderPrice int ,
    userId int,
	cartId int,
    FOREIGN KEY (userId) REFERENCES user(userId),
	FOREIGN KEY (cartId) REFERENCES cart(cartId),
	PRIMARY KEY (orderId)
);

























