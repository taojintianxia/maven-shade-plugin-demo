FROM ${baseImage}
MAINTAINER ${maintainer}

ENV APP_PORT=${appPort}

ADD ${targetFile} /huobi/soft/app.jar

ENTRYPOINT ["java -jar /huobi/soft/app.jar"]

EXPOSE ${exposePort}