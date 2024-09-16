/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.state;

/**
 *
 * @author XPG
 */
public class VendingMachine {
    private State waitingForCoinState;
    private State hasCoinState;
    private State soldState;
    private State state;

    public VendingMachine() {
        waitingForCoinState = new WaitingForCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        state = waitingForCoinState; // Initial state
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWaitingForCoinState() {
        return waitingForCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
}

