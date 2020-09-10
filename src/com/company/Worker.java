package com.company;

public class Worker {
    private  final String name;
    private double salary;

    Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    Worker()
    {
        salary = 0;
        name = "";
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


}
