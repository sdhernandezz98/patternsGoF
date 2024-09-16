/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author XPG
 */
public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherStation);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

        // Cambios en las mediciones
        weatherStation.setMeasurements(25, 65, 1013);
        weatherStation.setMeasurements(27, 70, 1010);
        weatherStation.setMeasurements(22, 90, 1005);
    }
}

