/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Puertas;

/**
 *
 * @author Farid
 */
public enum tipoPuerta {
    DELANTERA_IZQUIERDA(1,  "Delantera Izquierda"),
    DELANTERA_DERECHA(2, "Delantera Derecha"),
    TRASERA_IZQUIERDA(3, "Trasera Izquierda"),
    TRASERA_DERECHA(4, "Trasera Derecha");

    private final int numPuerta;
    private final String descripcion;

    tipoPuerta(int numPuerta, String descripcion) {
        this.numPuerta = numPuerta;
        this.descripcion = descripcion;
    }

    public int getNumPuerta() {
        return numPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }    
}
