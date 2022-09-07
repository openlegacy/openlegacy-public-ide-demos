FROM openjdk:11-slim
COPY './target/mf-screens-sdk.jar' /usr/local
RUN chmod +x ./usr/local/mf-screens-sdk.jar
CMD ["java", "-jar", "./usr/local/mf-screens-sdk.jar"]
