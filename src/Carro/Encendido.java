/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author Farid
 */
public class Encendido {
    private boolean encendido;
    
    public boolean isEncendido() {
    return encendido;
    }

    public Encendido() {
        this.encendido = false;
    }

    public void encender() {
        this.encendido=true;
    }
    
    public void apagar() {
        this.encendido=false;
    }

    
    
}
