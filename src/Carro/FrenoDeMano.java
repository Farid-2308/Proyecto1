
package Carro;

public class FrenoDeMano {
    private boolean frenoActivo;

    public boolean isFrenoActivo() {
        return frenoActivo;
    }
    
    public void activar(){
        frenoActivo=true;
    }
    
    public void desactivar(){
        frenoActivo=false;
    }

    public FrenoDeMano() {
        this.frenoActivo = false;
    }

}
