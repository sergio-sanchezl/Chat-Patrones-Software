package Comandos;

import Usuarios.Usuario;
import Sala.Sala;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class QuitarModerador implements Command{
    Sala sala;
    Usuario usuario;
    public QuitarModerador(Sala sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        sala.quitarModerador(usuario);
    }

    @Override
    public void undo() {
        sala.añadirModerador(usuario);
    }
    
    
}
