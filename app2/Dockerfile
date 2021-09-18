FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/app2.jar
WORKDIR /opt/app2
COPY ${JAR_FILE} app2.jar
ENTRYPOINT ["java","-jar","app2.jar"]