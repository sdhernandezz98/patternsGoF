/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Fábrica de camiones
        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery();

        // Fábrica de barcos
        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();
    }
}

