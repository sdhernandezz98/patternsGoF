/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear el editor de texto y el caretaker
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Modificar el contenido del editor y guardar los estados
        editor.setContent("Version 1");
        System.out.println("Contenido actual: " + editor.getContent());
        caretaker.saveState(editor);

        editor.setContent("Version 2");
        System.out.println("Contenido actual: " + editor.getContent());
        caretaker.saveState(editor);

        editor.setContent("Version 3");
        System.out.println("Contenido actual: " + editor.getContent());

        // Deshacer cambios (restaurar estado)
        caretaker.undo(editor);
        System.out.println("Después de deshacer: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("Después de otro deshacer: " + editor.getContent());

        caretaker.undo(editor);  // Intento de restaurar más allá del historial
    }
}

