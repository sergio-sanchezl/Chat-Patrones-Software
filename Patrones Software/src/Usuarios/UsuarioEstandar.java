package Usuarios;

import Sala.Sala;
import Poderes.PoderesEstandar;
import Poderes.*;

/**
 *
 * @author Sergio
 */
public class UsuarioEstandar extends Usuario {
    
    public UsuarioEstandar(String ID, String apodo) {
        super(ID, apodo);
        super.setTipoPoder(new PoderesEstandar());
    }
    public UsuarioEstandar(Usuario usuario){
        super(usuario);
        super.setTipoPoder(new PoderesEstandar());

    }
    
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        super.tipoPoder.enviarMensaje(objetivo, this, mensaje);
    }

    @Override
    public void enviarSusurro(String mensaje, Sala objetivo, Usuario receptor) {
        super.tipoPoder.enviarSusurro(objetivo, this, receptor, mensaje);
    }

    
}
