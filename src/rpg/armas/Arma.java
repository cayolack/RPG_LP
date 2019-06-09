
package rpg.armas;


public  abstract class Arma {
    private final double dano = 150;
    private int cicloDeUso = 5;

    public double getDano() {
        return dano;
    }
    public void usada(){
        cicloDeUso--;
    }
    public int getCicloDeUso() {
        return cicloDeUso;
    }
    
    
}
