package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteEnviarSusurro implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        //System.out.println("InterpreteEnviarSusurro con contexto: " + contexto.toString());
        
        Usuario emisor = contexto.getEmisor();
        Usuario receptor = contexto.getReceptor();
        String mensaje = contexto.getMensaje();
        Sala sala = contexto.getSala();
        
        emisor.enviarSusurro(mensaje, sala, receptor);
    }
    
}
