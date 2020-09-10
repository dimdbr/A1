package com.company;

import java.util.ArrayList;
import java.util.UUID;

public final class Contract {
    private final UUID clientId;
    private final int contract_number;
    private ArrayList<ParkingPlace> occupiedPlaces;
    private ArrayList<String> registeredCars;

    public Contract( int contract_number, ArrayList<ParkingPlace> occupied_places, ArrayList<String> registered_cars) {

        for (ParkingPlace parking_place:occupied_places)
        {
            if(parking_place.getIsOccupied() == true)
                System.out.println("Cant create such a contract");
        }
        this.clientId = UUID.randomUUID();
        this.contract_number = contract_number;
        for (ParkingPlace parking_place:occupied_places)
        {
           parking_place.setIsOccupied(true);
        }
        this.occupiedPlaces = occupied_places;
        this.registeredCars = registered_cars;
    }

    public Contract()
    {
        this.clientId =UUID.randomUUID();
        this.contract_number = 0;
        this.registeredCars = new ArrayList<String>();
        this.occupiedPlaces =  new ArrayList<ParkingPlace>() ;

    }

    public UUID getClient_id() {
        return clientId;
    }

    public int getContract_number() {
        return contract_number;
    }

    public ArrayList<ParkingPlace> getOccupied_places() {
        return occupiedPlaces;
    }

    public ArrayList<String> getRegistered_cars() {
        return registeredCars;
    }

    public void setOccupied_places(ArrayList<ParkingPlace> occupied_places) {
        this.occupiedPlaces = occupied_places;
    }

    public void setRegistered_cars(ArrayList<String> registered_cars) {
        this.registeredCars = registered_cars;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "client_id=" + clientId +
                ", contract_number=" + contract_number +
                ", occupied_places=" + occupiedPlaces +
                ", registered_cars=" + registeredCars +
                '}';
    }
}
