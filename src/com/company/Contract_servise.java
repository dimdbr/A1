package com.company;

import com.sun.management.VMOption;

import java.awt.image.VolatileImage;
import java.util.ArrayList;

public class Contract_servise {
    private Owner owner;
    private ArrayList<Client> clients;

    public Contract_servise(Owner owner, ArrayList<Client> clients) {
        this.owner = owner;
        this.clients = clients;
    }
    public  void add_client(Client new_client)
    {
        clients.add(new_client);
    }
    public void remove_client(Client former_client)
    {
        clients.remove(former_client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void add_client_p_p(Client client, Parking_place parking_place)
    {

    }
}
