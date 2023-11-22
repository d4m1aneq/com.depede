package org.example.rop.fmp.redirections.ah;

import org.apache.http.HttpStatus;
import org.example.pojo.ChangeDeliveryAddress.Address;
import org.example.pojo.ChangeDeliveryAddress.UserData;
import org.example.pojo.ChangeDeliveryAddress.DeliveryDate;
import org.example.pojo.Token;
import org.example.request.configuration.RequestConfigurationBuilder;
import org.example.rop.BaseEndpoint;
import org.example.test.data.UserAddressGenerator;
import org.example.test.data.UserDataGenerator;


import java.lang.reflect.Type;

import static io.restassured.RestAssured.given;

public class ChangeDeliveryAddressEndpoint extends BaseEndpoint<ChangeDeliveryAddressEndpoint, Token> {

    public Token token;

    @Override
    protected Type getModelType() {
        return Token.class;
    }

    @Override
    public ChangeDeliveryAddressEndpoint sendRequest() {

        DeliveryDate deliveryDate = new DeliveryDate();
        deliveryDate.setDeliveryDate("2023-11-23");

        UserAddressGenerator userAddressGenerator = new UserAddressGenerator();
        Address address = userAddressGenerator.generateAddress();

        UserDataGenerator userDataGenerator = new UserDataGenerator();
        UserData userData = userDataGenerator.generateUserData();

//        UserData userData = new UserData();

//        changeDeliveryAddressForm.setName("Damian Przygodny");
//        changeDeliveryAddressForm.setTitle("Mr.");
//        changeDeliveryAddressForm.setCompanyName("DEPEDE");
//        changeDeliveryAddressForm.setPhoneNumber("77777777777");
//        changeDeliveryAddressForm.setEmailAddress("test@example.com");
//        changeDeliveryAddressForm.setAdditionalInformation("kopytko");
        userData.setDeliveryDate(deliveryDate);
        userData.setAddress(address);


        response = given().spec(RequestConfigurationBuilder.getDefaultRequestSpecification())
                .header("Authorization", token.getTokenType() + " " + token.getAccessToken())
                .body(userData)
                .post("fmp/actions/delivery-address-change/DPD-CZ/13879530110603/entire-process?lang=en");
        return this;
    }

    @Override
    protected int getSuccessStatusCode() {
        return HttpStatus.SC_OK;
    }

    public ChangeDeliveryAddressEndpoint setToken(Token token) {
        this.token = token;
        return this;
    }
}
