/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comandos;

/**
 *
 * @author Zamar
 */
public class Invocador {
   Command elComando;

    public Invocador(Command elComando) {
        this.elComando = elComando;
    }
   
    public void accionar(){
        elComando.execute();
    }
    public void deshacer(){
        elComando.undo();
    }
}
