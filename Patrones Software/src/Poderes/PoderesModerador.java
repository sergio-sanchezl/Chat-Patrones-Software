/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import Comandos.EcharUsuario;
import Comandos.Invocador;
import Sala.SalaTest;
import patronessoftware.Usuario;

/**
 *
 * @author Zamar
 */


public class PoderesModerador extends Poder {

    @Override
    /**
     * Puede echar a quien excepto al administrador local y otros moderadores
     */
    public void echarUsuario(SalaTest sala, Usuario usuario) {
            if(usuario != sala.getAdministrador() && !sala.getModeradores().contains(usuario)){
                   EcharUsuario echar = new EcharUsuario(sala,usuario);
                   this.accionar = new Invocador(echar);
                   accionar.accionar();
           }
            else{ //Esta intentando 
                System.out.println("No tienes los permisos necesarios");
            }
    }

    
}
