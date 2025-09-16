# Imobiliária App

A modern real estate management application built with Quarkus, designed to handle property listings, client management, and real estate transactions.

## 🚀 Technologies

- **Java 21** - Programming language
- **Quarkus 3.2.6** - Supersonic Subatomic Java Framework
- **RESTEasy Reactive** - For building reactive REST APIs
- **Hibernate ORM with Panache** - For database operations
- **Test Containers** - For integration testing
- **Mockito** - For unit testing
- **OpenAPI/Swagger** - For API documentation

## 📋 Prerequisites

- Java 21 or later
- Maven 3.9.0 or later
- Docker (for containerized development and testing)
- PostgreSQL (or Docker to run it in a container)

## 🏃‍♂️ Getting Started

### Development Mode

Run the application in dev mode with live coding:

```bash
./mvnw quarkus:dev
```

Access the development UI at: http://localhost:8080/q/dev/

### Running Tests

Run unit tests:
```bash
./mvnw test
```

Run integration tests (requires Docker):
```bash
./mvnw verify -Pintegration-test
```

### Building the Application

Create a production build:
```bash
./mvnw package
```

Build a native executable (requires GraalVM):
```bash
./mvnw package -Dnative
```

### Running with Docker

Build and run using Docker Compose:
```bash
docker-compose up --build
```

## 📚 API Documentation

When running in development mode, access the following endpoints:

- **OpenAPI UI**: http://localhost:8080/q/swagger-ui/
- **OpenAPI Schema**: http://localhost:8080/q/openapi
- **Health Checks**: http://localhost:8080/q/health
- **Metrics**: http://localhost:8080/q/metrics

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/com/imobiliaria/
│   │   ├── application/      # Business logic
│   │   ├── domain/           # Domain models
│   │   └── infrastructure/   # Infrastructure concerns (persistence, API)
│   └── resources/            # Configuration files
└── test/                     # Test files
```

## 🔧 Configuration

Configuration is managed through `application.properties`. Key configurations include:

- Database connection
- Server port
- Logging levels
- Feature toggles

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🐳 Docker Support

### Building a Container Image

Build a container image:
```bash
./mvnw package -Dquarkus.container-image.build=true
```

### Running in Production

Run the application in production mode:
```bash
./mvnw package -Dquarkus.package.type=uber-jar
java -jar target/*-runner.jar
```

### Native Image with Docker

Build a native container image:
```bash
./mvnw package -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true -Dquarkus.native.builder-image=quay.io/quarkus/ubi-quarkus-native-image:21.0-java17
```

You can then execute your native executable with: `./target/imobiliaria-app-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- REST Links ([guide](https://quarkus.io/guides/resteasy-reactive#web-links-support)): Web Links support for Quarkus
  REST. Inject web links into response HTTP headers by annotating your endpoint resources.
- REST Client ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- RESTEasy Classic JSON-B ([guide](https://quarkus.io/guides/rest-json)): JSON-B serialization support for RESTEasy
  Classic
- SmallRye OpenAPI ([guide](https://quarkus.io/guides/openapi-swaggerui)): Document your REST APIs with OpenAPI - comes
  with Swagger UI
- Messaging - Kafka Connector ([guide](https://quarkus.io/guides/kafka-getting-started)): Connect to Kafka with Reactive
  Messaging
- Apache Kafka Client ([guide](https://quarkus.io/guides/kafka)): Connect to Apache Kafka with its native API
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code
  for Hibernate ORM via the active record or the repository pattern
- SmallRye Health ([guide](https://quarkus.io/guides/smallrye-health)): Monitor service health
- SmallRye Metrics ([guide](https://quarkus.io/guides/smallrye-metrics)): Expose metrics for your services
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC

