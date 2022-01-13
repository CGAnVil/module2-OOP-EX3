package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BillManagement billManagement = new BillManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("--Danh sách hóa đơn");
                    billManagement.displayAllBill();
                    break;
                }
                case 2: {
                    System.out.println("--Thêm hóa đơn mới--");
                    System.out.println("--Thêm thông tin khách hàng cho hóa đơn mới---");
                    Bill bill = getBill();
                    System.out.println("Nhập vị trí muốn thêm");
                    int index = scanner.nextInt();
                    billManagement.addInformation(index, bill);
                    break;
                }
                case 3:{
                    System.out.println("Nhập tên khách hàng cần tính tiền");
                    scanner.nextLine();
                    String checkName = scanner.nextLine();
                    billManagement.getFeeByName(checkName);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static Customer getCustomer() {
        scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        System.out.println("Nhập mã số công tơ");
        String meterCode = scanner.nextLine();
        Customer customer = new Customer(name, address, meterCode);
        return customer;
    }

    private static Bill getBill() {
        Customer customer = getCustomer();
        System.out.println("Nhập thông tin hóa đơn");
        System.out.println("Nhập số điện cũ");
        double oldIndex = scanner.nextDouble();
        System.out.println("Nhập thông tin số điện mới");
        double newIndex = scanner.nextDouble();
        Bill bill = new Bill(customer, oldIndex, newIndex);
        return bill;
    }

    private static void menu() {
        System.out.println("--Quản lý hóa đơn--");
        System.out.println("1. Hiển thị tất cả hóa đơn");
        System.out.println("2. Thêm hóa đơn mới");
        System.out.println("3. Hiển thị tiền phải trả theo tên khách hàng");
        System.out.println("0. Thoát chương trình");

    }


}
