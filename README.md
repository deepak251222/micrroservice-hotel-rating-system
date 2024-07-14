# micrroservice-hotel-rating-system


Project: Microservice Hotel Rating System

Description:
Developed a distributed and scalable Microservice Hotel Rating System to allow users to rate and review hotels. The system was built using microservice architecture to ensure flexibility, modularity, and easy scalability.

Technologies Used:
- Spring Boot
- Java 8
- Microservice
- Spring Cloud (Eureka for service discovery, Zuul for API gateway)
- Docker (for containerization)
- MongoDB and sql

Key Contributions:
- Designed and implemented microservices to handle various functionalities, such as user registration, hotel rating, and review management.
- Utilized Spring Boot to develop independent and loosely coupled microservices, enabling seamless communication and independent deployment.
- Implemented Spring Cloud components (Eureka and Zuul) to facilitate service discovery and API gateway, simplifying the interaction between microservices.
- Utilized Docker for containerization, ensuring consistent deployment and scalability across different environments.
- Designed the database schema for MongoDB, efficiently storing user information, hotel ratings, and reviews.
- Conducted load testing and performance optimization to ensure the system could handle a high volume of concurrent user requests.
- Implemented user authentication and authorization mechanisms to secure the API endpoints using JSON Web Tokens (JWT) and Spring Security.
- Ensured fault tolerance by implementing circuit breakers using Spring Cloud Circuit Breaker (e.g., Netflix Hystrix).
- Documented the architecture and API endpoints to assist with onboarding new developers and stakeholders.
- Utilized version control (e.g., Git) to track code changes and enable collaboration with the development team.

Results:
- Successfully delivered a robust and scalable Microservice Hotel Rating System, enhancing the user experience and overall satisfaction with hotel reviews.
- Improved the system's performance and reliability, ensuring smooth operation even during peak usage periods.
- Received positive feedback from team members and stakeholders for meeting project deadlines and delivering high-quality microservices.
- Contributed to the adoption of microservice architecture within the organization, promoting its benefits for future projects.


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


