FROM openjdk:8
MAINTAINER suprabha.bhojara@mindtree.com
ADD target/my-demo-project.jar my-demo-project.jar
RUN echo "CI/CD by Dockerizing Jenkins Pipeline."
ENTRYPOINT ["java","-jar","/my-demo-project.jar"]
EXPOSE 8080