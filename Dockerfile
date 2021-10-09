FROM openjdk:11-jre-slim
RUN pwd
RUN ls -lrt
COPY /home/vsts/work/1/s/target/springbootapp-1.0.0.jar springbootapp-1.0.0.jar
RUN pwd
RUN ls -lrt
ENTRYPOINT ["java","-jar","/springbootapp-1.0.0.jar"]