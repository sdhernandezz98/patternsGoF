/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visitor;

/**
 *
 * @author XPG
 */
public class DetailVisitor implements Visitor {

    @Override
    public void visit(Book book) {
        System.out.println("Título del libro: " + book.getTitle());
        System.out.println("Precio del libro: $" + book.getPrice());
    }

    @Override
    public void visit(Magazine magazine) {
        System.out.println("Título de la revista: " + magazine.getTitle());
        System.out.println("Precio de la revista: $" + magazine.getPrice());
    }
}
