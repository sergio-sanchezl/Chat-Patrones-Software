package Comandos;

import Sala.Sala;
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
