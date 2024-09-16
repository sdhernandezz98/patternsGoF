/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interpreter;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear expresiones para 5 y 3
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);

        // Crear expresión para 5 + 3
        Expression sum = new PlusExpression(five, three);
        System.out.println("5 + 3 = " + sum.interpret());

        // Crear expresión para 10 - 2
        Expression ten = new NumberExpression(10);
        Expression two = new NumberExpression(2);
        Expression difference = new MinusExpression(ten, two);
        System.out.println("10 - 2 = " + difference.interpret());

        // Crear expresión compuesta: (10 - 2) + (5 + 3)
        Expression complexExpression = new PlusExpression(difference, sum);
        System.out.println("(10 - 2) + (5 + 3) = " + complexExpression.interpret());
    }
}
