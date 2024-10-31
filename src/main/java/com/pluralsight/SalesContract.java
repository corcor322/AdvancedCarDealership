package com.pluralsight;

public class SalesContract extends Contract{
    private double salesTax = 0.05;
    private double recordingFee = 100.0;
    private double processingFee;
    private boolean finance;
    private double monthlyPayment;
    private double totalPrice;


    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicle, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicle);
        this.salesTax = 0.05;
        this.recordingFee = 100.0;
        this.processingFee = 295;
        this.finance = false;

    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
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
