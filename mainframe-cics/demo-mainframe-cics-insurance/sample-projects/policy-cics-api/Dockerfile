FROM openjdk:11-slim
COPY './target/policy-cics-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/policy-cics-api.jar
CMD ["java", "-jar", "./usr/local/policy-cics-api.jar"]
