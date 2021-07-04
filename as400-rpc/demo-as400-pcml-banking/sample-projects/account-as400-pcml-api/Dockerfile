FROM openjdk:11-slim
COPY './target/account-as400-pcml-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/account-as400-pcml-api.jar
CMD ["java", "-jar", "./usr/local/account-as400-pcml-api.jar"]
