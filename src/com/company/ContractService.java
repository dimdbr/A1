package com.company;

import com.sun.management.VMOption;

import java.awt.image.VolatileImage;
import java.security.cert.CertificateParsingException;
import java.util.ArrayList;

public final class ContractService {
    private Owner owner;
    private ArrayList<Client> clients;
    private ArrayList<CommunalWorker>communalWorkers;

    public ContractService(Owner owner, ArrayList<Client> clients,ArrayList<CommunalWorker> communal_workers) {
        this.owner = owner;
        this.clients = clients;
        this.communalWorkers = communal_workers;
        System.out.println("Сознан сервис ");
    }

    public ContractService(Object object, ArrayList<Client> clients) {
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

    public void add_client_p_p(Client client, ParkingPlace parking_place) {
        Contract contract = client.getContract();
        if (parking_place.getIsOccupied()==false) {
            ArrayList<ParkingPlace> parking_places = contract.getOccupied_places();
            parking_place.setIsOccupied();
            parking_places.add(parking_place);
            contract.setOccupied_places(parking_places);
            client.setContract(contract);

        }
        else
        {
            System.out.println("this parking place is already occupied");
        }

    }

    public void add_client_car(Client client, String car_number) throws NullPointerException
    {
        Contract contract = client.getContract();
        ArrayList<String> registered_cars  = contract.getRegistered_cars();
        registered_cars.add(car_number);
        contract.setRegistered_cars(registered_cars);
        client.setContract(contract);
    }

    public void remove_client_p_p(Client client, ParkingPlace parking_place) {
        Contract contract = client.getContract();
        ArrayList<ParkingPlace> parking_places = contract.getOccupied_places();
        parking_places.remove(parking_place);
        parking_place.setNotOccupied();
        contract.setOccupied_places(parking_places);
        client.setContract(contract);
    }

    public void remove_client_car(Client client, String car_number)
    {
        Contract contract = client.getContract();
        ArrayList<String> registered_cars = contract.getRegistered_cars();
        registered_cars.remove(car_number);
        contract.setRegistered_cars(registered_cars);
        client.setContract(contract);
    }

    public void collect_money() {
        double income;
        income = 0;
        for (Client client : clients) {
            income += client.getMonthPay() *
                      client.getContract()
                            .getOccupied_places()
                            .size();
        }
        for(CommunalWorker communal_worker:communalWorkers)
        {
            income-=communal_worker.getSalary();
        }
        owner.getMoney(income);
    }
}