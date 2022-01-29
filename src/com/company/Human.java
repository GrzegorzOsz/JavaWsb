package com.company;

import java.util.Date;

public class Human {
    String firstname;
    String lastName;
    Integer age;
    private Integer salary;
    private Car fiat;

    public Car getFiat() {
        return this.fiat;
    }

    public void setFiat(Car fiat) {
        if (this.salary > fiat.value) {
            System.out.println("stać cie");
        this.fiat = fiat;
        }else if (this.salary > fiat.value/12 ) {
            System.out.println ("udało się kupić samochód na kredyt");
            this.fiat = fiat;
        }else {
            System.out.println("nie stać cie, poszukaj lepszej pracy");
    }

   public void getSalary() {
        System.out.println("wyplata:"+this.salary);
        System.out.println (new Date());
        return salary;
    }

   public void setSalary(Integer salary) {
        if (salary < 0.00) {
            System.out.println("Wypłata musi być wieksza niz 0");
        } else {
            System.out.println("Dane wysłane do ksiegowości");
            System.out.println("Odbierz aneks do umowy z kadr");
            System.out.println("Dane wysłane do ZUS i urzędu skarbowego");
            this.salary = salary;
        }

    }
}

    public void setSalary(int salary) {
        System.out.println("wyplata:"+this.salary);
        System.out.println (new Date());
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}




