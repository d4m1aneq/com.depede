package org.example.pojo.ChangeDeliveryAddress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    public String city;
    private String streetName;
    private String streetNumber;
    private String zipCode;
    private String countryCode;


    public String getCity() { return city; }
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() { return streetName; }
    public void setStreetName(String streetName) {
        this.streetName = streetName;

    } public String getStreetNumber() { return streetNumber; }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;

    } public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
