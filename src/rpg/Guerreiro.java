
package rpg;
    import rpg.armas.Arma;

public class Guerreiro extends Personagem{
    private final int forca;
    private final int agilidade;
    private int hp;
    private int mp;
    private final int defesa;
    private final String nome;
    private Arma arma;
     

    public double getForça() {
        return forca;
    }

    public int getAgilidade() {
        return agilidade;
    }
    public Guerreiro(String nome, int agilidade, int forca,int hp,int defesa){
        this.nome = nome;
        this.agilidade = agilidade;
        this.forca = forca;
        this.hp = hp;
        this.defesa = defesa;
       
    } 
    @Override
    public String toString() {
        return "Guerreiro{" + "forca=" + forca + ", agilidade=" + agilidade + ", hp=" + hp + ", mp=" + mp + ", defesa=" + defesa + ", nome=" + nome + ", arma=" + arma + '}';
    }

    

    @Override
    public double Saude() {
        return hp;
    }

    @Override
    public String Nome() {
        return nome;
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
