/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo5;

/**
 *
 * @author luisf
 */
public class Cuadrado extends Area {
    
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double calcularArea() {
        return lado * lado;
        
    }
}
