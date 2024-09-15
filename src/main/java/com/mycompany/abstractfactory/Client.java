/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory;

/**
 *
 * @author XPG
 */
public class Client {
    private Chair chair;
    private Table table;

    public Client(AbstractFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void furnishRoom() {
        chair.sitOn();
        table.placeItemsOn();
    }

    public static void main(String[] args) {
        // Fábrica moderna
        AbstractFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        modernClient.furnishRoom();
        
        // Fábrica victoriana
        AbstractFactory victorianFactory = new VictorianFurnitureFactory();
        Client victorianClient = new Client(victorianFactory);
        victorianClient.furnishRoom();
    }
}
