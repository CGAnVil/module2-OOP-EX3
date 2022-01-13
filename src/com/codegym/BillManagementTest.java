package com.codegym;

public class BillManagementTest {
    public static void main(String[] args) {
        Customer customer = new Customer("minh", "123", "CT001");
        Customer customer2 = new Customer("quan", "123", "CT002");
        Customer customer3 = new Customer("sang", "123", "CT003");
        Bill bill = new Bill(customer, 15,50);
        Bill bill2 = new Bill(customer2, 5,30);
        Bill bill3 = new Bill(customer3, 10,40);
        BillManagement billManagement = new BillManagement();
        billManagement.addInformation(0,bill);
        billManagement.addInformation(1,bill2);
        billManagement.addInformation(2,bill3);
        billManagement.displayAllBill();
        billManagement.showFee(2);
    }
}
