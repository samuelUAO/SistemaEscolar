/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author SAMUEL
 */
public class SistemaColegio {

    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;

    public SistemaColegio() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void registrarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    // Reporte 1: lista de estudiantes
    public String reporteEstudiantes() {
        String reporte = "REPORTE DE ESTUDIANTES\n\n";

        if (estudiantes.isEmpty()) {
            return reporte + "No hay estudiantes registrados.";
        }

        for (Estudiante estudiante : estudiantes) {
            reporte += estudiante.mostrarDatos() + "\n\n";
        }

        return reporte;
    }

    // Reporte 2: profesores ordenados por costo total
    public String reporteProfesores() {
        String reporte = "REPORTE DE PROFESORES\n\n";

        if (profesores.isEmpty()) {
            return reporte + "No hay profesores registrados.";
        }

        List<Profesor> ordenados = new ArrayList<>(profesores);

        ordenados.sort(
            Comparator.comparingDouble(Profesor::calcularCostoTotal)
                      .reversed()
        );

        for (Profesor profesor : ordenados) {
            reporte += profesor.mostrarDatos() + "\n\n";
        }

        return reporte;
    }

    // Sobrecarga de métodos: mismo nombre, distintos parámetros
    public Persona buscarPersona(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }

        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equalsIgnoreCase(nombre)) {
                return profesor;
            }
        }

        return null;
    }

    public Persona buscarPersona(String nombre, String tipo) {
        if (tipo.equalsIgnoreCase("estudiante")) {
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                    return estudiante;
                }
            }
        } else if (tipo.equalsIgnoreCase("profesor")) {
            for (Profesor profesor : profesores) {
                if (profesor.getNombre().equalsIgnoreCase(nombre)) {
                    return profesor;
                }
            }
        }

        return null;
    }
}