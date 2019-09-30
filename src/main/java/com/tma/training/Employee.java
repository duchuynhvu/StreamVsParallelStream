package com.tma.training;

public class Employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
