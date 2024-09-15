/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author XPG
 */
public class House {
    private int doors;
    private int windows;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Constructor privado para que solo pueda ser construido a través del Builder
    private House(HouseBuilder builder) {
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House with " + doors + " doors, " + windows + " windows, " 
                + (hasGarage ? "a garage" : "no garage") 
                + " and " + (hasSwimmingPool ? "a swimming pool" : "no swimming pool");
    }


}

