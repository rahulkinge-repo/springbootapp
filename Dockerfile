FROM openjdk:11-jre-slim
COPY target/*.jar springbootapp-1.0.0.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/springbootapp-1.0.0.jar"]
