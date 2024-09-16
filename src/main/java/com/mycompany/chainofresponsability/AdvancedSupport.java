/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsability;

/**
 *
 * @author XPG
 */
public class AdvancedSupport extends SupportHandler {

    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("Avanzado")) {
            System.out.println("Soporte avanzado: Resolviendo un problema avanzado.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("No hay gestor disponible para esta solicitud.");
        }
    }
}

