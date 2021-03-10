/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Sebastian
 */
public class Estudiante {
    //Atributos
    protected String nombre;
    protected String tel;
    protected String edad;
    protected String codigo;
    protected String prom;
    
    //constructores

    public Estudiante(String nombre, String tel, String edad, String codigo, String prom) {
        this.nombre = nombre;
        this.tel = tel;
        this.edad = edad;
        this.codigo = codigo;
        this.prom = prom;
    }

    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public String getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProm() {
        return prom;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProm(String prom) {
        this.prom = prom;
    }
    
    public void estudiar(){
        
    }
    public void investigar(){
        
    }
}
