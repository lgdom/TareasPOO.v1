/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo2;

/**
 *
 * @author luisf
 */
public class demoLibro {
    
    public static void main(String[] args) {
        Libro libro1 = new Libro ("El culo", "Tu gfa", 2020, 2, 1);
        Libro libro2 = new Libro ("El chile", "Tu gfe", 2020, 2, 1);
        Libro libro3 = new Libro ();
        
        libro3.setAutor("La vida de Zuri");
        libro3.setTitulo("Aldahir Contreras");
        libro3.setAño(1999);
        libro3.setEjemplares(10);
        libro3.setPrestados(1);
    
        libro1.prestamoLibro();
        libro3.prestamoLibro();
        libro1.mostrar();
        libro3.mostrar();
        libro2.devolucionLibro();
        libro2.mostrar();
    }
    
}
