/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class echarUsuario implements Command{
    Sala sala;
    Usuario usuario;
    public echarUsuario(Sala sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
       sala.desuscribirse(usuario);
    }

    @Override
    public void undo() {
        sala.suscribirse(usuario);
    }
    
    
}
