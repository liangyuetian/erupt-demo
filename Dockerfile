FROM lwieske/java-8:latest

ENV service_name_arg=dashed

ARG BUILD_ENV
ENV env_arg=${BUILD_ENV}

WORKDIR /

COPY ./target/dashed-0.0.1-SNAPSHOT.jar app.jar

