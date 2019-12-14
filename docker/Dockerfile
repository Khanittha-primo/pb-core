FROM openjdk:8-jdk-alpine
RUN mkdir /build &&\
    cd /build &&\
    apk add git &&\
    git clone https://github.com/smprb/pb-core.git . &&\
    chmod +x gradlew &&\
    ./gradlew --no-daemon bootJar &&\
    mkdir /app &&\
    cp build/libs/*.jar /app &&\
    cd /app &&\
    rm -rf /build &&\
    mv *.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
