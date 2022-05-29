FROM maven:latest
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean package
# CMD ["sleep", "5000"]
ENTRYPOINT java -XX:+PrintFlagsFinal -jar $JAVA_OPTIONS /build/target/sample-0.0.1-SNAPSHOT.jar
