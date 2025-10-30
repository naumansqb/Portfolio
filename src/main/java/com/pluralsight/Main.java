package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount("Pam","123212",120);
        Valuable account2= new BankAccount("Nauman","1234",1222);
        account1.deposit(12);
        account2.getValue();
    }
}
