package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteCambiarNombre implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("InterpreteCambiarNombre con contexto: " + contexto.toString());
        
        Usuario usuario = contexto.getEmisor();
        Sala sala = contexto.getSala();
        String nombre = contexto.getMensaje();
        
        usuario.tipoPoder.cambiarNombreSala(sala, usuario, nombre);
    }
    
}
