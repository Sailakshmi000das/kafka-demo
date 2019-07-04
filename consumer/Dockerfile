FROM openjdk:11.0.3-jdk-slim-stretch
ADD ./target/consumer-0.0.1-SNAPSHOT.jar /app/kafkaDemo/consumer-0.0.1-SNAPSHOT.jar
WORKDIR app/kafkaDemo
ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]