/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo4;

/**
 *
 * @author luisf
 */
public class operacionDemo {
    
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        System.out.println("La suma es: " + op.suma(15.3, 0.5, 10.8));
        System.out.println("La resta es: " + op.resta(1, 1));
        System.out.println("La multiplicacion es: " + op.multiplicacion(1, 1));
        System.out.println("La división es: " + op.division(1, 1, 2));
        
    }
}
