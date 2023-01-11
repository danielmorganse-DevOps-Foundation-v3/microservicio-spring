FROM openjdk:11-jre

EXPOSE 8080

ADD target/testing-web-complete-0.0.1-SNAPSHOT.jar /app/testing-web-complete-0.0.1-SNAPSHOT.jar

WORKDIR /app

CMD java -jar testing-web-complete-0.0.1-SNAPSHOT.jar
