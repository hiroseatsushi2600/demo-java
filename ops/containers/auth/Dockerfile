# Stage 1: Build the application
FROM eclipse-temurin:21.0.3_9-jdk AS build
WORKDIR /app
COPY . .
RUN ./gradlew :auth:bootJar

# Stage 2: Run the application
FROM eclipse-temurin:21.0.3_9-jre
WORKDIR /app
COPY --from=build /app/auth/build/libs/*.jar auth.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "auth.jar"]
