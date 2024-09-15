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


    }
}

