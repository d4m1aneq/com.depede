package org.example.restassured.tests.fmp.redirections.ah;

import org.example.pojo.Token;
import org.example.restassured.tests.testbases.SuiteTestBase;
import org.example.restassured.tests.token.CreateTokenForAccountHolderTests;
import org.example.restassured.tests.token.CreateTokenTests;
import org.example.rop.home.myparcels.ParcelsListEndpoint;
import org.testng.annotations.Test;

public class DeliveryAddressChangeTests extends SuiteTestBase {

    public Token token;

    @Test
    public void givenLoginTokenWhenPostThenChangeDeliveryAddressTest() {


        CreateTokenForAccountHolderTests createTokenForAHTests = new CreateTokenForAccountHolderTests();
        createTokenForAHTests.givenOAuthTokenWhenPostThenTokenForAccountHolderIsCreatedTest();
        Token token = createTokenForAHTests.loggedUserToken;

        new ParcelsListEndpoint()
                .getToken(token)
                .sendRequest()
                .assertRequestSuccess()
                .getResponseModel();

    }
}
