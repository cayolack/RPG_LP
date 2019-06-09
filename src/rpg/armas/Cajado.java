
package rpg.armas;


public class Cajado extends Arma{
private final double magia = 50;

    @Override
    public double getDano() {
        return (3 * magia)+super.getDano(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cajado"; //To change body of generated methods, choose Tools | Templates.
    }


    
}
