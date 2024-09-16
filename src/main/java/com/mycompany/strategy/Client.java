/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Total de la compra
        double total = 100.0;

        // Crear el carrito de compras
        ShoppingCart cart = new ShoppingCart(total);

        // Aplicar estrategia de descuento sin descuento
        cart.setDiscountStrategy(new NoDiscountStrategy());
        System.out.println("Total sin descuento: " + cart.calculateFinalTotal());

        // Aplicar estrategia de descuento porcentual del 10%
        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));
        System.out.println("Total con 10% de descuento: " + cart.calculateFinalTotal());

        // Aplicar estrategia de descuento fijo de 20
        cart.setDiscountStrategy(new FixedDiscountStrategy(20));
        System.out.println("Total con descuento de 20: " + cart.calculateFinalTotal());
    }
}
