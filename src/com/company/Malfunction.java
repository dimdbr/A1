package com.company;

public class Malfunction {
    private String malf_name;

    private double fix_price;
    public Malfunction()
    {

    }
    public Malfunction(String malf_name, double fix_price) {
        this.malf_name = malf_name;
        this.fix_price = fix_price;
    }

    public String getMalf_name() {
        return malf_name;
    }

    public void setMalf_name(String malf_name) {
        this.malf_name = malf_name;
    }

    public double getFix_price() {
        return fix_price;
    }

    public void setFix_price(double fix_price) {
        this.fix_price = fix_price;
    }
}
