/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author mathy
 */
public class SistemaBateria {
    private double nivelBateria=100;

    public double getNivelBateria() {
        return nivelBateria;
    }
    
    public void consumirBateria(){
        nivelBateria = nivelBateria-0.5;
            if (nivelBateria<=0) {
                nivelBateria=0;
            }
    }
    
    public String estadoBateria() {
    if (nivelBateria <= 0) {
        return "Bateria agotada";
    } else if (nivelBateria <= 10) {
        return "Estado critico";
    } else if (nivelBateria <= 30) {
        return "Bateria baja";
    } else if (nivelBateria < 100) {
        return "Nivel normal";
    } else {
        return "Maxima capacidad";
    }
}
    
    public void cargarBateria(){
        if (nivelBateria<100) {
            nivelBateria=nivelBateria+0.5;
        }else if (nivelBateria>=100) {
            nivelBateria=100;
        }
    }

    public SistemaBateria() {
    }
}
