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
        System.out.println("Necesitas introducir una contraseña");
    }

    @Override
    public void suscribirse(Usuario usuario, String contraseña) {
        if(super.getSala().getContraseña().equals(contraseña)){
            super.getSala().suscribirse(usuario);
        }else 
            System.out.println("Contraseña Incorrecta");
    }
}
