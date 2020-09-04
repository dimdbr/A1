package com.company;

public class Owner  {
    private String name;
    private double salary;
    private static Tariff tariff;

    public Owner(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    Owner() {
        name = "";
        salary = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void getMoney(double sum)
    {
       salary+=sum;
    }
   /* public static Tariff change_tariff(Tariff tariff)
    {
    //..
        return tariff;
    }

    public void change_tariff()
    {

    }*/
}
