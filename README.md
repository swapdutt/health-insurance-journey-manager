# health-insurance-journey-manager

Health Insurance system built using Microservices, SpringBoot and SpringCloud

#### Contributor : Swapnadeep Dutta

## Introduction

This is a sample health insurance system built for insurance industry using Java, SpringBoot and SpringCloud where a
customer logs in and buys a health insurance policy either for self or family members. The module provides an
opportunity for the customer to buy a health policy according to the suitable policy plan and product for which the
customer is eligible for.

The whole system has been termed as journey manager as it's a kind of journey for the customer for buying the health
policy. The overall system, as per plan (as of now), has been divided into nine microservices:

1. insured-member-journey-manager
2. medical-history-journey-manager
3. policy-details-journey-manager
4. policy-search-journey-manager
5. payment-service-journey-manager
6. pricing-service-journey-manager
7. product-service-journey-manager
8. documents-service-journey-manager
9. email-service-journey-manager

Service registration/Eureka Server is also implemented along-with Business Rules using IBM Operation Decision Manager to
check the eligibility of the customer. Gateway and Authorization journey manager will be considered later in due course
of development.

### Application Architecture

(Will be posted soon)

### Server Ports

1. insured-member-journey-manager : 8100
2. medical-history-journey-manager : 8200
3. policy-details-journey-manager : 8300
4. policy-search-journey-manager : 8400
5. payment-service-journey-manager : 8500
6. pricing-service-journey-manager : 8600
7. product-service-journey-manager : 8700
8. documents-service-journey-manager : 8800
9. email-service-journey-manager : 8900

service-registration-manager is implemented in 8671.

### Technologies used in the project 

1. Java 17
2. Spring MVC
3. SpringBoot
4. Spring Data JPA
5. Spring Cloud
6. Spring Security
7. H2 database (for testing purpose)
8. PostgresSQL database
9. RabbitMQ/Apache Kafka
10. IBM Operational Decision Manager V8.10.0

### APIs developed

Currently, in development phase. Will be updated after completing each module.