/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visitor;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear elementos
        Element book = new Book("Patrones de diseño", 39.95);
        Element magazine = new Magazine("Tecnologia mensual", 5.99);

        // Crear visitantes
        Visitor detailVisitor = new DetailVisitor();
        Visitor discountVisitor = new DiscountVisitor(0.10); // 10% discount

        // Aplicar visitantes a los elementos
        System.out.println("Detalles de los artículos:");
        book.accept(detailVisitor);
        magazine.accept(detailVisitor);

        System.out.println("\nDescuentos en artículos:");
        book.accept(discountVisitor);
        magazine.accept(discountVisitor);
    }
}
