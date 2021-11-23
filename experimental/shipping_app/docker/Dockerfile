FROM tomcat:9.0.54-jdk11-openjdk-buster

LABEL maintainer="craig.gallen@solent.ac.uk"

ADD ./target/experimental/shipping_app/src/main/java/com/solent/shipping_app/web /usr/local/tomcat/webapps/experimental/shipping_app/src/main/java/com/solent/shipping_app/web

EXPOSE 8080

CMD ["catalina.sh", "run"]