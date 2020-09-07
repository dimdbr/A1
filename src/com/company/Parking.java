package com.company;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Client> clients;
    private ArrayList<Parking_place> parking_places;
    private Owner owner;
    private ArrayList<Communal_worker> c_workers;
    private ArrayList<Accountant> accountants;
    private  boolean open;
    Parking()
    {
        clients = null;
        parking_places = null;
        owner = null;
        c_workers = null;
        accountants = null;
        open = false;
    }

    public Parking(ArrayList<Client> clients, ArrayList<Parking_place> parking_places, Owner owner, ArrayList<Communal_worker> c_workers, ArrayList<Accountant> accountants, boolean is_open) {
        this.clients = clients;
        this.parking_places = parking_places;
        this.owner = owner;
        this.c_workers = c_workers;
        this.accountants = accountants;
        this.open = is_open;
    }
    public boolean is_open()
    {
        return open;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Parking_place> getParking_places() {
        return parking_places;
    }

    public void setParking_places(ArrayList<Parking_place> parking_places) {
        this.parking_places = parking_places;
    }

    public ArrayList<Communal_worker> getC_workers() {
        return c_workers;
    }

    public void setC_workers(ArrayList<Communal_worker> c_workers) {
        this.c_workers = c_workers;
    }

    public ArrayList<Accountant> getAccountants() {
        return accountants;
    }

    public void setAccountants(ArrayList<Accountant> accountants) {
        this.accountants = accountants;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Owner getOwner() {
        return owner;
    }
}
