/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicios1y2.RegistroLibreta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sebastian
 */
public class RegistroLibretaTest {
    
    public RegistroLibretaTest() {
    }

    @Test
    public void RegistroLibretaPrimerConstructorYSetters() {
        
        String nombre = "Sebastian Narvaez";
        String tel = "3817548724";
        String correo = "sebasnarvaez@correo.com";
        String dir = "Mz 43 Cs 12";
        
        var primerRegistro = new RegistroLibreta("Sebastian Narvaez",
                                                 "3817548724");
        
        primerRegistro.setCorreo("sebasnarvaez@correo.com");
        primerRegistro.setDir("Mz 43 Cs 12");
        
        assertEquals(nombre, primerRegistro.getNombre());
        assertEquals(tel, primerRegistro.getTel());
        assertEquals(correo, primerRegistro.getCorreo());
        assertEquals(dir, primerRegistro.getDir());
    }
    
}
