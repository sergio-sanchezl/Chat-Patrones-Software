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
public class SetSalaDescripcion implements Command{
    Sala sala;
    String descripcion;
    String antiguodescripcion;
    public SetSalaDescripcion(Sala sala,String descripcion) {
        this.sala = sala;
        this.descripcion = descripcion;
        this.antiguodescripcion = sala.getDescripcion();
    }

    @Override
    public void execute() {
       sala.setTitulo(descripcion);
    }

    @Override
    public void undo() {
        sala.setTitulo(antiguodescripcion);
    }
    
    
}
