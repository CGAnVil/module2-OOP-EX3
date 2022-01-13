package com.codegym;

public class BillManagement {
    Bill[] bills = new Bill[0];

    public Bill[] getBills() {
        return bills;
    }

    public void addInformation(int index, Bill bill){
        Bill[] newBills = new Bill[bills.length + 1];
        for (int i = 0; i < newBills.length; i++) {
            if(i < index){
                newBills[i] = bills[i];
            }else if (i == index){
                newBills[i] = bill;
            }else {
                newBills[i] = bills[i-1];
            }
        }
        bills = newBills;
    }
public void displayAllBill(){
    for (int i = 0; i < bills.length; i++) {
        System.out.println(bills[i]);
    }
}

public void getFeeByName (String checkname){
        boolean found = false;
    for (int i = 0; i < bills.length; i++) {
        if(bills[i].getCustomer().getName().toLowerCase().contains(checkname)){
            found = true;
            showFee(i);
            break;
        }
    }
if(!found){
    System.out.println("Tên không đúng");
    }
}

public void showFee(int index){
    System.out.println(bills[index].getFee());
}

}
