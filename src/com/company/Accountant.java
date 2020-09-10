package com.company;

import java.util.ArrayList;

public  final class Accountant extends Worker {
    private ArrayList<Client> clientsUnderAcc;//кажодому бугалтеру часть клиентов на расчет

    public Accountant(String name, double salary, ArrayList<Client> clientsUnderAcc) {
        super(name, salary);
        this.clientsUnderAcc = clientsUnderAcc;
    }

    public Accountant(ArrayList<Client> clientsUnderAcc) {
        this.clientsUnderAcc = clientsUnderAcc;
    }

    public ArrayList<Client> getClientsUnderAcc() {
        return clientsUnderAcc;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "clientsUnderAcc=" + clientsUnderAcc +
                '}';
    }
}
