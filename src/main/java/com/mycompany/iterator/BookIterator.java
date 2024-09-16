/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author XPG
 */
public class BookIterator implements Iterator {
    private String[] books;
    private int position = 0;

    public BookIterator(String[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Object next() {
        return books[position++];
    }
}

