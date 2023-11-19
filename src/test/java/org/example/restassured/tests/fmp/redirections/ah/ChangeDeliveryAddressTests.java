package org.example.restassured.tests.fmp.redirections.ah;

import org.example.pojo.Token;
import org.example.restassured.tests.testbases.SuiteTestBase;
import org.example.restassured.tests.token.CreateTokenForAccountHolderTests;
import org.example.restassured.tests.token.CreateTokenTests;
import org.example.rop.fmp.redirections.ah.ChangeDeliveryAddressEndpoint;
import org.testng.annotations.Test;

public class ChangeDeliveryAddressTests extends SuiteTestBase {


    @Test
    public void givenLoginTokenWhenPostThenChangeDeliveryAddressTest() {

        CreateTokenTests createTokenTests = new CreateTokenTests();
        createTokenTests.givenWhenPostThenTokenIsCreatedTest();
        Token token = createTokenTests.actualToken;

        CreateTokenForAccountHolderTests createTokenForAHTests = new CreateTokenForAccountHolderTests();
        createTokenForAHTests.givenOAuthTokenWhenPostThenTokenForAccountHolderIsCreatedTest();

        new ChangeDeliveryAddressEndpoint()
                .setToken(token)
                .sendRequest()
                .assertRequestSuccess()
                .getResponseModel();
    }
}

