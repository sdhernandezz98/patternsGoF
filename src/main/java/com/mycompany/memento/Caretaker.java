/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author XPG
 */
import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<>();

    // Guarda el estado del TextEditor
    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    // Restaura el estado anterior del TextEditor
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        } else {
            System.out.println("No más estados que deshacer.");
        }
    }
}

