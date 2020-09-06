package com.company;

import java.util.ArrayList;

public class Expenses_income_service {
    private Accountant accountant;
    private ArrayList<Communal_worker> communal_workers;
    private ArrayList<Client> clients;
    private Tariff tariff;

    public Expenses_income_service(Accountant accountant, ArrayList<Communal_worker> communal_workers, ArrayList<Client> clients, Tariff tariff) {
        this.accountant = accountant;
        this.communal_workers = communal_workers;
        this.clients = clients;
        this.tariff = tariff;
    }
    public Expenses_income_service(Object object, ArrayList<Client> clients,ArrayList<Communal_worker> communal_workers,Tariff tariff) {
        if (object instanceof Accountant) {
            this.accountant = (Accountant) object;
            this.communal_workers = communal_workers;
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
        double pay_sum=0;
        double general_fix_price=0;
        for(Communal_worker c_w : communal_workers)
        {
            if(c_w.get_is_winter()==false&&c_w.getType()==CW_type.GAS)
            {
                continue;
            }
            general_fix_price+=c_w.getMalfunction().getFix_price();
        }
        pay_sum+=general_fix_price/communal_workers.size()+tariff.getElectricity_tariff()+tariff.getGas_tariff()+tariff.getWater_tariff()+tariff.getPlace_price();
        for(Client client: clients)
        {
            client.setMonth_pay(pay_sum);
        }
    }

}
