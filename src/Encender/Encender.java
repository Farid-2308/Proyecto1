/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encender;

/**
 *
 * @author Farid
 */
public class Encender {
    private boolean encendido;
    
    public boolean isEncendido() {
    return encendido;
    }

    public Encender() {
        this.encendido = false;
    }

    public void encender() {
        this.encendido=true;
    }
    
    public void apagar() {
        this.encendido=false;
    }

    
    
}
