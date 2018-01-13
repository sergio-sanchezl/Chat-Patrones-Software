/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteQuitarModerador implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        //System.out.println("InterpreteQuitarModerador con contexto: " + contexto.toString());
        
        Usuario emisor = contexto.getEmisor();
        Usuario receptor = contexto.getReceptor();
        Sala sala = contexto.getSala();
        
        emisor.tipoPoder.quitarModerador(sala, emisor, receptor);
    }
    
}
