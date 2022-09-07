FROM ubuntu:18.04
RUN apt-get update
RUN yes | apt-get install openjdk-11-jdk
RUN update-alternatives --config java
RUN update-alternatives --config javac
RUN apt-get install libssl1.0.0
COPY './target/mf-screens-api.jar' /usr/local
RUN chmod +x ./usr/local/mf-screens-api.jar
CMD ["java", "-jar", "./usr/local/mf-screens-api.jar"]
