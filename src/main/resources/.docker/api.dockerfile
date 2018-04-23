FROM openjdk:8-jre-alpine
MAINTAINER IMPC<mouse-helpdesk@ebi.ac.uk>

### Build first, copy the artefact into the container and run
COPY target/*.jar /
ENTRYPOINT ["java","-Dspring.data.mongodb.host=mongodb","-Djava.security.egd=file:/dev/./urandom","-jar","/api.jar"]

### Build and then run inside the container
#FROM maven:3.5.2-alpine
#COPY . /usr/local/api
#ENTRYPOINT ["mvn","-f/usr/local/api/pom.xml","clean","spring-boot:run","-Dspring-boot.run.jvmArguments='-Dspring.data.mongodb.host=mongodb'"]
