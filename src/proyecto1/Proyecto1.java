/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import Luces.SistemaIluminacion;



/**
 *
 * @author Farid
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaIluminacion luces = new SistemaIluminacion();

        luces.encenderLucesBajas();
        luces.activarIntermitentes();

        System.out.println("Luces bajas activadas: " + luces.estanLucesBajas());
        System.out.println("Intermitentes: " + luces.estanIntermitentes());

        luces.encenderLucesAltas(); // Apaga las bajas automáticamente
        System.out.println("Luces altas activadas: " + luces.estanLucesAltas());
        System.out.println("Luces bajas aún activadas?: " + luces.estanLucesBajas()); // false
    }
}
