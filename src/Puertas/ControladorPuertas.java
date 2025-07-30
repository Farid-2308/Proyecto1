/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Puertas;

import Luces.SistemaIluminacion;

/**
 *
 * @author Farid
 */
public class ControladorPuertas {
   private Puerta delanteraIzquierda;
   private Puerta delanteraDerecha;
   private Puerta traseraIzquierda;
   private Puerta traseraDerecha;
   private SistemaIluminacion sistemaIluminacion = new SistemaIluminacion();
   
    public ControladorPuertas() {
        
        delanteraIzquierda = new Puerta (tipoPuerta.DELANTERA_IZQUIERDA);
        delanteraDerecha = new Puerta(tipoPuerta.DELANTERA_DERECHA);
        traseraIzquierda = new Puerta(tipoPuerta.TRASERA_IZQUIERDA);
        traseraDerecha = new Puerta(tipoPuerta.TRASERA_DERECHA);
    }

    public void abrirPuerta(tipoPuerta tipo) {
        sistemaIluminacion.activarLucesPuertas();
        Puerta puerta = getPuertaPorTipo(tipo);
        if (puerta != null) {
            puerta.abrir();
        }
    }

    public void cerrarPuerta(tipoPuerta tipo) {
         sistemaIluminacion.desactivarLucesPuertas();
        Puerta puerta = getPuertaPorTipo(tipo);
        if (puerta != null) {
            puerta.cerrar();
        }
    }

    public boolean estaAbierta(tipoPuerta tipo) {
        Puerta puerta = getPuertaPorTipo(tipo);
        return puerta != null && puerta.estaAbierta();
    }

    private Puerta getPuertaPorTipo(tipoPuerta tipo) {
       return switch (tipo) {
           case DELANTERA_IZQUIERDA -> delanteraIzquierda;
           case DELANTERA_DERECHA -> delanteraDerecha;
           case TRASERA_IZQUIERDA -> traseraIzquierda;
           case TRASERA_DERECHA -> traseraDerecha;
       };  
    }

    public void abrirTodas() {
        for (tipoPuerta tipo : tipoPuerta.values()) {
            abrirPuerta(tipo);
        }
    }

    public void cerrarTodas() {
        for (tipoPuerta tipo : tipoPuerta.values()) {
            cerrarPuerta(tipo);
        }
    }
}
