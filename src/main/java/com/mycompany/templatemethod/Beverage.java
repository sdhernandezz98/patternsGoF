/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author XPG
 */
public abstract class Beverage {

    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Steps to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    // Common steps
    private void boilWater() {
        System.out.println("Agua hirviendo");
    }

    private void pourInCup() {
        System.out.println("Verter en la taza");
    }
}

