package Comandos;

import Usuarios.Usuario;
import Sala.Sala;
import java.util.ArrayList;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class EcharTodosUsuarios implements Command {

    Sala sala;
    ArrayList<Usuario> usuarios;

    public EcharTodosUsuarios(Sala sala) {
        this.sala = sala;
        this.usuarios = sala.getMiembros();
    }

    @Override
    public void execute() {
        for (Usuario usuario : usuarios) {
            System.out.print("Expulsado: ");
            sala.desuscribirse(usuario);
        }
    }

    @Override
    public void undo() {
        for (Usuario usuario : usuarios) {
            sala.suscribirse(usuario);
        }
    }

}
