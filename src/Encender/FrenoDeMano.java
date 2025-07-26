/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encender;

/**
 *
 * @author mathy
 */
public class FrenoDeMano {
    private boolean frenoActivo=true;
    private SistemaBateria bateria;

    public boolean isFrenoActivo() {
        return frenoActivo;
    }
    
    public void activar(){
        if (bateria.getNivelBateria()>2) {
            frenoActivo=true;
            bateria.consumirBateria();
            System.out.println("Freno de mano activo");
        }
    }
    
    public void desactivar(){
        if (bateria.getNivelBateria()>2) {
            frenoActivo=true;
            bateria.consumirBateria();
            System.out.println("Freno de mano desactivado");
        }
    }

    public FrenoDeMano(SistemaBateria bateria) {
        this.bateria = bateria;
    }
    
}
