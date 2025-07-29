/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Climatizacion;

/**
 *
 * @author Farid
 */
public class Climatizacion {
    private int temperatura;
    private VelocidadAbanico velocidad;
    private boolean aireAcondicionadoEncendido;
    private boolean calefaccionEncendida;

    public Climatizacion() {
        this.temperatura = 22; 
        this.velocidad = VelocidadAbanico.APAGADO;
        this.aireAcondicionadoEncendido = false;
        this.calefaccionEncendida = false;
    }

    public void subirTemperatura() {
        temperatura++;
    }

    public void bajarTemperatura() {
        temperatura--;
    }

    public void setVelocidadVentilador(VelocidadAbanico nuevaVelocidad) {
        this.velocidad = nuevaVelocidad;
    }

    public void encenderAireAcondicionado() {
        aireAcondicionadoEncendido = true;
        calefaccionEncendida = false;
    }

    public void apagarAireAcondicionado() {
        aireAcondicionadoEncendido = false;
    }

    public void encenderCalefaccion() {
        calefaccionEncendida = true;
        aireAcondicionadoEncendido = false;
    }

    public void apagarCalefaccion() {
        calefaccionEncendida = false;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public VelocidadAbanico getVelocidad() {
        return velocidad;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public boolean isCalefaccionEncendida() {
        return calefaccionEncendida;
    }
}
