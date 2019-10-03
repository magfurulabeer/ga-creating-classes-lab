package com.generalassembly;

public class Animal {
    private int numLegs;
    private float topSpeed;
    private boolean isEndangered;
    private String name;

    public Animal(String name, int numLegs, float topSpeed, boolean isEndangered) {
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        String isEndangered = this.isEndangered ? "Unfortunately, I am endangered." : "I'm not endangered.";
        return "I am a " + this.name + ". I have " + this.numLegs + " legs. My top speed is " + topSpeed + "mph. " + isEndangered;
    }

    public String getFact() {
        return "The " + this.name + " has a top speed of " + this.topSpeed + "mph.";
    }
}
