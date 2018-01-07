/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poderes;

import Sala.Sala;
import Comandos.*;
import patronessoftware.*;

/**
 *
 * @author Zamar
 */
public abstract class Poder {
    protected Invocador accionar;
    public abstract void echarUsuario(Sala sala, Usuario usuario);
    
    public  void deshacerUltimaAccion(){
        accionar.deshacer();
    }
}
