package com.company;

public class Tariff {
    private double placePrice;
    private  double waterTariff;
    private  double electricityTariff;
    private  double gasTariff;


    public Tariff() {
    }

    public Tariff(double placePrice, double water_tariff, double electricityTariff, double gasTariff) {
        this.placePrice = placePrice;
        this.waterTariff = water_tariff;
        this.electricityTariff = electricityTariff;
        this.gasTariff = gasTariff;
    }

    public double getPlacePrice() {
        return placePrice;
    }



    public double getWaterTariff() {
        return waterTariff;
    }



    public double getElectricityTariff() {
        return electricityTariff;
    }



    public double getGasTariff() {
        return gasTariff;
    }


    public void setPlacePrice(double placePrice) {
        this.placePrice = placePrice;
    }

    public void setWaterTariff(double water_tariff) {
        this.waterTariff = water_tariff;
    }

    public void setElectricityTariff(double electricityTariff) {
        this.electricityTariff = electricityTariff;
    }

    public void setGasTariff(double gasTariff) {
        this.gasTariff = gasTariff;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "place_price=" + placePrice +
                ", water_tariff=" + waterTariff +
                ", electricity_tariff=" + electricityTariff +
                ", gas_tariff=" + gasTariff +
                '}';
    }
}
