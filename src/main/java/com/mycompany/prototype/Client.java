/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear prototipos iniciales
        Sheep sheepPrototype = new Sheep("Dolly");
        Dog dogPrototype = new Dog("Golden Retriever");

        // Registrar los prototipos
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("oveja", sheepPrototype);
        registry.addPrototype("perro", dogPrototype);

        // Clonar objetos a partir de los prototipos registrados
        Animal clonedSheep = registry.getPrototype("oveja");
        Animal clonedDog = registry.getPrototype("perro");

        // Mostrar los objetos clonados
        System.out.println(clonedSheep);
        System.out.println(clonedDog);
    }
}
