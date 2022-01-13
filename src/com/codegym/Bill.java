package com.codegym;

public class Bill {
    private Customer customer;
    private double oldIndex;
    private double newIndex;
    private double fee;

    public Bill() {
    }

    public Bill(Customer customer, double oldIndex, double newIndex) {
        this.customer = customer;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.fee = (newIndex - oldIndex) * 750;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }

    public double getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }

    public double getFee() {
        return (newIndex - oldIndex) * 750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", fee=" + fee +
                '}';
    }
}
