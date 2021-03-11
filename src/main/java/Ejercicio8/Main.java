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
        
        System.out.println("Ingrese un numero hexagesimal: ");
        hexa = entrada.readLine();
        
        try {
            resul = hexToDec(hexa);
            System.out.println(hexa+" equivale a "+resul+" en decimal.");
        } catch (CustomException e) {
            System.out.println("Sucedió un error. "+ e.getMessage());
        }
        
    }
    
    public Integer hexToDec(String hexa) throws CustomException{
        
        Boolean esHex = hexa.matches("[0-9A-F]+");
        if (!esHex) {
            throw new CustomException("El valor ingresado es inválido.");
        }
        
        Integer decimal = Integer.parseInt(hexa, 16);
       
        return decimal;
    }
}
