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
public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private int año;
    private int numEjemplares;
    private int numPrestados;

    //Métodos get y set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo (){
        return titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getAutor (){
        return autor;
    }
    
    public void setAño ( int año) {
        this.año = año;
    }
    
    public int getAño (){
        return año;
    }
    
    public void setEjemplares (int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }
    
    public int getEjemplares (){
        return numEjemplares;
    }
    
    public void setPrestados (int numPrestados){
        this.numPrestados = numPrestados;
    }
    
    public int getPrestados (){
        return numPrestados;
    }
    
    //Método constructor
    public Libro(String titulo, String autor, int año, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }
    
    public Libro() {
        
    }
    
    //Métodos
    public int prestamoLibro(){
        if (numEjemplares <= 1){
            return 0;
        }

        numPrestados = numPrestados + 1;
        
        return 1;
    }
    
    public int devolucionLibro(){
        if (numPrestados == 0){
            return 0;
        }

        numPrestados = numPrestados - 1;
        
        return 1;
    }
    
    public void mostrar(){
        System.out.println("Información del libro: ");
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Año: " +año);
        System.out.println("Numero de ejemplares: " +numEjemplares);
        System.out.println("Numero de ejemplares prestados: " +numPrestados);
    }
}