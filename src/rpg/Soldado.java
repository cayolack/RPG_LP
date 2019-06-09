package rpg;

import rpg.armas.Arma;
import rpg.armas.Espada;

public class Soldado extends Guerreiro {

    private final String armadura;
    private final Arma arma;

    public Soldado(String nome, String armadura, int forca, int hp, int agilidade, int defesa) {
        super(nome, forca, agilidade, hp, defesa);
        this.armadura = armadura;
        arma = new Espada();
    }

    public String getArmadura() {
        return armadura;
    }

   
    public String toString() {
        return "Soldado{"
                + ", armadura=" + armadura
                + ", arma=" + arma.toString() + '}';
    }

}
