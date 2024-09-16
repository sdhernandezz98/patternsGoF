/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author XPG
 */
public class SoundSystem {
    public void turnOn() {
        System.out.println("El sistema de sonido esta encendido");
    }

    public void turnOff() {
        System.out.println("El sistema de sonido esta apagado");
    }

    public void setVolume(int level) {
        System.out.println("Adjustando volumen en " + level);
    }
}

