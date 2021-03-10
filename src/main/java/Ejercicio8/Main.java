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
        
        System.out.println("Ingrese un numero hexagesimal: ");
        hexa = entrada.readLine();
        
        try {
            hexToDec(hexa);
        } catch (CustomException e) {
            System.out.println("Sucedió un error. "+ e.getMessage());
        }
        
    }
    
    public void hexToDec(String hexa) throws CustomException{
        
        Integer decimal = Integer.parseInt(hexa, 16);
        
    }
}
