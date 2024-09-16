/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author XPG
 */
public interface Mediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

