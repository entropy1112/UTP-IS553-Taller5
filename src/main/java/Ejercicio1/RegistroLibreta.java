/*
 * 
 */
package Ejercicio1;

/**
 *
 * @author Sebastian
 */
public class RegistroLibreta {
    
    protected String nombre;
    protected String dir;
    protected String tel; 
    protected String correo; 
    
    public RegistroLibreta(String nombre, String tel){
        this.nombre = nombre;
        this.tel = tel;
    }

    public RegistroLibreta(String nombre, String dir, String tel) {
        this.nombre = nombre;
        this.dir = dir;
        this.tel = tel;
    }

    public RegistroLibreta(String nombre, String dir, String tel,
                           String correo) {
        this.nombre = nombre;
        this.dir = dir;
        this.tel = tel;
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDir() {
        return dir;
    }

    public String getTel() {
        return tel;
    }

    public String getCorreo() {
        return correo;
    }

}
