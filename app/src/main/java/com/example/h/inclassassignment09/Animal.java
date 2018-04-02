package com.example.h.inclassassignment09;


public class Animal {

    private String type;
    private int numberOfLegs;
    private boolean canSwim;

    public Animal() {}

    public Animal(String type, int numberOfLegs, boolean canSwim){

        this.type = type;
        this.numberOfLegs = numberOfLegs;
        this.canSwim = canSwim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
}
