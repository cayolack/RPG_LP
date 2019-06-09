
package rpg;


public  abstract class Personagem<T> {
    public abstract double Saude ();
    public abstract void TakeDamage (Double forca);
    public abstract double Forca();
    public abstract String Nome ();
    public abstract String getTipoDeArma();
    
    
}
