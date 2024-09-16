/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author XPG
 */
public class SoldState implements State {
    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Por favor, espere, ya le estamos dando un producto.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Lo siento, ya has girado la manivela.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Girar dos veces no te da otro producto.");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensación del producto.");
        vendingMachine.setState(vendingMachine.getWaitingForCoinState());
    }
}

