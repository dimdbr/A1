package com.company;

import java.util.ArrayList;

public  final class Parking {
    private ArrayList<Client> clients;
    private ArrayList<ParkingPlace> parkingPlaces;
    private  final Owner owner;
    private ArrayList<CommunalWorker> cWorkers;
    private ArrayList<Accountant> accountants;
    private boolean open;

    Parking()
    {
        clients = null;
        parkingPlaces = null;
        owner = null;
        cWorkers = null;
        accountants = null;
        open = false;
    }

    public Parking(ArrayList<Client> clients, ArrayList<ParkingPlace> parkingPlaces, Owner owner, ArrayList<CommunalWorker> cWorkers, ArrayList<Accountant> accountants, boolean is_open) {
        this.clients = clients;
        this.parkingPlaces = parkingPlaces;
        this.owner = owner;
        this.cWorkers = cWorkers;
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

    public ArrayList<ParkingPlace> getParkingPlaces() {
        return parkingPlaces;
    }

    public void setParking_places(ArrayList<ParkingPlace> parkingPlaces) {
        this.parkingPlaces = parkingPlaces;
    }

    public ArrayList<CommunalWorker> getC_workers() {
        return cWorkers;
    }

    public void setC_workers(ArrayList<CommunalWorker> c_workers) {
        this.cWorkers = c_workers;
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

    public void setOpen() {
        this.open = true;
    }

    public Owner getOwner() {
        return owner;
    }
}
