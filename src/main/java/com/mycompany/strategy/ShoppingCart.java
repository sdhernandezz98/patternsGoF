/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author XPG
 */
public class ShoppingCart {
    private double total;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(double total) {
        this.total = total;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateFinalTotal() {
        if (discountStrategy == null) {
            return total;
        }
        return discountStrategy.applyDiscount(total);
    }
}
