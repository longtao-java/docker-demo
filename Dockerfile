FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/docekr-demo-0.0.1-SNAPSHOT.jar docker-demo.jar
ENTRYPOINT ["java","-jar","/docker-demo.jar","&"]