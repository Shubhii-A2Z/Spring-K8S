FROM eclipse-temurin:17-jdk
EXPOSE 8080
ADD build/libs/kubernetes-0.0.1-SNAPSHOT.jar springboot-k8s-demo.jar
ENTRYPOINT ["java","-jar","springboot-k8s-demo.jar"]
