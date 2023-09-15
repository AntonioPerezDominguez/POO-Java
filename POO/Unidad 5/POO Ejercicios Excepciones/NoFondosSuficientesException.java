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
public class NoFondosSuficientesException extends Exception{
    public NoFondosSuficientesException(String description){
        super(description);
    }
}
