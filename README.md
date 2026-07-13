# Vetrasales Notification Service

A Spring Boot microservice for managing email and SMS notifications in the Vetrasales platform. This service handles sending notifications through multiple channels including email and SMS (via Twilio).

## Overview

The Notification Service is a Java-based microservice built with Spring Boot that provides a centralized notification management system. It supports:
- **Email Notifications** - Sending emails with Spring Mail
- **SMS Notifications** - Sending SMS messages via Twilio SDK
- **Database Persistence** - Storing notification records in MySQL

## Technology Stack

- **Java 17** - Core programming language
- **Spring Boot 3.5.8** - Application framework
- **Spring Data JPA** - ORM for database operations
- **MySQL** - Relational database for notification storage
- **Twilio SDK v10.3.0** - SMS notification delivery
- **Spring Mail** - Email notification delivery
- **Docker** - Containerization

## Project Structure

```
src/main/java/com/notification/email/
├── Application startup and configuration files
├── Controllers - REST API endpoints
├── Services - Business logic for notifications
├── Models/Entities - Data models for notifications
├── Repositories - Database access layer
└── Utilities - Helper classes and configurations

src/main/resources/
└── Configuration files (application.properties, etc.)
```

## Prerequisites

- Java 17 or higher
- Maven 3.9.5 or higher
- MySQL database
- Twilio account credentials (for SMS functionality)

## Getting Started

### Building the Project

```bash
# Using Maven wrapper
./mvnw clean install

# Or using system Maven
mvn clean install
```

### Running the Application

```bash
# Using Maven
./mvnw spring-boot:run

# Or running the compiled JAR
java -jar target/email-0.0.1-SNAPSHOT.jar
```

The service will start on the default Spring Boot port (usually 8080).

## Docker Deployment

A multi-stage Dockerfile is provided for containerized deployment:

```bash
# Build the Docker image
docker build -f Dockerfile.notification -t vetrasales-notification-service .

# Run the container
docker run -p 9091:9091 vetrasales-notification-service
```

The service will be exposed on **port 9091** inside the container.

## Configuration

Configure the application by setting the following environment variables or updating `application.properties`:

```properties
# MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/notification_db
spring.datasource.username=root
spring.datasource.password=password

# Mail Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password

# Twilio Configuration
TWILIO_ACCOUNT_SID=your_account_sid
TWILIO_AUTH_TOKEN=your_auth_token
TWILIO_PHONE_NUMBER=your_twilio_number
```

## API Endpoints

The service provides REST endpoints for:
- Sending email notifications
- Sending SMS notifications
- Retrieving notification history
- Managing notification status

(Refer to the controller classes for detailed endpoint documentation)

## Dependencies

Key dependencies managed by Maven:
- **spring-boot-starter-data-jpa** - JPA data access
- **spring-boot-starter-mail** - Email support
- **spring-boot-starter-web** - REST API support
- **mysql-connector-j** - MySQL JDBC driver
- **twilio** - SMS delivery SDK
- **spring-boot-starter-test** - Testing framework

## Database

The service uses MySQL to persist notification records. Ensure your database is running and accessible with the configured credentials.

## Testing

Run the test suite using:

```bash
./mvnw test
```

## License

This project is part of the Vetrasales platform.

## Contributing

For bug reports, feature requests, or contributions, please create an issue or pull request.
