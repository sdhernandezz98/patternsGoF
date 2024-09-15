/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Construir una casa con 3 puertas, 5 ventanas, un garaje, pero sin piscina
        House house1 = new House.HouseBuilder()
                .setDoors(3)
                .setWindows(5)
                .setGarage(true)
                .setSwimmingPool(false)
                .build();

        System.out.println(house1);

        // Construir una casa con 2 puertas, 6 ventanas, sin garaje, pero con piscina
        House house2 = new House.HouseBuilder()
                .setDoors(2)
                .setWindows(6)
                .setGarage(false)
                .setSwimmingPool(true)
                .build();

        System.out.println(house2);
    }
}

