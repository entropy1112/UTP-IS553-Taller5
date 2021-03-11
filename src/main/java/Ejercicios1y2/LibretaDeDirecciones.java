/*
 * Creación de la clase LibretaDeDirecciones
 */
package Ejercicios1y2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sebastian
 */
public class LibretaDeDirecciones {
    
    // Atributos
    private static final Integer MAX_ENTRADAS = 100;
    protected Map<String, RegistroLibreta> libreta = new HashMap<>();
   
    //Constructor
    public LibretaDeDirecciones() {
    }
    
    // Métodos
    public void añadirEntrada(String nombre, String tel, String dir, 
                              String correo){
        
        var nuevaEntrada = new RegistroLibreta(nombre, tel, dir, correo);
        
        libreta.put(nombre, nuevaEntrada);
        
    }
    
    
    public void borrarEntrada(String nombre){
        
        libreta.remove(nombre);
        
    }
    
    public void verEntradas(){
        
        var nombresEntradas = libreta.keySet();
        
        nombresEntradas.stream().map((nombre) -> libreta.get(nombre))
                                .forEachOrdered((entrada) -> {
            System.out.println(entrada.getNombre()+"\n"+entrada.getTel()+"\n"
                               +entrada.getDir()+"\n"+entrada.getCorreo()+"\n");
        });
        
        System.out.println("-----------------------------------------------\n");
        
    }
    
    public void actualizarEntrada(String nombreAnterior, String nombreNuevo, 
                                  String tel, String dir, String correo)
                                    throws CustomException {
        
        var nombresEntradas = libreta.keySet();
        
        if(!nombresEntradas.contains(nombreAnterior)){
            throw new CustomException(nombreAnterior
                                      +" no pertenece a la libreta");
        }
        
        var entrada = libreta.get(nombreAnterior);
        
        entrada.setNombre(nombreNuevo);
        entrada.setTel(tel);
        entrada.setDir(dir);
        entrada.setCorreo(correo);
        
        libreta.remove(nombreAnterior);
        libreta.put(nombreNuevo, entrada);
        
    }
    
}
