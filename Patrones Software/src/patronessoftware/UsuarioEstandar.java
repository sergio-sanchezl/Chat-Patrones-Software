package patronessoftware;

import Sala.SalaTest;
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
    public void enviarMensaje(String mensaje, SalaTest objetivo) {
        objetivo.enviarMensaje(mensaje, this);
    }
}
