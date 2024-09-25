FROM maven:3.9.6-amazoncorretto-17-al2023 as build

WORKDIR /app

COPY pom.xml pom.xml

RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean verify -DskipTests

FROM amazoncorretto:17.0.10-al2023 as telemetry
EXPOSE 8887

ARG version=2.3.0

ADD --chmod=644 https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v$version/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENV JAVA_TOOL_OPTIONS=-javaagent:/opentelemetry-javaagent.jar

COPY --from=build /app/target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]

FROM amazoncorretto:17.0.10-al2023
EXPOSE 8887

COPY --from=build /app/target/*.jar app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]
