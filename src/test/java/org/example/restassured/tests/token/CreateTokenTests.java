package org.example.restassured.tests.token;
import org.example.pojo.Token;
import org.example.restassured.tests.testbases.SuiteTestBase;
import org.example.rop.CreateTokenEndpoint;
import org.testng.annotations.Test;


public class CreateTokenTests extends SuiteTestBase {
    public Token actualToken;
    @Test
    public void givenWhenPostThenTokenIsCreatedTest() {

        Token token = new Token();
        this.actualToken = new CreateTokenEndpoint()
                .getToken(token)
                .sendRequest()
                .assertRequestSuccess()
                .getResponseModel();
    }
}
