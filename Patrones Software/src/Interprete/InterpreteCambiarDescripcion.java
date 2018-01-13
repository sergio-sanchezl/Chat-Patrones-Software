package Interprete;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class InterpreteCambiarDescripcion implements Interprete {

    @Override
    public void interpretar(Contexto contexto) {
        //System.out.println("InterpreteCambiarDescripcion con contexto: " + contexto.toString());
        
        Usuario usuario = contexto.getEmisor();
        Sala sala = contexto.getSala();
        String descripcion = contexto.getMensaje();
        
        usuario.tipoPoder.cambiarDescripcionSala(sala, usuario, descripcion);
    }
    
}
