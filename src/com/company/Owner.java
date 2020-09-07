package com.company;

public class Owner  {
    private String name;
    private double currentAccount;


    public Owner(String name, double currentAccount) {
        this.name = name;
        this.currentAccount = currentAccount;
    }

    Owner() {
        name = "";
        currentAccount = 0D;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return currentAccount;
    }





    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", current_account=" + currentAccount +
                '}';
    }


}
