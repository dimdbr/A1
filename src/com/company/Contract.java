package com.company;

import java.util.ArrayList;

public class Contract {
    private int client_id;
    private int contract_number;
    private ArrayList<Parking_place> occupied_places;
    private ArrayList<String> registered_cars;

    public Contract(int client_id, int contract_number, ArrayList<Parking_place> occupied_places, ArrayList<String> registered_cars) {
        this.client_id = client_id;
        this.contract_number = contract_number;
        this.occupied_places = occupied_places;
        this.registered_cars = registered_cars;
    }
    public Contract()
    {
        this.client_id =0;
        this.contract_number = 0;

        this.occupied_places =  new ArrayList<Parking_place>() ;

    }

    public int getClient_id() {
        return client_id;
    }

    public int getContract_number() {
        return contract_number;
    }

    public ArrayList<Parking_place> getOccupied_places() {
        return occupied_places;
    }

    public ArrayList<String> getRegistered_cars() {
        return registered_cars;
    }

    public void setOccupied_places(ArrayList<Parking_place> occupied_places) {
        this.occupied_places = occupied_places;
    }

    public void setRegistered_cars(ArrayList<String> registered_cars) {
        this.registered_cars = registered_cars;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "client_id=" + client_id +
                ", contract_number=" + contract_number +
                ", occupied_places=" + occupied_places +
                ", registered_cars=" + registered_cars +
                '}';
    }
}
