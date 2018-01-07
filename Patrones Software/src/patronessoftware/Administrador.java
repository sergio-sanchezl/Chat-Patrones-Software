package patronessoftware;

import Sala.Sala;
import Poderes.PoderesAdministrador;
import Poderes.*;

/**
 *
 * @author Sergio
 */
public class Administrador extends Usuario {
    
    public Administrador(String ID, String apodo) {
        super(ID, apodo);
        super.setTipoPoder(new PoderesAdministrador());
    }
    
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        objetivo.enviarMensaje("[ADMIN] " + mensaje, this);
    }
}
