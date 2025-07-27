/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author Jorge
 */
public class ControlKilometraje {
    
    private double kilometrosRecorridos;
    private int velocidadActual; // en km/h
    private int rpm; // revoluciones por minuto
    private boolean vehiculoEncendido;

    public ControlKilometraje() {
        this.kilometrosRecorridos = 0.0;
        this.velocidadActual = 0;
        this.rpm = 0;
        this.vehiculoEncendido = false;
    }

    public void encenderVehiculo() {
        vehiculoEncendido = true;
    }

    public void apagarVehiculo() {
        vehiculoEncendido = false;
        velocidadActual = 0;
        rpm = 0;
    }

    public void setVelocidad(int nuevaVelocidad) {
        if (vehiculoEncendido) {
            this.velocidadActual = nuevaVelocidad;
            calcularRPM();
        }
    }

    private void calcularRPM() {
        if (velocidadActual == 0) {
            rpm = 700; // El ralentí es el régimen mínimo de revoluciones por las que el motor del carro puede estar funcionando sin calarse
        } else {
            rpm = 700 + velocidadActual * 50;
        }
    }

    // Simula avanzar un periodo de tiempo
    public void avanzarTiempo(double horas) {
        if (vehiculoEncendido && velocidadActual > 0) {
            double distancia = velocidadActual * horas;
            kilometrosRecorridos += distancia;
        }
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

    public boolean isVehiculoEncendido() {
        return vehiculoEncendido;
    }
}