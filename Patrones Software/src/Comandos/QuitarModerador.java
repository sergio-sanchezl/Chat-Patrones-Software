/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Sala.SalaTest;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class QuitarModerador implements Command{
    SalaTest sala;
    Usuario usuario;
    public QuitarModerador(SalaTest sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        sala.quitarModerador(usuario);
    }

    @Override
    public void undo() {
        sala.añadirModerador(usuario);
    }
    
    
}
