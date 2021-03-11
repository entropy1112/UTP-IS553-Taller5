/*
 * 
 */
package Ejercicio4;

import java.util.Random;

/**
 *
 * @author Sebastian
 */
public class PairOfDice implements Dice {
    //Atributos
    private final Random r = new Random();
    private Integer dice1;
    private Integer dice2;
    
    //Constructor
    public PairOfDice() {
    }
    
    //Métodos
    @Override
    public void roll(){
        this.dice1 = r.nextInt(6)+1;
        this.dice2 = r.nextInt(6)+1;
    }
    
    public void valorLanzamiento(){
        
        Integer resultado = this.dice1 + this.dice2;
        System.out.println("Los dados dieron: "+this.dice1+" y "+this.dice2
                           +" = "+resultado);
    }
}
