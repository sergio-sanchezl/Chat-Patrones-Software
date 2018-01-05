package patronessoftware;

/**
 *
 * @author Sergio
 */
public class Administrador extends Usuario {
    
    public Administrador(String ID, String apodo) {
        super(ID, apodo);
    }
    
    @Override
    public void enviarMensaje(String mensaje, Sala objetivo) {
        objetivo.enviarMensaje("[ADMIN] " + mensaje, this);
    }
}
