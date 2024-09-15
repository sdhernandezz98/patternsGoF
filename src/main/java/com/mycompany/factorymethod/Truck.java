/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author XPG
 */
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Enviado por tierra en con camión.");
    }
}

