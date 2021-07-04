FROM openjdk:11-slim
COPY './target/mainframe-mq-sdk.jar' /usr/local
RUN chmod +x ./usr/local/mainframe-mq-sdk.jar
CMD ["java", "-jar", "./usr/local/mainframe-mq-sdk.jar"]
