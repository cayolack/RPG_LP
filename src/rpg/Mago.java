
package rpg;

import rpg.armas.Arma;


public class Mago extends Personagem {
    private final int mana; 
    private double hp;
    private final double forca;
    private final int defesa;
    private final String nome;
    private Arma arma;

    public int getMana() {
        return mana;
    }
    public Mago(String nome, int mana, double hp, double forca, int defesa  ){
        this.nome = nome;
        this.mana = mana;
        this.hp = hp;
        this.forca = forca;
        this.defesa = defesa;
    }
    @Override
    public String toString() {
        return "Mago{" + ", mana=" + mana + ", hp=" + hp +", defesa=" + defesa +", froca=" +forca+", nome=" + nome + ", arma=" + arma + '}';
        
    }

    @Override
    public double Saude() {
        return hp;
    }

    @Override
    public String Nome() {
        return nome ;
    }

    @Override
    public double Forca() {
        return forca;
    }

    @Override
    public String getTipoDeArma() {
        return arma.toString();
    }

    @Override
    public void TakeDamage(Double forca) {
        hp -= forca;
        
    }
}

