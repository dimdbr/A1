package com.company;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String name;
    private Contract contract;
    private double month_pay;

    public Client(String name, double month_pay) {
        this.name = name;
        this.month_pay = 0;
        this.contract = new Contract();
    }

    public Client(String name,double month_pay, Contract contract)
    {
        this.name = name;
        this.month_pay = month_pay;
        this.contract = contract;
    }
    public Client()
    {
        this.name = "";
        this.month_pay = 0;

    }
    public String getName() {
        return name;
    }

    public Contract getContract() {
        return contract;
    }

    public double getMonth_pay() {
        return month_pay;
    }

    public void setMonth_pay(double month_pay) {
        this.month_pay = month_pay;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", contract=" + contract +
                ", month_pay=" + month_pay +
                '}';
    }
}
