package Poderes;

import Comandos.AñadirModerador;
import Comandos.EcharUsuario;
import Comandos.Invocador;
import Comandos.QuitarModerador;
import Comandos.SetSalaDescripcion;
import Comandos.SetSalaTitulo;
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

    @Override
    public void cambiarNombreSala(Sala sala, Usuario usuario, String nombreSala) {
        SetSalaTitulo setTitulo = new SetSalaTitulo(sala, nombreSala);
        accionar = new Invocador(setTitulo);
        accionar.accionar();
    }

    @Override
    public void cambiarDescripcionSala(Sala sala, Usuario usuario, String descripcionSala) {
        SetSalaDescripcion setDescripcion = new SetSalaDescripcion(sala, descripcionSala);
        accionar = new Invocador(setDescripcion);
        accionar.accionar();
    }

}
