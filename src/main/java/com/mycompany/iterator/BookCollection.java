/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author XPG
 */
public class BookCollection implements Aggregate {
    private String[] books;
    private int index = 0;

    public BookCollection(int size) {
        books = new String[size];
    }

    public void addBook(String book) {
        if (index < books.length) {
            books[index++] = book;
        }
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}

