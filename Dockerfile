FROM amazoncorretto:11
WORKDIR /main-app
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /Main.jar
EXPOSE 8080
CMD ["java", "-jar", "/Main.jar"]