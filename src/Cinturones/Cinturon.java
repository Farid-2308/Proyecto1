/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinturones;

/**
 *
 * @author Jorge
 */
public class Cinturon {

        private TipoCinturon tipo;
        private boolean abrochado;

        public Cinturon(TipoCinturon tipo) {
            this.tipo = tipo;
            this.abrochado = false;
        }

        public void abrochar() {
            abrochado = true;
        }

        public void desabrochar() {
            abrochado = false;
        }

        public boolean estaAbrochado() {
            return abrochado;
        }

        public TipoCinturon getTipo() {
            return tipo;
        }
    }