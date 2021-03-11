/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class ListaRealesTest {
    
    public ListaRealesTest() {
    }

    @Test
    public void maximoyMinimo() {
        Double max;
        Double min;
        Double maxEsperado = 87.6;
        Double minEsperado = 6.0;
        
        var lista = new ListaReales();
        lista.listaReales.add(22.1);
        lista.listaReales.add(52.3);
        lista.listaReales.add(6.0);
        lista.listaReales.add(87.6);
        lista.listaReales.add(41.0);
        lista.listaReales.add(8.8);
        lista.listaReales.add(13.8);
        lista.listaReales.add(24.2);
        lista.listaReales.add(14.0);
        lista.listaReales.add(35.3);
        
        max = lista.obtenerMaximo();
        min = lista.obtenerMinimo();
        
        assertEquals(maxEsperado, max);
        assertEquals(minEsperado, min);
    }
    
    @Test
    public void promedioyMedia() {
        Double prom;
        Double media;
        Double promEsperado = 30.51;
        Double mediaEsperado = 30.51;
        
        var lista = new ListaReales();
        lista.listaReales.add(22.1);
        lista.listaReales.add(52.3);
        lista.listaReales.add(6.0);
        lista.listaReales.add(87.6);
        lista.listaReales.add(41.0);
        lista.listaReales.add(8.8);
        lista.listaReales.add(13.8);
        lista.listaReales.add(24.2);
        lista.listaReales.add(14.0);
        lista.listaReales.add(35.3);
        
        prom = lista.calcularPromedio();
        media = lista.calcularMedia();
        
        assertEquals(promEsperado, prom);
        assertEquals(mediaEsperado, media);
    }
    
    @Test
    public void sumayPromedio() {
        Double prom;
        Double suma;
        Double promEsperado = 30.51;
        Double sumaEsperado = 305.1;
        
        var lista = new ListaReales();
        lista.listaReales.add(22.1);
        lista.listaReales.add(52.3);
        lista.listaReales.add(6.0);
        lista.listaReales.add(87.6);
        lista.listaReales.add(41.0);
        lista.listaReales.add(8.8);
        lista.listaReales.add(13.8);
        lista.listaReales.add(24.2);
        lista.listaReales.add(14.0);
        lista.listaReales.add(35.3);
        
        suma = lista.calcularSumar();
        prom = suma/10;
        
        assertEquals(promEsperado, prom);
        assertEquals(sumaEsperado, suma);
    }
    
}
