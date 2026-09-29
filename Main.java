/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependencia;


public class Main {
    public static void main(String[] args) {
        // Creamos los dos objetos
        Documento miReporte = new Documento();
        Impresora miImpresora = new Impresora();

        // La impresora 'usa' el documento para imprimirlo
        miImpresora.imprimir(miReporte);
    }
}