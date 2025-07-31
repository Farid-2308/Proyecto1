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

    private int velocidadActual;
    private int rpm;
    private int velocidad; // en km/h
    private double kilometrosRecorridos = 0;

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
        return velocidad * 50;
    }

    public void setVelocidad(int v) {
        this.velocidad = v;
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
// Método que debe llamarse cada segundo

    public void avanzarUnSegundo() {
        double kmPorSegundo = velocidad / 3600.0;
        kilometrosRecorridos += kmPorSegundo;
    }
}
