package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Person> employeeList = new ArrayList<>();
        List<Person> memberList = new ArrayList<>();

        employeeList.add(new Administration("Thomas", "235466-0111", 37, 23000, 5));
        employeeList.add(new Administration("Kasper", "235434-0035", 37, 23000, 5));
        employeeList.add(new Instructor("Jesper", "233134-2327", 26));
        employeeList.add(new Instructor("Rasmus", "234352-0033", 20));

        System.out.println("Fitness Employees:");
        System.out.println("Name        Cpr               Hours    Salary      Vacation");
        System.out.println("*************************************************************");
        for (Person employee : employeeList){
            System.out.println(employee);
        }
        System.out.println("=============================================================");
        System.out.println();

        memberList.add(new Member("Kasine", "234452-1111", true));
        memberList.add(new Member("Louise", "231325-1111", true));
        memberList.add(new Member("Magnus", "231325-1111", false));
        memberList.add(new Member("Sandra", "231325-1111", false));

        System.out.println("Members:");
        System.out.println("*************************************************************");
        System.out.println("Name         Cpr               MemberShip         Fee");
        for (Person member : memberList){
            System.out.println(member);
        }
        System.out.println("=============================================================");
        System.out.println();

        System.out.println("Employees and Members name and cpr");
        System.out.println("Name         Cpr");
        System.out.println("*************************************************************");

        List<Person> personList = new ArrayList<>();
        personList.addAll(employeeList);
        personList.addAll(memberList);
        for (Person person : personList){
            System.out.println(person.name + "       " + person.cpr);
        }
    }
}