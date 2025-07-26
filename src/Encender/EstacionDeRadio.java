/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encender;

/**
 *
 * @author mathy
 */
public class EstacionDeRadio {
    private boolean encendido=true;
    private Encender encender;
    private SistemaBateria bateria;
    private AlarmaYBloqueo alarma;
    private ModosRadio modoRadioActual=ModosRadio.FM;

    public boolean isEncendido() {
        return encendido;
    }
    
    public void encenderRadio(){
        if (encender.isEncendido()&&bateria.getNivelBateria()>5&&!alarma.isEstadoAlarmas()) {
            encendido=true;
            bateria.consumirBateria();
        }
    }
    
    public void apagadoAutoDeRadio(){
    if (encender.isEncendido()&&(bateria.getNivelBateria()<3||alarma.isEstadoAlarmas())) {
        encendido = false;
    }
}

    public void apagarRadio(){
        if (encender.isEncendido()&&bateria.getNivelBateria()>3) {
            encendido=false;
        }
    }
    
    public void cambiarEstacion(ModosRadio nuevoModo){
        if (encendido&&!alarma.isEstadoAlarmas()) {
            modoRadioActual=nuevoModo;
            bateria.consumirBateria();
        }
    }

    public EstacionDeRadio(Encender encender, SistemaBateria bateria, AlarmaYBloqueo alarma) {
        this.encender = encender;
        this.bateria = bateria;
        this.alarma = alarma;
    }
}
