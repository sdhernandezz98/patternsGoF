/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.command;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear el receptor (la luz)
        Light livingRoomLight = new Light();

        // Crear los comandos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Crear el invocador (control remoto)
        RemoteControl remote = new RemoteControl();

        // Encender la luz
        remote.setCommand(lightOn);
        remote.pressButton();

        // Apagar la luz
        remote.setCommand(lightOff);
        remote.pressButton();

        // Deshacer la última operación (encender la luz)
        remote.pressUndo();
    }
}

