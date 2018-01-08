/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Usuarios.Usuario;
import Sala.Sala;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class EcharUsuario implements Command{
    Sala sala;
    Usuario usuario;
    boolean wasAdministrator;
    boolean wasModerator;
    public EcharUsuario(Sala sala,Usuario usuario) {
        this.sala = sala;
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        wasAdministrator = false;
        wasModerator = false;
        System.out.print( "[Sala \"" + sala.getTitulo()+ "] Expulsado: ");
        sala.desuscribirse(usuario);
        if(usuario.equals(sala.getAdministrador())){ //Si echamos a la persona que es administradora, ponemos al miembro más antiguo.
            wasAdministrator = true;
            sala.setAdministrador(sala.getMiembros().get(0));
        }
        if(sala.getModeradores().contains(usuario)){ //Si es moderador en la sala y le hemos echado queremos sacarle.
            wasModerator = true;
            sala.quitarModerador(usuario);
        }
    }

    @Override
    public void undo() {
        System.out.print( "[Sala \"" + sala.getTitulo()+ "] Añadido: ");
        sala.suscribirse(usuario);
        if (wasAdministrator) sala.setAdministrador(usuario);
        if(wasModerator) sala.añadirModerador(usuario);
    }
    
    
}
