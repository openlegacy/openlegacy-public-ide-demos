FROM openjdk:11-slim
COPY './target/policy-as400-cobol-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/policy-as400-cobol-api.jar
CMD ["java", "-jar", "./usr/local/policy-as400-cobol-api.jar"]
