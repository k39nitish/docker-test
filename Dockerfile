FROM openjdk:17 
COPY target/*.war sample-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java" , "-jar" , "sample-0.0.1-SNAPSHOT.war" ]
