/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociasion;


import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    // Un estudiante tiene MUCHOS cursos
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método que vincula a ambas partes (mantiene la relación bidireccional)
    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
        curso.getEstudiantes().add(this);
    }

    public void mostrarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getNombre());
        }
    }
}