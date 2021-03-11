/*
 * 
 */
package Ejercicio9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void cuandoNes3() throws CustomException {
        
        var n = 3;
        String resultado;
        var mensajeEsperado =  "  *  "+"\n"+" *** "+"\n"
                              +"*****"+"\n"+" *** "+"\n"
                              +"  *  "+"\n";
        
        resultado = Main.asteriscos(n);
        
        assertEquals(mensajeEsperado, resultado);
        
    }
    
    @Test
    public void cuandoNes7() throws CustomException {
        
        var n = 7;
        String resultado;
        var mensajeEsperado =  "      *      "+"\n"+"     ***     "+"\n"
                              +"    *****    "+"\n"+"   *******   "+"\n"
                              +"  *********  "+"\n"+" *********** "+"\n"
                              +"*************"+"\n"+" *********** "+"\n"
                              +"  *********  "+"\n"+"   *******   "+"\n"
                              +"    *****    "+"\n"+"     ***     "+"\n"
                              +"      *      "+"\n";
                
        resultado = Main.asteriscos(n);
        
        assertEquals(mensajeEsperado, resultado);
        
    }
    
    @Test
    public void cuandoNes5() throws CustomException {
        
        var n = 5;
        String resultado;
        var mensajeEsperado =  "    *    "+"\n"+"   ***   "+"\n"
                              +"  *****  "+"\n"+" ******* "+"\n"
                              +"*********"+"\n"+" ******* "+"\n"
                              +"  *****  "+"\n"+"   ***   "+"\n"
                              +"    *    "+"\n";
        
        resultado = Main.asteriscos(n);
        
        assertEquals(mensajeEsperado, resultado);
        
    }
    
    @Test
    public void nNegativo() throws CustomException {
        
        var n = -4;
        String resultado;
        var mensajeEsperado = n+" es un número inválido.";
        try {
            resultado = Main.asteriscos(n);
        } catch (CustomException e) {
            resultado = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, resultado);
        
    }
    
}
