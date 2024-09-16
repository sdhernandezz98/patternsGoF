/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author XPG
 */
public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Remojar el té");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Añadir limón");
    }
}

