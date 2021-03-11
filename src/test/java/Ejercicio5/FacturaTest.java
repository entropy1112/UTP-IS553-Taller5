/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class FacturaTest {
    
    public FacturaTest() {
    }

    @Test
    public void factura1() {
        
        Factura fact = new Factura("El palacio del chorizo","Gonzalo Hernandez",
                                    9800.0);
        var mensajeEsperado = "Factura generada por: El palacio del chorizo\n"
                             +"Cliente: Gonzalo Hernandez\n"
                             +"Valor cancelado: 9800.0\n";
        String mensaje; 
        
        try {
            mensaje = fact.ImprimirFactura();
        } catch (CustomException e) {
            mensaje = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, mensaje);
    }
    
    @Test
    public void factura2() {
        
        Factura fact = new Factura("CC los luceros","Sarah Benavidez",
                                    34000.0);
        var mensajeEsperado = "Factura generada por: CC los luceros\n"
                             +"Cliente: Sarah Benavidez\n"
                             +"Valor cancelado: 34000.0\n";
        String mensaje; 
        
        try {
            mensaje = fact.ImprimirFactura();
        } catch (CustomException e) {
            mensaje = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, mensaje);
    }
    @Test
    public void factura3() {
        
        Factura fact = new Factura("Ramón Ordoñez","Gonzalo Hernandez",
                                    98000.0);
        var mensajeEsperado = "Factura generada por: Ramón Ordoñez\n"
                             +"Cliente: Gonzalo Hernandez\n"
                             +"Valor cancelado: 98000.0\n";
        String mensaje; 
        
        try {
            mensaje = fact.ImprimirFactura();
        } catch (CustomException e) {
            mensaje = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, mensaje);
    }
    @Test
    public void factura4() {
        
        Factura fact = new Factura("Billares la Perla","Gonzalo Hernandez",
                                    15000.0);
        var mensajeEsperado = "Factura generada por: Billares la Perla\n"
                             +"Cliente: Gonzalo Hernandez\n"
                             +"Valor cancelado: 15000.0\n";
        String mensaje; 
        
        try {
            mensaje = fact.ImprimirFactura();
        } catch (CustomException e) {
            mensaje = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, mensaje);
    }
    @Test
    public void error() {
        
        Factura fact = new Factura("El palacio del chorizo","Gonzalo Hernandez",
                                    -5000.0);
        var mensajeEsperado = fact.getPesos()
                                      +" no es una entrada válida";
        String mensaje; 
        
        try {
            mensaje = fact.ImprimirFactura();
        } catch (CustomException e) {
            mensaje = e.getMessage();
        }
        
        assertEquals(mensajeEsperado, mensaje);
    }
    
}
