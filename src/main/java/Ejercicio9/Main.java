/*
 * 
 */
package Ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer num;
        
        System.out.print("Ingrese un número entero: ");
        num = scan.nextInt();
        
        try {
            asteriscos(num);
        } catch (CustomException e) {
            System.out.println("Hubo un error. "+e.getMessage());
        }
    }
    
    public static void asteriscos(Integer n) throws CustomException{
        
        Integer lim = (n*2 -1);
        Character[][] mapa = new Character[lim][lim];
        int cont=0;
        
        if(n<=0){
            throw new CustomException(n+" es un número inválido.");
        }
        
        for(int i=0; i<lim; i++){
            for(int j=0; j<lim; j++){
                if(  j >= ((n-1)-cont) && j <= ((n-1)+cont) ){
                    mapa[i][j]='*';
                }
                else{
                    mapa[i][j]=' ';
                }
            }
            if(i>=(n-1)){
                cont--;
            }
            else{
                cont++;
            }
        }
        
        for(int i=0; i<lim; i++){
            for(int j=0; j<lim; j++){
                System.out.print(mapa[i][j]);
            }
            System.out.println("\n");
        }
        
    }
    
}
