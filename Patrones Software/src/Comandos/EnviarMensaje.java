package Comandos;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class EnviarMensaje implements Command {

    Sala sala;
    Usuario emisor;
    String mensaje;
    
    public EnviarMensaje(Sala sala, Usuario emisor, String mensaje) {
       this.sala = sala; 
       this.emisor = emisor;
       this.mensaje = mensaje;
    }
    @Override
    public void execute() {
        sala.enviarMensaje(mensaje, emisor);
    }

    @Override
    public void undo() {
        
    }
    
}
