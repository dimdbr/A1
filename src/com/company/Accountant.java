package com.company;

import java.util.ArrayList;

public class Accountant extends Worker {
    private ArrayList<Client> clients_under_acc;//кажодому бугалтеру часть клиентов на расчет

    public Accountant(String name, double salary, ArrayList<Client> clients_under_acc) {
        super(name, salary);
        this.clients_under_acc = clients_under_acc;
    }

    public Accountant(ArrayList<Client> clients_under_acc) {
        this.clients_under_acc = clients_under_acc;
    }

    public ArrayList<Client> getClients_under_acc() {
        return clients_under_acc;
    }



}
