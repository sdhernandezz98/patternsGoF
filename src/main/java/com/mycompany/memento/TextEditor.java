/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author XPG
 */
public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Crea un Memento con el estado actual del contenido
    public Memento save() {
        return new Memento(content);
    }

    // Restaura el estado del contenido desde un Memento
    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}

