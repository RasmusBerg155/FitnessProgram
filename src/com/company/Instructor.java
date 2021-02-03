package com.company;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours);
    }

    public int getSalary() {
        return super.getSalary();
    }

    public int calcSalary(){
        int inSalaray = (getHours() * 199) * 4;
        return inSalaray;
    }

    @Override
    public String toString() {
        return name + "      " + cpr + "       " + getHours() + "       " + calcSalary();
    }
}
