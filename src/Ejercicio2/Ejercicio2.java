/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import co.edu.uniminuto.actividad4.ejercicio2.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mduar
 */
public class Ejercicio2 {
  /** 2. El departamento escolar de la facultad de ingeniería necesita obtener un
 * reporte global de los promedios de sus estudiantes y que muestre el promedio
 * de cada uno, nombres, apellidos, carrera y semestre. Se debe imprimir el
 * promedio global y cada uno de los datos de los estudiantes.
     * @param args
    */
    public static void main(String[] args) {

        List<Estudiante> listEstudiantes = new ArrayList<>();

        short opcion = 0;
        double promedio = 0;
        String nombres = "";
        String apellidos = "";
        String carrera = "";
        String semestre = "";
        Estudiante estudiante;

        try {
            do {
                nombres = JOptionPane.showInputDialog("Ingrese nombres del estudiante:");
                apellidos = JOptionPane.showInputDialog("Ingrese apellidos del estudiante:");
                carrera = JOptionPane.showInputDialog("Ingrese carrera a la que pertenece el estudiante:");
                semestre = JOptionPane.showInputDialog("Ingrese semestre en curso del estudiante");
                promedio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota promedio del estudiante: "));
                if ((promedio >= 0) && (promedio <= 5)) {
                    estudiante = new Estudiante(nombres, apellidos, carrera, semestre, promedio);
                    listEstudiantes.add(estudiante);
                } else {
                    JOptionPane.showInputDialog(null, "Valor fuera de rango");
                }
                opcion = Short.parseShort(JOptionPane.showInputDialog("Si no desea seguir agregando promedios presione 0"));

            } while (opcion != 0);

        } catch (Exception e) {
            System.out.println("Error en captura de datos" + e.getMessage());
        }
        for (Estudiante e : listEstudiantes) {
            System.out.println("" + e);
        }
        estudiante = new Estudiante();
        double avg= estudiante.promediarGlobal(listEstudiantes);
        System.out.println("El promedio global de los estudiantes es: "+avg);

    }
}
