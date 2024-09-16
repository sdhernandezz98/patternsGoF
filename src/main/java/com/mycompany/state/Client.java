/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();
        vendingMachine.turnCrank();

        vendingMachine.insertCoin();
        vendingMachine.turnCrank();

        vendingMachine.ejectCoin();
        vendingMachine.turnCrank();
    }
}

