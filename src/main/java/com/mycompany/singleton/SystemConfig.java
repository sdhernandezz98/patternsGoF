/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author XPG
 */
public class SystemConfig {
    // Instancia única de la clase
    private static SystemConfig instance;

    // Variables de configuración (ejemplo)
    private String systemName;
    private String version;

    // Constructor privado para evitar que se creen instancias directamente
    private SystemConfig() {
        this.systemName = "UniApp";
        this.version = "1.0";
    }

    // Método público para obtener la única instancia de la clase
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    // Métodos para obtener y modificar la configuración
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Configuracion del sistema{" +
                "Nombre del sistema='" + systemName + '\'' +
                ", versión ='" + version + '\'' +
                '}';
    }
}

