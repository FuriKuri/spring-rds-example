FROM openjdk:8-alpine
MAINTAINER tf.pack@gmail.com

WORKDIR /app
COPY ./target/*.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "./app.jar", "-XX:+ExitOnOutOfMemoryError"]