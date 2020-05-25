FROM amazoncorretto:11
RUN echo $' \
public class Pollo { \
public static void main(String[] args) { \
System.out.println("Welcome to Amazon Corretto - Pollo!"); \
} \
}' > Pollo.java
RUN javac Pollo.java
CMD ["java", "Pollo"]