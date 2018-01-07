package Poderes;

import Comandos.EcharUsuario;
import Comandos.Invocador;
import Sala.Sala;
import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */


public class PoderesModerador extends Poder {

    @Override
    /**
     * Puede echar a quien excepto al administrador local y otros moderadores
     */
    public void echarUsuario(Sala sala, Usuario usuario) {
            if(usuario != sala.getAdministrador() && !sala.getModeradores().contains(usuario)){
                   EcharUsuario echar = new EcharUsuario(sala,usuario);
                   this.accionar = new Invocador(echar);
                   accionar.accionar();
           }
            else{ //Esta intentando 
                System.out.println("No tienes los permisos necesarios");
            }
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
