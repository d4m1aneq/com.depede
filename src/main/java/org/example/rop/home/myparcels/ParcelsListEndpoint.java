package org.example.rop.home.myparcels;

import org.apache.http.HttpStatus;
import org.example.pojo.Token;
import org.example.request.configuration.RequestConfigurationBuilder;
import org.example.rop.BaseEndpoint;

import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class ParcelsListEndpoint extends BaseEndpoint<ParcelsListEndpoint, Token> {
    public Token token;

    @Override
    protected Type getModelType() {
        return Token.class;
    }

    @Override
    public ParcelsListEndpoint sendRequest() {

        response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification())
                .header("Authorization", token.getTokenType() + " " + token.getAccessToken())
                .get("v3/parcels?lang=en&bu=DPD-CZ");
        return this;
    }

    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public ParcelsListEndpoint setToken(Token token) {
        this.token = token;
        return this;
    }
}
