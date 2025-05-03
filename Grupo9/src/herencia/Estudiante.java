/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author carra
 */
public class Estudiante extends Persona {
    int codigo_estudiante;
    int semestre;
    String carrera;

    public Estudiante() {
    }

    public Estudiante(int codigo_estudiante, int semestre, String carrera) {
        this.codigo_estudiante = codigo_estudiante;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public Estudiante(int codigo_estudiante, int semestre, String carrera, char sexo, String nombre, int estatura, String nacionalidad, int peso) {
        super(sexo, nombre, estatura, nacionalidad, peso);
        this.codigo_estudiante = codigo_estudiante;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    
    
    
}
