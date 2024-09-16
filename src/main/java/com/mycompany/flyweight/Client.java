/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Plantar varios árboles de la misma especie
        forest.plantTree(10, 20, "Roble", "Verde", "Áspero");
        forest.plantTree(30, 40, "Roble", "Verde", "Áspero");
        forest.plantTree(50, 60, "Pino", "Verde oscuro", "Suave");
        forest.plantTree(70, 80, "Pino", "Verde oscuro", "Suave");

        // Mostrar los árboles en el bosque
        forest.showTrees();
    }
}
