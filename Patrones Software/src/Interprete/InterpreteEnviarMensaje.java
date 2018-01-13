package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteEnviarMensaje implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        //System.out.println("InterpreteEnviarMensaje con contexto: " + contexto.toString());
        
        Usuario emisor = contexto.getEmisor();
        String mensaje = contexto.getMensaje();
        Sala sala = contexto.getSala();
        
        emisor.enviarMensaje(mensaje, sala);
    }
    
}
