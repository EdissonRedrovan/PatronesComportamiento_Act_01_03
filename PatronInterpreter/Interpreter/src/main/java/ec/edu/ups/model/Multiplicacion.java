/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.model;

/**
 *
 * @author adrian
 */
public class Multiplicacion implements Expression{

    private  Expression expressionIzq;
    private Expression expressionDer;


    public Multiplicacion(Expression expressionIzq, Expression expressionDer) {
        this.expressionIzq = expressionIzq;
        this.expressionDer = expressionDer;
    }
     

    public Expression getExpressionIzq() {
        return expressionIzq;
    }

    public void setExpressionIzq(Expression expressionIzq) {
        this.expressionIzq = expressionIzq;
    }

    public Expression getExpressionDer() {
        return expressionDer;
    }

    public void setExpressionDer(Expression expressionDer) {
        this.expressionDer = expressionDer;
    }
    
    @Override
    public double interpreter() {
         return expressionIzq.interpreter()* expressionDer.interpreter();

    }
    
}
