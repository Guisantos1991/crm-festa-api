# --- build ---
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# copia só o que precisa do módulo
COPY festa-crm/pom.xml festa-crm/pom.xml
COPY festa-crm/src festa-crm/src

WORKDIR /app/festa-crm
RUN mvn -DskipTests package

# --- run ---
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/festa-crm/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]