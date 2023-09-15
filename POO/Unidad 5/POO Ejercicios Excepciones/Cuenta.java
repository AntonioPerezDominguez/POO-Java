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
public class Cuenta {
    private String numero;
    private float saldo;
    private float limite;

    public Cuenta(String numero, float saldo, float limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public float retirar(float cantidad) throws NoFondosSuficientesException{
        if(cantidad>limite || cantidad>saldo){
            throw new NoFondosSuficientesException("La cantidad supera el limite diario/ o no hay dinero");
        }
        this.saldo-=cantidad;
        return this.saldo;
    }
    
}
