/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class MyMathTest {
    
    public MyMathTest() {
    }

    @Test
    public void minYmax1() {
        
        List<Double> lista = new ArrayList<>();
        var op = new MyMath();
        Double min;
        Double max;
        Double minEsperado = 1.0;
        Double maxEsperado = 12.0;
        
        lista.add(2.0);
        lista.add(5.0);
        lista.add(8.0);
        lista.add(12.0);
        lista.add(1.0);
        
        min = op.min(lista);
        max = op.max(lista);
        
        assertEquals(minEsperado, min);
        assertEquals(maxEsperado, max);
    }
    
    @Test
    public void minYmax2() {
        
        List<Double> lista = new ArrayList<>();
        var op = new MyMath();
        Double min;
        Double max;
        Double minEsperado = 5.0;
        Double maxEsperado = 61.0;
        
        lista.add(31.0);
        lista.add(5.0);
        lista.add(8.0);
        lista.add(12.0);
        lista.add(11.0);
        lista.add(22.0);
        lista.add(54.0);
        lista.add(18.0);
        lista.add(12.0);
        lista.add(61.0);
        
        min = op.min(lista);
        max = op.max(lista);
        
        assertEquals(minEsperado, min);
        assertEquals(maxEsperado, max);
    }
    
    @Test
    public void minYmax3() {
        
        List<Double> lista = new ArrayList<>();
        var op = new MyMath();
        Double min;
        Double max;
        Double minEsperado = 13.0;
        Double maxEsperado = 13.0;
        
        lista.add(13.0);
        
        min = op.min(lista);
        max = op.max(lista);
        
        assertEquals(minEsperado, min);
        assertEquals(maxEsperado, max);
    }
    
}
