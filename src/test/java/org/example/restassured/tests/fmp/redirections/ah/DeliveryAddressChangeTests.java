package org.example.restassured.tests.fmp.redirections.ah;

import org.example.pojo.Token;
import org.example.restassured.tests.testbases.SuiteTestBase;
import org.example.restassured.tests.token.CreateTokenForAccountHolderTests;
import org.example.restassured.tests.token.CreateTokenTests;
import org.example.rop.home.myparcels.ParcelsListEndpoint;
import org.testng.annotations.Test;

public class DeliveryAddressChangeTests extends SuiteTestBase {

    @Test
    public void givenLoginTokenWhenPostThenChangeDeliveryAddressTest() {

        CreateTokenTests createTokenTests = new CreateTokenTests();
        createTokenTests.givenWhenPostThenTokenIsCreatedTest();
        Token token = createTokenTests.actualToken;

        CreateTokenForAccountHolderTests createTokenForAHTests = new CreateTokenForAccountHolderTests();
        createTokenForAHTests.givenOAuthTokenWhenPostThenTokenForAccountHolderIsCreatedTest();

        new ParcelsListEndpoint()
                .setToken(token)
                .sendRequest()
                .assertRequestSuccess()
                .getResponseModel();

    }
}
