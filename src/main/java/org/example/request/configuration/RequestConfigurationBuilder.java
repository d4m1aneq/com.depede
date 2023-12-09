package org.example.request.configuration;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.DecoderConfig;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.config.EncoderConfig.encoderConfig;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;

public class RequestConfigurationBuilder {

    public RequestSpecBuilder getRequestSpecBuilder() {
        return new RequestSpecBuilder()
                .setContentType("application/json") // Ustawiamy nagłówek ContentType
                .setConfig(RestAssuredConfig.config().objectMapperConfig(objectMapperConfig().defaultObjectMapperType(ObjectMapperType.GSON))); // Ustawiamy Object Mapper, w naszym wypadku jest to oczywiście GSON




    }

    public static RequestSpecification getDefaultRequestSpecification() {
        return new RequestConfigurationBuilder().getRequestSpecBuilder().build();
    }

}