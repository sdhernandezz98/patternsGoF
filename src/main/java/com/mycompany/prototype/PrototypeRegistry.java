/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototype;

/**
 *
 * @author XPG
 */
import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public void addPrototype(String key, Animal prototype) {
        prototypes.put(key, prototype);
    }

    public Animal getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}
