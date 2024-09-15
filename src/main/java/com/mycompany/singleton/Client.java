/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        SystemConfig config1 = SystemConfig.getInstance();
        System.out.println(config1);

        // Modificar los valores de la configuración
        config1.setSystemName("UniversityOnHand");
        config1.setVersion("2.0");

        // Obtener otra referencia a la misma instancia
        SystemConfig config2 = SystemConfig.getInstance();
        System.out.println(config2);

        // Verificar que config1 y config2 son el mismo objeto
        if (config1 == config2) {
            System.out.println("Ambas referencias apuntan a la misma instancia.");
        }
    }
}

