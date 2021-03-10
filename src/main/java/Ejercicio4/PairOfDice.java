/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("las dados dieron: "+this.dice1+" y "+this.dice2
                           +" = "+resultado);
    }
}
