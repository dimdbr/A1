package com.company;

import java.util.ArrayList;

public  final class ExpensesIncomeService {
    private Accountant accountant;
    private ArrayList<CommunalWorker> communalWorkers;
    private ArrayList<Client> clients;
    private Tariff tariff;



    public ExpensesIncomeService(Accountant accountant,
                                 ArrayList<CommunalWorker> communalWorkers,
                                 ArrayList<Client> clients,
                                 Tariff tariff)
    {
        this.accountant = accountant;
        this.communalWorkers = communalWorkers;
        this.clients = clients;
        this.tariff = tariff;
    }

    public ExpensesIncomeService(
            Object object,
            ArrayList<Client> clients,
            ArrayList<CommunalWorker> communalWorkers,
            Tariff tariff)
    {

        if (object instanceof Accountant) {
            this.accountant = (Accountant) object;
            this.communalWorkers = communalWorkers;
            this.clients = clients;
            this.tariff = tariff;
        }
        else
        {
            System.out.println("cant create service");
        }
    }

    public void billing()
    {
        double paySum=0;
        double generalFixPrice=0;
        for(CommunalWorker c_w : communalWorkers)
        {
            if(c_w.getIsWinter()==false&&c_w.getType()==CWType.GAS)
            {
                continue;
            }
            generalFixPrice+=c_w.getMalfunction().getFixPrice();
        }

        paySum+=generalFixPrice/communalWorkers.size()+
                tariff.getElectricityTariff()+
                tariff.getGasTariff()+
                tariff.getWaterTariff()+
                tariff.getPlacePrice();

        for(Client client: clients)
        {
            client.setMonthPay(paySum*
                    client.getContract().
                            getOccupied_places().
                            size());
        }
    }

    public double ownerEarnings()
    {
        double earnings = clients.size() *
                clients.
                        get(0).
                        getMonthPay();

        for(CommunalWorker communalWorker:communalWorkers)
            earnings -= communalWorker.getSalary();

        return earnings;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public ArrayList<CommunalWorker> getCommunal_workers() {
        return communalWorkers;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public Tariff getTariff() {
        return tariff;
    }
}
