package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteEcharUsuario implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        //System.out.println("InterpreteEcharUsuario con contexto: " + contexto.toString());
        
        Usuario emisor = contexto.getEmisor();
        Usuario receptor = contexto.getReceptor();
        Sala sala = contexto.getSala();
        
        emisor.echarUsuario(sala, receptor);
    }
    
}
