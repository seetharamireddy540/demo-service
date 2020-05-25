FROM amazoncorretto:11
#RUN echo $' \
#public class Pollo { \
#public static void main(String[] args) { \
#System.out.println("Welcome to Amazon Corretto - Pollo!"); \
#} \
#}' > Pollo.java
#RUN javac Pollo.java

WORKDIR /main-app
COPY ./build/libs/demo-0.0.1-SNAPSHOT.jar /Main.jar
EXPOSE 9090
CMD ["java", "-jar", "/Main.jar"]