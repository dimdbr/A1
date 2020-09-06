package com.company;

public class Tariff {
    private double place_price;
    private  double water_tariff;
    private  double electricity_tariff;
    private  double gas_tariff;


    public Tariff() {
    }

    public double getPlace_price() {
        return place_price;
    }



    public double getWater_tariff() {
        return water_tariff;
    }



    public double getElectricity_tariff() {
        return electricity_tariff;
    }



    public double getGas_tariff() {
        return gas_tariff;
    }


    public void setPlace_price(double place_price) {
        this.place_price = place_price;
    }

    public void setWater_tariff(double water_tariff) {
        this.water_tariff = water_tariff;
    }

    public void setElectricity_tariff(double electricity_tariff) {
        this.electricity_tariff = electricity_tariff;
    }

    public void setGas_tariff(double gas_tariff) {
        this.gas_tariff = gas_tariff;
    }
}
