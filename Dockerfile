FROM openjdk:11-jre-slim
RUN pwd
RUN ls -lrt
COPY target/*.jar springbootapp-1.0.0.jar
RUN pwd
RUN ls -lrt
ENTRYPOINT ["java","-jar","/springbootapp-1.0.0.jar"]