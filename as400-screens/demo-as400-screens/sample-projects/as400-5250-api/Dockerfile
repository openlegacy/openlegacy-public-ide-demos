FROM openjdk:11-slim
COPY './target/as400-5250-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/as400-5250-api.jar
CMD ["java", "-jar", "./usr/local/as400-5250-api.jar"]
