/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author XPG
 */
public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

