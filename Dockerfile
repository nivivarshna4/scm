FROM eclipse-temurin:8-jdk
COPY target/scm-app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]