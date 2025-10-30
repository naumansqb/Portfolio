package com.pluralsight;

import com.pluralsight.finance.*;
import com.pluralsight.assets.*;

public class FinancialApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Retirement Fund", "Alex");

        BankAccount account1 = new BankAccount("Checking", "1111", 5000);
        BankAccount account2 = new BankAccount("Savings", "2222", 10000);
        CreditCard card1 = new CreditCard("Visa", "3333", -2000); // negative = debt
        Gold gold1 = new Gold(25, "Gold Bar", 2500);
        House house1 = new House("Family Home", 200000, 1995, 2400, 3);
        Jewelry ring = new Jewelry("Diamond Ring", 5000, 18);

        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(card1);
        portfolio.add(gold1);
        portfolio.add(house1);
        portfolio.add(ring);


        System.out.println("Total Portfolio Value: " + portfolio.getValue());
        System.out.println("Most Valuable Asset: " + portfolio.getMostValuable());
        System.out.println("Least Valuable Asset: " + portfolio.getLeastValuable());




    }
}
