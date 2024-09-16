/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author XPG
 */
public class BluRayPlayer {
    public void turnOn() {
        System.out.println("El Blu-ray esta encendido");
    }

    public void turnOff() {
        System.out.println("El Blu-ray esta apagado");
    }

    public void playMovie(String movie) {
        System.out.println("Reproduciendo la pelicula " + movie);
    }
}
