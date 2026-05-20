package com.pluralsight.finance;

import java.time.LocalDate;

public class Gold extends FixedAsset implements Valuable{
    private double weightInOunces;
    private double purity;
    private double marketPricePerOunce;
    private String form;
    private String serialNumber;
    private LocalDate purchaseDate;

    public Gold(String assetName, LocalDate purchaseDate, double value) {
        super(assetName, purchaseDate, value);
    }

    public double getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public double getPurity() {
        return purity;
    }

    public void setPurity(double purity) {
        this.purity = purity;
    }

    public double getMarketPricePerOunce() {
        return marketPricePerOunce;
    }

    public void setMarketPricePerOunce(double marketPricePerOunce) {
        this.marketPricePerOunce = marketPricePerOunce;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
