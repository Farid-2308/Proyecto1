/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puertas;

/**
 *
 * @author Farid
 */
public class Puerta {
    private tipoPuerta tipo;
    private boolean abierta; 
    
    public Puerta(tipoPuerta tipo) {
        this.tipo = tipo;
        this.abierta = false;
    }

public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public boolean estaAbierta() {
        return abierta;
    }

    public tipoPuerta getTipo() {
        return tipo;
    }    
}



