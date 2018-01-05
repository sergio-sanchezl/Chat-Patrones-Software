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
public class SetSalaTitulo implements Command{
    Sala sala;
    String titulo;
    String antiguotitulo;
    public SetSalaTitulo(Sala sala,String titulo) {
        this.sala = sala;
        this.titulo = titulo;
        this.antiguotitulo = sala.getTitulo();
    }

    @Override
    public void execute() {
       sala.setTitulo(titulo);
    }

    @Override
    public void undo() {
        sala.setTitulo(antiguotitulo);
    }
    
    
}
