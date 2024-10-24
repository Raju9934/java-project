FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/calculator-1.0-SNAPSHOT.jar /app/calculator.jar
ENTRYPOINT [ "java","-jar","calculator.jar" ]