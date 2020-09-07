package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Contract {
    private UUID client_id;
    private int contract_number;
    private ArrayList<Parking_place> occupied_places;
    private ArrayList<String> registered_cars;

    public Contract( int contract_number, ArrayList<Parking_place> occupied_places, ArrayList<String> registered_cars) {

        for (Parking_place parking_place:occupied_places)
        {
            if(parking_place.isIs_occupied() == true)
                System.out.println("Cant create such a contract");
        }
        this.client_id = UUID.randomUUID();
        this.contract_number = contract_number;
        for (Parking_place parking_place:occupied_places)
        {
           parking_place.setIs_occupied(true);
        }
        this.occupied_places = occupied_places;
        this.registered_cars = registered_cars;
    }
    public Contract()
    {
        this.client_id =UUID.randomUUID();
        this.contract_number = 0;

        this.occupied_places =  new ArrayList<Parking_place>() ;

    }

    public UUID getClient_id() {
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
