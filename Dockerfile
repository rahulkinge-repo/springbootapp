FROM openjdk:11-jre-slim
COPY --from=build /workspace/target/*.jar springbootapp-1.0.0.jar
ENTRYPOINT ["java","-jar","/springbootapp-1.0.0.jar"]