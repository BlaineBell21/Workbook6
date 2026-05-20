package com.pluralsight.finance;

import java.time.LocalDate;

public class CreditCard implements Valuable {
    private final String cardNumber;
    private final String cardHolderName;
    private final int cvv;
    private final double interestRate;
    private final double creditLimit;
    private final LocalDate expirationDate;
    private double currentBalance;
    private boolean isActive;
    private String issuingBank;

    public CreditCard(String cardNumber, String cardHolderName, int cvv, double creditLimit, LocalDate expirationDate, double interestRate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
        this.expirationDate = expirationDate;
        this.interestRate = interestRate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public int getCvv() {
        return cvv;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public void makePurchase(double amount){

    }

    public void makePayment(double amount){

    }

    @Override
    public double getValue() {
        return 0;
    }
}
