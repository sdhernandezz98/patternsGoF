/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bridge;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear colores concretos
        Color red = new Red();
        Color green = new Green();

        // Crear formas y aplicar colores
        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(green);

        // Dibujar formas
        circle.draw();
        rectangle.draw();
    }
}

