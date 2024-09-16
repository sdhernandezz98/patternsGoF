/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        Video video1 = new VideoProxy("pelicula1.mp4");
        Video video2 = new VideoProxy("pelicula2.mp4");

        // El video se carga y se reproduce solo cuando se llama a play()
        video1.play();
        System.out.println();
        video2.play();
        System.out.println();

        // Volver a reproducir no vuelve a cargar el video
        video1.play();
    }
}

