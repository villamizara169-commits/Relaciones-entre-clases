/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependencia;


public class Impresora {

    // Dependencia: Impresora USA a Documento solo en este método
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo: " + doc.getContenido());
    }
}