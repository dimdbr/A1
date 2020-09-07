package com.company;

import java.util.ArrayList;

public class Tariff_servise {
    private Tariff tariff;
    private Owner owner;

    public Tariff_servise(Tariff tariff, Owner owner) {
        this.tariff = tariff;
        this.owner = owner;
    }

    public Tariff_servise(Object object, Tariff tariff) {
        if (object instanceof Owner) {
            this.owner = (Owner) object;
            this.tariff = tariff;
        }
        else
        {
            System.out.println("cant create service");
        }
    }
    public Tariff getTariff() {
        return tariff;
    }



    /*public Owner getOwner() {
        return owner;
    }*/

    public void change_tariff(double rent, double water, double electricity, double gas)
    {
        tariff.setPlace_price(rent);
        tariff.setWater_tariff(water);
        tariff.setElectricity_tariff(electricity);

        tariff.setGas_tariff(gas);
        System.out.println("tariff changed to"+tariff);
    }

}
