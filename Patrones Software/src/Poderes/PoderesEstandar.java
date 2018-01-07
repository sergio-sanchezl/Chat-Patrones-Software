package Poderes;

import Comandos.EcharUsuario;
import Comandos.Invocador;
import Comandos.QuitarModerador;
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
          // 3 casos
          //1 usuario es administrador local en sala, puede echar moderadores también
          if(usuario==sala.getAdministrador()){
                EcharUsuario echar = new EcharUsuario(sala,usuario);
                this.accionar = new Invocador(echar);
                accionar.accionar();
                 if(sala.getModeradores().contains(usuario)){ //Si el usuario es moderador, echarlo también
                     QuitarModerador echarModerador = new QuitarModerador(sala,usuario);
                     this.accionar.setComando(echarModerador);
                     this.accionar.accionar();
                }
          }
          //2 usuario es moderador en sala
          else if(sala.getModeradores().contains(usuario)){
                if(usuario != sala.getAdministrador() && !sala.getModeradores().contains(usuario)){
                     EcharUsuario echar = new EcharUsuario(sala,usuario);
                     this.accionar = new Invocador(echar);
                     this.accionar.accionar();
                 }  
          }
          //3 el usuario es estandar en sala
          else{
              System.out.println("No tienes poderes en esta sala");
          }
    }

    @Override
    public void añadirModerador(Sala sala, Usuario usuario) {
        //Hacer permisos
    }

    @Override
    public void quitarModerador(Sala sala, Usuario usuario) {
        //Hacer permisos
    }
    
}
