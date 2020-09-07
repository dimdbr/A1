package com.company;

public class Malfunction {
    private String malfName;

    private double fixPrice;
    public Malfunction()
    {
    this.malfName ="";
    this.fixPrice =0D;
    }
    public Malfunction(String malfName, double fixPrice) {
        this.malfName = malfName;
        this.fixPrice = fixPrice;
    }

    public String getMalfName() {
        return malfName;
    }

    public void setMalfName(String malfName) {
        this.malfName = malfName;
    }

    public double getFixPrice() {
        return fixPrice;
    }

    public void setFixPrice(double fixPrice) {
        this.fixPrice = fixPrice;
    }
}
