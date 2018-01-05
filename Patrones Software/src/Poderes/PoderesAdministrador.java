/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import Comandos.EcharUsuario;
import Comandos.EcharUsuario;
import Comandos.Invocador;
import Comandos.Invocador;
import Comandos.QuitarModerador;
import Comandos.QuitarModerador;
import patronessoftware.Sala;
import patronessoftware.Usuario;

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
           EcharUsuario echar = new EcharUsuario(sala,usuario);
           accionar = new Invocador(echar);
           accionar.accionar();
           if(sala.getModeradores().contains(usuario)){ //Si el usuario es administrador
            QuitarModerador echarModerador = new QuitarModerador(sala,usuario);
            accionar.setComando(echarModerador);
            accionar.accionar();
           }
    }
    
}
