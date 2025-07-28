/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Luces;

import Carro.Encendido;

/**
 *
 * @author Jorge
 */
public class SistemaIluminacion extends Encendido {
    private boolean lucesAltas;
    private boolean lucesBajas;
    private boolean intermitentes;
    private boolean lucesEmergencia;
    private boolean lucesPuertas;

    public SistemaIluminacion() {
        super(); // inicia apagado
        lucesAltas = false;
        lucesBajas = false;
        intermitentes = false;
        lucesEmergencia = false;
        lucesPuertas = false;
    }

    public void encenderLucesAltas() {
        if (isEncendido()) {
            lucesAltas = true;
            lucesBajas = false;
        }
    }

    public void encenderLucesBajas() {
        if (isEncendido()) {
            lucesBajas = true;
            lucesAltas = false;
        }
    }

    public void apagarLucesDelanteras() {
        lucesAltas = false;
        lucesBajas = false;
    }

    public void activarIntermitentes() {
        if (isEncendido()) {
            intermitentes = true;
        }
    }

    public void desactivarIntermitentes() {
        intermitentes = false;
    }

    public void activarEmergencia() {
        if (isEncendido()) {
            lucesEmergencia = true;
        }
    }

    public void desactivarEmergencia() {
        lucesEmergencia = false;
    }

    public void activarLucesPuertas() {
        lucesPuertas = true;
    }

    public void desactivarLucesPuertas() {
        lucesPuertas = false;
    }

    //metodos para mostrar si estan o no encendidas
    public boolean estanLucesAltas() { return lucesAltas; }
    public boolean estanLucesBajas() { return lucesBajas; }
    public boolean estanIntermitentes() { return intermitentes; }
    public boolean estanLucesEmergencia() { return lucesEmergencia; }
    public boolean estanLucesPuertas() { return lucesPuertas; }
}
