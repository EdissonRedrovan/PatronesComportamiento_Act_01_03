package ec.edu.ups.interpreter;


import ec.edu.ups.controller.InterpreterController;
import ec.edu.ups.model.Numero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author adrian
 */
public class Interpreter {

    public static void main(String[] args) throws Exception {
        InterpreterController ic = new InterpreterController();
        double resultado = ic.interpretarExpression("9 * 1000");
        System.out.println("resultado = " + resultado);
    }
}
