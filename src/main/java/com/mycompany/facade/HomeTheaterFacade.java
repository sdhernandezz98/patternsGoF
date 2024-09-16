/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facade;

/**
 *
 * @author XPG
 */
public class HomeTheaterFacade {
    private Television tv;
    private SoundSystem soundSystem;
    private BluRayPlayer bluRayPlayer;

    public HomeTheaterFacade(Television tv, SoundSystem soundSystem, BluRayPlayer bluRayPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparando para reproducir la pelicula...");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        bluRayPlayer.turnOn();
        bluRayPlayer.playMovie(movie);
        System.out.println("Disfrute la pelicula!");
    }

    public void endMovie() {
        System.out.println("Apagando el sistema de teatro en casa...");
        bluRayPlayer.turnOff();
        soundSystem.turnOff();
        tv.turnOff();
    }
}

