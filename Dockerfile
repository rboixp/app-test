FROM adoptopenjdk/openjdk11:latest
COPY "rws-chef-de-luxe-render-0.0.1-SNAPSHOT.jar" "app-jar"
ENTRYPOINT ["java","-jar","app-jar"]