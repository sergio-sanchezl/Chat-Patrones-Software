/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interprete;

/**
 *
 * @author Sergio
 */
public class InterpreteEcharUsuario implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteEcharUsuario con contexto: " + contexto.toString());
    }
    
}
