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
        return "Casa con " + doors + " puertas, " + windows + " ventanas, " 
                + (hasGarage ? "un garage" : "sin garage") 
                + " y " + (hasSwimmingPool ? "una piscina" : "sin piscina");
    }

    // Clase Builder interna
    public static class HouseBuilder {
        private int doors;
        private int windows;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        // Métodos de construcción para los atributos
        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        // Método para construir el objeto final
        public House build() {
            return new House(this);
        }
    }
}

