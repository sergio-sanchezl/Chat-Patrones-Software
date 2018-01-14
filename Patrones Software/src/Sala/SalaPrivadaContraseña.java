package Sala;

import java.util.ArrayList;
import Usuarios.Usuario;

/**
 *
 * @author Sergio
 */
public class SalaPrivadaContraseña extends Sala {
    
    public SalaPrivadaContraseña(TipoSala sala) {
        super(sala);
    }

    @Override
    public void suscribirse(Usuario usuario) {
        if(super.getSala().getContraseña().isEmpty()){
            super.getSala().suscribirse(usuario);
        }else System.out.println("Contraseña Incorrecta");
    }

    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
        if(super.getSala().getContraseña().equals(contraseña)){
            super.getSala().suscribirse(usuario);
        }else 
            System.out.println("Contraseña Incorrecta");
    }
    @Override
    public boolean tieneContraseña() {
        return super.getSala().tieneContraseña();
    }
}
