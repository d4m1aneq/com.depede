package org.example.test.data;
import org.example.pojo.ChangeDeliveryAddress.Address;


public class UserAddressGenerator extends TestDataGenerator {

    public Address generateAddress() {

        Address address = new Address();
        address.setCity(faker().address().cityName());
        address.setStreetName(faker().address().streetName());
        address.setStreetNumber(faker().address().streetAddressNumber());
        address.setZipCode("14100");
        address.setCountryCode("CZ");

        return address;
    }
}
