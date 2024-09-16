/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author XPG
 */
public class HasCoinState implements State {
    private VendingMachine vendingMachine;

    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Ya has introducido una moneda.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Moneda devuelta.");
        vendingMachine.setState(vendingMachine.getWaitingForCoinState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Manivela girada.");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Gire la manivela para dispensar.");
    }
}

