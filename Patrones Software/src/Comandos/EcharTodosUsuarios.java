/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

import Sala.SalaTest;
import java.util.ArrayList;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public class EcharTodosUsuarios implements Command{
    SalaTest sala;
    ArrayList <Usuario> usuarios;
    public EcharTodosUsuarios(SalaTest sala) {
        this.sala = sala;
        this.usuarios = sala.getMiembros();
    }
    @Override
    public void execute() {
       for (Usuario usuario : usuarios){
          System.out.print("Expulsado: ");
           sala.desuscribirse(usuario);
       }
    }

    @Override
    public void undo() {
       for (Usuario usuario : usuarios){
       sala.suscribirse(usuario);
       }
    }
    
    
}
