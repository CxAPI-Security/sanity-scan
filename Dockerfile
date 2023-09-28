# Use OpenJDK 11 as the base image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Download project dependencies
RUN ./mvnw dependency:go-offline

# Package the application
RUN ./mvnw package -DskipTests

# Expose port 8080 for the application
EXPOSE 8080 

# Set the command to run the application
CMD ["./mvnw", "spring-boot:run"]
