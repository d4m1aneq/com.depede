package org.example.test.data;

import org.example.pojo.ChangeDeliveryAddress.UserData;

public class UserDataGenerator extends TestDataGenerator {

    public UserData generateUserData() {

        UserData userData = new UserData();
        userData.setName(faker().name().fullName());
        userData.setTitle("Mr.");
        userData.setCompanyName(faker().company().name());
        userData.setPhoneNumber(faker().phoneNumber().phoneNumber());
        userData.setEmailAddress("test@example.com");
        userData.setAdditionalInformation(faker().witcher().location());
        return userData;

    }
}
