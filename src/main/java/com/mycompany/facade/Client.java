/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear los componentes del sistema
        Television tv = new Television();
        SoundSystem soundSystem = new SoundSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();

        // Crear la fachada
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, bluRayPlayer);

        // Usar la fachada para ver una película
        homeTheater.watchMovie("Inception");

        // Finalizar la película
        homeTheater.endMovie();
    }
}

