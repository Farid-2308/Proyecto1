/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Escobillas;

/**
 *
 * @author Farid
 */
public enum Velocidades {
    BAJA(1, "Velocidad baja"),
    MEDIA(2, "Velocidad media"),
    ALTA(3, "Velocidad alta");

    private final int nivel;
    private final String descripcion;

    Velocidades(int nivel, String descripcion) {
        this.nivel = nivel;
        this.descripcion = descripcion;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
