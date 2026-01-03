FROM eclipse-temurin:17-jre
WORKDIR /app
ARG JAR_File=targets/*.jar
COPY ./targets/portfolio-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Xmx256m","-jar","app.jar"]