FROM openjdk:11-slim
COPY './target/microsoft-sqlserver-sp-api.jar' /usr/local
COPY './target/*.dylib' './target/*.so' './target/*.dll' /usr/lib/java/
RUN chmod +x ./usr/local/microsoft-sqlserver-sp-api.jar
CMD ["java", "-jar", "./usr/local/microsoft-sqlserver-sp-api.jar"]
