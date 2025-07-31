/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kilometraje;

import Carro.Encendido;

/**
 *
 * @author Jorge
 */
 public class ControlKilometraje extends Encendido {
    private double kilometrosRecorridos;
    private int velocidadActual;
    private int rpm;

    public ControlKilometraje() {
        super();
        kilometrosRecorridos = 0.0;
        velocidadActual = 0;
        rpm = 0;
    }

        public double getKilometrosRecorridos() { 
            return kilometrosRecorridos; 
        }
        
    public int getVelocidadActual() {
        return velocidadActual; 
    }
    
    public int getRPM() { 
        return rpm; 
    }
    
     public void setVelocidad(int velocidad) {
        this.velocidadActual = velocidad;
        calcularRPM();
        actualizarKilometraje();
    }
     
   private void actualizarKilometraje() {
        kilometrosRecorridos += velocidadActual / 3600.0; //cada seg
    }
    
    private void calcularRPM() {
        if (velocidadActual == 0) {
            rpm = 700;  // El ralentí es el régimen mínimo de revoluciones por las que el motor del carro puede estar funcionando sin calarse
        } else {
            rpm = 700 + velocidadActual * 50;
        }
    }

    public void avanzarTiempo(double horas) {
        if (isEncendido() && velocidadActual > 0) {
            double distancia = velocidadActual * horas;
            kilometrosRecorridos += distancia;
        }
    }


}
