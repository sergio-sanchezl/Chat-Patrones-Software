package Usuarios;

import Sala.Sala;
import Poderes.*;
import java.util.HashSet;

/**
 *
 * @author Sergio
 */
public class Administrador extends Usuario {
    public Administrador(String ID, String apodo) {
        super(ID, apodo);
        super.setTipoPoder(new PoderesAdministrador());
    }
    public Administrador(Usuario usuario){
        super(usuario);
        super.setTipoPoder(new PoderesAdministrador());

    }
   
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        super.tipoPoder.enviarMensaje(objetivo, this, "[ADMIN] " + mensaje);
    }

    @Override
    public void enviarSusurro(String mensaje, Sala objetivo, Usuario receptor) {
        super.tipoPoder.enviarSusurro(objetivo, this, receptor, "[ADMIN] " + mensaje);
    }
}
