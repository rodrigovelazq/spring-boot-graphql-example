# Spring Boot GraphQL Example
This is an example of using GraphQL using the Spring Boot freamework.

## Installation
You need to install JDK 8 
```bash
sudo apt install openjdk-8-jdk
```
You must also have Postgresql installed and create a Database with the name `gqldb` and run the migration `/spring-boot-graphql-example/src/main/resources/db/migrate.sql`. The username and password shoud be 
`postgres`. You can change this in `/spring-boot-graphql-example/src/main/resources/application.properties`  

/spring-boot-graphql-example/src/main/resources/db/migrate.sql

Run the spring boot application.
```bash
mvn spring-boot:run
```

## Access to the services of the application 
[http://localhost:8080/graphiql](http://localhost:8080/graphiql)
