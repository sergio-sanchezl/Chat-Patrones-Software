package patronessoftware;

/**
 *
 * @author Sergio
 */
public class UsuarioEstandar extends Usuario {
    
    public UsuarioEstandar(String ID, String apodo) {
        super(ID, apodo);
    }
    
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        objetivo.enviarMensaje(mensaje, this);
    }
}
