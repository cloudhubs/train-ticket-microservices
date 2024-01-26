FROM amazoncorretto:17.0.10-al2023
EXPOSE 8900

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/app.jar"]
