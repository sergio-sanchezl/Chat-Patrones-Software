package patronessoftware;

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
    
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        objetivo.enviarMensaje(mensaje, this);
    }
}
