package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteAñadirModerador implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteAñadirModerador con contexto: " + contexto.toString());
        Usuario emisor = contexto.getEmisor();
        Usuario receptor = contexto.getReceptor();
        Sala sala = contexto.getSala();
        
        emisor.tipoPoder.añadirModerador(sala, emisor, receptor);
    }
    
}
