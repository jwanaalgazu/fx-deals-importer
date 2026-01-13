FX Deals Importer

FX Deals Importer is a backend application built to import, validate, and store foreign exchange (FX) deal data in a reliable and structured way.
The goal of this project is to ensure that FX deals coming from external sources are validated correctly before being persisted in a database.

This project was built as a practical Spring Boot backend service and focuses on clean architecture, validation, and database integration.
__________________________________________________________________________________


Project Overview

The application exposes a REST API that accepts FX deals in JSON format.
Each deal is validated to ensure data correctness and consistency before it is saved.

The system is designed to be simple, extendable, and production-ready.

___________________________________________________________________________________

Features

REST API for importing FX deals

Validation layer to prevent invalid or duplicate data

PostgreSQL database integration

Spring Boot application structure

Docker support for database setup

Clear separation between controller, service, validation, and persistence layers

___________________________________________________

Technology Stack

Java 17

Spring Boot

Maven

PostgreSQL

Docker

Postman (for testing)


____________________________________________________
How the System Works

A client sends FX deal data as JSON to the API

The controller receives the request

The validator checks the data:

Currency pair format

Deal time validity

Amount correctness

Valid deals are passed to the service layer

The service saves the deals into PostgreSQL

Invalid deals are rejected and logged

____________________________________________________

API Endpoint
Import FX Deals

POST

/api/fx/import


Request Body Example

[
  {
    "currencyPair": "EUR/USD",
    "dealTime": "2026-01-13T10:00:00",
    "amount": 100000
  },
  {
    "currencyPair": "USD/JPY",
    "dealTime": "2026-01-13T11:30:00",
    "amount": 50000
  }
]


________________________________________________________________________
Running the Project
1. Start PostgreSQL Using Docker
docker run --name fx-postgres \
  -e POSTGRES_DB=fxdb \
  -e POSTGRES_USER=fxuser \
  -e POSTGRES_PASSWORD=fxpass \
  -p 5432:5432 \
  -d postgres:15

2. Configure Application Properties
spring.datasource.url=jdbc:postgresql://localhost:5432/fxdb
spring.datasource.username=fxuser
spring.datasource.password=fxpass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8081

3. Run the Application
./mvnw spring-boot:run

4. Test with Postman

Send a POST request to:

http://localhost:8081/api/fx/import


If everything is working correctly, the application will log the received deals and store them in the database.

___________________________________________________-
Project Structure
src/main/java/com/fx/deals
├── FXDealController.java
├── FXDealService.java
├── FXDealValidator.java
├── FXDealRequest.java
├── FXDeal.java
├── FXDealRepository.java
└── FxDealsApplication.java

___________________________________________________
Current Status

Backend API implemented

Validation logic completed

Database integration working

API tested using Postman

Ready for submission or further extension

___________________________________________________

Author

Jwana Al-Gazu
Backend / QA-focused developer
