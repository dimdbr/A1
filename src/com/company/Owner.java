package com.company;

public class Owner  {
    private String name;
    private double current_account;
    private static Tariff tariff;

    public Owner(String name, double current_account) {
        this.name = name;
        this.current_account = current_account;
    }
    Owner() {
        name = "";
        current_account = 0D;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return current_account;
    }

    public void setSalary(double current_account) {
        this.current_account = current_account;
    }
    public void getMoney(double sum)
    {
        current_account+=sum;
    }
   /* public static Tariff change_tariff(Tariff tariff)
    {
    //..
        return tariff;
    }

    public void change_tariff()
    {

    }*/

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", current_account=" + current_account +
                '}';
    }
}
