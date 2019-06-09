
package rpg;

import rpg.armas.Arma;
import rpg.armas.Cajado;

public class Feiticeiro extends Mago {
    private final String pocoes;
    private final Arma arma;

    public String getPocoes() {
        return pocoes;
    }
    public Feiticeiro(String nome, String pocoes,int forca, int hp,  int defesa,int mana) {
        super(nome,forca,hp,defesa,mana);
        this.pocoes = pocoes;
        arma = new Cajado();
    }

    @Override
    public String toString() {
         return "Feiticeiro{ pocoes=" + pocoes + ", arma= " + arma.toString() + '}';
    }
    
}
