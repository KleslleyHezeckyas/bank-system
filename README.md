# Bank System API

A backend banking system developed with Java and Spring Boot, designed to simulate real-world banking operations with a focus on clean architecture, security, and best practices.

This project was built to go beyond basic CRUD operations, applying concepts commonly used in production-grade backend systems.

## Features

- Client registration and authentication
- Account management
- Financial transactions (deposit, withdrawal, transfer)
- Bill payment processing
- JWT-based authentication and authorization
- Role-based security with Spring Security
- Global exception handling
- Transaction reporting
- Clean layered architecture

## Technologies

- Java 21
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- MySQL
- Hibernate
- Maven

## Project Structure

com.example.banksystem
├── controller
├── service
├── repository
├── entity
├── dto
├── security
├── exception
├── config
├── report
└── BankSystemApplication.java


## Architecture

The application follows a layered architecture:

- **Controller Layer**: Handles HTTP requests and responses
- **Service Layer**: Contains business logic
- **Repository Layer**: Manages data persistence
- **DTO Layer**: Transfers data between client and server
- **Security Layer**: Handles authentication and authorization
- **Exception Layer**: Centralized error handling

This structure ensures separation of concerns, maintainability, and scalability.

## Security

- Authentication is implemented using JWT
- Passwords are securely stored using encryption
- Sensitive configuration data is externalized using environment variables
- Endpoints are protected with Spring Security filters

## Environment Configuration

The application uses environment variables to protect sensitive data.

Example configuration:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update

jwt.secret=${JWT_SECRET}
jwt.expiration=${JWT_EXPIRATION}

Running the Application
Prerequisites

Java 21

Maven

MySQL

Clone the repository:

git clone https://github.com/KleslleyHezeckyas/bank-system.git


Configure the required environment variables

Build the project:

mvn clean install


Run the application:

mvn spring-boot:run


The application will start on port 8080.

Database

MySQL is used as the relational database

Tables are automatically generated using JPA and Hibernate

Purpose

This project was created to demonstrate backend development skills using Java and Spring Boot, focusing on real-world scenarios, security, and clean code principles.

Future Improvements

API documentation with Swagger/OpenAPI

Pagination and filtering

Advanced reporting features

Integration tests

Docker support

Author

Developed by Kleslley Hezeckyas

License

This project is for educational and portfolio purposes.
