
package rpg;

import rpg.armas.Arma;
import rpg.armas.Cajado;

public class Aprendiz extends Mago {
    private final String pet;
    private final Arma arma;
    
    public Aprendiz(String nome, String pet,  int forca, int hp,  int defesa,int mana) {
        super(nome, forca, hp, defesa,mana);
        this.pet = pet;
        arma = new Cajado();
    }

    public String getPet() {
        return pet;
    }
    
    @Override
    public String toString() {
        return "Aprendiz{+ , pet=" + pet + ", arma=" + arma.toString() + '}';
    }
    
}
