FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/bankingdockerapp-0.0.1-SNAPSHOT.jar bankingdockerapp.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /bankingdockerapp.jar" ]