package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String name;
    private int contract_number;
    private ArrayList<Parking_place> occupied_places;
    private ArrayList<String> registered_cars;
    private double month_pay;

    public Client(String name, int contract_number, ArrayList<Parking_place> occupied_places, ArrayList<String> registered_cars) {
        this.name = name;
        this.contract_number = contract_number;
        this.occupied_places = occupied_places;
        this.registered_cars = registered_cars;
    }

    public String getName() {
        return name;
    }

    public int getContract_number() {
        return contract_number;
    }

    public double getMonth_pay() {
        return month_pay;
    }

    public void setMonth_pay(double month_pay) {
        this.month_pay = month_pay;
    }

    public ArrayList<Parking_place> getOccupied_places() {
        return occupied_places;
    }

    public ArrayList<String> getRegistered_cars() {
        return registered_cars;
    }
    //есть смысл менять только занятые места и привязанные машины
    public void setOccupied_places(ArrayList<Parking_place> occupied_places) {
        this.occupied_places = occupied_places;
    }

    public void setRegistered_cars(ArrayList<String> registered_cars) {
        this.registered_cars = registered_cars;
    }
}
