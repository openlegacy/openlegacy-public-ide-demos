FROM openjdk:11-slim
COPY './target/mainframe-mq-api.jar' /usr/local
RUN chmod +x ./usr/local/mainframe-mq-api.jar
CMD ["java", "-jar", "./usr/local/mainframe-mq-api.jar"]
