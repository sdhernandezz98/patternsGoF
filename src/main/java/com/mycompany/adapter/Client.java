/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        // Sistema de pago antiguo
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();

        // Adaptador para el sistema antiguo
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldPaymentSystem);

        // El cliente utiliza el adaptador sin saber que detrás está el sistema antiguo
        paymentProcessor.processPayment("1198563", 250.00);
    }
}

