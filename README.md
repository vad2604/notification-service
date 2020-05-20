# Notification Service
This is a tutorial project, which demonstrates Microservice Architecture using Spring Boot, Spring Cloud, Spring config, Docker and Docker Compose.
It simulates service for sending notifications to end user. Notifications can be sent through 3 different methods: SMS, Push and E-mail. 
Every method is supported by its own microservice. All microservices are accessible through gateway and discovered by Eureka server. Configuration files located on separate configuration server.

# Getting started

Clone project from GIT repository, then build it using Maven.
```text
mvn clean install
```
Give execute permissions to file `start.sh` and execute it. Then visit Eureka Server on `localhost:8761` to ensure that it works.

# Application Endpoints

Method | Service | Port | Endpoint |
------| ------ | ------ | ------ |
GET | Eureka | 8761 | http://localhost:8761/
GET | API Gateway | 8079 | http://localhost:8079/<resource>
POST | Service for send SMS | 8079 | http://localhost:8079/sms/sendSms <resource>
POST | Service for send Push | 8079 | http://localhost:8079/push/sendPush<resource>
POST | Service for send E-Mail | 8079 | http://localhost:8079/email/sendEmail<resource>

For POST requests you must specify message text in JSON. Example:
```text
{
  "text": "Hello world"
} 
```
