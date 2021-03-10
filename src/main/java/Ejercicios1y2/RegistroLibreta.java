/*
 *  Creación de la clase RegistroLibreta
 */
package Ejercicios1y2;

/**
 *
 * @author Sebastian
 */
public class RegistroLibreta {
    
    // Atributos 
    protected String nombre;
    protected String tel; 
    protected String dir;
    protected String correo; 
    
    // Constructores
    public RegistroLibreta(String nombre, String tel){
        this.nombre = nombre;
        this.tel = tel;
    }

    public RegistroLibreta(String nombre, String tel, String dir) {
        this.nombre = nombre;
        this.tel = tel;
        this.dir = dir;
    }

    public RegistroLibreta(String nombre, String tel, String dir,
                           String correo) {
        this.nombre = nombre;
        this.tel = tel;
        this.dir = dir;
        this.correo = correo;
    }

    // Métodos 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public String getDir() {
        return dir;
    }

    public String getCorreo() {
        return correo;
    }
    
}
