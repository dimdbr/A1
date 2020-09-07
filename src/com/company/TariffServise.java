package com.company;

import java.util.ArrayList;

public class TariffServise {
    private Tariff tariff;
    private Owner owner;

    public TariffServise(Tariff tariff, Owner owner) {
        this.tariff = tariff;
        this.owner = owner;
    }

    public TariffServise(Object object, Tariff tariff) {
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

    public void changeTariff(double rent, double water, double electricity, double gas)
    {
        tariff.setPlacePrice(rent);
        tariff.setWaterTariff(water);
        tariff.setElectricityTariff(electricity);

        tariff.setGasTariff(gas);
        System.out.println("tariff changed to"+tariff);
    }

}
