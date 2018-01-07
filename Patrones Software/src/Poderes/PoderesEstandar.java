package Poderes;

import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */


public class PoderesEstandar extends Poder {

    @Override
    /**
     * No puede echar a nadie
     */
    public void echarUsuario(Sala sala, Usuario usuario) {
          System.out.println("No tienes los permisos necesarios");
    }

    @Override
    public void añadirModerador(Sala sala, Usuario usuario) {
        System.out.println("No tienes los permisos necesarios");
    }

    @Override
    public void quitarModerador(Sala sala, Usuario usuario) {
        System.out.println("No tienes los permisos necesarios");
    }
    
}
