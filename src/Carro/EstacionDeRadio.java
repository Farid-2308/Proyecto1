/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author mathy
 */
public class EstacionDeRadio extends Encendido{
    private boolean encendidos=true;
    private Encendido encender;
    private SistemaBateria bateria;
    private AlarmaYBloqueo alarma;
    private ModosRadio modoRadioActual=ModosRadio.FM;

    public boolean isEncendidos() {
        return encendido;
    }
    
    public void encenderRadio(){
        if (encender.isEncendido()&&bateria.getNivelBateria()>5&&!alarma.isEstadoAlarmas()) {
            encendidos=true;
            bateria.consumirBateria();
        }
    }
    
    public void apagadoAutoDeRadio(){
    if (encender.isEncendido()&&(bateria.getNivelBateria()<3||alarma.isEstadoAlarmas())) {
        encendidos = false;
    }
}

    public void apagarRadio(){
        if (encender.isEncendido()&&bateria.getNivelBateria()>3) {
            encendidos=false;
        }
    }
    
    public void cambiarEstacion(ModosRadio nuevoModo){
        if (encendidos&&!alarma.isEstadoAlarmas()) {
            modoRadioActual=nuevoModo;
            bateria.consumirBateria();
        }
    }

    public EstacionDeRadio(Encendido encender, SistemaBateria bateria, AlarmaYBloqueo alarma) {
        this.encender = encender;
        this.bateria = bateria;
        this.alarma = alarma;
    }
}
