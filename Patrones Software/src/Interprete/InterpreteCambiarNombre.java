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
public class InterpreteCambiarNombre implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteCambiarNombre con contexto: " + contexto.toString());
    }
    
}
