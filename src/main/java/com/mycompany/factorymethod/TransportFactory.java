/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author XPG
 */
public abstract class TransportFactory {
    // Método Factory que será implementado por las subclases
    public abstract Transport createTransport();

    // Método común para hacer entregas
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
