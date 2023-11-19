package org.example.restassured.tests.token;

import org.example.pojo.Token;
import org.example.restassured.tests.testbases.SuiteTestBase;
import org.example.rop.CreateTokenForAccountHolderEndpoint;
import org.testng.annotations.Test;


public class CreateTokenForAccountHolderTests extends SuiteTestBase {

    @Test
    public void givenOAuthTokenWhenPostThenTokenForAccountHolderIsCreatedTest() {

        CreateTokenTests createTokenTests = new CreateTokenTests();
        createTokenTests.givenWhenPostThenTokenIsCreatedTest();
        Token token = createTokenTests.actualToken;

        new CreateTokenForAccountHolderEndpoint()
                .setToken(token)
                .sendRequest()
                .assertRequestSuccess()
                .getResponseModel();
    }
}