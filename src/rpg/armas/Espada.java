/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.armas;

/**
 *
 * @author yuri ferreira
 */
public class Espada extends Arma{
    private final double corte = 50 ;

    @Override
    public double getDano() {
        return (2*corte)+super.getDano();
    }

    @Override
    public String toString() {
        return "Espada";
    }
    
}
