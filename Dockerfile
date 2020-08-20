FROM openjdk:8

ENV SERVICE_NAME hello-world-backend

ADD target /api-hello-world-backend-*.jar $APP_HOME/hello-world-backend.jar

RUN mkdir /opt/reactor-netty

ENTRYPOINT ["java","-jar","hello-world-backend.jar"]
EXPOSE 9090