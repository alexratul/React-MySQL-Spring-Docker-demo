# ---- Build stage ----
FROM docker.io/library/maven:3.9.11-sapmachine-21 as build
WORKDIR /workspace

COPY spring-boot-library/pom.xml .
RUN mvn -B -q -DskipTests dependency:go-offline

COPY spring-boot-library/src ./src
RUN mvn -B -q -DskipTests package

# ---- Runtime stage ----
FROM docker.io/library/maven:3.9.11-sapmachine-21
RUN useradd -r -u 10001 -m spring
WORKDIR /app

COPY --from=build /workspace/target/*.jar /app/app.jar

ENV JAVA_TOOL_OPTIONS="-XX:MaxRAMPercentage=75.0 -XX:+UseStringDeduplication" \
    SPRING_PROFILES_ACTIVE=prod \
    SERVER_PORT=8080

EXPOSE 8080
USER spring
ENTRYPOINT ["java","-jar","/app/app.jar"]
