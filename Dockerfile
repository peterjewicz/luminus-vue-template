FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/vue-test.jar /vue-test/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/vue-test/app.jar"]
