/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo3;

/**
 *
 * @author luisf
 */
public class cuentaBancaria {
    //Atributos
    private String nombreCliente;
    private int numCuenta;
    private float saldo;

    //getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Constructor inicializado
    public cuentaBancaria(String nombreCliente, int numCuenta, float saldo) {
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    //Constructor por defecto
    public cuentaBancaria() {
        
    }
    
    //Constructor copia
    public cuentaBancaria(final cuentaBancaria f) {
        nombreCliente = f.nombreCliente;
        numCuenta = f.numCuenta;
        saldo = f.saldo;
    }
    
    public float depositoCuenta(float cantidad) {
        if (cantidad < 0){
            return 0;
        }
        
        saldo = saldo + cantidad;
        return saldo;
      
    }
    
    public float retiro(float cantidad) {
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            return saldo;
        }
        return 0;
    }
    
    public float transferencia(cuentaBancaria cuentaRecibe, float cantidad) {
        if(saldo>50){
            saldo = saldo - cantidad;
            cuentaRecibe.saldo = cuentaRecibe.saldo + cantidad;
            
            return cuentaRecibe.saldo;
        }
        
        return 0;
    }
    
}

