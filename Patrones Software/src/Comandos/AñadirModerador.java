package Comandos;

import Usuarios.Usuario;
import Sala.Sala;
import patronessoftware.*;

/**
 *
 * @author Sergio
 */
public class AñadirModerador implements Command{
    Sala sala;
    Usuario usuario;
    public AñadirModerador(Sala sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        sala.añadirModerador(usuario);
    }

    @Override
    public void undo() {
        sala.quitarModerador(usuario);
    }
    
    
}
