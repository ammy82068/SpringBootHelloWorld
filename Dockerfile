FROM java:8
WORKDIR /
ADD SpringBootHelloWorld-0.0.1-SNAPSHOT.jar abc.jar
EXPOSE 8080
CMD java - jar abc.jar