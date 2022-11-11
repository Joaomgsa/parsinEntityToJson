package org.example.model.entities;

public class Targets {

    private double original_location;
    private double location;

    public Targets() {
    }

    public Targets(double original_location, double location) {
        this.original_location = original_location;
        this.location = location;
    }

    public double getOriginal_location() {
        return original_location;
    }

    public void setOriginal_location(double original_location) {
        this.original_location = original_location;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Targets{" +
                "original_location:" + original_location +
                ", location:" + location +
                '}';
    }
}


