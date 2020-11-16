package com.company;

public class Main {

    public static void main(String[] args) {
        Account.setYearInterestRate(4.5);
        Account a1 = new Account(1122, 20000);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1.getDateCreated());
        System.out.println(a1.getMonthlyInterest());
    }
}
