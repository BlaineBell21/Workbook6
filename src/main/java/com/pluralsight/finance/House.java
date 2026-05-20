package com.pluralsight.finance;

import java.time.LocalDate;

public class House extends FixedAsset implements Valuable{

    private String address;
    private int squareFeet;
    private int bedrooms;
    private int bathrooms;
    private double propertyValue;
    private double mortgageBalance;
    private LocalDate purchaseDate;
    private boolean rentedOut;
    private double monthlyRentIncome;

    public House(String assetName, LocalDate purchaseDate, double value) {
        super(assetName, purchaseDate, value);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public double getMortgageBalance() {
        return mortgageBalance;
    }

    public void setMortgageBalance(double mortgageBalance) {
        this.mortgageBalance = mortgageBalance;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isRentedOut() {
        return rentedOut;
    }

    public void setRentedOut(boolean rentedOut) {
        this.rentedOut = rentedOut;
    }

    public double getMonthlyRentIncome() {
        return monthlyRentIncome;
    }

    public void setMonthlyRentIncome(double monthlyRentIncome) {
        this.monthlyRentIncome = monthlyRentIncome;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
