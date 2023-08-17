FROM openjdk:11.0.10

COPY ./out/production/Airticketapp/ /tmp
WORKDIR /tmp

VOLUME /src/Airtickets

EXPOSE 8080

ENTRYPOINT ["java",Airticketapp"]
