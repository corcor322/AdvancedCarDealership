package com.pluralsight;

public class LeaseContract extends Contract{
    private double stickerPrice;
    private double expectedEndValue = stickerPrice * 0.5;
    private double leaseFee = stickerPrice * 0.07;
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
        monthlyPayment = stickerPrice * 0.04;
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice() {
        totalPrice = monthlyPayment * 36 + leaseFee;
        return totalPrice;
    }
}
