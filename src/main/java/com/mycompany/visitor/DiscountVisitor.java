/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visitor;

/**
 *
 * @author XPG
 */
public class DiscountVisitor implements Visitor {
    private double discountRate;

    public DiscountVisitor(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public void visit(Book book) {
        double discountedPrice = book.getPrice() * (1 - discountRate);
        System.out.println("Título del libro: " + book.getTitle());
        System.out.println("Precio del libro con descuento: $" + discountedPrice);
    }

    @Override
    public void visit(Magazine magazine) {
        double discountedPrice = magazine.getPrice() * (1 - discountRate);
        System.out.println("Título de la revista: " + magazine.getTitle());
        System.out.println("Precio reducido de la revista: $" + discountedPrice);
    }
}

