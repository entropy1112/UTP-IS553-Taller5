/*
 * Testeo de los constructores, setters y getters de la clase RegistroLibreta
 */
package Ejercicio1y2;

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
    public void RegistroLibretaPrimerConstructorYSetters(){
        
        String nombre = "Sebastian Narvaez";
        String tel = "3817548724";
        String dir = "Mz 43 Cs 12";
        String correo = "sebasnarvaez@correo.com";
        
        var primerRegistro = new RegistroLibreta("Sebastian Narvaez",
                                                 "3817548724");
        
        primerRegistro.setCorreo("sebasnarvaez@correo.com");
        primerRegistro.setDir("Mz 43 Cs 12");
        
        assertEquals(nombre, primerRegistro.getNombre());
        assertEquals(tel, primerRegistro.getTel());
        assertEquals(correo, primerRegistro.getCorreo());
        assertEquals(dir, primerRegistro.getDir());
    }
    
    @Test
    public void RegistroLibretaSegundoConstructorYSetter() {
        
        String nombre = "John Herrera";
        String tel = "3684751287";
        String dir = "Mz 7 Cs 7";
        String correo = "jonhsito@correo.co";
        
        var SegundoRegistro = new RegistroLibreta("John Herrera", "3684751287", 
                                                  "Mz 7 Cs 7");
        
        SegundoRegistro.setCorreo("jonhsito@correo.co");
        
        assertEquals(nombre, SegundoRegistro.getNombre());
        assertEquals(tel, SegundoRegistro.getTel());
        assertEquals(correo, SegundoRegistro.getCorreo());
        assertEquals(dir, SegundoRegistro.getDir());
    }
    
    @Test
    public void RegistroLibretaTercerConstructor() {
        
        String nombre = "Diana Ossa";
        String tel = "3458571426";
        String dir = "Mz 3 Cs 7";
        String correo = "diana@correo.co";
        
        var TercerRegistro = new RegistroLibreta("Diana Ossa", "3458571426", 
                                                 "Mz 3 Cs 7","diana@correo.co");
        
        assertEquals(nombre, TercerRegistro.getNombre());
        assertEquals(tel, TercerRegistro.getTel());
        assertEquals(correo, TercerRegistro.getCorreo());
        assertEquals(dir, TercerRegistro.getDir());
    }
}
