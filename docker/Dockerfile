FROM tomcat:9.0.54-jdk11-openjdk-buster

LABEL maintainer="craig.gallen@solent.ac.uk"

ADD ./target/shiplane /usr/local/tomcat/webapps/shiplane

EXPOSE 8080

CMD ["catalina.sh", "run"]