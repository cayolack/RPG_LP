package rpg;

import rpg.armas.Arco;
import rpg.armas.Arma;

public class Arqueiro extends Guerreiro {

    private String ataque;

    private Arma arma;

    public Arqueiro(String nome, String ataque, int forca, int hp, int agilidade, int defesa) {
        super(nome, forca, hp, agilidade, defesa);
        this.ataque = ataque;
        arma = new Arco();
    }

    @Override
    public String toString() {
        return "Arqueiro{" + ", atque=" + ataque
                + ", arma=" + arma.toString() + '}';
    }

}
