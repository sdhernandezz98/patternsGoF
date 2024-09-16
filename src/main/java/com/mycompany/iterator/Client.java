/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear una colección de libros
        BookCollection books = new BookCollection(5);
        books.addBook("Patrones de diseño");
        books.addBook("Refactorización");
        books.addBook("Código limpio");
        books.addBook("El programador pragmático");
        books.addBook("Código completo");

        // Crear un iterador para la colección
        Iterator iterator = books.createIterator();

        // Recorrer la colección utilizando el iterador
        while (iterator.hasNext()) {
            String book = (String) iterator.next();
            System.out.println("Libro: " + book);
        }
    }
}

