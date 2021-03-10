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
public class EstudianteDeInformatica extends Estudiante {
    //Atributos
    private Integer semestre;
    
    //Constructores
    public EstudianteDeInformatica(Integer semestre, String nombre, String tel, String edad, String codigo, String prom) {
        super(nombre, tel, edad, codigo, prom);
        this.semestre = semestre;
    }

    public EstudianteDeInformatica(Integer semestre, String nombre, String codigo) {
        super(nombre, codigo);
        this.semestre = semestre;
    }
    
    //Métodos
    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    
    public void programar(){
        
    }
    
    public void trasnochar(){
        
    }
}
