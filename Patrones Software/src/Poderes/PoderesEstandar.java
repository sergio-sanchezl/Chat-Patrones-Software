/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import patronessoftware.Sala;
import patronessoftware.Usuario;

/**
 *
 * @author Zamar
 */


public class PoderesEstandar extends Poder {

    @Override
    /**
     * No puede ecahr a nadie
     */
    public void echarUsuario(Sala sala, Usuario usuario) {
          System.out.println("No tienes los permisos necesarios");
    }
    
}
