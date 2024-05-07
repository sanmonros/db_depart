FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/department-service-0.0.1.jar
COPY ${JAR_FILE} department-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","department-service.jar"]