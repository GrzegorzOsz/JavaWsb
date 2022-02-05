package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Human {
    String firstname;
    String lastName;
    Integer age;
    private Integer salary;
    private Double cash;
    public Car[] garage;
    private Object Car;


    public Integer getSalary() {
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


    public void setSalary(int salary) {
        System.out.println("wyplata:"+this.salary);
        System.out.println (new Date());
        this.salary = salary;
    }
    public void sale(Human seller,Human buyer,Double price){
       if (buyer.cash < price) {
           System.out.println("Nie stać cie");
       }else if (!buyer.hasFreeParkingLot()) {
           System.out.println("Nie ma miejsca");
       }else if (!seller.hasCar(this)) {
           System.out.println("Nie ma aut na sprzedaz");
       } else {
           seller.removeCar(this);
           buyer.addCar(this);
           seller.cash += price;
           buyer.cash -= price;
           System.out.println("Transkacja udana");
       }
    }
    public void removeCar(Car){
        for(int i = 0; i < garage.length; i++){
            if(garage[i] == Car){
                garage[i] = null;

                public void addCar(Car){
                    for(int i = 0; i < garage.length; i++){
                        if(garage[i] == null){
                            garage[i] = Car;

    public boolean hasCar() {
        for (int i = 0; i < garage.length; i++){
            if (garage[i] == Car){
                return true;
            }
        }
        return false;
    }
    public boolean hasFreeParkingLot() {
        for (int i = 0; i < garage.length; i++){
            if (garage[i] == null){
                return true;
            }
        }
        return false;
    }

}




