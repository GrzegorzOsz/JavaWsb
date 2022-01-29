package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.species = "canis";
        dog.weight = 12.0;
        dog.name = "Szarik";

        dog.feed();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.takeForWalk();
        dog.feed();

        Car fiat = new Car("fiat","Bravo",2020,12000);

        Human me = new Human();
        me.firstname = "Grzegorz";
        me.lastName = "Oszmian";
        me.setSalary(4000);

    }
}
