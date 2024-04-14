FROM maven:3.9.6-amazoncorretto-17-al2023 as build

WORKDIR /app

COPY pom.xml pom.xml

RUN mvn dependency:go-offline -B

COPY . .

RUN mvn clean verify -DskipTests

FROM amazoncorretto:17.0.10-al2023
EXPOSE 8902

COPY --from=build /app/target/*.jar app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]
