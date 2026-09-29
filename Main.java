/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociasion;


public class Main {
    public static void main(String[] args) {
        // 1. Creamos cursos
        Curso java = new Curso("Programación Java");
        Curso bd = new Curso("Bases de Datos");

        // 2. Creamos estudiantes
        Estudiante juan = new Estudiante("Juan");
        Estudiante maria = new Estudiante("María");

        // 3. Relacionamos Juan con ambos cursos
        juan.inscribirCurso(java);
        juan.inscribirCurso(bd);

        // 4. Relacionamos María solo con el curso de Java
        maria.inscribirCurso(java);

        // --- Verificación de la relación bidireccional ---
        System.out.println("=== DESDE LA PERSPECTIVA DEL ESTUDIANTE ===");
        juan.mostrarCursos();

        System.out.println("\n=== DESDE LA PERSPECTIVA DEL CURSO ===");
        java.mostrarEstudiantes();
    }
}