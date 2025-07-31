/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escobillas;

/**
 *
 * @author Farid
 */
public class Escobilla {
     private Velocidades velocidadActual;

    public Escobilla() {
        this.velocidadActual = null;
    }

    public void encender(Velocidades velocidad) {
        this.velocidadActual = Velocidades.BAJA;
    }

    public void apagar() {
        this.velocidadActual = null;
    }

    public boolean estaEncendido() {
        return velocidadActual != null;
    }

    public Velocidades getVelocidadActual() {
        return velocidadActual;
    }

    public void cambiarVelocidad(Velocidades nuevaVelocidad) {
        if (estaEncendido()) {
            this.velocidadActual = nuevaVelocidad;
        }
    }
}
