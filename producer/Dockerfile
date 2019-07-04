FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/producer-0.0.1-SNAPSHOT.jar  /app/kafkaDemo/producer-0.0.1-SNAPSHOT.jar
WORKDIR  /app/kafkaDemo
ENTRYPOINT ["java","-jar","producer-0.0.1-SNAPSHOT.jar"]

