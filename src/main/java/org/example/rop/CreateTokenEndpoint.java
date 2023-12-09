package org.example.rop;
import org.apache.http.HttpStatus;
import org.example.pojo.Token;
import org.example.request.configuration.RequestConfigurationBuilder;
import java.lang.reflect.Type;
import static io.restassured.RestAssured.given;


public class CreateTokenEndpoint extends BaseEndpoint<CreateTokenEndpoint, Token> {
    public Token token;

    @Override
    protected Type getModelType() {
        return Token.class;
    }

    @Override
    public CreateTokenEndpoint sendRequest() {
         response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification()).body(token)
                .header("Authorization", "Basic Zm1wOmZtcHNlY3JldA==")
                .queryParam("grant_type", "client_credentials")
                .when().post("oauth/token");
        return this;
    }
    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public CreateTokenEndpoint getToken(Token token) {
        this.token = token;
        return this;
    }

}
