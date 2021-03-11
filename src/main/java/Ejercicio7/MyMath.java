/*
 * 
 */
package Ejercicio7;

import java.util.List;

/**
 * @author Sebastian
 */
public final class MyMath implements Extremos<Double>{
    //Constructor
    public MyMath(){
        
    }

    //Métodos
    @Override
    public Double min(List<Double> a) {
        Double minimo = a.stream().mapToDouble(i -> i)
                                   .min().getAsDouble();
        
        return minimo;
    }
    
    @Override
    public Double max(List<Double> a){
        Double maximo = a.stream().mapToDouble(i -> i)
                                   .max().getAsDouble();
        
        return maximo;
    }
}
