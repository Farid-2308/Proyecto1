/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinturones;

/**
 *
 * @author Jorge
 */
public class ControladorCinturones {

    private Cinturon[] cinturones;

    public static final int CONDUCTOR = 0;
    public static final int PASAJERO_DELANTERO = 1;
    public static final int PASAJERO_TRASERO_IZQ = 2;
    public static final int PASAJERO_TRASERO_DER = 3;

    private Cinturon conductor;
    private Cinturon pasajeroDelantero;
    private Cinturon traseroIzquierdo;
    private Cinturon traseroDerecho;

    public ControladorCinturones() {
        conductor = new Cinturon(TipoCinturon.CONDUCTOR);
        pasajeroDelantero = new Cinturon(TipoCinturon.PASAJERO_DELANTERO);
        traseroIzquierdo = new Cinturon(TipoCinturon.TRASERO_IZQUIERDO);
        traseroDerecho = new Cinturon(TipoCinturon.TRASERO_DERECHO);
    }

    public void cambiarEstadoCinturon(TipoCinturon tipo) {
        Cinturon c = getCinturonPorTipo(tipo);
        if (c != null) {
            if (c.estaAbrochado()) {
                c.desabrochar();
            } else {
                c.abrochar();
            }
        }
    }

    public boolean estaAbrochado(TipoCinturon tipo) {
        Cinturon c = getCinturonPorTipo(tipo);
        return c != null && c.estaAbrochado();
    }

    private Cinturon getCinturonPorTipo(TipoCinturon tipo) {
        return switch (tipo) {
            case CONDUCTOR ->
                conductor;
            case PASAJERO_DELANTERO ->
                pasajeroDelantero;
            case TRASERO_IZQUIERDO ->
                traseroIzquierdo;
            case TRASERO_DERECHO ->
                traseroDerecho;
        };
    }
}
