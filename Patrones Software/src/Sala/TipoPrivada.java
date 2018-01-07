/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */
public class TipoPrivada extends TipoSala{
    public TipoPrivada(String contraseña, Usuario administrador, String titulo, String descripcion, int tamaño) {
        super(administrador, titulo, descripcion, tamaño);
        super.setContraseña(contraseña);
    }
}
