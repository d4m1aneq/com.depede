package org.example.pojo.ChangeDeliveryAddress;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChangeDeliveryAddressForm {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("title")
    @Expose
    private String title;
//    @SerializedName("additional_information")
//    @Expose
    private String additionalInformation;
//    @SerializedName("company_name")
//    @Expose
    private String companyName;
//    @SerializedName("email_address")
//    @Expose
    private String emailAddress;
//    @SerializedName("phone_number")
//    @Expose
    private String phoneNumber;
    @SerializedName("address")
    @Expose
    private Address address;
//    @SerializedName("title")
//    @Expose
    private DeliveryDate deliveryDate;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public DeliveryDate getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(DeliveryDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}

