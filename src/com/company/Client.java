package com.company;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Date;

public final class Client {
    private final String name;
    private Contract contract;
    private double monthPay;

    public Client(String name, double monthPay) {
        this.name = name;
        this.monthPay = monthPay;
        this.contract = new Contract();
    }

    public Client(String name,double monthPay, Contract contract)
    {
        this.name = name;
        this.monthPay = monthPay;
        this.contract = contract;
    }

    public Client()
    {
        this.name = "";
        this.monthPay = 0;

    }

    public String getName() {
        return name;
    }

    public Contract getContract() {
        return contract;
    }

    public double getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(double month_pay) {
        this.monthPay = month_pay;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", contract=" + contract +
                ", month_pay=" + monthPay +
                '}';
    }
}
