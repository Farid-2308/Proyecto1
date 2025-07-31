/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

public class SensorDeReversa {
    private double distanciaRecorrida = 0;
    private int numeroAleatorio;

    public int queTanLejosElObstaculo() {
        numeroAleatorio = (int)(Math.random() * 10) + 1;
        return numeroAleatorio;
    }

    public String moverseReversa() {
        int distancia = queTanLejosElObstaculo();
        if (distancia < 2) {
            return "Cuidado, hay un obstáculo muy cerca";
        } else {
            distanciaRecorrida += 1;
            if (distanciaRecorrida >= distancia) {
                return "Ha chocado con el obstáculo";
            }else {
                return "Moviendose en reversa";
            }
        }
    }

    public SensorDeReversa() {
    }
    
}
