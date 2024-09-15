/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author XPG
 */
public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentSystem oldPaymentSystem;

    // El adaptador recibe una instancia del sistema antiguo
    public PaymentAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    // Implementamos el método de la nueva interfaz adaptándolo al sistema antiguo
    @Override
    public void processPayment(String accountNumber, double amount) {
        // Llamada al sistema antiguo con el formato que necesita
        oldPaymentSystem.makePayment(accountNumber, amount);
    }
}
