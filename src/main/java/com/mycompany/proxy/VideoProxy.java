/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author XPG
 */
public class VideoProxy implements Video {
    private RealVideo realVideo;
    private String fileName;

    public VideoProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(fileName);
        }
        realVideo.play();
    }
}

