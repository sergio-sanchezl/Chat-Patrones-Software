package Sala;

import Usuarios.Usuario;

/**
 *
 * @author Zamar
 */
public class TipoPrivada extends TipoSala implements Prototype {
    public TipoPrivada(String contraseña, Usuario administrador, String titulo, String descripcion, int tamaño) {
        super(administrador, titulo, descripcion, tamaño);
        super.setContraseña(contraseña);
    }

    @Override
    public Object clonar() {
        return new TipoPrivada(super.getContraseña(),super.getAdministrador(),super.getTitulo(),super.getDescripcion(),super.getTamaño());
    }
    
    
}
