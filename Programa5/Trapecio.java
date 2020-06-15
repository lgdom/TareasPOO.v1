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
public class Trapecio extends Area{
    
    private double baseMenor;
    private double baseMayor;
    private double altura;

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Trapecio(double baseMenor, double baseMayor, double altura) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (((baseMenor + baseMayor)/2) * altura);
    }
}
