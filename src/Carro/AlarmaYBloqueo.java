/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author mathy
 */

public class AlarmaYBloqueo {
    private boolean estadoAlarmas;
    private boolean puertaBloqueada;

    public boolean isEstadoAlarmas() {
        return estadoAlarmas;
    }

    public boolean isPuertaBloqueada() {
        return puertaBloqueada;
    }
    
    public void activarAlarma(){
        this.estadoAlarmas=true;
    }
    
    public void desactivarAlarma(){
        this.estadoAlarmas=false;
    }
    
    public void bloquearPuerta(){
        this.puertaBloqueada=false;
    }
    
    public void desbloquearPuerta(){
        this.puertaBloqueada=true;
    }

    public AlarmaYBloqueo() {
        this.estadoAlarmas = false;
        this.puertaBloqueada = false;
    }
    
}
