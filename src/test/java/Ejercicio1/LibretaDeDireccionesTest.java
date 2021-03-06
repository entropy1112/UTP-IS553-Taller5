/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

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
        
        libreta.añadirEntrada("Sebastian Narvaez", "3233295771", "Mz 9 Cs 2", 
                              "sebas@correo.co");
        libreta.añadirEntrada("Diana Ossa", "3458571426", "Mz 3 Cs 7", 
                              "diana@correo.co");
        libreta.añadirEntrada("John Herrera", "3684751287", "Mz 7 Cs 7", 
                              "diana@correo.co");
        
        libreta.verEntradas();
        
    }
    
}
