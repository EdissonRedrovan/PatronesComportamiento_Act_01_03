/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author adrian
 */
public class Suma  implements Expression{

    private  Expression expressionIzq;
    private Expression expressionDer;
    
    @Override
    public double interpreter() {
        return 301.1+2.0;
    }
    
}
