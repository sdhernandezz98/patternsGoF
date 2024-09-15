/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composite;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear archivos
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Crear directorios
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");
        Directory rootDir = new Directory("root");

        // Añadir archivos a directorios
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);

        // Añadir directorios a directorio raíz
        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Mostrar la estructura de directorios y archivos
        rootDir.showDetails();
    }
}

