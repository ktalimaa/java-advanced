package org.sda.model;

public class Passenger extends Person {

    private PaymentType paymentType;        // here using PaymentType as enum
    private String destinationAddress;

    public Passenger() {

    }

    public Passenger(PaymentType paymentType, String destinationAddress) {
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public Passenger(Long id, String address, PaymentType paymentType, String destinationAddress) {
        super(id, address);             // super refers to the parent class
        this.paymentType = paymentType;
        this.destinationAddress = destinationAddress;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    @Override
    public String getEmail() {
        return "sda@gmail.com";
    }

    public String getAddresses() {
        return "Source address: " + super.getAddress() + ", destination address: " + getDestinationAddress();     // super used to get methods from parent class


    }

    @Override
    public String toString() {
        return "Passenger{" +
                "paymentType='" + paymentType + '\'' +
                ", destinationAddress='" + destinationAddress + '\'' +
                '}';
    }

    public boolean getHiddenAlive() {
        return super.isAlive();
    }


}
