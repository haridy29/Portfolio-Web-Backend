FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app
COPY src src
COPY pom.xml .
RUN mvn clean install -DskipTests=true

FROM openjdk:17
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/target/*.jar /app/*.jar
ENTRYPOINT ["java","-jar","/app/*.jar"]