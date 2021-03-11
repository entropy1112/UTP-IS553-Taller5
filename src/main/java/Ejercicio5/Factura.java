/*
 * 
 */
package Ejercicio5;

/**
 *
 * @author Sebastian
 */
public class Factura extends Precio{
    //Atributos
    private final String emisor;
    private final String cliente;
    
    //Constructor
    public Factura(String emisor, String cliente, Double aCancelar){
        this.emisor = emisor;
        this.cliente = cliente;
        this.pesos = aCancelar;
    }
    
    //Métodos
    public String ImprimirFactura() throws CustomException{
        
        if(this.getPesos() < 0 ){
            throw new CustomException(this.getPesos()
                                      +" no es una entrada válida");
        }
        
        String mensaje;
        
        mensaje = "Factura generada por: "+this.emisor+"\n";
        mensaje += "Cliente: "+this.cliente+"\n";
        mensaje += "Valor cancelado: "+this.getPesos()+"\n";
        
        System.out.println(mensaje);
        
        return mensaje;
    }
    
}
