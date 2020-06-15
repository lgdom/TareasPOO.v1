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
public class demoAreas {
    
    public static void main(String[] args) {
        
    Cuadrado cuadrado = new Cuadrado(10);
    Triangulo triangulo = new Triangulo(10, 3);
    Rectangulo rectangulo = new Rectangulo(5, 8);
    Circulo circulo = new Circulo(5);
    Hexagono hexagono = new Hexagono(4, 8);
    Trapecio trapecio = new Trapecio(10, 5, 8);

        System.out.println("El area del cuadrado es: " +cuadrado.calcularArea());
        System.out.println("El area del triangulo es: " +triangulo.calcularArea());
        System.out.println("El area del rectangulo es: " +rectangulo.calcularArea());
        System.out.println("El area del circulo es: " +circulo.calcularArea());
        System.out.println("El area del hexagono es: " +hexagono.calcularArea());
        System.out.println("El area del trapecio es: " +trapecio.calcularArea());
    }
    
}