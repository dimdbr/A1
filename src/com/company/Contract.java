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
}
