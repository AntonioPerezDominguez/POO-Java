/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Antonio
 */
public class CuentaTester {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("00001",5000,2500);
        float cantidad=600;
        try{
            c1.retirar(cantidad);
            System.out.println("Se retiraron: "+cantidad+" exitosamente de la cuenta");
            
        }catch(NoFondosSuficientesException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
