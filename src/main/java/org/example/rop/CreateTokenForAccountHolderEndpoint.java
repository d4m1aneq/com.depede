package org.example.rop;
import org.apache.http.HttpStatus;
import org.example.pojo.Token;
import org.example.request.configuration.RequestConfigurationBuilder;
import java.lang.reflect.Type;
import static io.restassured.RestAssured.given;



public class CreateTokenForAccountHolderEndpoint extends BaseEndpoint<CreateTokenForAccountHolderEndpoint, Token> {

    private Token token;

    @Override
    protected Type getModelType() {
        return Token.class;
    }

    @Override
    public CreateTokenForAccountHolderEndpoint sendRequest() {

        response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification())
                .header("Authorization", token.getTokenType()+" "+token.getAccessToken())
                .body("\"Test1234!\"")
                .post("users/login/czechia-test@z7vpjrzt.mailosaur.net");
        return this;
    }
    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public CreateTokenForAccountHolderEndpoint setToken(Token token) {
        this.token = token;
        return this;
    }
    public CreateTokenForAccountHolderEndpoint getToken(Token token) {
        this.token = token;
        return this;
    }
}