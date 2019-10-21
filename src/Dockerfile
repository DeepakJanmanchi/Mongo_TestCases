FROM openjdk:11
WORKDIR usr/src
ADD ./target/userservice-0.0.1-SNAPSHOT.jar /usr/src/userservice-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/usr/src/userservice-0.0.1-SNAPSHOT.jar"]