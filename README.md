# Movie-Tickets-App

## About the project

Basic example simulating online ticket booking app based on N-Tier Architecture principles.  
Utilizing Java, Spring, Hibernate, MySQL, Apache Tomacat technologies.

## General Info

In this app user can login, choose a movie and cinema hall, make and order.  
Administrator can register new user, add mew movie, add new movie session, 
delete existing movie session, register new cinema hall. All data are saving to the DB.

## Technologies used

- JDK 11
- Spring Web
- Spring REST API
- Spring Security
- Hibernate
- Maven
- Apache Tomcat 9.0.54
- MySQL 8.0.26
- JSON

## Installation

- Clone the project 
- You need Apache Tomacat and MySQL installations, also
- Add database credentials, DB driver, DB URl to db.properties file

## Usage

Login with default credentials:  
ADMIN role:  
login: root@mail.net  
password: 1111  
or  
USER role:  
login: user@mail.net  
password: 2222  

Navigate to the following endpoints, please don't forget
to put above credentials to Authorization tab in case of using Postman:

- GET - /cinema-halls, /movies, /movie-sessions/available - all roles
- GET - /users/by-email?email - ADMIN role
- GET - /orders, /shopping-carts/by-user - USER role
- POST - /register-user - all roles
- POST - /cinema-halls, /movies, /movie-sessions - ADMIN role
- POST - /orders/complete - USER role; 
- PUT /movie-sessions/id - ADMIN role
- PUT - /shopping-carts/movie-sessions?movieSessionId - USER role
- DELETE - /movie-sessions/id - ADMIN role


```html
Examples:

//yourserver/register  {"email":"one@mail.net", "password":"12345678", "repeatPassword":"12345678"} - POST

//yourserver/cinema-halls  {"capacity":110, "description":"Cinema hall"} - POST

//yourserver/movies  {"title":"Interception", "description":"sci-fi movie"} - POST

//yourserver/movie-sessions/available  ?movieId={id}&date=dd.MM.yyyy - GET

//yourserver/movie-sessions  {"movieId":1, "cinemaHallId":1, "showTime":"01.02.2021 10:00"} - POST

//yourserver/movie-sessions/{id} {"movieId":1, "cinemaHallId":1, "showTime":"03.03.2021 12:15"} - PUT

//yourserver/shopping-carts/movie-sessions?movieSessionId=1 - PUT

//yourserver/users/by-email?email=youremail - GET

```
