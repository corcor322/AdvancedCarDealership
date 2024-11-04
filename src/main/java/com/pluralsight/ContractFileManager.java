package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.dgc.Lease;

public class ContractFileManager {
    public Contract getContract() {

        return null;
    }
    public Contract saveContract(Contract contract) {
        // accept a contract parameter, use instanceof to check the type of contract
        String fileName = "contracts.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            if (contract instanceof LeaseContract) {
                LeaseContract lease = (LeaseContract) contract;
                bw.write("Lease Contract:");
                bw.newLine();
                bw.write("Customer Name: " + lease.getCustomerName());
                bw.newLine();
                bw.write("Customer email: " + lease.getCustomerEmail());
                bw.newLine();
                bw.write("Vehicle :" + lease.getVehicle());
                bw.newLine();
                bw.write("Expected End Value: $" + lease.getExpectedEndValue());
                bw.newLine();
                bw.write("Lease Fee: $" + lease.getLeaseFee());
                bw.newLine();
                bw.write("Monthly Payment: $" + lease.getMonthlyPayment());
                bw.newLine();
                bw.write("Total Price: $" + lease.getTotalPrice());
                bw.newLine();

            } else if (contract instanceof SalesContract) {
                SalesContract sales = (SalesContract) contract;
                bw.write("Sales Contract:");
                bw.newLine();
                bw.write("Customer Name: " + sales.getCustomerName());
                bw.newLine();
                bw.write("Customer email: " + sales.getCustomerEmail());
                bw.newLine();
                bw.write("Vehicle: " + sales.getVehicle());
                bw.newLine();
                bw.write("Sticker Price: $" + sales.getStickerPrice());
                bw.newLine();
                bw.write("Processing Fee: $" + sales.getProcessingFee());
                bw.newLine();
                bw.write("Sales Tax: $" + sales.getSalesTax());
                bw.newLine();
                bw.write("Monthly Payment: $" + sales.getMonthlyPayment());
                bw.newLine();
                bw.write("Total Price: $" + sales.getTotalPrice());
                bw.newLine();
            } else {
                System.out.println("Unknown contract type. Contract not saved.");
            }
            bw.newLine();
            System.out.println("Contract saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
