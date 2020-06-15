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
public class demoCuentaBancaria {
    public static void main(String[] args) {
        cuentaBancaria cuenta1 = new cuentaBancaria();
        
        cuenta1.setNombreCliente("Zuri");
        cuenta1.setNumCuenta(01);
        cuenta1.setSaldo(70000);
        
        cuentaBancaria cuenta2 = new cuentaBancaria("Eliuh", 02, 30000);
        cuentaBancaria cuenta3 = new cuentaBancaria("Luis", 03, 50000);
        cuentaBancaria cuenta4 = new cuentaBancaria (cuenta1);
        
        cuenta1.depositoCuenta(3000);
        cuenta4.depositoCuenta(3000);
        
        if(cuenta2.retiro(10000) == 0){
            System.out.println("No hay saldo suficiente");
        }
        
        else{
            System.out.println("Retiro exitoso");
        }
        
        cuenta1.transferencia(cuenta2, 200);
        
        System.out.println("Titular de la cuenta: " +cuenta1.getNombreCliente());
        System.out.println("Número de cuenta: " +cuenta1.getNumCuenta());
        System.out.println("El saldo de la cuenta es: " +cuenta1.getSaldo()+ "\n");
        
        System.out.println("Titular de la cuenta: " +cuenta2.getNombreCliente());
        System.out.println("Número de cuenta: " +cuenta2.getNumCuenta());
        System.out.println("El saldo de la cuenta es: " +cuenta2.getSaldo() + "\n");
        
        System.out.println("Titular de la cuenta: " +cuenta3.getNombreCliente());
        System.out.println("Número de cuenta: " +cuenta3.getNumCuenta());
        System.out.println("El saldo de la cuenta es: " +cuenta3.getSaldo() + "\n");
        
        System.out.println("Titular de la cuenta: " +cuenta4.getNombreCliente());
        System.out.println("Número de cuenta: " +cuenta4.getNumCuenta());
        System.out.println("El saldo de la cuenta es: " +cuenta4.getSaldo() + "\n");
        
    }
       
}
    
