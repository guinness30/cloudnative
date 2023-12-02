FROM openjdk:17
ARG JAR-FILE=*.JAR
COPY build/libs/*.JAR app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]