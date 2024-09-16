/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear el mediador
        Mediator chatMediator = new ChatMediator();

        // Crear los usuarios
        User user1 = new ConcreteUser(chatMediator, "Jose");
        User user2 = new ConcreteUser(chatMediator, "Alicia");
        User user3 = new ConcreteUser(chatMediator, "Bobby");
        User user4 = new ConcreteUser(chatMediator, "Diana");

        // Añadir usuarios al chat
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        // Enviar mensajes entre los usuarios
        user1.send("Hola a todos!");
        user3.send("Hola Sebastian!");
    }
}

