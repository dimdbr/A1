package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String name;

    private double month_pay;

    public Client(String name, int contract_number, ArrayList<Parking_place> occupied_places, ArrayList<String> registered_cars) {
        this.name = name;
        this.month_pay = 0;
    }

    public String getName() {
        return name;
    }



    public double getMonth_pay() {
        return month_pay;
    }

    public void setMonth_pay(double month_pay) {
        this.month_pay = month_pay;
    }


}
