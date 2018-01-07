/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sala;

import patronessoftware.Usuario;

/**
 *
 * @author Zamar
 */
public class TipoPrivada extends TipoSala{
    private String contraseña;
    public TipoPrivada(String contraseña, Usuario administrador, String titulo, String descripcion, int tamaño) {
        super(administrador, titulo, descripcion, tamaño);
        this.contraseña = contraseña;
    }

    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
       if (this.contraseña.equals(contraseña)){
           super.suscribirse(usuario);
       }else System.out.println("No coincide la contraseña");
    }
    @Override
   public void suscribirse(Usuario usuario){
       //Invitacion
       System.out.println("Aquí se miraría si el usuario ha sido invitado");
   }
    
}
