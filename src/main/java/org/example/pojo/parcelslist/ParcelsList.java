package org.example.pojo.parcelslist;
import java.util.List;

public class ParcelsList {

    public class IncomingParcel {

        private String parcelNumber;
        private String shipmentId;
        private String shipmentOriginalCode;
        private String senderName;
        private Status status;
        private String parcelSearchType;
        private Boolean fmpRedirectionPossibility;
        private Boolean returnPossibility;
        private Boolean refused;

        public String getParcelNumber() {
            return parcelNumber;
        }

        public void setParcelNumber(String parcelNumber) {
            this.parcelNumber = parcelNumber;
        }

        public String getShipmentId() {
            return shipmentId;
        }

        public void setShipmentId(String shipmentId) {
            this.shipmentId = shipmentId;
        }

        public String getShipmentOriginalCode() {
            return shipmentOriginalCode;
        }

        public void setShipmentOriginalCode(String shipmentOriginalCode) {
            this.shipmentOriginalCode = shipmentOriginalCode;
        }

        public String getSenderName() {
            return senderName;
        }

        public void setSenderName(String senderName) {
            this.senderName = senderName;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String getParcelSearchType() {
            return parcelSearchType;
        }

        public void setParcelSearchType(String parcelSearchType) {
            this.parcelSearchType = parcelSearchType;
        }

        public Boolean getFmpRedirectionPossibility() {
            return fmpRedirectionPossibility;
        }

        public void setFmpRedirectionPossibility(Boolean fmpRedirectionPossibility) {
            this.fmpRedirectionPossibility = fmpRedirectionPossibility;
        }

        public Boolean getReturnPossibility() {
            return returnPossibility;
        }

        public void setReturnPossibility(Boolean returnPossibility) {
            this.returnPossibility = returnPossibility;
        }

        public Boolean getRefused() {
            return refused;
        }

        public void setRefused(Boolean refused) {
            this.refused = refused;
        }

    }



    public class ParcelList {

        private List<IncomingParcel> incomingParcels;
        private List<Object> returningParcels;
        private ParcelTranslations parcelTranslations;

        public List<IncomingParcel> getIncomingParcels() {
            return incomingParcels;
        }

        public void setIncomingParcels(List<IncomingParcel> incomingParcels) {
            this.incomingParcels = incomingParcels;
        }

        public List<Object> getReturningParcels() {
            return returningParcels;
        }

        public void setReturningParcels(List<Object> returningParcels) {
            this.returningParcels = returningParcels;
        }

        public ParcelTranslations getParcelTranslations() {
            return parcelTranslations;
        }

        public void setParcelTranslations(ParcelTranslations parcelTranslations) {
            this.parcelTranslations = parcelTranslations;
        }

    }


    public class ParcelTranslations {

        private String parcelOfNumbersToday;
        private String parcelOfNumbers;

        public String getParcelOfNumbersToday() {
            return parcelOfNumbersToday;
        }

        public void setParcelOfNumbersToday(String parcelOfNumbersToday) {
            this.parcelOfNumbersToday = parcelOfNumbersToday;
        }

        public String getParcelOfNumbers() {
            return parcelOfNumbers;
        }

        public void setParcelOfNumbers(String parcelOfNumbers) {
            this.parcelOfNumbers = parcelOfNumbers;
        }

    }


    public class Status {

        private Integer status;
        private String description;
        private String deliveryType;
        private String eventDateAndTime;
        private String eventDateAndTimeZoneId;
        private Object city;
        private String countryCode;
        private Boolean homeDelivery;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getDeliveryType() {
            return deliveryType;
        }

        public void setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
        }

        public String getEventDateAndTime() {
            return eventDateAndTime;
        }

        public void setEventDateAndTime(String eventDateAndTime) {
            this.eventDateAndTime = eventDateAndTime;
        }

        public String getEventDateAndTimeZoneId() {
            return eventDateAndTimeZoneId;
        }

        public void setEventDateAndTimeZoneId(String eventDateAndTimeZoneId) {
            this.eventDateAndTimeZoneId = eventDateAndTimeZoneId;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public Boolean getHomeDelivery() {
            return homeDelivery;
        }

        public void setHomeDelivery(Boolean homeDelivery) {
            this.homeDelivery = homeDelivery;
        }

    }
}
