FROM openjdk:8
ADD target/victorjavierpena-0.0.1-SNAPSHOT.jar victorjavierpena-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "victorjavierpena-0.0.1-SNAPSHOT.jar"]