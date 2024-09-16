/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediator;

/**
 *
 * @author XPG
 */
import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // No reenviar el mensaje al mismo usuario que lo envió
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

