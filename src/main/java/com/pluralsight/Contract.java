package com.pluralsight;
//TODO: Verify correct constructor getters and setters
public abstract class Contract {
    private String dateOfContract;
    private String customerName;
    private String customerEmail;
    private String vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, String vehicle) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicle = vehicle;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    //TODO: Constructor

    //TODO: Getters and setters aside from totalprice and monthly payment


    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
