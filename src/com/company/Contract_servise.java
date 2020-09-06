package com.company;

import com.sun.management.VMOption;

import java.awt.image.VolatileImage;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;

public class Contract_servise {
    private Owner owner;
    private ArrayList<Client> clients;
    private ArrayList<Communal_worker>communal_workers;
    public Contract_servise(Owner owner, ArrayList<Client> clients,ArrayList<Communal_worker> communal_workers) {
        this.owner = owner;
        this.clients = clients;
        this.communal_workers = communal_workers;
    }

    public Contract_servise(Object object, ArrayList<Client> clients) {
        if (object instanceof Owner) {
            this.owner = (Owner) object;
            this.clients = clients;
        }
        else
        {
            System.out.println("cant create service");
        }
    }

    public void add_client(Client new_client) {
        clients.add(new_client);
    }

    public void remove_client(Client former_client) {
        clients.remove(former_client);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public void add_client_p_p(Client client, Parking_place parking_place) {
        Contract contract = client.getContract();
        if (parking_place.isIs_occupied()==false) {
            ArrayList<Parking_place> parking_places = contract.getOccupied_places();
            parking_place.setIs_occupied(true);
            parking_places.add(parking_place);
            contract.setOccupied_places(parking_places);
            client.setContract(contract);

        }
        else
        {
            System.out.println("this parking place is already occupied");
        }
    }

    public void remove_client_p_p(Client client, Parking_place parking_place) {
        Contract contract = client.getContract();
        ArrayList<Parking_place> parking_places = contract.getOccupied_places();
        parking_places.remove(parking_place);
        parking_place.setIs_occupied(false);

        contract.setOccupied_places(parking_places);
        client.setContract(contract);
    }

    public void collect_money() {
        double income = 0;
        for (Client client : clients) {
            income += client.getMonth_pay() * client.getContract().getOccupied_places().size();
        }
        for(Communal_worker communal_worker:communal_workers)
        {
            income-=communal_worker.getSalary();
        }
        owner.getMoney(income);
    }
}