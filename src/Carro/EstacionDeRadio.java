/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author mathy
 */
public class EstacionDeRadio{
    private boolean encendidos;
    private ModosRadio modoRadioActual=ModosRadio.FM;

    public boolean isEncendidos() {
        return encendidos;
    }
    
    public void encenderRadio(){
        encendidos=true;
    }

    public void apagarRadio(){
        encendidos=false;
    }
    
    public void cambiarEstacion(ModosRadio nuevoModo){
        if (encendidos) {
            modoRadioActual=nuevoModo;
        }
    }

    
}
