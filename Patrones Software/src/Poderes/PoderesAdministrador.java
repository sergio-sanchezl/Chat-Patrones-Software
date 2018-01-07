package Poderes;

import Comandos.AñadirModerador;
import Comandos.EcharUsuario;
import Comandos.Invocador;
import Comandos.QuitarModerador;
import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */
public class PoderesAdministrador extends Poder {

    @Override
    /**
     * Puede echar a quien quiera, es el administrador.
     */
    public void echarUsuario(Sala sala, Usuario usuario) {
        if (sala.getModeradores().contains(usuario)) { //Si el usuario es administrador
           EcharUsuario echar = new EcharUsuario(sala,usuario);
           accionar = new Invocador(echar);
           accionar.accionar();
           //Echa al usuario independientemente de lo que sea
           //Si echa a un usuario administrador de la sala, el miembro más antiguo se convierte en administrador
           if(usuario==sala.getAdministrador()){
               sala.setAdministrador(sala.getMiembros().get(0));
           }
           if(sala.getModeradores().contains(usuario)){ //Si el usuario es moderador, echarlo también
            QuitarModerador echarModerador = new QuitarModerador(sala,usuario);
            accionar.setComando(echarModerador);
            accionar.accionar();
        }
    }
    }

    @Override
    public void añadirModerador(Sala sala, Usuario usuario){
        AñadirModerador añadir = new AñadirModerador(sala,usuario);
        accionar = new Invocador(añadir);
        accionar.accionar();
    }

    @Override
    public void quitarModerador(Sala sala, Usuario usuario) {
        QuitarModerador quitar = new QuitarModerador(sala,usuario);
        accionar = new Invocador(quitar);
        accionar.accionar();
    }

}
