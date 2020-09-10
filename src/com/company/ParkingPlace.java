package com.company;

import java.util.ArrayList;

public  final class ParkingPlace {
    private final int id_p_p;
    private boolean isOccupied;
    private Client placeOwner;

    public ParkingPlace(int id_p_p, boolean isOccupied, Client placeOwner) {
        this.id_p_p = id_p_p;
        this.isOccupied = isOccupied;
        this.placeOwner = placeOwner;
    }

    public ParkingPlace(int id_p_p, boolean isOccupied) {
        this.id_p_p = id_p_p;
        this.isOccupied = isOccupied;

    }

    public  ParkingPlace()
    {
        this.id_p_p = 0;
        this.isOccupied=false;
        this.placeOwner = new Client();
    }

    public int getPackingPlaceId() {
        return id_p_p;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public Client getPlaceOwner() {
        return placeOwner;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setPlaceOwner(Client v) {
        this.placeOwner = placeOwner;
    }

    @Override
    public String toString() {
        return "Parking_place{" +
                "id_p_p=" + id_p_p +
                ", is_occupied=" + isOccupied +

                '}';
    }
}
