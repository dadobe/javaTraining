FROM openjdk:8-jdk-alpine
ADD Hackaton2018/src /app
ENV CLASSPATH=app:.
CMD java hackaton2018/Hackaton2018
