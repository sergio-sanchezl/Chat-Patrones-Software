/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

import patronessoftware.Usuario;

/**
 * Concreto del implementador, esto es el caso de implementar el publico, el constructor no necesitará contraseña.
 * @author Zamar
 */
public class TipoPublica extends TipoSala {

    public TipoPublica(Usuario administrador, String titulo, String descripcion, int tamaño) {
        super(administrador, titulo, descripcion, tamaño);
    }
    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
       super.suscribirse(usuario); //Obviamos la contraseña, after all es publico.
    }
    
}
