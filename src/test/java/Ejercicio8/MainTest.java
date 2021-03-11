/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

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
    public void probarHexa1() {
        
        var entrada = "0128AFB";
        Integer resul;
        String resultado;
        var mensajeEsperado = "0128AFB equivale a 1215227 en decimal.";
        
        try {
            resul = Main.hexToDec(entrada);
            resultado = Main.imprimir(resul,entrada);
        } catch (CustomException e) {
            resultado = "Sucedió un error. " + e.getMessage();
        }
        
        assertEquals(mensajeEsperado, resultado);
    }
    
    @Test
    public void probarHexa2() {
        
        var entrada = "19FBE54";
        Integer resul;
        String resultado;
        var mensajeEsperado = "19FBE54 equivale a 27246164 en decimal.";
        
        try {
            resul = Main.hexToDec(entrada);
            resultado = Main.imprimir(resul,entrada);
        } catch (CustomException e) {
            resultado = "Sucedió un error. " + e.getMessage();
        }
        
        assertEquals(mensajeEsperado, resultado);
    }
    
    @Test
    public void probarHexa3() {
        
        var entrada = "FFFFA3";
        Integer resul;
        String resultado;
        var mensajeEsperado = "FFFFA3 equivale a 16777123 en decimal.";
        
        try {
            resul = Main.hexToDec(entrada);
            resultado = Main.imprimir(resul,entrada);
        } catch (CustomException e) {
            resultado = "Sucedió un error. " + e.getMessage();
        }
        
        assertEquals(mensajeEsperado, resultado);
    }
    
    @Test
    public void error() {
        
        var entrada = "NNNNN";
        Integer resul;
        String resultado;
        var mensajeEsperado = "Sucedió un error. "
                              + "El valor ingresado es inválido.";
        
        try {
            resul = Main.hexToDec(entrada);
            resultado = Main.imprimir(resul,entrada);
        } catch (CustomException e) {
            resultado = "Sucedió un error. " + e.getMessage();
        }
        
        assertEquals(mensajeEsperado, resultado);
    }
    
}
