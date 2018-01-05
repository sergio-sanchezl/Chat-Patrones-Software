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
public class EcharUsuario implements Command{
    Sala sala;
    Usuario usuario;
    public EcharUsuario(Sala sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        System.out.print( "[Sala \"" + sala.getTitulo()+ "] Expulsado: ");
        sala.desuscribirse(usuario);
    }

    @Override
    public void undo() {
        System.out.print( "[Sala \"" + sala.getTitulo()+ "] Añadido: ");
        sala.suscribirse(usuario);
    }
    
    
}
