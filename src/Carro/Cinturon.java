/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author Jorge
 */
public class Cinturon {
    
    private String ubicacion; 
    private boolean abrochado;

    public void abrochar() {
        this.abrochado = true;
    }
    
    public void desabrochar() {
        this.abrochado = false;
    }

    public boolean estaAbrochado() {
        return abrochado;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
    public Cinturon(String ubicacion) {
        this.ubicacion = ubicacion;
        this.abrochado = false; 
    }

    @Override
    public String toString() {
        return ubicacion + ": " + (abrochado ? "Abrochado" : "Desabrochado");
    }
}

