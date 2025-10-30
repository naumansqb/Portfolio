package com.pluralsight;

import com.pluralsight.Interface.Valuable;
import java.util.*;

public class Portfolio implements Valuable{
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        assets=new ArrayList<>();
    }
    public void add(Valuable asset){
        assets.add(asset);
    }

    @Override
    public double getValue() {
        double total=0;
        for (Valuable asset : assets) {
            total+=asset.getValue();
        }
        return total;
    }

    public Valuable getMostValuable(){
        Valuable max= assets.get(0);
        for (Valuable asset : assets) {
            if(asset.getValue()> max.getValue()){
                max=asset;
            }
        }
        return max;
    }
    public Valuable getLeastValuable(){
        Valuable min= assets.get(0);
        for (Valuable asset : assets) {
            if(asset.getValue()< min.getValue()){
                min=asset;
            }
        }
        return min;
    }


}
