/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.actividad4.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mduar
 */
public class Estudiante {
     private String nombres;
    private String apellidos;
    private String carrera;
    private String semestre;
    
    private double promedioEstudiante;
    
    // Metodo contructor

    public Estudiante(String nombres, String apellidos, String carrera, String semestre, double promedioEstudiante) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedioEstudiante = promedioEstudiante;
    }

    public Estudiante() {
    }
    
    // Metodos de acceso

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedioEstudiante() {
        return promedioEstudiante;
    }

    public void setPromedioEstudiante(double promedioEstudiante) {
        this.promedioEstudiante = promedioEstudiante;
    }
    public double promediarGlobal(List<Estudiante> lista){
    List<Estudiante> estudiante = new ArrayList<>(lista);
    double suma=0;
    for(Estudiante e : estudiante){
    suma+= e.getPromedioEstudiante();
    }
        return suma /estudiante.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", carrera=").append(carrera);
        sb.append(", semestre=").append(semestre);
        sb.append(", promedioEstudiante=").append(promedioEstudiante);
        sb.append('}');
        return sb.toString();
    }
}
