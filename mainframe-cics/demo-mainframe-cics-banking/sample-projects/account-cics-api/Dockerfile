FROM openjdk:11-slim
COPY './target/account-cics-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/account-cics-api.jar
CMD ["java", "-jar", "./usr/local/account-cics-api.jar"]
