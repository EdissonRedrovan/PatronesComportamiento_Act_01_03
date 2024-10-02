/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controller;

import ec.edu.ups.model.Division;
import ec.edu.ups.model.Expression;
import ec.edu.ups.model.Multiplicacion;
import ec.edu.ups.model.Numero;
import ec.edu.ups.model.Resta;
import ec.edu.ups.model.Suma;
import java.util.Stack;

/**
 *
 * @author adrian
 */
public class InterpreterController {
    
    
    private Expression expression;

    public InterpreterController(Expression expression) {
        this.expression = expression;
    }

    public InterpreterController() {
    }
    
    public double interpretarExpression(String input) throws Exception { // 9+8-5
        Expression expression = parseExpression(input);
        return expression.interpreter();

    }

    public Expression parseExpression(String input) throws Exception {
        
        String[] tokens = input.split(" ");
        System.out.println("tokens = " + tokens);
        Expression left = new Numero(Double.parseDouble(tokens[0]));

        
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            Expression right = new Numero(Double.parseDouble(tokens[i + 1]));

            switch (operator) {
                case "+":
                    left = new Suma(left, right);
                    break;
                case "-":
                    left = new Resta(left, right);
                    break;
                case "*":
                    left = new Multiplicacion(left, right);
                    break;
                case "/":
                    left = new Division(left, right);
                    break; 
                default:
                    throw new Exception("Operador no soportado");
            }
        }
        return left;
    }        
//        Stack<Expression> expressionStack = new Stack<>();
//        StringBuilder numberBuilder = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//
//            if (Character.isDigit(c)) {
//                numberBuilder.append(c);
//            } else if (c == '+' || c == '-') {
//                if (numberBuilder.length() > 0) {
//                    expressionStack.push(new Numero(Integer.parseInt(numberBuilder.toString())));
//                    numberBuilder = new StringBuilder();
//                }
//
//                if (expressionStack.size() < 2) {
//                    throw new IllegalArgumentException("Expresión inválida: faltan operandos en la posición " + i);
//                }
//
//                Expression right = expressionStack.pop();
//                Expression left = expressionStack.pop();
//
//                if (c == '+') {
//                    expressionStack.push(new Suma(left, right));
//                } else {
//                    expressionStack.push(new Resta(left, right));
//                }
//            } else if (!Character.isWhitespace(c)) {
//                throw new IllegalArgumentException("Carácter no válido en la posición " + i + ": " + c);
//            }
//        }
//
//        if (numberBuilder.length() > 0) {
//            expressionStack.push(new Numero(Integer.parseInt(numberBuilder.toString())));
//        }
//
//        if (expressionStack.size() != 1) {
//            throw new IllegalArgumentException("Expresión inválida: demasiados operandos o falta un operador");
//        }
//
//        return expressionStack.pop();
//    }

}
