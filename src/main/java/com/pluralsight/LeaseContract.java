package com.pluralsight;

public class LeaseContract extends Contract{
    private double expectedEndValue;
    private double leaseFee;
    private double monthlyPayment;
    private double totalPrice;
    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicle) {
        super(dateOfContract, customerName, customerEmail, vehicle);
    }

    public double getExpectedEndValue() {
        return expectedEndValue;
    }

    public void setExpectedEndValue(double expectedEndValue) {
        this.expectedEndValue = expectedEndValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }
}
