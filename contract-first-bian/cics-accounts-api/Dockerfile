FROM openjdk:11-slim
COPY './target/cics-account-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/cics-account-api.jar
CMD ["java", "-jar", "./usr/local/cics-account-api.jar"]
