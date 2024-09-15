package com.mycompany.factorymethod;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author XPG
 */
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Enviado por barco en via maritima.");
    }
}

