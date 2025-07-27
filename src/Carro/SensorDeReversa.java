/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author mathy
 */
public class SensorDeReversa extends Encendido{
    private FrenoDeMano freno;
    private SistemaBateria consumo;
    private Encendido encendido;
    private double distanciaRecorrida=0;
    private int numeroAleatorio;
    
    public int queTanLejosElObstaculo(){
        numeroAleatorio = (int)(Math.random() * 10) + 1;
        return numeroAleatorio;
    }
    
    public void moverseReversa(){
        if (freno.isFrenoActivo()&&!encendido.isEncendido()) {
            System.out.println("No puede moverse en reversa porque el freno esta activado");
        }
        int distancia=queTanLejosElObstaculo();
        if (distancia<2) {
            System.out.println("Cuidado que hay un obstaculo cerca");
        }else {
            distanciaRecorrida+=1;
            System.out.println("moviendose en reversa");
            consumo.consumirBateria();
            if (distanciaRecorrida>=distancia) {
                System.out.println("Has chocado con el obstaculo");
            }
        }
    }
}
