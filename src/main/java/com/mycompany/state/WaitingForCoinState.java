/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author XPG
 */
public class WaitingForCoinState implements State {
    private VendingMachine vendingMachine;

    public WaitingForCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Moneda insertada.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("Sin moneda para expulsar.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Introduzca primero una moneda.");
    }

    @Override
    public void dispense() {
        System.out.println("Primero tienes que introducir una moneda.");
    }
}

