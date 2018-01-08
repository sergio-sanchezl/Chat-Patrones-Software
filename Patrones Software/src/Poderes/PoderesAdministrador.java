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
    public void echarUsuario(Sala sala, Usuario emisor, Usuario receptor) {
           EcharUsuario echar = new EcharUsuario(sala,receptor);
           accionar = new Invocador(echar);
           accionar.accionar();
    }

    @Override
    public void añadirModerador(Sala sala, Usuario emisor, Usuario receptor){
        AñadirModerador añadir = new AñadirModerador(sala,receptor);
        accionar = new Invocador(añadir);
        accionar.accionar();
    }

    @Override
    public void quitarModerador(Sala sala, Usuario emisor, Usuario receptor) {
        QuitarModerador quitar = new QuitarModerador(sala,receptor);
        accionar = new Invocador(quitar);
        accionar.accionar();
    }

}
