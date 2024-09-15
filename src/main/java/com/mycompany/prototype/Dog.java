/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author XPG
 */
public class Dog implements Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    @Override
    public Animal clone() {
        return new Dog(this.breed);
    }

    @Override
    public String toString() {
        return "Dog of breed " + this.breed;
    }
}

