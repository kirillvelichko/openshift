FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/app1.jar
WORKDIR /opt/app1
COPY ${JAR_FILE} app1.jar
ENTRYPOINT ["java","-jar","app1.jar"]