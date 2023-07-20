# micrroservice-hotel-rating-system
The Microservice Hotel Rating System is a project that consists of five microservices built using Spring Boot. The microservices include:

User Service: Responsible for managing user-related operations.
Rating Service: Handles hotel rating-related functionalities.
Hotel Service: Manages hotel-related operations.
API Gateway: Acts as a single entry point for clients to access the different microservices.
Config Service: Utilizes Git as a configuration source to manage the configuration settings for the microservices.
The project incorporates various technologies and features:

Feign Client: Feign is used for making communication between microservices more convenient by providing a declarative way to call other services over HTTP.

API Gateway: The API Gateway provides a central point of entry for clients to interact with the microservices. It can handle authentication, routing, load balancing, and more.

Config Service using Git: The Config Service utilizes Git as a centralized configuration source, allowing the microservices to retrieve their configuration settings from a Git repository.

Fault Tolerance with Circuit Breaker Pattern: The project implements the Circuit Breaker pattern (e.g., using Resilience4j) to handle failures and prevent cascading failures when a service becomes unresponsive.

Exception Handling: Proper exception handling is implemented to gracefully handle errors and provide appropriate responses to clients when exceptions occur within the microservices.

To build this project, you need to create separate Spring Boot applications for each microservice and configure them accordingly. Each microservice should have its own responsibilities and data storage if needed.

The API Gateway should be configured to route incoming requests from clients to the appropriate microservice. It may also handle authentication and other cross-cutting concerns.

Each microservice can use Feign clients to communicate with other services. Feign provides a more intuitive and easy-to-use way to consume RESTful APIs.

The Config Service should be set up to fetch the configuration details for each microservice from the Git repository.

For fault tolerance, you can use libraries like Resilience4j, which provides robust support for implementing circuit breakers and other fault tolerance mechanisms.

Exception handling should be implemented in each microservice to capture and handle different types of exceptions that may occur during their execution.


