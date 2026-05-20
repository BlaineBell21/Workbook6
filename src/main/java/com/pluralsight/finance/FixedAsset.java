package com.pluralsight.finance;

import java.time.LocalDate;

abstract class FixedAsset implements Valuable{
    private String assetName;
    private LocalDate purchaseDate;
    private double value;

    public FixedAsset(String assetName, LocalDate purchaseDate, double value) {
        this.assetName = assetName;
        this.purchaseDate = purchaseDate;
        this.value = value;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){

        return null;
    }
}
