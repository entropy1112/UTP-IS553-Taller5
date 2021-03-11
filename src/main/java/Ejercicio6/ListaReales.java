/*
 * 
 */
package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class ListaReales implements Estadisticas<Double>{
    //Atributos
    List<Double> listaReales = new ArrayList();
    
    //Constructor
    public ListaReales() {
    }
    
    //Métodos
    @Override
    public Double obtenerMinimo(){
        Double minimo = this.listaReales.stream().mapToDouble(i -> i)
                                   .min().getAsDouble();
        return minimo;
    }
    @Override
    public Double obtenerMaximo(){
        Double maximo = this.listaReales.stream().mapToDouble(i -> i)
                                   .max().getAsDouble();
        return maximo;
    }
    @Override
    public Double calcularMedia(){
        Double media = (this.listaReales.stream().mapToDouble(i -> i).sum())
                       /this.listaReales.size();
        
        return media;
    }
    @Override
    public Double calcularPromedio(){
        Double prom = (this.listaReales.stream().mapToDouble(i -> i).sum())
                      /this.listaReales.size();
        
        return prom;
    }
    @Override
    public Double calcularSumar(){
        Double suma = this.listaReales.stream().mapToDouble(i -> i).sum();
        
        return suma;
    }
}
