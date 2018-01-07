package Comandos;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class EnviarSusurro implements Command {

    Sala sala;
    Usuario emisor;
    Usuario receptor;
    String mensaje;
    
    public EnviarSusurro(Sala sala, Usuario emisor, Usuario receptor, String mensaje) {
        this.sala = sala;
        this.emisor = emisor;
        this.mensaje = mensaje;
        this.receptor = receptor;
        
    }
    
    @Override
    public void execute() {
        sala.enviarSusurro(mensaje, emisor, receptor);
    }

    @Override
    public void undo() {
        
    }
    
}
