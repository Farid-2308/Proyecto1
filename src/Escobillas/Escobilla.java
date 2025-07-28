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
        System.out.println("Escobillas encendidas a " + velocidad.getDescripcion());
    }

    public void apagar() {
        this.velocidadActual = null;
        System.out.println("Escobillas apagadas.");
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
            System.out.println("Velocidad cambiada a " + nuevaVelocidad.getDescripcion());
        } else {
            System.out.println("No se puede cambiar la velocidad. Las escobillas están apagadas.");
        }
    }
}
