/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.templatemethod;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Preparar café...");
        coffee.prepareRecipe();
        
        System.out.println("\nHacer té...");
        tea.prepareRecipe();
    }
}

