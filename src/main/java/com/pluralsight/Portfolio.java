package com.pluralsight;

import com.pluralsight.finance.Valuable;

import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }

    public void addAssets(List<Valuable> asset){

    }

    public double getValue(){
        return 0;
    }

    public Valuable getMostValuable(){
        return null;
    }

    public Valuable getLeaseValuable(){
        return null;
    }
}
