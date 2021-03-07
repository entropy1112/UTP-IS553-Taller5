/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1y2;

import Ejercicios1y2.LibretaDeDirecciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class LibretaDeDireccionesTest {
    
    public LibretaDeDireccionesTest() {
    }

    @Test
    public void añadir3EntradasEImprimirlas() {
        
        var libreta = new LibretaDeDirecciones();
        
        libreta.añadirEntrada("Alejandra Franco", "3233295771", "Mz 9 Cs 2", 
                              "maleja@correo.co");
        libreta.añadirEntrada("Diana Bermudez", "3458571426", "Mz 3 Cs 7", 
                              "diana@correo.co");
        libreta.añadirEntrada("John Herrera", "3684751287", "Mz 7 Cs 7", 
                              "jonhsito@correo.co");
        
        libreta.verEntradas();
        System.out.println("-----------------------------------------------\n");
    }
    
    @Test
    public void añadir3EntradasImprimirlasYActualizarlas() {
        
        var libreta = new LibretaDeDirecciones();
        
        libreta.añadirEntrada("Raul Ramirez", "3233295771", "No tiene", 
                              "rarami@correo.co");
        libreta.añadirEntrada("Carolina Ossa", "3458571426", "Mz 3 Cs 7", 
                              "c.ossa@correo.co");
        libreta.añadirEntrada("John Herrera", "3684751287", "Mz 7 Cs 7", 
                              "jonhsito@correo.co");
        
        libreta.verEntradas();
        
        libreta.actualizarEntrada("Carolina Ossa", "Caro Ossa", "No tiene", 
                                  "Mz 9 Cs 9", "Carossa@correo.com");
        libreta.actualizarEntrada("Raul Ramirez", "Raul Fernando Alvarez", 
                                  "3658471245", "Mz 58 Cs 8", "rarami@correo.com");
        
        
        libreta.verEntradas();
        System.out.println("-----------------------------------------------\n");
    }
    
    @Test
    public void añadir5EntradasActualizarBorrarEImprimir() {
        
        var libreta = new LibretaDeDirecciones();
        
        libreta.añadirEntrada("Sebastian Narvaez", "3233295771", "Mz 9 Cs 2", 
                              "sebas@correo.co");
        libreta.añadirEntrada("Diana Ossa", "3458571426", "Mz 3 Cs 7", 
                              "diana@correo.co");
        libreta.añadirEntrada("John Herrera", "3684751287", "Mz 7 Cs 7", 
                              "jonhsito@correo.co");
        libreta.añadirEntrada("Alejandra Franco", "3233295771", "Mz 9 Cs 2", 
                              "maleja@correo.co");
        libreta.añadirEntrada("Raul Ramirez", "3233295771", "No tiene", 
                              "rarami@correo.co");
        libreta.verEntradas();
        
        libreta.actualizarEntrada("Diana Ossa", "Diana Ossa", "No tiene", 
                                  "Mz 9 Cs 9", "DianaMarcela@correo.com");
        libreta.actualizarEntrada("Sebastian Narvaez", "Sebas Narvaez", 
                                  "3658471245", "Mz 9 Cs 9", "sebas@correo.com");
        libreta.actualizarEntrada("Alejandra Franco", "Mayris Franco",
                                  "3233295771", "Mz 9 Cs 9", 
                                  "maleja@correo.co");
        libreta.verEntradas();
        
        libreta.borrarEntrada("John Herrera");
        libreta.borrarEntrada("Raul Ramirez");
        libreta.verEntradas();
        
        System.out.println("-----------------------------------------------\n");
    }
    
}
