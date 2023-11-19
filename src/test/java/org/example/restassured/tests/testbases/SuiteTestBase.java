package org.example.restassured.tests.testbases;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeSuite;
import org.example.properties.EnvironmentConfig;

public class SuiteTestBase {

    @BeforeSuite
    public void setupConfiguration() {
        EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class);

        RestAssured.baseURI = environmentConfig.baseUri();
//        RestAssured.basePath = environmentConfig.basePath();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
