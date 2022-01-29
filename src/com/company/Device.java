package com.company;

public abstract class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProd;

    public Device(String producer, String model, Integer yearOfProd) {
        this.producer=producer;
        this.model=model;
        this.yearOfProd=yearOfProd;
    }

    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProd +
                '}';
    }

    abstract public void turnOn();
}