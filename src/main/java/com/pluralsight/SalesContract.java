package com.pluralsight;

public class SalesContract extends Contract{
    private double stickerPrice;
    private double salesTax;
    private double recordingFee;
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

    public double getStickerPrice() {
        return stickerPrice;
    }

    public void setStickerPrice(double stickerPrice) {
        this.stickerPrice = stickerPrice;
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
        if (finance = false) {
            return 0;
        }else
            if (stickerPrice < 10000) {
               monthlyPayment = stickerPrice * 0.0425;
            } else
                monthlyPayment = stickerPrice * 0.0525;
        return monthlyPayment;
    }

    @Override
    public double getTotalPrice() {
        if (stickerPrice < 10000) {
            processingFee = 295;
        } else
            processingFee = 495;

        if (finance = false) {
            totalPrice = (stickerPrice + recordingFee + processingFee) * salesTax;
        }else if (finance = true && stickerPrice < 10000) {
            totalPrice = (((stickerPrice * 0.0425) * 48) + recordingFee + processingFee) * salesTax;
        }else
            totalPrice = (((stickerPrice * 0.0525) * 24) + recordingFee + processingFee) * salesTax;

        return totalPrice;
    }
}
