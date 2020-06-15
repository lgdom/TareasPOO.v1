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
public class Hexagono extends Area{
    
    private float perimetro;
    private float apotema;

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public Hexagono(float perimetro, float apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }
    
    @Override
    public double calcularArea() {
        return ((perimetro * apotema)/2);
    }
}
