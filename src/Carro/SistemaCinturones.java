/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author Jorge
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaCinturones {
    
    private List<Cinturon> cinturones;

    public SistemaCinturones() {
        cinturones = new ArrayList<>();
        cinturones.add(new Cinturon("Conductor"));
        cinturones.add(new Cinturon("Pasajero delantero"));
        cinturones.add(new Cinturon("Pasajero trasero izquierdo"));
        cinturones.add(new Cinturon("Pasajero trasero derecho"));
    }

    public void abrocharCinturon(String ubicacion) {
        for (Cinturon c : cinturones) {
            if (c.getUbicacion().equalsIgnoreCase(ubicacion)) { //compara ignorando mayúsculas y minúsculas
                c.abrochar();
            }
        }
    }

    public void desabrocharCinturon(String ubicacion) {
        for (Cinturon c : cinturones) {
            if (c.getUbicacion().equalsIgnoreCase(ubicacion)) {
                c.desabrochar();
            }
        }
    }

    public List<Cinturon> getCinturones() {
        return cinturones;
    }

    public void mostrarEstado() {
        for (Cinturon c : cinturones) {
            System.out.println(c);
        }
    }
}

