/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear un café básico
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " costo $" + coffee.cost());

        // Decorar el café con leche
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " costo $" + milkCoffee.cost());

        // Decorar el café con leche y azúcar
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " costo $" + sugarMilkCoffee.cost());
    }
}
