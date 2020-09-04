package com.company;

import java.util.ArrayList;

public class Parking_place {
    private int id_p_p;
    private boolean is_occupied;
    private Client place_owner;

    public Parking_place(int id_p_p, boolean is_occupied, Client place_owner) {
        this.id_p_p = id_p_p;
        this.is_occupied = is_occupied;
        this.place_owner = place_owner;
    }

    public int getId_p_p() {
        return id_p_p;
    }

    public boolean isIs_occupied() {
        return is_occupied;
    }

    public Client getPlace_owner() {
        return place_owner;
    }

    public void setIs_occupied(boolean is_occupied) {
        this.is_occupied = is_occupied;
    }

    /*public void setPlace_owner(Client place_owner) {
        this.place_owner = place_owner;
    }*/
}
