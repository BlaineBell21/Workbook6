package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        // try to deposit money into both accounts account1.deposit(100); account2.deposit(100);
        BankAccount account1 = new BankAccount("123", "Pam", 12500, "checking");
        Valuable account2 = new BankAccount("456", "Gary", 1500, "checking");
        account1.deposit(100);
        //account2.deposit(); doesn't work because Valuable objects only have access to Valuable methods
        System.out.println(account1.getBalance());
    }
}
