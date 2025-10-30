package com.pluralsight.assets;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight,String name, double value) {
        super(name,value);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue(){
        return weight * 100;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "weight=" + weight +
                '}';
    }
}
