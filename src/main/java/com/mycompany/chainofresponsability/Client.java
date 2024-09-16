/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsability;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Crear los diferentes niveles de soporte
        SupportHandler basicSupport = new BasicSupport();
        SupportHandler intermediateSupport = new IntermediateSupport();
        SupportHandler advancedSupport = new AdvancedSupport();

        // Crear la cadena de responsabilidad
        basicSupport.setNextHandler(intermediateSupport);
        intermediateSupport.setNextHandler(advancedSupport);

        // Hacer diferentes solicitudes de soporte
        basicSupport.handleRequest("Basico");
        basicSupport.handleRequest("Intermedio");
        basicSupport.handleRequest("Avanzado");
        basicSupport.handleRequest("Desconocido");
    }
}

