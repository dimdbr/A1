package com.company;

import java.util.ArrayList;

public class ParkingPlace {
    private int id_p_p;
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

    public int getId_p_p() {
        return id_p_p;
    }

    public boolean isIs_occupied() {
        return isOccupied;
    }

    public Client getPlaceOwner() {
        return placeOwner;
    }

    public void setIs_occupied(boolean isOccupied) {
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
