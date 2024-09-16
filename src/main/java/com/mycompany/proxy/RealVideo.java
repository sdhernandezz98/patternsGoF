/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author XPG
 */
public class RealVideo implements Video {
    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Cargando video: " + fileName);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo video: " + fileName);
    }
}
