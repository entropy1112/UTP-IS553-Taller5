/*
 * 
 */
package Ejercicio8;


import java.io.*;


/**
 
 * @author Sebastian
 */
public class Main {
    public void main(String args[]) throws IOException{
        
        var entrada = new BufferedReader(new InputStreamReader(System.in)); 
        String hexa;
        Integer resul;
        String mensaje;
        
        System.out.println("Ingrese un numero hexagesimal: ");
        hexa = entrada.readLine();
        
        try {
            resul = hexToDec(hexa);
            mensaje = imprimir(resul,hexa);
            System.out.println(mensaje);
        } catch (CustomException e) {
            mensaje = "Sucedió un error. "+ e.getMessage();
            System.out.println(mensaje);
        }
        
    }
    
    public static Integer hexToDec(String hexa) throws CustomException{
        
        Boolean esHex = hexa.matches("[0-9A-F]+");
        if (!esHex) {
            throw new CustomException("El valor ingresado es inválido.");
        }
        
        Integer decimal = Integer.parseInt(hexa, 16);
       
        return decimal;
    }
    
    public static String imprimir(Integer resul, String hexa){
        
        String mensaje;
        
        mensaje = hexa+" equivale a "+resul+" en decimal.";
        
        return mensaje;
    }
}
