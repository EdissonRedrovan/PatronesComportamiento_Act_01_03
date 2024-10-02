/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author adrian
 */
public class Numero implements Expression{

    private double valor;

    public Numero() {
    }

    public Numero(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
    @Override
    public double interpreter() {
         return valor;
    }
    
}
