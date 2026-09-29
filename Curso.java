/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociasion;


import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    // Un curso contiene MUCHOS estudiantes
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println(" - " + e.getNombre());
        }
    }
}