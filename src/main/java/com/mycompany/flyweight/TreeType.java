/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author XPG
 */
public class TreeType implements Tree {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void plant(int x, int y) {
        System.out.println("Plantando " + name + " arbol en (" + x + ", " + y + "), Color: " + color + ", Textura: " + texture);
    }
}

